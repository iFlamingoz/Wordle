package wordle.project.manager;

import org.yaml.snakeyaml.Yaml;

import java.util.Map;

public class ConfigManager {
    private boolean enabled;
    private String address;
    private String database;
    private String username;
    private String password;

    public ConfigManager() {
        Yaml yaml = new Yaml();
        Map<String, Object> config = yaml.load(getClass().getClassLoader().getResourceAsStream("mysql.yml"));
        enabled = (boolean) config.get("enabled");
        address = (String) config.get("address");
        database = (String) config.get("database");
        username = (String) config.get("username");
        password = (String) config.get("password");
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getAddress() {
        return address;
    }

    public String getDatabase() {
        return database;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
