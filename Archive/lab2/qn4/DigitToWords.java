package lab2.qn4;

public class DigitToWords {

    String CnvtDigitToString(int number){
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;

        String[] Words = {"Zero","one","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

        return Words[hundreds] + " " + Words[tens] + " " + Words[ones];
    }

    public static void main(String[] args) {
        DigitToWords obj = new DigitToWords();

        String result = obj.CnvtDigitToString(951);

        System.out.println(result);
    }
}
