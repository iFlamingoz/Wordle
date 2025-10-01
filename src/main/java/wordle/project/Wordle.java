package wordle.project;

import wordle.project.data.Account;
import wordle.project.manager.DataManager;
import wordle.project.manager.GameManager;
import wordle.project.manager.WindowManager;

public class Wordle {
    private static Account account;
    private static DataManager dataManager;
    private static GameManager gameManager;
    private static WindowManager windowManager;

    public static void main(String[] args) {
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

    public static DataManager getDataManager() {
        return dataManager;
    }

    public static GameManager getGameManager() {
        return gameManager;
    }

    public static WindowManager getWindowManager() {
        return windowManager;
    }
}