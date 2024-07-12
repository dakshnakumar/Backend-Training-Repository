package UnHandledException;

public class unHandledExceptionEx3 {

    public static void main(String[] args) {
        int age = 90;

        try{
            if (age < 20 || age >80){

                //Here the object is created because user defined exception class is defined only because of if exception occur
                // this object needs to be executed
                AgeInvalidException1 ageInvalidException1 = new AgeInvalidException1("you are too young");
                throw ageInvalidException1;
            }
        }
        catch (AgeInvalidException1 e){
            System.out.println(e.getMessage());
        }

    }
}


class  AgeInvalidException1 extends Exception{
    private String message;
    public AgeInvalidException1(String message){
//         super(message);
        this.message = message;
    }

    // when using override the signature should be same i.e) parameter , return type , function name
    @Override
    public String getMessage(){
        return "message";
    }
}

