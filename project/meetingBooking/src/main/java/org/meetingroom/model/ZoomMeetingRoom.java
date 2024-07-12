package org.meetingroom.model;

import org.meetingroom.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ZoomMeetingRoom extends MeetingRoom {

    int zoomId;
    int zoomAccountId;

    ZoomMeetingRoom(String roomId, int capacity, int floor, int zoomId, int zoomAccountId) {
        super(roomId, capacity, floor);
        this.zoomId = zoomId;
        this.zoomAccountId = zoomAccountId;
    }

    @Override
    String getRoomDetails() {
        return "room :" + roomId + " capacity : " + capacity +
                " floor :" + floor;
    }

    @Override
    boolean isAvailable() {
        return false;
    }

    public void createRoom(int roomId,int capacity,int floor,int zoomId,int zoomAccountId) throws SQLException, ClassNotFoundException {

            String sql = "INSERT into meetingrooms (room_id,room_type,capacity,floor,zoom_device_id,zoom_account_id) VALUES (" +
                    roomId + "," + capacity + "," + floor + "," + zoomId + "," + zoomAccountId + ");";

            try(Connection connection = DatabaseConnection.getConnection();
                Statement statement = connection.createStatement();){

                System.out.println("Statement Created");

                ResultSet resultSet = statement.executeQuery(sql);
                System.out.println("No of rows inserted: " + resultSet.getMetaData());
            }
        }

    }



