package wordle.project;

import wordle.project.data.Account;
import wordle.project.manager.*;

public class Wordle {
    private static Account account;
    private static ConfigManager configManager;
    private static DatabaseManager databaseManager;
    private static DataManager dataManager;
    private static GameManager gameManager;
    private static WindowManager windowManager;

    public static void main(String[] args) {
        configManager = new ConfigManager();
        databaseManager = new DatabaseManager();
        dataManager = new DataManager();
        windowManager = new WindowManager();
        gameManager = new GameManager();
    }

    public static void setAccount(Account account) {
        Wordle.account = account;
    }

    public static Account getAccount() {
        return account;
    }

    public static ConfigManager getConfigManager() {
        return configManager;
    }

    public static DataManager getDataManager() {
        return dataManager;
    }

    public static GameManager getGameManager() {
        return gameManager;
    }

    public static WindowManager getWindowManager() {
        return windowManager;
    }

    public static DatabaseManager getDatabaseManager() {
        return databaseManager;
    }
}