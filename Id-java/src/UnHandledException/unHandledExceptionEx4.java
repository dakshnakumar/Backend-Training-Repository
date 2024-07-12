package UnHandledException;

public class unHandledExceptionEx4 {

    // try and finally
    public static void main(String[] args) {
        System.out.println("UE");
        int i = 100;
        int j = 0;

        try{
            System.out.println("try");
            j = i/0;
            System.out.println("after the exception occur");
        }
        finally {
            System.out.println("Inside the final keyword");
        }

        System.out.println("After final keyword");
    }


}
