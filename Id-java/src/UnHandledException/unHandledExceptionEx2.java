package UnHandledException;

public class unHandledExceptionEx2 {

    // accessing the array's not defined element

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        System.out.println("The program starts");
//        System.out.println(arr[6]);
        System.out.println(arr[-1]);

    }


}
