package wordle.project.window;

import wordle.project.Wordle;
import wordle.project.data.GameData;
import wordle.project.data.WindowType;
import wordle.project.window.generic.Window;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatchHistoryWindow extends Window {
    private int page = 0;
    private final List<JLabel> numLabels;
    private final List<JLabel> resultLabels;
    private final List<JLabel> correctLabels;
    private final List<JButton> detailButtons;

    public MatchHistoryWindow() {
        super(WindowType.MATCH_HISTORY, "Wordle - Match History", true);
        initComponents();
        numLabels = new ArrayList<>(Arrays.asList(num1, num2, num3, num4, num5));
        resultLabels = new ArrayList<>(Arrays.asList(result1, result2, result3, result4, result5));
        correctLabels = new ArrayList<>(Arrays.asList(correct1, correct2, correct3, correct4, correct5));
        detailButtons = new ArrayList<>(Arrays.asList(details1, details2, details3, details4, details5));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        previousButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        numLabel = new javax.swing.JLabel();
        correctLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        num1 = new javax.swing.JLabel();
        correct1 = new javax.swing.JLabel();
        result1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        pageLabel = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        backButton = new javax.swing.JButton();
        details1 = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        result2 = new javax.swing.JLabel();
        correct2 = new javax.swing.JLabel();
        details2 = new javax.swing.JButton();
        num2 = new javax.swing.JLabel();
        result3 = new javax.swing.JLabel();
        correct3 = new javax.swing.JLabel();
        details3 = new javax.swing.JButton();
        num3 = new javax.swing.JLabel();
        result4 = new javax.swing.JLabel();
        correct4 = new javax.swing.JLabel();
        details4 = new javax.swing.JButton();
        num4 = new javax.swing.JLabel();
        result5 = new javax.swing.JLabel();
        correct5 = new javax.swing.JLabel();
        details5 = new javax.swing.JButton();
        num5 = new javax.swing.JLabel();

        setLayout(null);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Match History");
        titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        titleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLabel.setRequestFocusEnabled(false);
        titleLabel.setVerifyInputWhenFocusTarget(false);
        add(titleLabel);
        titleLabel.setBounds(0, 0, 400, 48);

        previousButton.setBackground(new java.awt.Color(255, 0, 0));
        previousButton.setFont(previousButton.getFont().deriveFont(previousButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        previousButton.setForeground(new java.awt.Color(0, 0, 0));
        previousButton.setText("Previous");
        previousButton.setFocusable(false);
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });
        add(previousButton);
        previousButton.setBounds(0, 560, 120, 30);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator1);
        jSeparator1.setBounds(0, 140, 400, 10);

        numLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numLabel.setForeground(new java.awt.Color(255, 255, 255));
        numLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numLabel.setText("Num");
        add(numLabel);
        numLabel.setBounds(10, 90, 60, 40);

        correctLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        correctLabel.setForeground(new java.awt.Color(102, 255, 102));
        correctLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correctLabel.setText("Correct");
        add(correctLabel);
        correctLabel.setBounds(170, 90, 80, 40);

        resultLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resultLabel.setForeground(new java.awt.Color(255, 255, 255));
        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultLabel.setText("Result");
        add(resultLabel);
        resultLabel.setBounds(80, 90, 90, 40);

        num1.setForeground(new java.awt.Color(255, 255, 255));
        num1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num1.setText("Num");
        add(num1);
        num1.setBounds(10, 160, 60, 40);

        correct1.setForeground(new java.awt.Color(255, 255, 255));
        correct1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correct1.setText("Correct");
        add(correct1);
        correct1.setBounds(160, 160, 80, 40);

        result1.setForeground(new java.awt.Color(255, 255, 255));
        result1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result1.setText("Guessed");
        add(result1);
        result1.setBounds(70, 160, 90, 40);

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator2);
        jSeparator2.setBounds(0, 220, 400, 10);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator3);
        jSeparator3.setBounds(0, 370, 400, 10);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator4);
        jSeparator4.setBounds(0, 290, 400, 10);

        pageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageLabel.setText("Page");
        add(pageLabel);
        pageLabel.setBounds(140, 550, 120, 40);

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        add(jSeparator5);
        jSeparator5.setBounds(0, 450, 400, 10);

        backButton.setBackground(new java.awt.Color(255, 0, 0));
        backButton.setFont(backButton.getFont().deriveFont(backButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("BACK");
        backButton.setFocusable(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(125, 680, 150, 40);

        details1.setBackground(new java.awt.Color(255, 204, 153));
        details1.setFont(details1.getFont().deriveFont(details1.getFont().getStyle() | java.awt.Font.BOLD, 20));
        details1.setForeground(new java.awt.Color(0, 0, 0));
        details1.setText("Details");
        details1.setFocusable(false);
        details1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                details1ActionPerformed(evt);
            }
        });
        add(details1);
        details1.setBounds(260, 170, 100, 30);

        nextButton.setBackground(new java.awt.Color(102, 255, 102));
        nextButton.setFont(nextButton.getFont().deriveFont(nextButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        nextButton.setForeground(new java.awt.Color(0, 0, 0));
        nextButton.setText("Next");
        nextButton.setFocusable(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        add(nextButton);
        nextButton.setBounds(270, 560, 120, 30);

        result2.setForeground(new java.awt.Color(255, 255, 255));
        result2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result2.setText("Guessed");
        add(result2);
        result2.setBounds(70, 240, 90, 40);

        correct2.setForeground(new java.awt.Color(255, 255, 255));
        correct2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correct2.setText("Correct");
        add(correct2);
        correct2.setBounds(160, 240, 80, 40);

        details2.setBackground(new java.awt.Color(255, 204, 153));
        details2.setFont(details2.getFont().deriveFont(details2.getFont().getStyle() | java.awt.Font.BOLD, 20));
        details2.setForeground(new java.awt.Color(0, 0, 0));
        details2.setText("Details");
        details2.setFocusable(false);
        details2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                details2ActionPerformed(evt);
            }
        });
        add(details2);
        details2.setBounds(260, 250, 100, 30);

        num2.setForeground(new java.awt.Color(255, 255, 255));
        num2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num2.setText("Num");
        add(num2);
        num2.setBounds(10, 240, 60, 40);

        result3.setForeground(new java.awt.Color(255, 255, 255));
        result3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result3.setText("Guessed");
        add(result3);
        result3.setBounds(70, 310, 90, 40);

        correct3.setForeground(new java.awt.Color(255, 255, 255));
        correct3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correct3.setText("Correct");
        add(correct3);
        correct3.setBounds(160, 310, 80, 40);

        details3.setBackground(new java.awt.Color(255, 204, 153));
        details3.setFont(details3.getFont().deriveFont(details3.getFont().getStyle() | java.awt.Font.BOLD, 20));
        details3.setForeground(new java.awt.Color(0, 0, 0));
        details3.setText("Details");
        details3.setFocusable(false);
        details3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                details3ActionPerformed(evt);
            }
        });
        add(details3);
        details3.setBounds(260, 320, 100, 30);

        num3.setForeground(new java.awt.Color(255, 255, 255));
        num3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num3.setText("Num");
        add(num3);
        num3.setBounds(10, 310, 60, 40);

        result4.setForeground(new java.awt.Color(255, 255, 255));
        result4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result4.setText("Guessed");
        add(result4);
        result4.setBounds(70, 390, 90, 40);

        correct4.setForeground(new java.awt.Color(255, 255, 255));
        correct4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correct4.setText("Correct");
        add(correct4);
        correct4.setBounds(160, 390, 80, 40);

        details4.setBackground(new java.awt.Color(255, 204, 153));
        details4.setFont(details4.getFont().deriveFont(details4.getFont().getStyle() | java.awt.Font.BOLD, 20));
        details4.setForeground(new java.awt.Color(0, 0, 0));
        details4.setText("Details");
        details4.setFocusable(false);
        details4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                details4ActionPerformed(evt);
            }
        });
        add(details4);
        details4.setBounds(260, 400, 100, 30);

        num4.setForeground(new java.awt.Color(255, 255, 255));
        num4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num4.setText("Num");
        add(num4);
        num4.setBounds(10, 390, 60, 40);

        result5.setForeground(new java.awt.Color(255, 255, 255));
        result5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        result5.setText("Guessed");
        add(result5);
        result5.setBounds(70, 470, 90, 40);

        correct5.setForeground(new java.awt.Color(255, 255, 255));
        correct5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        correct5.setText("Correct");
        add(correct5);
        correct5.setBounds(160, 470, 80, 40);

        details5.setBackground(new java.awt.Color(255, 204, 153));
        details5.setFont(details5.getFont().deriveFont(details5.getFont().getStyle() | java.awt.Font.BOLD, 20));
        details5.setForeground(new java.awt.Color(0, 0, 0));
        details5.setText("Details");
        details5.setFocusable(false);
        details5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                details5ActionPerformed(evt);
            }
        });
        add(details5);
        details5.setBounds(260, 480, 100, 30);

        num5.setForeground(new java.awt.Color(255, 255, 255));
        num5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        num5.setText("Num");
        add(num5);
        num5.setBounds(10, 470, 60, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void updateComponents() {
        List<GameData> history = Wordle.getAccount().getMatchHistory();
        pageLabel.setText("Page " + (page + 1));

        for (int i = page * 5; i < (page * 5) + 5; i++) {
            if (i < history.size()) {
                GameData match = history.get(i);
                numLabels.get(i % 5).setText(String.valueOf(i + 1));
                resultLabels.get(i % 5).setText(match.wonGame() ? "Won" : "Lost");
                correctLabels.get(i % 5).setText(match.getWord());

                if (match.wonGame()) {
                    resultLabels.get(i % 5).setForeground(Color.green);
                } else {
                    resultLabels.get(i % 5).setForeground(Color.red);
                }

                detailButtons.get(i % 5).setEnabled(true);
            } else {
                numLabels.get(i % 5).setText("N/A");
                resultLabels.get(i % 5).setText("N/A");
                correctLabels.get(i % 5).setText("N/A");
                resultLabels.get(i % 5).setForeground(Color.white);
                detailButtons.get(i % 5).setEnabled(false);
            }
        }
    }

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        if (page <= 0) {
            return;
        }

        page--;
        updateComponents();

        if (page == 0) {
            previousButton.setEnabled(false);
        }

        nextButton.setEnabled(true);
    }//GEN-LAST:event_previousButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Wordle.getWindowManager().pause();
    }//GEN-LAST:event_backButtonActionPerformed

    private void details1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_details1ActionPerformed
        viewDetails(0);
    }//GEN-LAST:event_details1ActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (page + 1 >= getMaxPageSize()) {
            return;
        }

        page++;
        updateComponents();

        if (page + 1 >= getMaxPageSize()) {
            nextButton.setEnabled(false);
        }

        previousButton.setEnabled(true);
    }//GEN-LAST:event_nextButtonActionPerformed

    private void details2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_details2ActionPerformed
        viewDetails(1);
    }//GEN-LAST:event_details2ActionPerformed

    private void details3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_details3ActionPerformed
        viewDetails(2);
    }//GEN-LAST:event_details3ActionPerformed

    private void details4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_details4ActionPerformed
        viewDetails(3);
    }//GEN-LAST:event_details4ActionPerformed

    private void details5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_details5ActionPerformed
        viewDetails(4);
    }//GEN-LAST:event_details5ActionPerformed

    private void viewDetails(int position) {
        List<GameData> history = Wordle.getAccount().getMatchHistory();

        if (page * 5 + position >= history.size())
            return;

        GameResultsWindow gameResultsWindow = ((GameResultsWindow) Wordle.getWindowManager().getWindow(WindowType.GAME_RESULTS));
        gameResultsWindow.setData(WindowType.MATCH_HISTORY, history.get(page * 5 + position));
        Wordle.getWindowManager().switchToWindow(WindowType.GAME_RESULTS);
    }

    @Override
    public void onShow() {
        nextButton.setEnabled(page + 1 < getMaxPageSize());
        previousButton.setEnabled(page > 0);

        updateComponents();
    }

    private int getMaxPageSize() {
        return (int) Math.ceil(Math.max(1, Wordle.getAccount().getMatchHistory().size() / 5d));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel correct1;
    private javax.swing.JLabel correct2;
    private javax.swing.JLabel correct3;
    private javax.swing.JLabel correct4;
    private javax.swing.JLabel correct5;
    private javax.swing.JLabel correctLabel;
    private javax.swing.JButton details1;
    private javax.swing.JButton details2;
    private javax.swing.JButton details3;
    private javax.swing.JButton details4;
    private javax.swing.JButton details5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel num1;
    private javax.swing.JLabel num2;
    private javax.swing.JLabel num3;
    private javax.swing.JLabel num4;
    private javax.swing.JLabel num5;
    private javax.swing.JLabel numLabel;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JButton previousButton;
    private javax.swing.JLabel result1;
    private javax.swing.JLabel result2;
    private javax.swing.JLabel result3;
    private javax.swing.JLabel result4;
    private javax.swing.JLabel result5;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
