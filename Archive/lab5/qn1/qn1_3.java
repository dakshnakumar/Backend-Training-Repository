package lab5.qn1;

public class qn1_3 extends RuntimeException{
    public static void main(String[] args) {
        try {
            try {
                int num1 = 40;
                int num2 = 0;
                int num3 = num1 / num2;

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Nested try-catch is successfully completed");
            }

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Outer try-catch block executed");
        }
    }
}
