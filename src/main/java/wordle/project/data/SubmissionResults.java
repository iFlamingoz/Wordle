package wordle.project.data;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;

public class SubmissionResults {
    private final String correctWord;
    private final String inputWord;

    private final Result[] results;

    public SubmissionResults(String correctWord, String inputWord, Result[] results) {
        this.correctWord = correctWord;
        this.inputWord = inputWord;
        this.results = results;
    }

    public SubmissionResults(String correctWord, String inputWord) {
        this.correctWord = correctWord;
        this.inputWord = inputWord;
        this.results = new Result[5];
        String[] inputLetters = inputWord.split("");
        String[] correctLetters = correctWord.split("");
        HashMap<String, Integer> letterGuessCount = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            String inputLetter = inputLetters[i];

            if (!correctLetters[i].equals(inputLetter)) {
                continue;
            }

            if (!letterGuessCount.containsKey(inputLetter)) {
                letterGuessCount.put(inputLetter, 1);
            } else {
                letterGuessCount.replace(inputLetter, letterGuessCount.getOrDefault(inputLetter, 0) + 1);
            }

            results[i] = Result.CORRECT;
        }

        for (int i = 0; i < 5; i++) {
            String inputLetter = inputLetters[i];

            if (inputLetter.equals(correctLetters[i])) {
                continue;
            }

            if (!correctWord.contains(inputLetter)) {
                results[i] = Result.INCORRECT;
                continue;
            }

            int letterGuessed = letterGuessCount.getOrDefault(inputLetter, 0) + 1;
            int maxGuesses = getMaxGuesses(inputLetter);

            if (letterGuessed > maxGuesses) {
                results[i] = Result.INCORRECT;
                continue;
            }

            if (!letterGuessCount.containsKey(inputLetter)) {
                letterGuessCount.put(inputLetter, 1);
            } else {
                letterGuessCount.replace(inputLetter, letterGuessed + 1);
            }

            results[i] = Result.WRONG_POSITION;
        }
    }

    private int getMaxGuesses(String guessedLetter) {
        int guesses = 0;

        for (String correctLetter : correctWord.split("")) {
            if (correctLetter.equals(guessedLetter)) {
                guesses++;
            }
        }

        return guesses;
    }

    public boolean wonGame() {
        return correctWord.equals(inputWord);
    }

    public String getInputWord() {
        return inputWord;
    }

    public Result[] getResults() {
        return results;
    }

    public enum Result {
        CORRECT(Color.GREEN),
        WRONG_POSITION(Color.YELLOW),
        INCORRECT(Color.RED);

        private final Color colour;

        Result(Color colour) {
            this.colour = colour;
        }

        public Color getColour() {
            return colour;
        }
    }
}
