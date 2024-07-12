package funda.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCSelect extends Exception {

    // Steps to follow to work with JDBC

    public static void main(String[] args) {

        try { // 1.Load the driver, its is optional
//            Class.forName("com.mysql.jdbc.Driver");

            // 2.Establish the connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "test@123");

            // 3.Create a statement object
            Statement statement = conn.createStatement();

            // 4.Execute the query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM test1 limit 4");

            while (resultSet.next()){
                System.out.println("FirstName: "+resultSet.getString("f_name"));
                System.out.println("LastName: "+resultSet.getString("l_name"));
                System.out.println("email: "+resultSet.getString("email"));
                System.out.println("----------****-----------");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
