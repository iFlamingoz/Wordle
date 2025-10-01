package wordle.project.window;

import wordle.project.Wordle;
import wordle.project.data.Account;
import wordle.project.data.GameData;
import wordle.project.data.WindowType;
import wordle.project.window.generic.Window;

public class PauseWindow extends Window {
    public PauseWindow() {
        super(WindowType.PAUSE, "Wordle - Main Menu", false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        infoLabel = createSection("Wordle", false, 30);
        statisticsLabel = createSection("Overall Statistics");
        lastGameLabel = createSection("Previous Game");
        keybindindsLabel = createSection("Key Bindings");
        logoutButton = new javax.swing.JButton();
        leaderboardButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();
        matchHistoryButton = new javax.swing.JButton();
        playButton = new javax.swing.JButton();

        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        infoLabel.setText("InfoLabel");
        infoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        statisticsLabel.setText("statisticsLabel");
        statisticsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lastGameLabel.setText("lastGameLabel");
        lastGameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        keybindindsLabel.setText("keybindindsLabel");
        keybindindsLabel.setToolTipText("");
        keybindindsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logoutButton.setBackground(java.awt.Color.red);
        logoutButton.setFont(logoutButton.getFont().deriveFont(logoutButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        logoutButton.setForeground(new java.awt.Color(0, 0, 0));
        logoutButton.setText("LOGOUT");
        logoutButton.setFocusable(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        leaderboardButton.setBackground(new java.awt.Color(255, 204, 0));
        leaderboardButton.setFont(leaderboardButton.getFont().deriveFont(leaderboardButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        leaderboardButton.setForeground(new java.awt.Color(0, 0, 0));
        leaderboardButton.setText("LEADERBOARD");
        leaderboardButton.setFocusable(false);
        leaderboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderboardButtonActionPerformed(evt);
            }
        });

        settingsButton.setBackground(new java.awt.Color(51, 153, 255));
        settingsButton.setFont(settingsButton.getFont().deriveFont(settingsButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        settingsButton.setForeground(new java.awt.Color(0, 0, 0));
        settingsButton.setText("SETTINGS");
        settingsButton.setFocusable(false);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        matchHistoryButton.setBackground(java.awt.Color.white);
        matchHistoryButton.setFont(matchHistoryButton.getFont().deriveFont(matchHistoryButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        matchHistoryButton.setForeground(new java.awt.Color(0, 0, 0));
        matchHistoryButton.setText("MATCH HISTORY");
        matchHistoryButton.setFocusable(false);
        matchHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchHistoryButtonActionPerformed(evt);
            }
        });

        playButton.setBackground(java.awt.Color.green);
        playButton.setFont(playButton.getFont().deriveFont(playButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        playButton.setForeground(new java.awt.Color(0, 0, 0));
        playButton.setText("PLAY");
        playButton.setFocusable(false);
        playButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playButtonActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(infoLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(statisticsLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lastGameLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(keybindindsLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(logoutButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(leaderboardButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(settingsButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(matchHistoryButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(playButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statisticsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastGameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keybindindsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(matchHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(leaderboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(100, 100, 100))
        );
        jLayeredPane1Layout.setVerticalGroup(
                jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastGameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statisticsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(keybindindsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(playButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(leaderboardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(matchHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        updateLabel(infoLabel, "Guess a 5-letter-word. You get 6 guesses.\nOnce you guess a word, letters that are:\n"
                + "- <font color='red'>wrong</font>: will be labeled <font color='red'>red</font>.\n"
                + "- <font color='#b4b200'>in wrong position</font>: will be labeled <font color='#b4b200'>yellow</font>.\n"
                + "-  <font color='green'>correct</font>: will be labeled <font color='green'>green</font>.\n");
        updateLabel(keybindindsLabel, colour("orange", "Pause: Escape/Space\n") + colour("orange", "Delete all: Control + Backspace"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Wordle.setAccount(null);
        Wordle.getDataManager().getGeneralData().disableAutoLogin();
        Wordle.getWindowManager().switchToWindow(WindowType.LOGIN);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void leaderboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderboardButtonActionPerformed
        Wordle.getWindowManager().switchToWindow(WindowType.LEADERBOARD_SELECTION);
    }//GEN-LAST:event_leaderboardButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        Wordle.getWindowManager().switchToWindow(WindowType.SETTING);
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void matchHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchHistoryButtonActionPerformed
        Wordle.getWindowManager().switchToWindow(WindowType.MATCH_HISTORY);
    }//GEN-LAST:event_matchHistoryButtonActionPerformed

    private void playButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playButtonActionPerformed
        Wordle.getWindowManager().switchToWindow(WindowType.GAME);
    }//GEN-LAST:event_playButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel keybindindsLabel;
    private javax.swing.JLabel lastGameLabel;
    private javax.swing.JButton leaderboardButton;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton matchHistoryButton;
    private javax.swing.JButton playButton;
    private javax.swing.JButton settingsButton;
    private javax.swing.JLabel statisticsLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onShow() {
        Account account = Wordle.getAccount();
        GameData lastGame = account.getMatchHistory().isEmpty() ? null : account.getMatchHistory().get(account.getMatchHistory().size() - 1);

        if (lastGame == null) {
            updateLabel(lastGameLabel, "This section outlines your last game played.\n"
                    + "Currently blank as you haven't played a game yet.");
        } else {
            updateLabel(lastGameLabel, "You " + (lastGame.wonGame() ? colour("green", "won") : colour("red", "lost"))
                    + " your previous game in " + lastGame.getGuessCount() + " guess(es)!"
                    + "\nThe word was '" + colour("aqua", lastGame.getWord()) + "'");
        }

        int wins = account.getWins();
        int losses = account.getLosses();
        String winPercent = wins == 0 && losses == 0 ? "N/A" : String.format("%.2f", (wins / (double) (wins + losses)) * 100d);

        updateLabel(statisticsLabel, colour("green", "Wins: " + wins) + "\n"
                + colour("red", "Losses: " + losses) + "\n"
                + colour("#b4b200", "Win Percent: " + winPercent + "%") + "\n"
                + colour("white", "Total Games/Guesses: " + (wins + losses)) + "/" + account.getTotalGuesses() + "\n");
    }
}
