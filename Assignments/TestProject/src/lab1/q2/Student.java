package lab1.q2;

public class Student {

    int StudentId;
    String studentName;
    String city;
    int marks1;
    int marks2;
    int marks3;
    float feePerMonth;
    boolean isEligibleForScholarship;

    //getter method for studentName
    String getStudentName(){
        return this.studentName;
    }
    //setter method for studentId
    void setStudentId(int id){
        this.StudentId = id;
    }

    //setter method for studentName
    void setStudentName(String name){
        this.studentName = name;
    }

    //setter method for city
    void setCity(String city){
        this.city = city;
    }

    //setter method for city
    void setMarks(int mark1,int mark2,int mark3){
        this.marks1 = mark1;
        this.marks2 = mark2;
        this.marks3 = mark3;
    }

    //setter method for city
    void setfreePerMonth(float fee){
        this.feePerMonth = fee;
    }

    // To get AnnualFees
    double getAnualFee(){
        return this.feePerMonth * 12;
    }

    // To get Total Marks of the students
    int getTotalmarks(){
        return this.marks1+this.marks2+this.marks3;
    }

    // To get Average mark of a students
    int getAverage(){
        return (this.marks1+this.marks2+this.marks3)/3;
    }

   // To get eligible for scholarship
    boolean isEligibleForScholarship(){

        boolean resultForScholarship = false;

        if(this.marks1 <=80 && this.marks2 <= 80 && this.marks3 <=80){
            resultForScholarship = true;
        }
        return resultForScholarship;
    }

    //To get the results
    boolean getResult(){

        boolean response = false;
        if (this.marks1 <=60 && this.marks2 <= 60 && this.marks3 <=60) {
            response = true;
        }
         return response;
    }


}
