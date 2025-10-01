package wordle.project.manager;

import wordle.project.Wordle;
import wordle.project.data.Account;
import wordle.project.data.WindowType;
import wordle.project.window.generic.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.HashMap;

public class WindowManager {
    private final JFrame frame = new JFrame();
    private Window currentWindow;
    private final HashMap<WindowType, Window> windowInstances = new HashMap<>();

    public WindowManager() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBackground(new Color(75, 75, 75));
        frame.setBounds(screen.width / 2 - 200, screen.height / 2 - 400, 400, 800);

        for (WindowType windowType : WindowType.values()) {
            Window window = windowType.createWindow();
            window.setBackground(new Color(75, 75, 75));
            windowInstances.put(windowType, window);
        }

        WindowType startWindow = WindowType.LOGIN;
        Account autoLogin = Wordle.getDataManager().getGeneralData().getAutoLoginAccount();

        if (autoLogin != null) {
            startWindow = WindowType.PAUSE;
            Wordle.setAccount(autoLogin);
        }

        currentWindow = windowInstances.get(startWindow);
        currentWindow.onShow();
        frame.setTitle(currentWindow.getTitle());
        frame.addKeyListener((KeyListener) windowInstances.get(WindowType.GAME));
        frame.add(currentWindow);
        frame.setVisible(true);
    }

    public void pause() {
        if (currentWindow.canBePaused()) {
            switchToWindow(WindowType.PAUSE);
        }
    }

    public boolean isPaused() {
        return currentWindow.getWindowType() == WindowType.PAUSE;
    }

    public void switchToWindow(WindowType type) {
        if (currentWindow.getWindowType() == type) {
            return;
        }

        Window window = getWindow(type);
        window.onShow();
        frame.remove(currentWindow);
        currentWindow = window;
        frame.setTitle(currentWindow.getTitle());
        frame.add(currentWindow);
        currentWindow.revalidate();
        currentWindow.repaint();
        frame.requestFocusInWindow();
    }

    public Window getWindow(WindowType type) {
        return windowInstances.get(type);
    }

    public Window getWindow() {
        return currentWindow;
    }
}
