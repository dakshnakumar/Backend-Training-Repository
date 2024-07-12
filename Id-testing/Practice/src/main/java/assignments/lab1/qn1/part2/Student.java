package org.example.lab1.qn1.part2;


public class Student {

    int studentId;
    String studentName;
    String city;
    int marks1;
    int marks2;
    int marks3;
    float feePerMonth;
    boolean isEligibleForScholarship;

    public Student(){

    }

    public Student(int studentId, String studentName, String city, int marks1, int marks2, int marks3, float feePerMonth, boolean isEligibleForScholarship){
        this.studentId = studentId;
        this.studentName = studentName;
        this.city = city;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.feePerMonth = feePerMonth;
        this.isEligibleForScholarship = isEligibleForScholarship;

    }

    //getter method for studentName
    public String getStudentName(){
        return this.studentName;
    }
    //setter method for studentId
    public void setStudentId(int id){
        this.studentId = id;
    }

    //setter method for studentName
    public void setStudentName(String name){
        this.studentName = name;
    }

    //setter method for city
    public void setCity(String city){
        this.city = city;
    }

    //setter method for city
    public void setMarks(int mark1,int mark2,int mark3){
        this.marks1 = mark1;
        this.marks2 = mark2;
        this.marks3 = mark3;
    }

    //setter method for city
    public void setfreePerMonth(float fee){
        this.feePerMonth = fee;
    }

    // To get AnnualFees
    public double getAnualFee(){
        return feePerMonth * 12;
    }

    //to get Monthly fee
    public float getMonthlyfee(){
        return this.feePerMonth;
    }
    // To get Total Marks of the students
    public int getTotalmarks(){
        return marks1+marks2+marks3;
    }

    // To get Average mark of a students
    public int getAverage(){
        return (marks1+marks2+marks3)/3;
    }

    //getAll the list of students and their marks
    public String getHighTotalMarks(Student[] student) {
        int high = 0;
        String name = "";
        int index = 0;

        for (int i = 0; i < student.length - 1; i++) {
            if (student[i].getTotalmarks() < student[i + 1].getTotalmarks()) {
//                high = student[i + 1].getTotalmarks();
                name = student[i + 1].getStudentName();
//                index = i;
            }
        }
//        return student[index];
        return name;
    }

    //To get the results
    public boolean getResult(){

        boolean response = false;
        if (marks1 >=60 && marks2 >= 60 && marks3 >=60) {
            response = true;
        }
        return response;
    }

    //To get Least Monthly fee
    public String leastMonthlyFee(Student[] student){
        String name="";

        for(int i=0 ; i<student.length-1;i++){
            if(student[i].getMonthlyfee() < student[i+1].getMonthlyfee()){
                 name = student[i].getStudentName();
            }
        }
        return name;
    }

    //To get Scholarship eligibilty
    public boolean getIsEligibleForScholarship(){

        boolean resultForScholarship = false;

        if(this.marks1 >=80 && this.marks2 >= 80 && this.marks3 >=80){
            resultForScholarship = true;
        }
        return resultForScholarship;
    }


}

