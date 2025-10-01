package wordle.project.data;

import wordle.project.Wordle;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RowData {
    private final java.util.List<Label> labels = new ArrayList<>();
    private String wordInput = "";

    public RowData() {
        for (int i = 0; i < 5; i++) {
            Label label = new Label("-", Label.CENTER);
            label.setBackground(new Color(255, 255, 255));
            Wordle.getWindowManager().getWindow(WindowType.GAME).add(label);
            labels.add(label);
            label.setFont(label.getFont().deriveFont(Font.BOLD, 40));
        }
    }

    public void updateRowDisplay(SubmissionResults submissionResults) {
        for (int i = 0; i < 5; i++) {
            SubmissionResults.Result result = submissionResults.getResults()[i];
            labels.get(i).setBackground(result.getColour());
        }
    }

    public boolean inputLetter(String letter) {
        if (wordInput.length() >= 5)
            return false;

        labels.get(wordInput.length()).setText(letter);
        wordInput += letter;

        return true;
    }

    public boolean deleteLetter() {
        if (wordInput.isEmpty())
            return false;

        wordInput = wordInput.substring(0, wordInput.length() - 1);
        labels.get(wordInput.length()).setText("-");
        return true;
    }

    public void reset() {
        for (Label label : labels) {
            label.setText("-");
            label.setBackground(Color.WHITE);
        }

        wordInput = "";
    }

    public List<Label> getLabels() {
        return labels;
    }

    public String getWordInput() {
        return wordInput;
    }
}
