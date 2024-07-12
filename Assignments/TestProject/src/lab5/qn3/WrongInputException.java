package lab5.qn3;

import java.util.Scanner;

public class WrongInputException extends RuntimeException{

    WrongInputException(){
        super();
    }
    WrongInputException(String message){
        super(message);
    }
    public WrongInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongInputException(Throwable cause) {
        super(cause);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter the String type input");
            String num = input.nextLine();

            if (num.equals(((Object) num).getClass().getSimpleName())) {
                System.out.println("yes your typed string type");
            } else {
                WrongInputException obj = new WrongInputException("you not entered string data type");
                throw obj;
            }
        }catch (WrongInputException e){
            System.out.println(e.getMessage());
        }
    }

}
