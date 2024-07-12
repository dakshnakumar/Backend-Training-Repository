package lab2.qn1Optimized;

import java.util.Scanner;

public class ZoomMeeting extends StandardMeeting {

    int zoomDeviceId;
    int zoomAccountId;


    Scanner input = new Scanner(System.in);

//    ZoomMeeting(){
//
//    }
    ZoomMeeting(int roomId,int capacity , int floorNumber, int zoomDeviceId, int zoomAccountId ){
        super(roomId,capacity,floorNumber);
        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountId = zoomAccountId;
    }

    public void setZoomDeviceId(int zoomDeviceId) {
        this.zoomDeviceId = zoomDeviceId;
    }

    public int getZoomDeviceId() {
        return zoomDeviceId;
    }

    public void setZoomAccountId(int zoomAccountId) {
        this.zoomAccountId = zoomAccountId;
    }

    public int getZoomAccountId() {
        return zoomAccountId;
    }

    ZoomMeeting getZoomMeetingDetails(){

//        StandardMeeting standardMeeting = new StandardMeeting();
//        standardMeeting.getStandardMeetingDetail();

        System.out.println("Enter the ZoomDeviceId");
        zoomDeviceId = input.nextInt();

        System.out.println("Enter the ZoomAccountId");
        zoomAccountId = input.nextInt();
        return null;

//        return  new ZoomMeeting(standardMeeting.getCapacity(),standardMeeting.getFloorNumber(),zoomDeviceId,zoomAccountId);
    }


}
