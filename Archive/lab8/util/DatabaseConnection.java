package lab8.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

        private static final String URL = "jdbc:mysql://localhost:3306/flightbooking";
        private static final String USER = "root";
        private static final String PASSWORD = "test@123";

        public static Connection getConnection() throws ClassNotFoundException, SQLException {


            return DriverManager.getConnection(URL,USER,PASSWORD);

        }
    }

