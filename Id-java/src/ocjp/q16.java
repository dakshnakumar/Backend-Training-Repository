package ocjp;

public class q16 {
    static {
        System.out.println("Static");
    }
    {
        System.out.println("instances");
    }

    public void Test1(){
        System.out.println("construtors");
    }

//    public static void main(String[] args) {
//        q16 obj = null;
//    }
}

class q17 {
    public q17() {
        System.out.println("Parent class");
    }
}

class Test2 extends q17 {
    public Test2(){
        System.out.println("Child class");
    }

    public static void main(String[] args) {
        Test2 obj = new Test2();

    }
}
