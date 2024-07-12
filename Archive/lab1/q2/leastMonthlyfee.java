package lab1.q2;

public class leastMonthlyfee {
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

        float lowFee = 0;
        String name = "";


        for (int i=0;i< arr.length-1;i++){
            if (arr[i].feePerMonth > arr[i+1].feePerMonth){
                lowFee = arr[i].feePerMonth;
                name = arr[i].studentName;

            }
        }

        System.out.println(lowFee);
        System.out.println(name);
    }
}
