package accessModifiers.p1;

public class p1C1 {
    private int privateVar = 1;
    static int defaultVar = 3;
    public int publicVar = 3;
    protected  int protectedVar = 4;

    static void staticMethod(int defaultVar){
        System.out.println(defaultVar);

        p1C1 obj = new p1C1();
        obj.defaultVar = defaultVar;
    }


    void instantMethod(int defaultVar){
        System.out.println(publicVar);
        defaultVar = defaultVar;


    }



    public static void main(String[] args) {
        p1C1 p1c1 = new p1C1();

        //the private variable can be access within the class
        System.out.println(p1c1.privateVar);

        //the public variable can be access by any class , any package
        System.out.println(p1c1.defaultVar);

        // the protected variable can be access within the class
        System.out.println(p1c1.protectedVar);
    }

}


