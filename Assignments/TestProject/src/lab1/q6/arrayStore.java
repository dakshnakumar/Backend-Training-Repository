package lab1.q6;
import java.util.Arrays;
import java.util.Scanner;

public class arrayStore {

    static int lengthOfArray;
    public int arr[];
    Scanner input = new Scanner(System.in);
    int i = 0;
    int uniqueElements = 0;
    int arrUpdated[];

//    void storeElement(){
//
//        for(int i=0;i<lengthOfArray;i++){
//            arr[i] = input.nextInt();;
//        }
//
//    }

    //To display the elements in the array
    void display(){
        System.out.println("using For loop");
        for(int i=0;i<lengthOfArray;i++){
            System.out.println(arr[i]);
        }

        System.out.println("using while loop");
        while(i<lengthOfArray){
            System.out.println(arr[i]);
            i++;
        }
    }

    void sortArray(){
        Arrays.sort(arr);
        System.out.println("Sorted array");
        System.out.println(arr);
    }

    // Accepts the number and return number of times it occurs in the arrray
    int numberOccurs(int number){
        int count = 0;
        for (int i=0;i<lengthOfArray;i++){
            if (arr[i] == number) {
                count++;
            }
            else System.out.println("The number does'nt present in the array");
        }

        return count;

    }

    //insert element at specific postion in the arrray
    void insertAtposition(int position,int element){

        arr[position] = element;
    }

    // return only the excludes duplicate elements in the original array
    int[] returnOriginalArr(){

        Arrays.sort(arr);

        for (int i=0;i<lengthOfArray-1;i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueElements++;
            }

        }

        System.out.println(uniqueElements);

        int arrUpdated[] = new int[uniqueElements];
//            arrUpdated[0] = arr[0];
        int index = 1;

        for (int j= 0;j<uniqueElements-1;j++){
            if (arr[j] != arr[j+1]){
                arrUpdated[j] = arr[j];
            }

        }



        return arrUpdated;
    }

    public static void main(String[] args) {

        arrayStore obj = new arrayStore();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements to store in the array");
        lengthOfArray = input.nextInt();

        obj.arr = new int[lengthOfArray];

        for(int i =0;i<lengthOfArray;i++ ){
            obj.arr[i] = input.nextInt();
        }

        while(true) {
            System.out.println("Press 1 for Display the elements");
            System.out.println("press 2 for check number of times elements occur");
            System.out.println("press 3 for insert number at array in the specific position");
            System.out.println("press 4 for return original arry without duplicate of element");

            while (true) {

                int num = input.nextInt();

                if (num == 1) {
                    obj.display();
                } else if (num == 2) {

                    System.out.println("Enter the element you want to check");
                    int element = input.nextInt();

                    obj.numberOccurs(element);

                } else if (num == 3) {
                    System.out.println("Enter the position you want to insert");
                    int position = input.nextInt();

                    System.out.println("Enter the element you want to insert");
                    int ele = input.nextInt();

                    obj.insertAtposition(position, ele);
                } else if (num == 4) {
                    int[] response = obj.returnOriginalArr();
                    for (int i=0;i<response.length;i++){
                        System.out.println(response[i]);
                    }
                } else if (num == 5) {
                    break;
                }
            }
        }

    }


}
