package UnHandledException;


// try, catch and finally block
public class UnHandledExceptionEx6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Check the array size you want to access");
        }

        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("After finally block executed");

    }
}
