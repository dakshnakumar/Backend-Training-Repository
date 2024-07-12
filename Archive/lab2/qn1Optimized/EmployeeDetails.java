package lab2.qn1Optimized;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class EmployeeDetails {

    int empId;
    String date;
    String time;
    String duration;

    EmployeeDetails(int empId,String date , String time , String duration){
        this.empId = empId;
        this.date = date;
        this.time = time;
        this.duration = duration;
    }

    EmployeeDetails(){

    }

    Scanner input = new Scanner(System.in);

    void enterDetails(){
        while(true){
            System.out.println("Enter the employee to book the room");

            System.out.println("Enter the employee ID");
            empId = input.nextInt();
            input.nextLine();

            System.out.println("Enter the meeting date (format: YYYY-MM-DD)");
            date = input.nextLine();
            LocalDate localDate = LocalDate.parse(date);
            System.out.println(localDate);

            System.out.println("Enter meeting time (HH:MM)");
            time = input.nextLine();
            LocalTime localTime = LocalTime.parse(time);
            System.out.println(localTime);



            System.out.println("Which type of meeting room you want to book");
            System.out.println("To book standard meeting room, enter: std");
            System.out.println("To book zoom meeting room, enter: zoom ");

            String type = input.nextLine();

            if (type.equals("std")){

//                StandardMeeting standardMeeting = new StandardMeeting();
//                StandardMeeting stdObj = standardMeeting.getStandardDetailAlone();
            }
            else if (type.equals("zoom")){
//                ZoomMeeting zoomMeeting = new ZoomMeeting();
//                ZoomMeeting zoomObj = zoomMeeting.getZoomMeetingDetails();
            }
            else System.out.println("please enter valid input");

        }
    }


}
