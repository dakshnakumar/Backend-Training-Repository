package funda.abstracEx;

public class AbstractClassEx2  {
    public static void main(String[] args) {

        Bike bike = new Bike();
        bike.turnOn();
        bike.turnOff();

        Car car = new Car();
        car.turnOn();
        car.turnOff();
    }

}

// Abstract class without concerte(well defined body ) method, only abstract methods
abstract class Vehicle{

    // Only methods and class can be a abstract
    public abstract void turnOn();
    public abstract void turnOff();
}

class Bike extends Vehicle{

    @Override
    public void turnOn(){
        System.out.println("The Bike is turned ON");
    }

    @Override
    public void turnOff(){
        System.out.println("The Bike is turned OFF");
    }
}

class Car extends Vehicle{
    @Override
    public void turnOn(){
        System.out.println("The Car is turned ON");
    }

    @Override
    public void turnOff(){
        System.out.println("The Car is turned OFF");
    }
}


// Abstract class with concerte method and also abstract method
// constructor and variables
abstract class Bank{

    String accountNumber;
    String accountName;

    //Constructor for this class
    Bank(String accNum, String accName){
        this.accountNumber = accNum;
        this.accountName = accName;
    }

    // abstract methods
    public abstract void withdraw();
    public abstract void credit();

    //concrete methods
    public void printDetails(){
        System.out.println("Print details is called");
    }

    public static void printAccName(){
        System.out.println("Account Name is called");
    }

}
