package lab2.qn3;

import java.util.Arrays;

public class LargestNumber {

    int num1;
    int num2;
    int num3;

    int arr[] = new int[3];
    LargestNumber(int num1 , int num2 , int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;

        Assginvalue();
    }

    void Assginvalue(){
        arr[0] = num1;
        arr[1] = num2;
        arr[2] = num3;
    }


    int findLargestNumber(){
        Arrays.sort(arr);
        return arr[(arr.length)-1];
    }

    public static void main(String[] args) {
        LargestNumber obj = new LargestNumber(1000,523,50);

        int result = obj.findLargestNumber();

        System.out.println(result);
    }
}
