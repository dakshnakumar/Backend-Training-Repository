package funda.staticEx;

public class staticEx {


    static String name;
    int age;

    static void printName(String name){
        staticEx.name = name;

    }

    void printAge(){
        System.out.println(age);
    }

    public static void main(String[] args) {

        name = "kumar";
        System.out.println(name);
        System.out.println("directly called static variable without using object");
//        printName();


    }
}
