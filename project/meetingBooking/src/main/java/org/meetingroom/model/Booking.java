package org.meetingroom.model;
import org.meetingroom.util.DatabaseConnection;
import java.sql.*;

public class Booking {
    String bookingId;
    String employeeId;
    String roomId;
    String meetingDate;
    String meetTime;
    String duration;

    Booking() {

    }

    Booking(String bookingId, String employeeId, String roomId, String meetingDate, String meetTime, String duration) {
        this.bookingId = bookingId;
        this.employeeId = employeeId;
        this.roomId = roomId;
        this.meetingDate = meetingDate;
        this.meetTime = meetTime;
        this.duration = duration;
    }


    public String getBookingDetails(String bookingId) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM bookings WHERE booking_id= ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);) {

            statement.setString(1, bookingId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return "Booking ID: " + resultSet.getInt("booking_id") +
                            "Employee ID: " + resultSet.getInt("employee_id") +
                            "Room ID: " + resultSet.getInt("room_id") +
                            "Date: " + resultSet.getString("meeting_Date") +
                            "Time: " + resultSet.getString("meeting_time") +
                            "Duration :" + resultSet.getString("duration");


                } else return "No Booking is found";
            }
        }


    }

}
