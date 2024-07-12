package lab5.qn1;

public class Qn1_4 {

    // i can use as many exceptions here
    void divideByZero(int num1 , int num2) throws ArithmeticException{

        // ask subbu this below doubt
//            if(num1%num2 == 0){
//                throw new ArithmeticException("cannot divde by zero");
//            }

        if(num2 ==0){
            throw new ArithmeticException("cannot divde by zero");
        }
        else{
            int result = num1/num2;
            System.out.println("The result "+result);
        }


    }
    public static void main(String[] args) {
        Qn1_4 qn1_4 = new Qn1_4();

        try {
            qn1_4.divideByZero(34, 0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
