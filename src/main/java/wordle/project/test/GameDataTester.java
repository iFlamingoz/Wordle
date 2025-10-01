package wordle.project.test;

import wordle.project.data.GameData;
import wordle.project.data.SubmissionResults;

public class GameDataTester {
    public static void main(String[] args) {
        GameData gameData = new GameData(1, "TESTS");
        gameData.getGuessData()[0] = new SubmissionResults("PESTS", "TESTS");
        gameData.getGuessData()[1] = new SubmissionResults("PESTS", "PESTS");
        System.out.println(gameData);
    }
}
