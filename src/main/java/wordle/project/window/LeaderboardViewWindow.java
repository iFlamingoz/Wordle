package wordle.project.window;

import wordle.project.Wordle;
import wordle.project.data.Account;
import wordle.project.data.LeaderboardType;
import wordle.project.data.WindowType;
import wordle.project.window.generic.Window;

import javax.swing.*;
import java.util.List;

public class LeaderboardViewWindow extends Window {
    private LeaderboardType leaderboardType;
    private final JLabel[] userLabels;
    private final JLabel[] valueLabels;

    public LeaderboardViewWindow() {
        super(WindowType.LEADERBOARD_VIEW, "Wordle - Leaderboard View", true);
        initComponents();
        userLabels = new JLabel[]{oneUser, twoUser, threeUser, fourUser, fiveUser};
        valueLabels = new JLabel[]{oneValue, twoValue, threeValue, fourValue, fiveValue};
        typeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        oneUser = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        oneValue = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        twoUser = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        twoValue = new javax.swing.JLabel();
        fourUser = new javax.swing.JLabel();
        fourValue = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        threeUser = new javax.swing.JLabel();
        threeValue = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        fiveUser = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fiveValue = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();

        setLayout(null);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("title");
        titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        titleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLabel.setRequestFocusEnabled(false);
        titleLabel.setVerifyInputWhenFocusTarget(false);
        add(titleLabel);
        titleLabel.setBounds(0, 0, 400, 48);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setToolTipText("");
        add(jSeparator2);
        jSeparator2.setBounds(0, 218, 400, 14);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("#1");
        add(jLabel1);
        jLabel1.setBounds(0, 162, 50, 40);

        oneUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        oneUser.setForeground(new java.awt.Color(204, 204, 0));
        oneUser.setText("oneUser");
        add(oneUser);
        oneUser.setBounds(60, 164, 260, 48);

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

        oneValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        oneValue.setForeground(new java.awt.Color(255, 255, 255));
        oneValue.setText("XX ?????");
        add(oneValue);
        oneValue.setBounds(320, 170, 80, 48);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Username");
        add(jLabel4);
        jLabel4.setBounds(60, 120, 260, 32);

        typeLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(255, 255, 255));
        typeLabel.setText("typeLabel");
        typeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(typeLabel);
        typeLabel.setBounds(250, 120, 120, 32);

        twoUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        twoUser.setForeground(new java.awt.Color(204, 204, 204));
        twoUser.setText("twoUser");
        add(twoUser);
        twoUser.setBounds(60, 252, 260, 48);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("#2");
        add(jLabel7);
        jLabel7.setBounds(0, 250, 50, 40);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setToolTipText("");
        add(jSeparator3);
        jSeparator3.setBounds(0, 306, 400, 14);

        twoValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        twoValue.setForeground(new java.awt.Color(255, 255, 255));
        twoValue.setText("XX ?????");
        add(twoValue);
        twoValue.setBounds(320, 260, 80, 48);

        fourUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fourUser.setForeground(new java.awt.Color(102, 204, 255));
        fourUser.setText("fourUser");
        add(fourUser);
        fourUser.setBounds(60, 424, 260, 48);

        fourValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fourValue.setForeground(new java.awt.Color(255, 255, 255));
        fourValue.setText("XX ?????");
        add(fourValue);
        fourValue.setBounds(320, 430, 80, 48);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 255, 255));
        jLabel11.setText("#4");
        add(jLabel11);
        jLabel11.setBounds(0, 424, 50, 40);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setToolTipText("");
        add(jSeparator4);
        jSeparator4.setBounds(6, 478, 400, 14);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 255, 0));
        jLabel12.setText("#3");
        add(jLabel12);
        jLabel12.setBounds(0, 338, 50, 40);

        threeUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        threeUser.setForeground(new java.awt.Color(0, 204, 0));
        threeUser.setText("theeUser");
        add(threeUser);
        threeUser.setBounds(60, 338, 260, 48);

        threeValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        threeValue.setForeground(new java.awt.Color(255, 255, 255));
        threeValue.setText("XX ?????");
        add(threeValue);
        threeValue.setBounds(320, 340, 80, 48);

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setToolTipText("");
        add(jSeparator5);
        jSeparator5.setBounds(6, 392, 400, 14);

        fiveUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fiveUser.setForeground(new java.awt.Color(102, 204, 255));
        fiveUser.setText("fiveUser");
        add(fiveUser);
        fiveUser.setBounds(60, 510, 260, 48);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 255, 255));
        jLabel16.setText("#5");
        add(jLabel16);
        jLabel16.setBounds(0, 510, 50, 40);

        fiveValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fiveValue.setForeground(new java.awt.Color(255, 255, 255));
        fiveValue.setText("XX ?????");
        add(fiveValue);
        fiveValue.setBounds(320, 520, 80, 48);

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setToolTipText("");
        add(jSeparator6);
        jSeparator6.setBounds(0, 564, 400, 14);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Wordle.getWindowManager().switchToWindow(WindowType.LEADERBOARD_SELECTION);
    }//GEN-LAST:event_backButtonActionPerformed

    @Override
    public void onShow() {
        titleLabel.setText(leaderboardType.getFormattedName() + " Leaderboard");
        typeLabel.setText(leaderboardType.getFormattedName());
        List<Account> leaderboard = Wordle.getDataManager().getAccounts().stream().sorted(leaderboardType.comparator()).toList();
        List<Account> leaderboardTop = leaderboard.stream().limit(8).toList();

        for (int i = 0; i < 5; i++) {
            Account account = i < leaderboardTop.size() ? leaderboardTop.get(i) : null;
            userLabels[i].setText(account == null ? "N/A" : account.getUsername());
            valueLabels[i].setText(account == null ? "N/A" : String.valueOf(leaderboardType.getValue(account)));
        }
    }

    public void setLeaderboardType(LeaderboardType leaderboardType) {
        this.leaderboardType = leaderboardType;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel fiveUser;
    private javax.swing.JLabel fiveValue;
    private javax.swing.JLabel fourUser;
    private javax.swing.JLabel fourValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel oneUser;
    private javax.swing.JLabel oneValue;
    private javax.swing.JLabel threeUser;
    private javax.swing.JLabel threeValue;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel twoUser;
    private javax.swing.JLabel twoValue;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public String toString() {
        return "Leaderboard type: " + leaderboardType;
    }
}
