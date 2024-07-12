package accessModifiers.p1;

public class p1C2 {
    public static void main(String[] args) {
        p1C1 p1c1 = new p1C1();

//      'PrivateVar has private access in 'accessmodifiers.p1.c1p1'
//       System.out.println(p1c1.privateVar);

        // 'defaultVar has access to called within in same package'
        System.out.println(p1c1.defaultVar);


        // the public variable can be access by any class , any package'
        System.out.println(p1c1.publicVar);

        // the protected variable can be accessed by different class but within same package
        System.out.println(p1c1.protectedVar);
    }




}
