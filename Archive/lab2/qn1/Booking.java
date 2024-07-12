package lab2.qn1;

public class Booking extends Employee {

    protected String meetDate;
    protected String meetTime;
    protected int duration;

    Booking(){
        super();
    }

    Booking(int empId , String meetDate , String meetTime , int duration){
        super(empId);
        this.meetDate = meetDate;
        this.meetTime = meetTime;
        this.duration = duration;
    }


    void setMeetDate(String meetDate) {
        this.meetDate = meetDate;
    }

     void setMeetTime(String meetTime) {
        this.meetTime = meetTime;
    }

     void setDuration(int duration) {
        this.duration = duration;
    }

     int getDuration() {
        return duration;
    }

     String getMeetDate() {
        return meetDate;
    }

     String getMeetTime() {
        return meetTime;
    }
}
