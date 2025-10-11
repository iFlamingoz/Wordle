package wordle.project.manager;

import lombok.Getter;
import wordle.project.Wordle;
import wordle.project.data.Account;
import wordle.project.data.GameData;
import wordle.project.data.GeneralData;

import java.io.*;
import java.util.*;

public class DataManager {
    private int highestAccountID;
    private int highestGameID;

    private final HashMap<Integer, Account> accounts = new HashMap<>();

    @Getter
    private final List<String> possibleWords = new ArrayList<>();
    @Getter
    private final GeneralData generalData;

    public DataManager() {
        try (InputStream wordResource = getClass().getClassLoader().getResourceAsStream("words.txt");
             Scanner scanner = new Scanner(Objects.requireNonNull(wordResource))) {
            while (scanner.hasNext())
                possibleWords.addAll(Arrays.asList(scanner.next().split(";")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        for (Account account : Wordle.getDatabaseManager().getAccounts()) {
            if (account.getID() > highestAccountID) {
                highestAccountID = account.getID();
            }

            accounts.put(account.getID(), account);
        }

        highestGameID = Wordle.getDatabaseManager().getHighestGameId();
        generalData = readData("general_data.txt", new GeneralData());
    }

    private <T> T readData(String name, T defaultValue) {
        try {
            File file = new File(System.getenv("APPDATA") + "/.wordle/" + name);
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            T value = (T) objectInputStream.readObject();

            objectInputStream.close();
            inputStream.close();
            return value;
        } catch (IOException | ClassNotFoundException ignore) {
        }

        return defaultValue;
    }

    public void saveGeneralData() {
        saveData(generalData, "general_data.txt");
    }

    private void saveData(Object data, String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(System.getenv("APPDATA") + "/.wordle/" + fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(data);

            objectOutputStream.flush();
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public Collection<Account> getAccounts() {
        return accounts.values();
    }

    public Account getAccount(int id) {
        return accounts.get(id);
    }

    public Account getAccount(String username) {
        for (Account account : accounts.values()) {
            if (account.getUsername().equals(username)) {
                return account;
            }
        }

        return null;
    }

    public int getNewGameID() {
        return ++highestGameID;
    }

    public void saveAccount() {
        Wordle.getDatabaseManager().saveAccount(Wordle.getAccount());
    }

    public void onGameEnd(GameData gameData) {
        Wordle.getAccount().addMatch(gameData);
        Wordle.getDatabaseManager().saveAccount(Wordle.getAccount());
        Wordle.getDatabaseManager().saveGame(gameData);
    }

    public Account createAccount(String username, String password) {
        Account account = new Account(++highestAccountID, username, password);
        accounts.put(account.getID(), account);
        Wordle.getDatabaseManager().saveAccount(account);
        return account;
    }
}
