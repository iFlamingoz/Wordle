package wordle.project.window;

import wordle.project.Wordle;
import wordle.project.data.GameData;
import wordle.project.data.WindowType;
import wordle.project.window.generic.Window;

import java.awt.*;

public class GameResultsWindow extends Window {
    private final Label[][] labels = new Label[6][5];
    private WindowType returnWindow;
    private GameData game;

    public GameResultsWindow() {
        super(WindowType.GAME_RESULTS, "Wordle - Game Results", false);
        initComponents();
        gridPanel.setLayout(new GridLayout(6, 5, 20, 22));
        gridPanel.setBackground(new Color(75, 75, 75));
        gridPanel.setSize(50, 50);

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 5; y++) {
                Label label = new Label("-", Label.CENTER);
                gridPanel.add(label);
                labels[x][y] = label;
                label.setFont(label.getFont().deriveFont(Font.BOLD, 40));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        infoLabel = new javax.swing.JLabel();
        gridPanel = new javax.swing.JPanel();

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Game Over");
        titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        titleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLabel.setRequestFocusEnabled(false);
        titleLabel.setVerifyInputWhenFocusTarget(false);

        backButton.setBackground(new java.awt.Color(0, 255, 204));
        backButton.setFont(backButton.getFont().deriveFont(backButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("Continue");
        backButton.setFocusable(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        infoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setText("InfoLabel");

        javax.swing.GroupLayout gridPanelLayout = new javax.swing.GroupLayout(gridPanel);
        gridPanel.setLayout(gridPanelLayout);
        gridPanelLayout.setHorizontalGroup(
                gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        gridPanelLayout.setVerticalGroup(
                gridPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 453, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(gridPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(125, 125, 125)
                                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(titleLabel)
                                .addGap(37, 37, 37)
                                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gridPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Wordle.getWindowManager().switchToWindow(returnWindow);
    }//GEN-LAST:event_backButtonActionPerformed

    @Override
    public void onShow() {
        updateLabel(infoLabel, "You have " + (game.wonGame() ? colour("green", "won") : colour("red", "lost"))
                + (game.wonGame() ? " in " + game.getGuessCount() + " guess(es)!" : " the game.")
                + "\nThe word was '" + colour("aqua", game.getWord()) + "'");

        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 5; y++) {
                labels[x][y].setText("-");
                labels[x][y].setBackground(new Color(255, 255, 255));
            }
        }

        for (int x = 0; x < game.getGuessCount(); x++) {
            String[] inputWord = game.getGuessData()[x].getInputWord().split("");

            for (int y = 0; y < 5; y++) {
                labels[x][y].setText(inputWord[y]);
                labels[x][y].setBackground(game.getGuessData()[x].getResults()[y].getColour());
            }
        }
    }

    public void setData(WindowType returnWindow, GameData game) {
        this.returnWindow = returnWindow;
        this.game = game;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel gridPanel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
