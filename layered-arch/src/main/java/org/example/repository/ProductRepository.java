package org.example.repository;

import org.example.model.Product;

public interface ProductRepository {
    boolean addProductsToDB(Product product);
     boolean deleteProductFromDB(String name);
     boolean updateProductsToDB(String name,String productIdWantsToChange);

}
