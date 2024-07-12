package lab2.qn1Optimized;

abstract class MeetingRoom {
    int roomId;
    int capacity;
    int floor;

    MeetingRoom(int roomId, int capacity, int floor){
        this.roomId = roomId;
        this.capacity = capacity;
        this.floor = floor;
    }

    abstract String getRoomDetails();

    abstract boolean isAvailable(int roomId, String roomType , String date,String time);
}
