package wordle.project.data;

import lombok.Getter;
import wordle.project.Wordle;

import java.util.function.BiFunction;

public enum Setting {
    USERNAME("New Username", "change my username", (account, value) -> {
        if (value.length() > 12) {
            return "Username is too long (<13)!";
        }

        if (value.length() < 4) {
            return "Username is too short (>3)!";
        }

        if (Wordle.getDataManager().getAccount(value) != null) {
            return "An account with this username already exists!";
        }

        account.setUsername(value);
        Wordle.getDataManager().saveAccount();
        Wordle.getWindowManager().pause();
        return null;
    }),
    PASSWORD("New Password", "change my password", (account, value) -> {
        if (value.length() < 4) {
            return "Password is too short (>3)!";
        }

        account.setPassword(value);
        Wordle.getDataManager().saveAccount();
        Wordle.getWindowManager().pause();
        return null;
    }),
    DELETION("Current Username", "delete my account", (account, value) -> {
        if (!account.getUsername().equalsIgnoreCase(value)) {
            return "Input current username";
        }

        Wordle.setAccount(null);
        Wordle.getDataManager().getGeneralData().disableAutoLogin();
        Wordle.getDataManager().getAccounts().remove(account);
        Wordle.getDataManager().saveAccount();
        Wordle.getWindowManager().switchToWindow(WindowType.LOGIN);
        return null;
    });

    @Getter
    private final String input;
    @Getter
    private final String updateDescription;
    private final BiFunction<Account, String, String> action;

    Setting(String input, String updateDescription, BiFunction<Account, String, String> action) {
        this.input = input;
        this.updateDescription = updateDescription;
        this.action = action;
    }

    public String performAction(Account account, String value) {
        return action.apply(account, value);
    }
}
