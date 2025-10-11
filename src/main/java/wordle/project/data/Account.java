package wordle.project.data;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Account implements Serializable {
    @Serial
    private static final long serialVersionUID = 1;
    private final int ID;
    private String username, password;

    private int wins;
    private int losses;
    private int totalGuesses;

    private List<GameData> matchHistory = new ArrayList<>();

    public Account(int ID, String username, String password) {
        this.ID = ID;
        this.username = username;
        this.password = password;
    }

    public Account(int ID, String username, String password, int wins, int losses, int totalGuesses, List<GameData> matchHistory) {
        this(ID, username, password);
        this.wins = wins;
        this.losses = losses;
        this.totalGuesses = totalGuesses;
        this.matchHistory = matchHistory;
    }

    public void addMatch(GameData gameData) {
        if (gameData.wonGame()) {
            wins++;
        } else {
            losses++;
        }

        totalGuesses += gameData.getGuessCount();
        matchHistory.add(gameData);
    }
}
