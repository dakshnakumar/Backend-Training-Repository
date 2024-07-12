package funda.setterEx.wrapperClass;


public class WrapperClass {

    final int age;
    final String name;
    final String sex;

    WrapperClass(){
        this (13,"dakshnakumar","male");
    }

    WrapperClass(int age,String name,String sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    public static void main(String[] args) {


        // convert string to number using byte class
        Byte cvtByte = new Byte("127");
        System.out.println(cvtByte.byteValue());

        WrapperClass obj = new WrapperClass();

        System.out.println(obj.sex);

    }
}
