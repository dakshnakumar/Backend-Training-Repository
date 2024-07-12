package ocjp;

public class q7 {
    public q7(){

    }

     public q7(q7 ref){
        this(ref,"Hai");
    }

    public q7(q7 ref , String str){
        ref.q7(str);
        System.out.println("Hi");
    }

    public void q7(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {

        q7 t = new q7();

        q7 t7 = new q7(t);
    }


}
