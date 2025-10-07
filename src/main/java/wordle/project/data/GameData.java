package wordle.project.data;

import java.util.Arrays;

public class GameData {
    private final int gameID;

    private final String word;
    private int guessCount;
    private SubmissionResults[] guessData = new SubmissionResults[6];

    public GameData(int gameID, String word, int guessCount, SubmissionResults[] guessData) {
        this.gameID = gameID;
        this.word = word;
        this.guessCount = guessCount;
        this.guessData = Arrays.copyOf(guessData, 6);
    }

    public GameData(int gameID, String word) {
        this.gameID = gameID;
        this.word = word;
    }

    public boolean wonGame() {
        for (int i = 5; i >= 0; i--) {
            if (guessData[i] != null) {
                return guessData[i].wonGame();
            }
        }

        return false;
    }

    public int addAndGetGuessCount() {
        this.guessCount++;
        return guessCount;
    }

    public SubmissionResults[] getGuessData() {
        return guessData;
    }

    public int getGuessCount() {
        return guessCount;
    }

    public String getWord() {
        return word;
    }

    public int getGameID() {
        return gameID;
    }
}
