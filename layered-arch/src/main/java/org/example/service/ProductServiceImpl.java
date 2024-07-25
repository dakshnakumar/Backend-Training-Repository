package org.example.service;

import org.example.model.Product;
import org.example.repository.ProductRepositoryImpl;

import java.util.List;


public class ProductServiceImpl implements ProductService{

    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    public boolean addProduct(Product product){
//        return productRepository.addProductToCart(product);
        return productRepository.addProductsToDB(product);
    }


//    public boolean addProductToCart(Product product){
//        //Validation
//        boolean isAdded = false;
//        if(product.getPrice()<=0){
//            System.out.println("product price can't be negative");
//        }
//        else  isAdded = productRepository.addProductToCart(product);
//        return isAdded;
//    }


    public List<Product> viewProducts(int show){
        List<Product> product;
        product = productRepository.viewProductsFromDB(show);
        return product;
    }


    public boolean deleteProducts(String name){
        boolean isDeleted = productRepository.deleteProductFromDB(name);
        return isDeleted;
    }

    public Product recieveUpdateProducts(String id){
        Product product = productRepository.findProductById(id);
        return  product;
    }

    public void updateProducts(String name,String productIdNumber){
        productRepository.updateProductsToDB(name,productIdNumber);
    }

    public void updateProducts(double price,String productIdNumber){
        productRepository.updateProductsToDB(price,productIdNumber);
    }

    public void updateProducts(int quantity,String productIdNumber){
        productRepository.updateProductsToDB(quantity,productIdNumber);
    }
}
