package wordle.project.window.generic;

import lombok.Getter;
import lombok.experimental.Accessors;
import wordle.project.data.WindowType;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

@Getter
public abstract class Window extends JPanel {
    private final String title;
    private final WindowType windowType;
    @Accessors(fluent = true)
    private final boolean canBePaused;

    protected Window(WindowType windowType, String title, boolean canBePaused) {
        this.windowType = windowType;
        this.canBePaused = canBePaused;
        this.title = title;
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
}
