package wordle.project.window;

import wordle.project.Wordle;
import wordle.project.data.Account;
import wordle.project.data.Setting;
import wordle.project.data.WindowType;
import wordle.project.window.generic.Window;

public class SettingsWindow extends Window {
    public SettingsWindow() {
        super(WindowType.SETTING, "Wordle - Settings", true);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        deleteAccountButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        changePasswordButton = new javax.swing.JButton();
        changeUsernameButton = new javax.swing.JButton();
        titleLabel = createSection("Settings", false, 30);
        subtitleLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        accountIDLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        autoLoginLabel = new javax.swing.JLabel();
        gamesPlayedLabel = new javax.swing.JLabel();

        jLayeredPane1.setMaximumSize(new java.awt.Dimension(400, 800));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(400, 800));

        deleteAccountButton.setBackground(new java.awt.Color(255, 51, 51));
        deleteAccountButton.setFont(deleteAccountButton.getFont().deriveFont(deleteAccountButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        deleteAccountButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteAccountButton.setText("DELETE ACCOUNT");
        deleteAccountButton.setFocusable(false);
        deleteAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(deleteAccountButton);
        deleteAccountButton.setBounds(75, 620, 250, 50);

        backButton.setBackground(new java.awt.Color(255, 153, 102));
        backButton.setFont(backButton.getFont().deriveFont(backButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        backButton.setForeground(new java.awt.Color(0, 0, 0));
        backButton.setText("BACK");
        backButton.setFocusable(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(backButton);
        backButton.setBounds(75, 680, 250, 50);

        changePasswordButton.setBackground(new java.awt.Color(51, 153, 255));
        changePasswordButton.setFont(changePasswordButton.getFont().deriveFont(changePasswordButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        changePasswordButton.setForeground(new java.awt.Color(0, 0, 0));
        changePasswordButton.setText("CHANGE PASSWORD");
        changePasswordButton.setFocusable(false);
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(changePasswordButton);
        changePasswordButton.setBounds(75, 560, 250, 50);

        changeUsernameButton.setBackground(java.awt.Color.white);
        changeUsernameButton.setFont(changeUsernameButton.getFont().deriveFont(changeUsernameButton.getFont().getStyle() | java.awt.Font.BOLD, 20));
        changeUsernameButton.setForeground(new java.awt.Color(0, 0, 0));
        changeUsernameButton.setText("CHANGE USERNAME");
        changeUsernameButton.setFocusable(false);
        changeUsernameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeUsernameButtonActionPerformed(evt);
            }
        });
        jLayeredPane1.add(changeUsernameButton);
        changeUsernameButton.setBounds(75, 500, 250, 50);

        titleLabel.setText("titleLabel");
        jLayeredPane1.add(titleLabel);
        titleLabel.setBounds(0, 0, 400, 64);
        updateLabel(titleLabel, "");

        subtitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subtitleLabel.setForeground(java.awt.Color.red);
        subtitleLabel.setText("Account Information");
        jLayeredPane1.add(subtitleLabel);
        subtitleLabel.setBounds(0, 50, 400, 40);

        infoLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(255, 255, 255));
        infoLabel.setText("Game statistics can be found under leaderboards in the main menu");
        jLayeredPane1.add(infoLabel);
        infoLabel.setBounds(0, 210, 400, 30);

        accountIDLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        accountIDLabel.setForeground(new java.awt.Color(51, 255, 255));
        accountIDLabel.setText("accountIDLabel");
        accountIDLabel.setToolTipText("");
        jLayeredPane1.add(accountIDLabel);
        accountIDLabel.setBounds(0, 90, 400, 30);

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(51, 255, 255));
        usernameLabel.setText("usernameLabel");
        jLayeredPane1.add(usernameLabel);
        usernameLabel.setBounds(0, 120, 400, 30);

        autoLoginLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        autoLoginLabel.setForeground(new java.awt.Color(51, 255, 255));
        autoLoginLabel.setText("autoLoginLabel");
        jLayeredPane1.add(autoLoginLabel);
        autoLoginLabel.setBounds(0, 150, 400, 30);

        gamesPlayedLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gamesPlayedLabel.setForeground(new java.awt.Color(51, 255, 255));
        gamesPlayedLabel.setText("gamesPlayedLabel");
        jLayeredPane1.add(gamesPlayedLabel);
        gamesPlayedLabel.setBounds(0, 180, 400, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Wordle.getWindowManager().pause();
    }//GEN-LAST:event_backButtonActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        confirmChange(Setting.PASSWORD);
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void changeUsernameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeUsernameButtonActionPerformed
        confirmChange(Setting.USERNAME);
    }//GEN-LAST:event_changeUsernameButtonActionPerformed

    private void deleteAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountButtonActionPerformed
        confirmChange(Setting.DELETION);
    }//GEN-LAST:event_deleteAccountButtonActionPerformed

    private void confirmChange(Setting setting) {
        ((AccountChangeConfirmWindow) Wordle.getWindowManager().getWindow(WindowType.CONFIRM_SETTING)).switchSetting(setting);
        Wordle.getWindowManager().switchToWindow(WindowType.CONFIRM_SETTING);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountIDLabel;
    private javax.swing.JLabel autoLoginLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JButton changeUsernameButton;
    private javax.swing.JButton deleteAccountButton;
    private javax.swing.JLabel gamesPlayedLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onShow() {
        Account account = Wordle.getAccount();
        accountIDLabel.setText("Account ID: " + account.getID());
        usernameLabel.setText("Username: " + account.getUsername());
        autoLoginLabel.setText("Account login remember time: " + Wordle.getDataManager().getGeneralData().getAccountRememberTimeRemaining());
        gamesPlayedLabel.setText("Games played: " + account.getMatchHistory().size());
    }
}
