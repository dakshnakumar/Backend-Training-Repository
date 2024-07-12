package funda.abstracEx;

public class AbstractClassEx {

    public static void main(String[] args) {

        Account account;
        account = new SavingAccount();

//        System.out.println(account.bankName);
    account.withdraw();

    account = new DigitalWallet();
    account.withdraw();
    }
}


 abstract class Account{

    //In abstract class i can use both unbody method &
    // method which has body

    String bankName = "HDFC";

    // declaring method withdraw
    abstract void withdraw();

    void getBankDetails(){
        System.out.println(bankName);
    }

}

class SavingAccount extends Account{

    @Override
    void withdraw(){
        System.out.println("This is savingAccount");
    }
}

class DigitalWallet extends Account{
    @Override
    void withdraw(){
        System.out.println("This is digitalWallet");
    }

    @Override
    void getBankDetails(){
        System.out.println("GPay");
    }
}
