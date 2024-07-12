package org.meetingroom.model;

import org.meetingroom.util.DatabaseConnection;

import java.sql.*;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Employee extends Booking{

    String employeeId;

    public void getemployeeId(){

    }

    public void bookMeetingRoom() throws SQLException,ClassNotFoundException {
        String sql = "INSERT into bookings(booking_id,room_id,employee_id,date,start_time,duration) values(?,?,?,?)";

        try(Connection connection = DatabaseConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);){

            statement.setString(1,bookingId);
            statement.setString(2,employeeId);
            statement.setString(3,roomId);
            statement.setString(4,meetingDate);
            statement.setString(5,meetTime);
            statement.setString(6,duration);

            try(ResultSet resultSet = statement.executeQuery()) {
                System.out.println("Query executed");
            }
        }
    }

    public void deleteBooking(int booking_id) throws SQLException,ClassNotFoundException {

        String sql = "DELETE FROM bookings WHERE booking_id='"+booking_id +"'";

        try(Connection connection = DatabaseConnection.getConnection();
            Statement statement = connection.createStatement();){

            System.out.println("Statement Created");

            int affectedRows = statement.executeUpdate(sql);
            System.out.println("No of rows deleted: " + affectedRows);
        }
    }

    private boolean isRoomAvailable( String date, String time, String endTime,String roomType) {
     //Write a query which reterive data from database

        return true;
    }

//    private boolean saveBooking(Booking )

}

class BookingException extends RuntimeException{
    BookingException(String message){
        super(message);
    }
}




