package ocpj;

public class q1 {
    int[] arr = new int[5];

    public static void method() {
        System.out.println("called");
    }

//    public static void main(String[] args) {
//        q1 obj = null;
//        obj.method();
//}
}

class Test5 {
    public void Test5() {
        System.out.println("constructor1");
    }

    public Test5() {
        System.out.println("constructor2");
    }

    public static void main(String[] args) {
        Test5 obj = new Test5();
    }
}