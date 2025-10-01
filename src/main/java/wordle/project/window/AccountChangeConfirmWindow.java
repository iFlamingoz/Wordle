package wordle.project.window;

import wordle.project.Wordle;
import wordle.project.data.Setting;
import wordle.project.data.WindowType;
import wordle.project.window.generic.Window;

public class AccountChangeConfirmWindow extends Window {
    private Setting setting;

    public AccountChangeConfirmWindow() {
        super(WindowType.CONFIRM_SETTING, "Wordle - Login", true);
        initComponents();
    }

    @Override
    public void onShow() {
    }

    public void switchSetting(Setting setting) {
        this.setting = setting;

        if (setting != Setting.DELETION)
            subtitleLabel.setText("Enter " + setting.getInput());
        else
            subtitleLabel.setText("Confirm account deletion");

        inputLabel.setText(setting.getInput());
        confirmCheck.setText("I am aware that this will " + setting.getUpdateDescription());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPane = new javax.swing.JLayeredPane();
        titleLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        valueInput = new javax.swing.JTextField();
        inputLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        confirmCheck = new javax.swing.JCheckBox();
        errorLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frame"); // NOI18N

        loginPane.setPreferredSize(new java.awt.Dimension(400, 800));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Setting Confirmation");
        titleLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        titleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        titleLabel.setRequestFocusEnabled(false);
        titleLabel.setVerifyInputWhenFocusTarget(false);
        loginPane.add(titleLabel);
        titleLabel.setBounds(0, 0, 400, 48);
        titleLabel.getAccessibleContext().setAccessibleDescription("");

        subtitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        subtitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        subtitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitleLabel.setText("Enter login infromation");
        subtitleLabel.setToolTipText("");
        subtitleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subtitleLabel.setVerifyInputWhenFocusTarget(false);
        loginPane.add(subtitleLabel);
        subtitleLabel.setBounds(0, 210, 400, 30);

        valueInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        valueInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        valueInput.setActionCommand("<Not Set>");
        valueInput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        valueInput.setName(""); // NOI18N
        valueInput.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        valueInput.setVerifyInputWhenFocusTarget(false);
        loginPane.add(valueInput);
        valueInput.setBounds(170, 260, 180, 26);

        inputLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputLabel.setForeground(new java.awt.Color(255, 255, 255));
        inputLabel.setText("Username");
        inputLabel.setVerifyInputWhenFocusTarget(false);
        loginPane.add(inputLabel);
        inputLabel.setBounds(30, 260, 140, 20);

        confirmButton.setBackground(java.awt.Color.green);
        confirmButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(0, 0, 0));
        confirmButton.setText("Confirm");
        confirmButton.setFocusCycleRoot(true);
        confirmButton.setFocusPainted(false);
        confirmButton.setFocusable(false);
        confirmButton.setVerifyInputWhenFocusTarget(false);
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        loginPane.add(confirmButton);
        confirmButton.setBounds(130, 400, 150, 32);

        backButton.setBackground(new java.awt.Color(0, 102, 255));
        backButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.setFocusable(false);
        backButton.setVerifyInputWhenFocusTarget(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        loginPane.add(backButton);
        backButton.setBounds(130, 440, 150, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Current Passsword");
        jLabel2.setVerifyInputWhenFocusTarget(false);
        loginPane.add(jLabel2);
        jLabel2.setBounds(30, 300, 130, 20);

        confirmCheck.setBackground(new java.awt.Color(75, 75, 75));
        confirmCheck.setForeground(new java.awt.Color(255, 255, 255));
        confirmCheck.setText("I am aware that this will");
        loginPane.add(confirmCheck);
        confirmCheck.setBounds(50, 340, 300, 20);

        errorLabel.setForeground(new java.awt.Color(255, 0, 0));
        errorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginPane.add(errorLabel);
        errorLabel.setBounds(71, 234, 280, 18);
        loginPane.add(passwordInput);
        passwordInput.setBounds(170, 300, 180, 26);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(loginPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(loginPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        loginPane.getAccessibleContext().setAccessibleName("");
        loginPane.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String input = valueInput.getText().toLowerCase();
        String password = passwordInput.getText();

        if (!Wordle.getAccount().getPassword().equals(password)) {
            errorLabel.setText("Incorrect password");
            return;
        }

        if (!confirmCheck.isSelected()) {
            errorLabel.setText("Confirm using the confirmation box");
            return;
        }

        String error = setting.performAction(Wordle.getAccount(), input);

        if (error != null) {
            error(error);
            return;
        }

        resetFields();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        resetFields();
        Wordle.getWindowManager().switchToWindow(WindowType.SETTING);
    }//GEN-LAST:event_backButtonActionPerformed

    public void error(String error) {
        errorLabel.setText(error);
    }

    private void resetFields() {
        valueInput.setText("");
        passwordInput.setText("");
        confirmCheck.setSelected(false);
        errorLabel.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JCheckBox confirmCheck;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane loginPane;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField valueInput;
    // End of variables declaration//GEN-END:variables
}
