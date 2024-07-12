package funda.jdbcEx;

import java.sql.*;

public class JDBCInsert extends Exception {

    public static void main(String[] args) {

        try { // 1.Load the Driver
//            Class.forName("com.mysql.jdbc.Driver");

            //2.Create a connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "test@123");
            System.out.println("Made connection successfully");

            //3.Create an object for statement to execute the query
            Statement statement = connection.createStatement();
            System.out.println("Create statement successfully");

            //4.Send query to the database
            int resultSet = statement.executeUpdate("Insert into test1 (ID,f_name,l_name,email) values (1,'dakshna','kumar','daksh@gmail.com') ");

            System.out.println("No.of.Affected Rows "+ resultSet);
        }catch (Exception e){

            System.out.println(e.getMessage());
        }

    }

}
