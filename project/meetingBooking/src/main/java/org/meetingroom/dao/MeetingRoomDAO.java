package org.meetingroom.dao;

import org.meetingroom.util.DatabaseConnection;

import java.sql.*;

public class MeetingRoomDAO{

    public void getZoomDetails() throws SQLException, ClassNotFoundException {

        Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * from meetingrooms WHERE room_type=zoom");
        System.out.println("Result set returned");
        while(resultSet.next()){
            System.out.println();
        }
    }
}
