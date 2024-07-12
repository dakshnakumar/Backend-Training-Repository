package lab2.qn1;

import java.util.ArrayList;
import java.util.Scanner;

public class BookingSystem extends Booking {
    public static void main(String[] args) {

        int id;
        int capacity;
        int floor;
        int zoomDeviceId;
        int zoomAccountId;
        boolean num = true;
        int task;
        int roomId = 0;
        String meetDate = "";
        String meetTime = "";
        int duration = 0;
        String date;
        String time;

        Scanner input = new Scanner(System.in);
        BookingSystem bookingSystem = new BookingSystem();


//        for (int i = 0; i < 5; i++) {

            while(num) {

                System.out.println("Enter the operation you want perform");

                System.out.println("1.Book Room");
                System.out.println("2.Get meeting details");
                System.out.println("3.Details about available room");
                System.out.println("4.Break");

                task = input.nextInt();

                if (task == 1) {
                    System.out.println("Enter the Employee ID");
                    id = input.nextInt();

                    System.out.println("Enter the capacity");
                    capacity = input.nextInt();

                    System.out.println("Enter the floor number");
                    floor = input.nextInt();

                    System.out.println("Enter the ZoomDeviceId");
                    zoomDeviceId = input.nextInt();

                    System.out.println("Enter the ZoomAccountId");
                    zoomAccountId = input.nextInt();


                    if (zoomDeviceId == 0) {
                        bookingSystem.addRoom(new WithOutZoom(id, capacity, floor));

                        System.out.println("Enter the details to book the room");

                        System.out.println("Enter the roomId");
                        roomId = input.nextInt();
                        input.nextLine();

                        System.out.println("Enter the meetDate");
                        meetDate = input.nextLine();
                        input.nextLine();

                        System.out.println("Enter the meetTime");
                         meetTime = input.nextLine();

                        System.out.println("Enter the duration");
                        duration = input.nextInt();

//                    bookingSystem.addRoomZoom()

                        bookingSystem.bookRoom(id, roomId, meetDate, meetTime, duration);
                    } else if (zoomDeviceId != 0){

                        System.out.println("Enter the Zoom Room id");
                        int ZoomRoomId = input.nextInt();
                        input.nextLine();

                        System.out.println("Enter the meetDate");
                        String ZoomMeetDate = input.nextLine();

                        System.out.println("Enter the meetTime");
                        String ZoomMeetTime = input.nextLine();

                        System.out.println("Enter the duration");
                        int ZoomMeetDuration = input.nextInt();

                        bookingSystem.addRoom(new WithZoom(ZoomRoomId, capacity, floor, zoomDeviceId, zoomAccountId));

                        bookingSystem.bookRoom(id,ZoomRoomId,ZoomMeetDate,ZoomMeetTime,ZoomMeetDuration);

                    }

                } else if (task == 2) {

                    System.out.println("Enter the meeting date you want to get details");
                    input.nextLine();
                    date = input.nextLine();
                    bookingSystem.MeetingInfo(date);
                } else if (task == 3) {

                    System.out.println("Enter the details of the room ");

                    System.out.println("Enter the date ");
                    input.nextLine();
                    date = input.nextLine();

                    System.out.println("Enter the time");
                    input.nextLine();
                    time = input.nextLine();

                    System.out.println("Enter the duration");
                    duration = input.nextInt();

                    int count = bookingSystem.getAvailableRoom(date,time,duration);
                    System.out.println("There are " + count + "rooms are available");
                }
                else if (task == 4){
                    break;
                }
//            bookingSystem.MeetingInfo("03/07/2024");
//        }
            }
    }

    ArrayList<WithOutZoom> rooms;
//    ArrayList<WithZoom> zoomRooms;

    ArrayList<Booking> bookings;

    BookingSystem() {
//        zoomRooms = new ArrayList<>();
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();
    }


    void addRoom(WithOutZoom room){
        rooms.add(room);
    }

    void addRoom(WithZoom room){
        rooms.add(room);
    }

    void bookRoom(int empId ,int roomId, String meetDate , String meetTime , int duration) {


        WithOutZoom room = findRoom(roomId);
        WithOutZoom zoomRoom = findZoomRoom(roomId);
        if (room != null) {
            if (room != null && isAvailable(meetDate, meetTime, duration)) {
                Booking booking = new Booking(empId, meetDate, meetTime, duration);
                bookings.add(booking);
                System.out.println("Room booked successfully");
            } else System.out.println("Room already booked or Doesn't exist");
        } else {

            if (zoomRoom != null && isAvailable(meetDate, meetTime, duration)) {
                Booking booking = new Booking(empId, meetDate, meetTime, duration);
                bookings.add(booking);
                System.out.println("Room booked successfully");
            } else System.out.println("Room already booked or Doesn't exist");

        }
    }

    WithOutZoom findZoomRoom(int ZoomRoom){
        for(WithOutZoom room:rooms){
            if(room.getRoomId() == ZoomRoom){
                return room;
            }

        }
        return null;
    }
     WithOutZoom findRoom(int roomId) {
        for (WithOutZoom room: rooms){
            if(room.getRoomId() == roomId){
                return room;
            }
        }
        return null;
    }

    int getAvailableRoom(String date , String time , int duration){
        int count = 0;
         for (WithOutZoom room : rooms){
             if(room !=null && room.isAvailable(date,time,duration)){
                 count++;
             }
         }
         return count;
    }

    void MeetingInfo(String date){

        for(Booking booking:bookings){
            if (booking.getMeetDate().equals(date)){

                WithOutZoom room = findRoom(booking.getRoomId());
                WithOutZoom ZoomRoom = findZoomRoom(booking.getRoomId());

                if (room != null) {

                    displayBooking(booking);
                }
                else {

                    displayBooking(booking);
                    System.out.println("Zoom Device id: " + booking.getZoomDeviceId());

                }
            }


        }
    }

    private static void displayBooking(Booking booking) {
        System.out.println("emp id: " + booking.getEmpId());
        System.out.println("meet date: " + booking.getMeetDate());
        System.out.println("meet time: " + booking.getMeetTime());
        System.out.println("meet duration: " + booking.getDuration());
    }


}
