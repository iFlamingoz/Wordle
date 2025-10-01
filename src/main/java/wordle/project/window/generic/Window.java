package wordle.project.window.generic;

import wordle.project.data.WindowType;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public abstract class Window extends JPanel {
    private final String name;
    private final WindowType windowType;
    private final boolean canBePaused;

    protected Window(WindowType windowType, String name, boolean canBePaused) {
        this.windowType = windowType;
        this.canBePaused = canBePaused;
        this.name = name;
    }

    protected JLabel createSection(String title) {
        return createSection(title, true, 20);
    }

    protected JLabel createSection(String title, boolean addBorder, int titleSize) {
        JLabel label = new JLabel("", SwingConstants.LEFT);
        label.setVerticalAlignment(SwingConstants.TOP);
        label.setFont(label.getFont().deriveFont(Font.BOLD, 15));
        label.setForeground(Color.WHITE);

        final Border matteBorder = BorderFactory.createMatteBorder(addBorder ? 1 : 0, 0, 0, 0, Color.WHITE);
        TitledBorder border = BorderFactory.createTitledBorder(matteBorder, title);
        border.setTitleJustification(TitledBorder.CENTER);
        border.setTitleColor(Color.RED);
        border.setTitleFont(border.getTitleFont().deriveFont(Font.BOLD, titleSize));
        label.setBorder(border);

        return label;
    }

    protected String colour(String colour, String text) {
        return "<font color='" + colour + "'>" + text + "</font>";
    }

    protected void updateLabel(JLabel label, String text) {
        label.setText("<html>" + text.replace("\n", "<br>") + "</html>");
    }

    public abstract void onShow();

    public boolean canBePaused() {
        return canBePaused;
    }

    public String getTitle() {
        return name;
    }

    public WindowType getWindowType() {
        return windowType;
    }
}
