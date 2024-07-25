package org.example.ui;

import org.example.model.Product;
import org.example.service.ProductService;
import org.example.service.ProductServiceImpl;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuUI {

    static Scanner input = new Scanner(System.in);
    static ProductService productServiceImpl = new ProductServiceImpl();

    public static int accessMenu(){
        System.out.println("1.Add products");
        System.out.println("2.View products");
        System.out.println("3.Update products");
        System.out.println("4.Delete products");
        System.out.println("5.Exit");
        int operation = input.nextInt();
        input.nextLine();
        return operation;
    }

    public void addProducts(){
        try {
            System.out.println("Enter the product id");
            String id = input.nextLine();
            System.out.println("Enter the product name");
            String name = input.nextLine();
            System.out.println("Enter the product price");
            double price = input.nextDouble();

            System.out.println("Enter the quantity");
            int qunatity = input.nextInt();

            Product product = new Product(id, name, price, qunatity);

            boolean isAdded = productServiceImpl.addProduct(product);

            if (isAdded) {
                System.out.println("Product successfully added");
            } else System.out.println("product doesn't added to the cart");

        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
            input.nextLine();
        }
    }

    public void viewProducts(){
        System.out.println("How many rows you want to show ");
        int show = input.nextInt();
        List<Product> product = productServiceImpl.viewProducts(show);
        for(Product products :product){
            System.out.println(products.toString());
        }
    }

    public void deleteProduct(){
        System.out.println("Enter the product name you want to delete");
        String name = input.nextLine();
        boolean isDeleted = productServiceImpl.deleteProducts(name);
        if (isDeleted){
            System.out.println("Deleted sucessfully");
        } else {
            System.out.println("No deletion take place");
        }
    }

    public void updateProducts(){
        ProductServiceImpl productServiceImpl = new ProductServiceImpl();

        System.out.println("Enter the existing product id you want to change");
        String id = input.nextLine();
        Product product = productServiceImpl.recieveUpdateProducts(id);
        // write an logic to get all the entites which have id equal to above id
        System.out.println("which one you want to update");
        System.out.println("1.udpate ID");
        System.out.println("2.update name");
        System.out.println("3.update price");
        System.out.println("4.update quantity");
        int update = input.nextInt();
        input.nextLine();
        switch (update){

            case 2:
                System.out.println("Enter the updated name");
                String name = input.nextLine();
                productServiceImpl.updateProducts(name,id);

            case 3:
                System.out.println("Enter the updated price");
                double price = input.nextInt();
                productServiceImpl.updateProducts(price,id);

            case 4:
                System.out.println("Enter the updated qunatity");
                int quantity = input.nextInt();
                productServiceImpl.updateProducts(quantity,id);

        }

    }
}
