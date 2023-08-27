package chapter24;

import java.sql.*;

public class JDBCMain {
    public static void main(String... args) throws SQLException {


        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");
            Statement statement = connection.createStatement();
            boolean execute = statement.execute("CREATE table users (id INT AUTO_INCREMENT , name VARCHAR(255), age INT )");
            System.out.println("Is result set (create table)" + execute);

            PreparedStatement insertUserStatement = connection.prepareStatement("insert into users (name, age) VALUES (?, ?)");
            insertUserStatement.setString(1, "foo");
            insertUserStatement.setInt(2, 3);
            boolean execute2 = insertUserStatement.execute();
            insertUserStatement.close();

            System.out.println("insert user 1 is result statement: " + execute2);

            PreparedStatement selectAllStatement = connection.prepareStatement("select * from users where 1 = 1");
            boolean execute1 = selectAllStatement.execute();
            System.out.println("Is result set (select all users" + execute1);
            ResultSet resultSet = selectAllStatement.getResultSet();
            System.out.println(resultSet.getType());
            System.out.println(resultSet.getConcurrency());
            System.out.println(resultSet.getHoldability());

            if (execute1) {
                while (resultSet.next()) {
                //    resultSet.updateString(1, "foo");
                  //  resultSet.updateRow();
                    System.out.println("User id: " + resultSet.getInt(1));
                    System.out.println("User name: " + resultSet.getString("name"));
                    System.out.println("User age: " + resultSet.getInt(3));
                }

            }
            resultSet.close();
            selectAllStatement.close();

        } finally {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }


    }
}
