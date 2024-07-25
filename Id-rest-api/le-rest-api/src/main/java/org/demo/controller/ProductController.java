package org.demo.controller;

import org.demo.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductController {

    private List<Product> productList= new ArrayList<>();

    public ProductController(){
     productList.add(new Product("1","laptop",20000,1));
     productList.add(new Product("1","mobile",4000,2));
    }

    public List<Product> getAllProducts(){
        return productList;
    }
}
