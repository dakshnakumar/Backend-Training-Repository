package org.example.model;

import java.util.InputMismatchException;

public class Product {

    String id;
    String name;
    double price;
    int quantity;

    public Product(String id,String name , double price , int quantity){
        if(price < 0 || quantity <= 0) {
            System.out.println("Price cannot be less than 0");
            throw new RuntimeException("Price or quantity cannot be less than zero or equal to zero");
        }
        try{
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        } catch (RuntimeException e){
            throw new InputMismatchException(e.getMessage());
        }
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if(price <=0){
            throw new IllegalArgumentException("Price can't be negative or zero");
        }
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product("+"id :"+this.id+", name :"+this.name+", price :"+this.price+", qunatity :"+this.quantity+")";
    }


}
