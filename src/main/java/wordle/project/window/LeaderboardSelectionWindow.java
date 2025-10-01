package wordle.project.window;

import wordle.project.Wordle;
import wordle.project.data.LeaderboardType;
import wordle.project.data.WindowType;
import wordle.project.window.generic.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class LeaderboardSelectionWindow extends Window {
    public LeaderboardSelectionWindow() {
        super(WindowType.LEADERBOARD_SELECTION, "Wordle - Leaderboard Selection", true);
        initComponents();
        addLeaderboards();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Leaderboards");
        titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        titleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLabel.setRequestFocusEnabled(false);
        titleLabel.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(titleLabel)
                                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(titleLabel)
                                .addContainerGap(747, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addLeaderboards() {
        int yPointer = 250;

        for (LeaderboardType type : LeaderboardType.values()) {
            JButton button = new JButton(type.getFormattedName() + " Leaderboard");
            button.setBackground(type.getColour());
            button.setFont(button.getFont().deriveFont(Font.BOLD, 18));
            button.setBounds(50, yPointer, 300, 60);
            add(button);
            yPointer += 80;

            button.addActionListener(event -> onLeaderboardButtonPressed(event, type));
        }

        JButton backButton = new JButton("Back");
        backButton.setBackground(Color.RED);
        backButton.setFont(backButton.getFont().deriveFont(Font.BOLD, 18));
        backButton.setBounds(100, 650, 200, 60);
        add(backButton);

        backButton.addActionListener(event -> Wordle.getWindowManager().pause());
    }

    public void onLeaderboardButtonPressed(ActionEvent event, LeaderboardType type) {
        LeaderboardViewWindow lbViewWindow = (LeaderboardViewWindow) Wordle.getWindowManager().getWindow(WindowType.LEADERBOARD_VIEW);
        lbViewWindow.setLeaderboardType(type);
        Wordle.getWindowManager().switchToWindow(WindowType.LEADERBOARD_VIEW);
    }

    @Override
    public void onShow() {

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
