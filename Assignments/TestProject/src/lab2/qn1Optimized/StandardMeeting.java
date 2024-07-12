package lab2.qn1Optimized;

import java.util.Scanner;

public class StandardMeeting extends MeetingRoom{



    StandardMeeting(int roomId, int capacity, int floor) {
        super(roomId, capacity, floor);
    }

    @Override
    String getRoomDetails() {
        return "RoomId: " + roomId +"capacity: "+ capacity + "floor: "+floor;
    }

    @Override
    boolean isAvailable(int roomId, String roomType , String date,String time) {
        return true;
    }

    void getStandardDetailAlone(){

    }
}
