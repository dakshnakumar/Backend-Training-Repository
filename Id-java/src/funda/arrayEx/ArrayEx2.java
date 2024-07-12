import  java.util.Arrays;

public class ArrayEx2 {

    void search(char[] arr,char target){
        for (int i=0; i<arr.length;i++){
            if (arr[i] == target){
                System.out.println("Yes, Element is present");
                break;
            }
        }

        System.out.println("No");

    }
    public static void main(String[] args) {


        //creating object
        ArrayEx2 obj = new ArrayEx2();

        //Create an array and sort it
        char[] arr = {'a','b','c','d','e'};
        Arrays.sort(arr);
        System.out.println(arr);


        //create new array
        char reversed[] = new char[5];
        for(int i = 0; i < arr.length; i++){
            reversed[i] = arr[arr.length-i-1];
        }
        System.out.println(reversed);

        // check for target element
        obj.search(arr,'y');


    }



}
