package ocjp;

public class q20 {
    public q20(){
        System.out.println("First constructor");
    }

    private q20(String str){
        System.out.println("second constructor");
    }

}

class Test5 extends q20{
    private Test5(String str){
//        super();
        System.out.println(str);
    }

    public static void main(String[] args) {
        Test5 t5 = new Test5("HII");
    }
}
