package wordle.project.window;

import wordle.project.Wordle;
import wordle.project.data.Account;
import wordle.project.data.WindowType;
import wordle.project.window.generic.Window;

import java.awt.*;

public class LoginWindow extends Window {
    private boolean login = true;

    public LoginWindow() {
        super(WindowType.LOGIN, "Wordle - Login", true);
        initComponents();
    }

    @Override
    public void onShow() {
    }

    public void switchLoginType() {
        login = !login;

        Point registerButtonLoc = registerButton.getLocation().getLocation();
        registerButton.setLocation(loginButton.getLocation());
        loginButton.setLocation(registerButtonLoc);

        if (login) {
            titleLabel.setText("Account Login");
            subtitleLabel.setText("Enter login infromation");
        } else {
            titleLabel.setText("Account Registration");
            subtitleLabel.setText("Enter details for a new account");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPane = new javax.swing.JLayeredPane();
        titleLabel = new javax.swing.JLabel();
        subtitleLabel = new javax.swing.JLabel();
        usernameInput = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        passwordLabel = new javax.swing.JLabel();
        autoLogin = new javax.swing.JCheckBox();
        errorLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 800));

        loginPane.setPreferredSize(new java.awt.Dimension(400, 800));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 0, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if (login) {
            titleLabel.setText("Account Login");
        } else {
            titleLabel.setText("Account Registration");
        }
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
        subtitleLabel.setText("Enter login information");
        subtitleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subtitleLabel.setVerifyInputWhenFocusTarget(false);
        loginPane.add(subtitleLabel);
        subtitleLabel.setBounds(0, 210, 400, 30);

        usernameInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernameInput.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameInput.setActionCommand("<Not Set>");
        usernameInput.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernameInput.setName(""); // NOI18N
        usernameInput.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        usernameInput.setVerifyInputWhenFocusTarget(false);
        loginPane.add(usernameInput);
        usernameInput.setBounds(170, 260, 180, 26);

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username");
        usernameLabel.setVerifyInputWhenFocusTarget(false);
        loginPane.add(usernameLabel);
        usernameLabel.setBounds(70, 260, 70, 20);

        loginButton.setBackground(java.awt.Color.green);
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 0, 0));
        loginButton.setText("Login");
        loginButton.setFocusCycleRoot(true);
        loginButton.setVerifyInputWhenFocusTarget(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginPane.add(loginButton);
        loginButton.setBounds(130, 400, 150, 32);

        registerButton.setBackground(new java.awt.Color(0, 102, 255));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.setVerifyInputWhenFocusTarget(false);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        loginPane.add(registerButton);
        registerButton.setBounds(130, 440, 150, 32);

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Passsword");
        passwordLabel.setVerifyInputWhenFocusTarget(false);
        loginPane.add(passwordLabel);
        passwordLabel.setBounds(70, 300, 70, 20);

        autoLogin.setBackground(new java.awt.Color(75, 75, 75));
        autoLogin.setForeground(new java.awt.Color(255, 255, 255));
        autoLogin.setText("Keep account logged in? (30 minutes)");
        loginPane.add(autoLogin);
        autoLogin.setBounds(80, 340, 240, 20);

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

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if (!login) {
            switchLoginType();
            return;
        }

        String user = usernameInput.getText().toLowerCase();
        String password = passwordInput.getText();
        Account account = Wordle.getDataManager().getAccount(user);

        if (account == null || !account.getPassword().equals(password)) {
            errorLabel.setText("Incorrect user or password");
            return;
        }

        if (autoLogin.isSelected()) {
            Wordle.getDataManager().getGeneralData().autoLogin(account.getID());
        }

        resetFields();
        Wordle.setAccount(account);
        Wordle.getWindowManager().pause();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        if (login) {
            switchLoginType();
            return;
        }

        String user = usernameInput.getText().toLowerCase();
        String password = passwordInput.getText();

        if (!validateCredentials(user, password))
            return;

        if (Wordle.getDataManager().getAccount(user) != null) {
            error("An account with this username already exists!");
            return;
        }

        Account account = Wordle.getDataManager().createAccount(user, password);
        Wordle.setAccount(account);

        if (autoLogin.isSelected())
            Wordle.getDataManager().getGeneralData().autoLogin(account.getID());

        resetFields();
        Wordle.getWindowManager().pause();
    }//GEN-LAST:event_registerButtonActionPerformed

    public void error(String error) {
        errorLabel.setText(error);
    }

    public void resetFields() {
        usernameInput.setText("");
        passwordInput.setText("");
        autoLogin.setSelected(false);
        errorLabel.setText("");
    }

    public boolean validateCredentials(String user, String password) {
        if (user.length() > 12) {
            error("Username is too long (<13)!");
            return false;
        }

        if (user.length() < 4) {
            error("Username is too short (>3)!");
            return false;
        }

        if (password.length() < 4) {
            error("Password is too short (>3)!");
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox autoLogin;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLayeredPane loginPane;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel subtitleLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField usernameInput;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
