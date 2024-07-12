package org.meetingroom.model;

/*Classes, Attributes, Methods, and Relationships:

a) MeetingRoom (Abstract class)
Attributes:

roomId: string (unique identifier)
capacity: int
floor: int

Methods:

getRoomDetails()
isAvailable(date, time, duration)

b) StandardMeetingRoom (Inherits from MeetingRoom)
No additional attributes or methods

c) ZoomMeetingRoom (Inherits from MeetingRoom)
Attributes:

zoomDeviceId: string
zoomAccountId: string

Methods:

getZoomDetails()

d) Employee
Attributes:

employeeId: string

Methods:

bookMeetingRoom(roomId, date, time, duration)
getMeetingInfo(date)

e) Booking
Attributes:

bookingId: string
employeeId: string
roomId: string
meetingDate: date
meetingTime: time
duration: int

Methods:

createBooking()
cancelBooking()

Relationships:

MeetingRoom (1) ---> (0..*) Booking
Employee (1) ---> (0..*) Booking
MeetingRoom <|-- StandardMeetingRoom
MeetingRoom <|-- ZoomMeetingRoom */

public abstract class MeetingRoom {

    String roomId;
    int capacity;
    int floor;

    MeetingRoom(String roomId,int capacity,int floor){
        this.roomId = roomId;
        this.capacity = capacity;
        this.floor = floor;
    }

     abstract String getRoomDetails();

     abstract boolean isAvailable();

}


