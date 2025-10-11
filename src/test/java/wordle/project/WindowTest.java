package wordle.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import wordle.project.data.WindowType;
import wordle.project.window.generic.Window;

import javax.swing.*;
import java.awt.*;

public class WindowTest {
    @Test
    void openJFrame() {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setBackground(new Color(75, 75, 75));
        frame.setBounds(screen.width / 2 - 200, screen.height / 2 - 400, 400, 800);
        frame.setVisible(true);
        frame.setVisible(false);
    }

    @Test
    void windowCreation() {
        for (WindowType windowType : WindowType.values()) {
            Window window = windowType.createWindow();
            Assertions.assertEquals(windowType, window.getWindowType());
        }
    }
}
