import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        char[] conso = {'g', 'd', 'c', 'f', 'b'};
        //System.out.println(Arrays.sort(conso));
        Arrays.sort(conso);
        //System.out.println(conso);


        for (int i = 0; i < conso.length; i++) {
            System.out.println(conso[i]);
        }


        char[] reverse = new char[5];
        for (int i = 0; i < conso.length; i++) {
            reverse[i] = conso[conso.length - i - 1];
        }
        System.out.println(reverse);

        System.out.println(Arrays.toString(reverse));

        String customString = "[";

        for (int i = 0; i < reverse.length; i++) {
            if (i == reverse.length - 1) {
                customString = customString + reverse[i];
            } else
                customString = customString + reverse[i] + ", ";

        }
        customString = customString + "]";
        System.out.println(customString);


        }
    }

