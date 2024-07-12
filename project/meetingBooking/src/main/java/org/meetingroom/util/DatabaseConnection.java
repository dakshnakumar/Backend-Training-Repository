package org.meetingroom.util;

import java.sql.*;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/roombooking";
    private static final String USER = "root";
    private static final String PASSWORD = "test@123";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        //Declare the class
//        Class.forName("com.mysql.jdbc.Driver");
//
//        //Create a connection
//        Connection connection = DriverManager.getConnection("", "", "test@123");
//
//        //3.Create an statement
////        PreparedStatement statement = connection.prepareStatement("insert into user (user_id, email, first_name, last_name) values (?,?,?,?)");
//        System.out.println("Connection established!");
//
//
//        connection.close();
//        System.out.println("Connection closed");

        return DriverManager.getConnection(URL,USER,PASSWORD);


    }
}
