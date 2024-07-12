package lab5.qn2;

import java.util.Scanner;

public class InvalidAgeException extends Exception{

  InvalidAgeException(){
     super();
 }

    InvalidAgeException(String message){
        super(message);
    }

    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAgeException(Throwable cause) {
        super(cause);
    }

}

class main extends InvalidAgeException{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter the age");
            int age = input.nextInt();
            if(age>50){
                InvalidAgeException obj = new InvalidAgeException("Age is not valid");
                throw obj;
            }
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}