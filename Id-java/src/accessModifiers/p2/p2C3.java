package accessModifiers.p2;

import accessModifiers.p1.p1C1;


public class p2C3 extends p1C1 {

    public static void main(String[] args) {
        p1C1 p1c1 = new p1C1();
        p2C3 p2c3 = new p2C3();

        // defaultVar has not access to call different package
//        System.out.println(obj.defaultVar);


        // the public variable can be access by any class , any package'
        System.out.println(p1c1.publicVar);

        // using inheritence
        // Note: without inheritence protectedVar can't be accessed in this class
        System.out.println(p2c3.protectedVar);

//        System.out.println(p1c1.);



    }
}
