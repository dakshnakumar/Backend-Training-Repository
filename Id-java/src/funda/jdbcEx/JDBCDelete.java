package funda.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDelete{

    public static void main(String[] args) {
        
        try {//1. Load jdbc driver
//        Class.forName("com.mysql.jdbc.Driver");

            // 2.Make an connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root1", "test@123");

            // 3. Create statement
            Statement statement = connection.createStatement();

            // 4. Write query you want to execute
            int resultset = statement.executeUpdate("delete from test1");
        }
        catch (SQLException  e){
            throw new RuntimeException(e);
//            System.out.println(e.getMessage());
        }
    }

}
