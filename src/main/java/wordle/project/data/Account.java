package wordle.project.data;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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

    public int getID() {
        return ID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getTotalGuesses() {
        return totalGuesses;
    }

    public List<GameData> getMatchHistory() {
        return matchHistory;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
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
