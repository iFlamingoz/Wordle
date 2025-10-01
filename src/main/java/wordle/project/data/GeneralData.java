package wordle.project.data;

import wordle.project.Wordle;

import java.io.Serial;
import java.io.Serializable;

public class GeneralData implements Serializable {
    @Serial
    private static final long serialVersionUID = 2;
    private static final int accountRememberTime = 1800000;

    private Integer autoLoginAccountID = -1;
    private long autoLoginTime;

    public Account getAutoLoginAccount() {
        if (autoLoginAccountID == -1 || System.currentTimeMillis() - autoLoginTime >= accountRememberTime)
            return null;

        return Wordle.getDataManager().getAccount(autoLoginAccountID);
    }

    public String getAccountRememberTimeRemaining() {
        return String.format("%.1f", (accountRememberTime - (System.currentTimeMillis() - autoLoginTime)) / 1000f / 60f);
    }

    public void autoLogin(int accountID) {
        autoLoginTime = System.currentTimeMillis();
        autoLoginAccountID = accountID;
        Wordle.getDataManager().saveGeneralData();
    }

    public void disableAutoLogin() {
        autoLoginTime = -1;
        autoLoginAccountID = -1;
        Wordle.getDataManager().saveGeneralData();
    }
}