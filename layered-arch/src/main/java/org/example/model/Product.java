package org.example.model;

public class Product {

    String id;
    String name;
    double price;
    int quantity;

    public Product(String id,String name , double price , int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
