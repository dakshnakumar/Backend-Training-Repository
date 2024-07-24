package org.example.service;

import org.example.model.Product;

import java.util.List;

public interface ProductService {

    boolean addProduct(Product product);
    List<Product> viewProducts(int show);
    boolean deleteProducts(String name);
    void updateProducts(String name,String productIdNumber);
}
