package wordle.project.manager;

import wordle.project.Wordle;
import wordle.project.data.Account;
import wordle.project.data.GameData;
import wordle.project.data.GeneralData;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;

public class DataManager {
    private final DB db = new DB();

    private int highestAccountID;
    private int highestGameID;

    private final HashMap<Integer, Account> accounts = new HashMap<>();
    private final List<String> possibleWords = new ArrayList<>();

    private final GeneralData generalData;

    public DataManager() {
        try (Scanner scanner = new Scanner(getFile("words.txt").openStream())) {
            while (scanner.hasNext()) {
                possibleWords.addAll(Arrays.asList(scanner.next().split(";")));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        for (Account account : db.getAccounts()) {
            if (account.getID() > highestAccountID) {
                highestAccountID = account.getID();
            }

            accounts.put(account.getID(), account);
        }

        highestGameID = db.getHighestGameId();
        generalData = readData("general_data.txt", new GeneralData());
    }

    private <T> T readData(String name, T defaultValue) {
        try {
            InputStream inputStream = getFile(name).openStream();
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
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
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
        db.saveAccount(Wordle.getAccount());
    }

    public List<String> getPossibleWords() {
        return possibleWords;
    }

    public GeneralData getGeneralData() {
        return generalData;
    }

    public void onGameEnd(GameData gameData) {
        Wordle.getAccount().addMatch(gameData);
        db.saveAccount(Wordle.getAccount());
        db.saveGame(gameData);
    }

    public Account createAccount(String username, String password) {
        Account account = new Account(++highestAccountID, username, password);
        accounts.put(account.getID(), account);
        db.saveAccount(account);
        return account;
    }

    private URL getFile(String fileName) {
        return getClass().getClassLoader().getResource(fileName);

//        System.out.println("fileName = " + getClass().getClassLoader().getResource(fileName).getFile());;
//        return new File(getClass().getClassLoader().getResource(fileName).getFile());
    }
}
