package org.meetingroom.dao;

import org.meetingroom.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

public class EmployeeDAO {

    public void getEmployeeDetail(int empid) throws SQLException, ClassNotFoundException {

        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement("");


    }

    public void checkRoomAvailable(String date, String time, String endTime, String roomType) throws SQLException, ClassNotFoundException {
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement("SELECT * from ");
    }
}
