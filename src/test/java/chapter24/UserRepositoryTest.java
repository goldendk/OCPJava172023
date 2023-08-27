package chapter24;

import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

    private JdbcDataSource dataSource;

    @BeforeEach
    public void setup() throws SQLException {
        dataSource = new JdbcDataSource();
        dataSource.setURL("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");
        
        try (Connection connection = dataSource.getConnection();
             PreparedStatement createTable = connection.prepareStatement(
                "CREATE TABLE users (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "username VARCHAR(255)," +
                "email VARCHAR(255)" +
                ")"
             )) {
            createTable.execute();
        }
    }

    @AfterEach
    public void cleanup() throws SQLException {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement dropTable = connection.prepareStatement("DROP TABLE users")) {
            dropTable.execute();
        }
    }

    @Test
    public void testInsertAndRetrieveUser() throws SQLException {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement insertUser = connection.prepareStatement(
                "INSERT INTO users (username, email) VALUES (?, ?)")) {
            insertUser.setString(1, "testuser");
            insertUser.setString(2, "test@example.com");
            insertUser.execute();
        }

        try (Connection connection = dataSource.getConnection();
             PreparedStatement selectUser = connection.prepareStatement(
                "SELECT * FROM users WHERE username = ?")) {
            selectUser.setString(1, "testuser");
            try (ResultSet resultSet = selectUser.executeQuery()) {
                assertTrue(resultSet.next());
                assertEquals("testuser", resultSet.getString("username"));
                assertEquals("test@example.com", resultSet.getString("email"));
            }
        }
    }
}
