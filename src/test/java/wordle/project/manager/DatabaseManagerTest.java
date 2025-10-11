package wordle.project.manager;

import org.junit.jupiter.api.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

class DatabaseManagerTest {
    @Test
    void testH2Connection() throws SQLException {
        DriverManager.getConnection("jdbc:h2:mem:test");
    }
}