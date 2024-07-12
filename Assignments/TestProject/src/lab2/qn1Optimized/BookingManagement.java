package lab2.qn1Optimized;

import java.util.ArrayList;
import java.util.List;

public class BookingManagement extends MeetingRoom {
    BookingManagement(int roomId, int capacity, int floor) {
        super(roomId, capacity, floor);
    }

//    Map<LocalDate, List<EmployeeDetails>> bookings = new HashMap<>();
//    public  List<MeetingRoom>;


    void addBooking(EmployeeDetails employeeDetails){

//        bookings.put(employeeDetails.);
    }

    @Override
    String getRoomDetails() {
        return "";
    }

    @Override
    boolean isAvailable(int roomId, String roomType, String date, String time) {
        return false;
    }
}
