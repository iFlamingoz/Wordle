package wordle.project.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AccountTest {
    @Test
    void statCheck() {
        Account account = new Account(1, "test", "admin123");
        GameData gameData = new GameData(1, "TESTS");
        gameData.getGuessData()[gameData.addAndGetGuessCount() - 1] = new SubmissionResults("TESTS", "LETSS");
        gameData.getGuessData()[gameData.addAndGetGuessCount() - 1] = new SubmissionResults("TESTS", "WESTS");
        gameData.getGuessData()[gameData.addAndGetGuessCount() - 1] = new SubmissionResults("TESTS", "PESTS");
        gameData.getGuessData()[gameData.addAndGetGuessCount() - 1] = new SubmissionResults("TESTS", "TESTS");
        account.addMatch(gameData);

        Assertions.assertEquals(1, account.getWins());
        Assertions.assertEquals(4, account.getTotalGuesses());
        Assertions.assertEquals(0, account.getLosses());
    }

    @Test
    void credentialsTest() {
        Account account = new Account(1, "test", "admin123", 1, 1, 1, new ArrayList<>(List.of(new GameData(1, "TEST"))));
        Assertions.assertEquals("test", account.getUsername());
        Assertions.assertEquals("admin123", account.getPassword());
        Assertions.assertEquals(1, account.getMatchHistory().size());
        account.setUsername("testreset");
        account.setPassword("admin321");
        Assertions.assertEquals("testreset", account.getUsername());
        Assertions.assertEquals("admin321", account.getPassword());
    }
}