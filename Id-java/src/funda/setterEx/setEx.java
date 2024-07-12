package funda.setterEx;
import java.util.Scanner;


public class setEx {

    public static void main(String[] args) {

        Employee obj = new Employee();

        // get input of string
        Scanner name = new Scanner(System.in);

        // obj.setAge((int) age);

        obj.setName("Kumar");
        obj.getAge();
        obj.setAge(20);
        obj.setSex("Male");
        System.out.println(obj.getAge());
    }

}



class Employee {


    // Exercise to make setter and getter more clear

//    private String name1 = "dakshnakumar";
    private String name;
    private int age;
    public String sex;
    static  int colour;

// setter function to set values for the given fields

    void setName(String name) {
        this.name = name;
        System.out.println(colour);
    }

    void setAge(int age) {

        if (age >= 20 && age <= 50) {
            this.age = age;
        }

        else System.out.println("you age is not valid");
    }

    void setSex(String sex) {
        this.sex = sex;
    }

//getter method

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getSex() {
        return sex;
    }

}
