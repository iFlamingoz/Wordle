package wordle.project.manager;

import wordle.project.data.Account;
import wordle.project.data.GameData;
import wordle.project.data.SubmissionResults;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DB {
    private Connection connection;

    public DB() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/wordle", "root", "");
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.exit(exception.getErrorCode());
        }

        if (connection == null) {
            System.out.println("Could not connect to the database");
            System.exit(-1);
        }
    }

    public void saveGame(GameData game) {
        List<String> submissionData = new ArrayList<>();

        for (SubmissionResults submission : game.getGuessData()) {
            if (submission == null)
                break;

            submissionData.add(submission.getInputWord() + "-"
                    + String.join(",", Arrays.stream(submission.getResults())
                    .map(v -> v.name())
                    .toList()));
        }

        execute("insert into games values(?, ?, ?, ?)",
                game.getGameID(), game.getWord(), game.getGuessCount(), String.join(";", submissionData));
    }

    public void saveAccount(Account account) {
        if (!accountSaved(account.getID())) {
            execute("insert into accounts(accountid) values(?)", account.getID());
        }

        List<String> matchHistory = account.getMatchHistory()
                .stream()
                .map(v -> String.valueOf(v.getGameID()))
                .toList();

        execute("update accounts set username = ?, password = ?, wins = ?, losses = ?, total_guesses = ?, match_history = ? where accountid = " + account.getID(),
                account.getUsername(), account.getPassword(), account.getWins(), account.getLosses(), account.getTotalGuesses(), String.join(";", matchHistory));
    }

    public int getHighestGameId() {
        try (PreparedStatement pst = connection.prepareStatement("select gameid from games order by gameid desc limit 1")) {
            ResultSet resultSet = pst.executeQuery();

            if (!resultSet.next())
                return 0;

            return resultSet.getInt("gameid");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

        return 0;
    }

    public HashMap<Integer, GameData> getGames() {
        try (PreparedStatement pst = connection.prepareStatement("select * from games")) {
            ResultSet result = pst.executeQuery();
            HashMap<Integer, GameData> games = new HashMap<>();

            while (result.next()) {
                List<SubmissionResults> submissions = new ArrayList<>();
                int id = result.getInt("gameid");
                String word = result.getString("word");

                for (String submission : result.getString("submissions").split(";")) {
                    String[] submissionData = submission.split("-");

                    submissions.add(new SubmissionResults(word, submissionData[0],
                            Arrays.stream(submissionData[1].split(","))
                                    .map(v -> SubmissionResults.Result.valueOf(v))
                                    .toArray(SubmissionResults.Result[]::new)));
                }

                games.put(id, new GameData(
                        id,
                        word,
                        result.getInt("guess_count"),
                        submissions.toArray(SubmissionResults[]::new)));
            }

            return games;
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.exit(exception.getErrorCode());
        }

        return null;
    }

    public List<Account> getAccounts() {
        try (PreparedStatement pst = connection.prepareStatement("select * from accounts")) {
            ResultSet result = pst.executeQuery();
            List<Account> accounts = new ArrayList<>();
            HashMap<Integer, GameData> games = getGames();

            while (result.next()) {
                List<GameData> matchHistory = new ArrayList<>();
                for (String id : result.getString("match_history").split(";"))
                    if (id != null && !id.isEmpty())
                        matchHistory.add(games.get(Integer.valueOf(id)));

                accounts.add(new Account(
                        result.getInt("accountid"),
                        result.getString("username"),
                        result.getString("password"),
                        result.getInt("wins"),
                        result.getInt("losses"),
                        result.getInt("total_guesses"),
                        matchHistory));
            }

            return accounts;
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.exit(exception.getErrorCode());
        }

        return null;
    }

    private boolean accountSaved(int accountID) {
        try (PreparedStatement pst = connection.prepareStatement("select * from accounts where accountid=" + accountID)) {
            return pst.executeQuery().next();
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.exit(exception.getErrorCode());
        }

        return false;
    }

    private void execute(String statement, Object... data) {
        try (PreparedStatement pst = connection.prepareStatement(statement)) {
            for (int i = 0; i < data.length; i++) {
                pst.setObject(i + 1, data[i]);
            }

            pst.execute();
        } catch (SQLException exception) {
            exception.printStackTrace();
            System.exit(exception.getErrorCode());
        }
    }
}
