package lab1.q3;

public class printTable {

    void multiply(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + " " + "= " + num * i);
        }
    }


    void multiplyWhile(int num){

            int i = 1;
            while(i <= 10){
             System.out.println(num + "x" + i + " " + "= " + num * i);
             i++;
        }
        }

    void multiplyDoWhile(int num){

        int i = 1;
        do{
            System.out.println(num + "x" + i + " " + "= " + num * i);
            i++;
        }while(i <= 10);
    }



    public static void main(String[] args) {
        printTable operation = new printTable();

        operation.multiply(3);
        operation.multiplyWhile(3);
        operation.multiplyDoWhile(3);
    }
}
