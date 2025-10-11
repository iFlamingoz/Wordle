package wordle.project;

import org.junit.jupiter.api.Test;
import wordle.project.manager.ConfigManager;

public class ConfigLoadTest {
    @Test
    void loadConfig() {
        new ConfigManager();
    }
}
