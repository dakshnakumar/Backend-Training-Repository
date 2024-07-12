package lab5.qn4;

import lab5.qn4.WrongInputException;

import java.util.Scanner;

public class Qn4 {
    Qn4 obj = new Qn4();

    public String getLearningCode(String name , int age) throws WrongInputException, InvalidAgeException {

        try{
            String result = obj.getAgeCode(age);
            String code = name + result;
            return code;

        }catch (WrongInputException e){
            throw new WrongInputException(e.getMessage());
        }

    }

    public String getAgeCode(int age) throws InvalidAgeException,WrongInputException{
        try{
            if (age > 18) {
                return "Adult";
            } else if (age > 0 && age < 18) {
                return "child";
            } else {
                throw new InvalidAgeException("Age is not valid");
            }
        }catch (InvalidAgeException e){
            throw new WrongInputException("Wrong input exception");
        }
    }

    public static void main(String[] args) {
        Qn4 qn4 = new Qn4();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name");
        String name = input.nextLine();

        System.out.println("Enter the age");
        int age = input.nextInt();

        try{
            qn4.getLearningCode(name, age);
        }catch (WrongInputException | InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}


