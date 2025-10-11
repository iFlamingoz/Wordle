package wordle.project.manager;

import lombok.Getter;
import org.yaml.snakeyaml.Yaml;

import java.util.Map;

@Getter
public class ConfigManager {
    private final boolean enabled;
    private final String address;
    private final String database;
    private final String username;
    private final String password;

    public ConfigManager() {
        Yaml yaml = new Yaml();
        Map<String, Object> config = yaml.load(getClass().getClassLoader().getResourceAsStream("mysql.yml"));
        enabled = (boolean) config.get("enabled");
        address = (String) config.get("address");
        database = (String) config.get("database");
        username = (String) config.get("username");
        password = (String) config.get("password");
    }
}
