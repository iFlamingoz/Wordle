package wordle.project.window;

import wordle.project.Wordle;
import wordle.project.data.WindowType;
import wordle.project.window.generic.Window;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameWindow extends Window implements KeyListener {
    private boolean isControlPressed;

    public GameWindow() {
        super(WindowType.GAME, "Wordle", true);
        setLayout(new GridLayout(6, 5, 20, 22));
    }

    @Override
    public void onShow() {
        if (!Wordle.getGameManager().isActive()) {
            Wordle.getGameManager().beginGame();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent event) {
        // space/escape key
        if (event.getKeyCode() == 32 || event.getKeyCode() == 27) {
            Wordle.getWindowManager().pause();
            return;
        }

        if (!Wordle.getGameManager().isActive() || Wordle.getWindowManager().getWindow().getWindowType() != WindowType.GAME)
            return;

        // enter, control, backspace
        switch (event.getKeyCode()) {
            case 10 -> Wordle.getGameManager().submitGuess();
            case 17 -> isControlPressed = true;
            case 8 -> {
                if (isControlPressed)
                    Wordle.getGameManager().getCurrentRow().reset();
                else
                    Wordle.getGameManager().inputLetter(null);
            }
        }

        // valid letter input
        if (event.getKeyCode() >= 65 && event.getKeyCode() <= 90)
            Wordle.getGameManager().inputLetter(String.valueOf(event.getKeyChar()).toUpperCase());
    }

    @Override
    public void keyReleased(KeyEvent event) {
        if (event.getKeyCode() == 17)
            isControlPressed = false;
    }
}