package lab1.q2;

public class Display {
    public static void main(String[] args) {

        Student Antony = new Student();
        Antony.setStudentId(001);
        Antony.setStudentName("Antony");
        Antony.setCity("Chennai");
        Antony.setMarks(65,70,80);
        Antony.setfreePerMonth(5000f);

        Student Ramesh = new Student();
        Ramesh.setStudentId(002);
        Ramesh.setStudentName("Ramesh");
        Ramesh.setCity("Tanjore");
        Ramesh.setMarks(89,90,100);
        Ramesh.setfreePerMonth(3000f);

        Student arr[] = new Student[3];

        arr[0] = Antony;
        arr[2] = Ramesh;


    }
}
