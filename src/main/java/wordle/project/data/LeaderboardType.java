package wordle.project.data;

import lombok.Getter;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public enum LeaderboardType {
    WINS(Account::getWins, Color.YELLOW),
    WIN_PERCENT(v -> (int) (v.getWins() / (double) (v.getWins() + v.getLosses()) * 100), Color.CYAN),
    GUESSES(Account::getTotalGuesses, Color.GREEN);

    @Getter
    private final String formattedName;
    private final ToIntFunction<Account> keyGetter;
    private final Comparator<Account> comparator;
    @Getter
    private final Color colour;

    LeaderboardType(ToIntFunction<Account> keyGetter, Color colour) {
        this.formattedName = String.join(" ", Arrays.stream(name().split("_")).map(v -> v.substring(0, 1).toUpperCase() + v.substring(1).toLowerCase()).toList());
        this.keyGetter = keyGetter;
        this.comparator = Comparator.comparingInt(keyGetter).reversed();
        this.colour = colour;
    }

    public int getValue(Account account) {
        return keyGetter.applyAsInt(account);
    }

    public Comparator<Account> comparator() {
        return comparator;
    }
}