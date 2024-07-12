package lab2.qn1;

// package name should start with small letter
// class name should start with captial letter
// method name should have camel case


public class WithOutZoom {

    private int roomId;
    private int capacity;
    private int floor;

    WithOutZoom(){

    }
    WithOutZoom(int id , int capacity , int floor) {
        this.roomId = id;
        this.capacity = capacity;
        this.floor = floor;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFloor() {
        return floor;
    }

    public int getRoomId() {
        return roomId;
    }

    // method to check if any already room are booked
    public Boolean isAvailable(String date , String time , int duration){
        return true;
    }


}
