package org.meetingroom.model;



public class StandardMeetingRoom extends MeetingRoom{

    StandardMeetingRoom(String roomId, int capacity, int floor) {
        super(roomId, capacity, floor);
    }

    @Override
    String getRoomDetails() {
        return "room id: "+ roomId + "capacity :"+ capacity+
                "floor: "+ floor;
    }

    @Override
    boolean isAvailable() {
        return false;
    }
}
