package wordle.project.test;

import wordle.project.data.Account;
import wordle.project.data.GameData;
import wordle.project.data.SubmissionResults;

public class AccountTester {
    public static void main(String[] args) {
        Account account1 = new Account(1, "test", "admin123");
        GameData gameData1 = new GameData(1, "TESTS");
        gameData1.getGuessData()[gameData1.addAndGetGuessCount() - 1] = new SubmissionResults("TESTS", "LETSS");
        gameData1.getGuessData()[gameData1.addAndGetGuessCount() - 1] = new SubmissionResults("TESTS", "WESTS");
        gameData1.getGuessData()[gameData1.addAndGetGuessCount() - 1] = new SubmissionResults("TESTS", "PESTS");
        gameData1.getGuessData()[gameData1.addAndGetGuessCount() - 1] = new SubmissionResults("TESTS", "TESTS");
        account1.addMatch(gameData1);
        System.out.println(account1);

        Account account2 = new Account(2, "test", "admin123");
        GameData gameData2 = new GameData(2, "TESTS");
        gameData2.getGuessData()[0] = new SubmissionResults("PLACE", "STATE");
        gameData2.addAndGetGuessCount();
        account2.addMatch(gameData2);
        account2.setUsername("testreset");
        account2.setPassword("admin321");
        System.out.println("\nID: " + account2.getID());
        System.out.println("Username: " + account2.getUsername());
        System.out.println("Password: " + account2.getPassword());
        System.out.println("Wins: " + account2.getWins());
        System.out.println("Losses: " + account2.getLosses());
        System.out.println("Losses: " + account2.getTotalGuesses());
        System.out.println("Match history: " + account2.getMatchHistory());
    }
}