package org.example.ui;


public class App {
    public static void main( String[] args )
    {
        MenuUI menuUI = new MenuUI();

        while (true) {
        int response = MenuUI.accessMenu();

        if (response == 1) {
            menuUI.addProducts();
        } else if (response == 2) {
            menuUI.viewProducts();
        } else if (response ==3) {
            menuUI.updateProducts();
        } else if (response == 4) {
            menuUI.deleteProduct();
        } else if (response == 5) {
            break;
        } else{
            try{
                InvalidOptionChoosenException invalidOptionChoosenException = new InvalidOptionChoosenException("Invalid options entered");
                throw invalidOptionChoosenException;
            }catch (InvalidOptionChoosenException e){
                System.out.println(e.getMessage());
            }
        }
        }
    }
}

class InvalidOptionChoosenException extends RuntimeException{

    String message;

    InvalidOptionChoosenException(String message){
        super(message);
    }


}
