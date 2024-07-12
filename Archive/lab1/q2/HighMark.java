package lab1.q2;

public class HighMark {
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

        Student Suresh = new Student();
        Suresh.setStudentId(003);
        Suresh.setStudentName("Suresh");
        Suresh.setCity("Madurai");
        Suresh.setMarks(99,98,100);
        Suresh.setfreePerMonth(1000f);

        Student arr[] = new Student[3];

        arr[0] = Antony;
        arr[1] = Suresh;
        arr[2] = Ramesh;
        int high = 0;
        String name ="";

        for(int i = 0;i<arr.length-1;i++){
            if (arr[i].getTotalmarks() < arr[i+1].getTotalmarks()){
                high = arr[i+1].getTotalmarks();
                name = arr[i+1].getStudentName();
            }
        }

        System.out.println(high);
        System.out.println(name);
    }
}
