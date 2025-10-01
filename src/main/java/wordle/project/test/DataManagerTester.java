package wordle.project.test;

import wordle.project.manager.DataManager;

public class DataManagerTester {
    public static void main(String[] args) {
        DataManager dataManager = new DataManager();
        dataManager.createAccount("HELLO", "TEST");
        dataManager.createAccount("WOAH", "AAA");
        System.out.println(dataManager);
    }
}
