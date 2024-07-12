package UnHandledException;

public class unHandledExceptionEx5 {
    public static void main(String[] args) {
        int num = 0;
        int num1 = 100;

        try{
            System.out.println("Try");
            num = num1/0;
            System.out.println("After exception occur");

        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException"+e.getMessage());
        }
        catch (Throwable throwable){
            System.out.println("throwable");
            System.out.println(throwable.getMessage());
        }

        finally {
            System.out.println("finally");
        }

    }
}
