package lab5.qn1;

import java.util.Scanner;

public class Qn1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter the fname: ");
            String fname = input.nextLine();

            System.out.println("Enter the lname");
            String lname = input.nextLine();

            System.out.println("Enter the age");
            int age = input.nextInt();

            if (age < 20 || age > 50){
                InvalidAgeException invalidAgeException = new InvalidAgeException("you are too young or too experience to work");
                throw  invalidAgeException;
            }

        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Code complete execution");
        }
    }
}

class InvalidAgeException extends RuntimeException{

    String message;
    InvalidAgeException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }

}
