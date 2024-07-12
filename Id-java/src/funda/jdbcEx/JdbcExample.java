package funda.jdbcEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class JdbcExample extends Exception {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
//            Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "test@123");

            // Create a Statement object
            Statement stmt = conn.createStatement();

            // Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM actor LIMIT 5");

            // Process the results
            while (rs.next()) {
                System.out.println(rs.getString("first_name"));
            }

//           //  Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}