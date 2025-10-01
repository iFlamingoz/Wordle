package wordle.project.data;

import wordle.project.window.*;
import wordle.project.window.generic.Window;

public enum WindowType {
    LOGIN(LoginWindow.class),
    PAUSE(PauseWindow.class),
    GAME(GameWindow.class),
    GAME_RESULTS(GameResultsWindow.class),
    LEADERBOARD_SELECTION(LeaderboardSelectionWindow.class),
    LEADERBOARD_VIEW(LeaderboardViewWindow.class),
    MATCH_HISTORY(MatchHistoryWindow.class),
    SETTING(SettingsWindow.class),
    CONFIRM_SETTING(AccountChangeConfirmWindow.class);

    private final Class<? extends Window> windowClass;

    WindowType(Class<? extends Window> windowClass) {
        this.windowClass = windowClass;
    }

    public Window createWindow() {
        try {
            return windowClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
