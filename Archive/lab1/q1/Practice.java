package lab1.q1;

public class Practice {

    int add(int num1 , int num2){
        return num1 + num2;
    }

    int add(int num1 , int num2 , int num3){
        return num1 + num2 + num3;
    }

    float add(float num1 , float num2){
        return num1 + num2;
    }

    String add(String str , int num){
        return str+num;
    }

    public static void main(String[] args) {
        Practice obj = new Practice();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add(10.5f,20.1f));
        System.out.println(obj.add("Hello ",20));
    }
}
