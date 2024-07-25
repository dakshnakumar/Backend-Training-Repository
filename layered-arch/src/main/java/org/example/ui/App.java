package org.example.ui;


import java.util.InputMismatchException;

public class App {
    public static void main( String[] args )
    {
        MenuUI menuUI = new MenuUI();

        while (true) {
        int response = MenuUI.accessMenu();

        if (response == 1) {
            try{
                menuUI.addProducts();
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }
        } else if (response == 2) {
            menuUI.viewProducts();
        } else if (response ==3) {
            menuUI.updateProducts();
        } else if (response == 4) {
            menuUI.deleteProduct();
        } else if (response == 5) {
            break;
        } else System.out.println("Invalid input");
        }
    }
}


