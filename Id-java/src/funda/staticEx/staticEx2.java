package funda.staticEx;

public class staticEx2 {

    static String name;
    static int age;
    static String sex;
    static int a = 4;
    static int b ;

    static {
        System.out.println("I am static block, execited");
        System.out.println(b);
        b = a * 5;
    }


    static class test{


    }

    static void Grettings(){
        System.out.println("Hello!!!" + name);
    }

    void printAge(){
        System.out.println(age);

    }

    public static void main(String[] args) {


        staticEx2 obj = new staticEx2();
        name = "kumar";
        age = 45;
//        obj.printAge();
//        Grettings();
//        staticEx2.b = 30;

        staticEx2 obj1 = new staticEx2();
        System.out.println(staticEx2.b);


    }







}
