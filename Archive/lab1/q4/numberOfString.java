package lab1.q4;

public class numberOfString {

    private int findNoofString(String data){

        int string = data.trim().split("\\s+").length;
        return string;
    }
 

    public static void main(String[] args) {

    numberOfString obj = new numberOfString();
        System.out.println(obj.findNoofString("Sum of 12 and 20 is 32"));


    }

}
