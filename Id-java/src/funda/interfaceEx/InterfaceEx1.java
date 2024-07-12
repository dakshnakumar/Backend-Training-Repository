package funda.interfaceEx;

public class InterfaceEx1 implements NetBanking {

    @Override
    public void displayAccountInfo(){
        System.out.println("Display account information is called");
    }

    @Override
    public void transferAmount(){
        System.out.println("Amount was transfered");
    }
}

// unlike Abstract class , interface should have any concrete methods
// all the methods defined in the interface should be an abstract

// interface should have only constants i.e) public static final

// A class can have multiple interfaces

// interface's methods should be public or abstract

interface NetBanking {
    public abstract void displayAccountInfo();

    abstract void transferAmount();
}
