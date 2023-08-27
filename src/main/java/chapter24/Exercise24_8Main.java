package chapter24;

import java.sql.*;

public class Exercise24_8Main {
    public static void main(String... args) throws SQLException {
        String findQuestion = "select question, answer from questions where answer is null";
        Connection c = DriverManager.getConnection("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");
        Statement statement = c.createStatement();
       boolean execute = statement.execute("CREATE table questions ( question VARCHAR(255), answer VARCHAR(255))");
        statement.execute("insert into questions (question, answer) values ('who?', 'foo')");
        statement.execute("insert into questions (question) values ('why?')");

        try(
            PreparedStatement ps = c.prepareStatement(findQuestion,
                    ResultSet.TYPE_FORWARD_ONLY,
                    ResultSet.CONCUR_UPDATABLE,
                    ResultSet.CLOSE_CURSORS_AT_COMMIT);
            ){
            c.setAutoCommit(false);
            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()){
                System.out.println(resultSet.getString(1));
                resultSet.updateString(1, "bar");
                resultSet.updateRow();
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
