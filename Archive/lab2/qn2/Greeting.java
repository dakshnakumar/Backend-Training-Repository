package lab2.qn2;

import java.util.Scanner;

public class Greeting {
    String Greetings(String name){
        return "Hello "+ name + ",Welcome to Java World";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Greeting obj = new Greeting();

        System.out.println("Enter the name");
        String result = obj.Greetings(input.nextLine());
        System.out.println(result);
    }
}
