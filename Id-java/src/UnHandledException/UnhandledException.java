package UnHandledException;

public class UnhandledException {

    //try catch and finally
    public static void main(String[] args) {
        int num1 = 0; int num2 = 30;

        try{
            System.out.println("Inside try block");
            num2 = num1/0;
        }
        catch (ArithmeticException e){
            System.out.println("Inside catch block");
            System.out.println("Divides zero"+ e.getMessage());
        }
        finally {
            System.out.println("Inside finally block");
        }

        System.out.println("Outside try catch finally block");
    }
}
