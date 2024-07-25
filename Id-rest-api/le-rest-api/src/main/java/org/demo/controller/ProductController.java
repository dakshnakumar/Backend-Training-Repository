package org.demo.controller;

import org.demo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private List<Product> productList= new ArrayList<>();

    public ProductController(){
     productList.add(new Product("1","laptop",20000,1));
     productList.add(new Product("1","mobile",4000,2));
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productList;
    }

}
