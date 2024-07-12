package lab1.q5;

public class qn5 {

    public static void main(String[] args) {
        String str = "hello";
        String str1 = "dakshnakumar";
        String str2 = "HELLO";

        //  checking the length of string
        System.out.println("The length of string "+str1.length());


        // to lower case
        System.out.println(str2.toLowerCase());

        //to uppper case
        System.out.println(str.toUpperCase());


        // checks the string
        System.out.println(str.equals(str2));

        //contains the string
        System.out.println(str1.contains("s"));
    }
}
