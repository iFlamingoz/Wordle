package wordle.project.manager;

import wordle.project.Wordle;
import wordle.project.data.GameData;
import wordle.project.data.RowData;
import wordle.project.data.SubmissionResults;
import wordle.project.data.WindowType;
import wordle.project.window.GameResultsWindow;

import java.util.List;
import java.util.Random;

public class GameManager {
    private boolean active;
    private GameData gameData;
    private final RowData[] rows = new RowData[6];

    public GameManager() {
        for (int i = 0; i < 6; i++)
            rows[i] = new RowData();
    }

    public void beginGame() {
        List<String> possibleWords = Wordle.getDataManager().getPossibleWords();
        String word = possibleWords.get(new Random().nextInt(0, possibleWords.size())).toUpperCase();
        gameData = new GameData(Wordle.getDataManager().getNewGameID(), word);
        active = true;

        for (RowData row : rows)
            row.reset();
    }

    public void inputLetter(String input) {
        if (input != null)
            getCurrentRow().inputLetter(input);
        else
            getCurrentRow().deleteLetter();
    }

    public void submitGuess() {
        if (getCurrentRow().getWordInput().length() != 5)
            return;

        SubmissionResults results = new SubmissionResults(gameData.getWord(), getCurrentRow().getWordInput());
        getCurrentRow().updateRowDisplay(results);
        gameData.getGuessData()[gameData.getGuessCount()] = results;

        if (gameData.addAndGetGuessCount() == 6 || results.wonGame()) {
            Wordle.getDataManager().onGameEnd(gameData);
            active = false;
            ((GameResultsWindow) Wordle.getWindowManager().getWindow(WindowType.GAME_RESULTS)).setData(WindowType.PAUSE, gameData);
            Wordle.getWindowManager().switchToWindow(WindowType.GAME_RESULTS);
        }
    }

    public GameData getGameData() {
        return gameData;
    }

    public boolean isActive() {
        return active;
    }

    public RowData getCurrentRow() {
        return rows[gameData.getGuessCount()];
    }
}