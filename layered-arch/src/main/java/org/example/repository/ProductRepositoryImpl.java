package org.example.repository;

import org.example.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository{

    Map<String, Product> cart = new HashMap<>();

//    public boolean addProductToCart(Product product){
//        cart.put(product.getId(),product);
//        System.out.println("Product added successfully to the cart");
//        return true;
//    }

    public boolean addProductsToDB(Product product){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","test@123");
            System.out.println("connection created");
            Statement statement = connection.createStatement();
            System.out.println("Statement created");
            String insertQuery = "INSERT into products (id,name,price,quantity) VALUES ('"+product.getId()+"','"+product.getName()+"','"+product.getPrice()+"','"+product.getQuantity()+"');";
            int noOfRowsAffected = statement.executeUpdate(insertQuery);
            return noOfRowsAffected>0;
        }
        catch (SQLException | ClassNotFoundException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        } finally {
            System.out.println("Driver Loaded");
        }

    }

//    public void viewProductsInCart(){
//       for(Map.Entry<String,Product> entry : cart.entrySet()){
//           String key = entry.getKey();
//           String value = entry.getValue().toString();
//           System.out.println("key: " + key +","+"values: "+value);
//       }
//    }

    public boolean deleteProductFromDB(String name){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","test@123");
            System.out.println("connection created");
            Statement statement = connection.createStatement();
            System.out.println("Statement created");
            String sql = "DELETE FROM products WHERE name='"+name+"';";
            int affectedRows = statement.executeUpdate(sql);
            return affectedRows>0;

        } catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }


    public List<Product> viewProductsFromDB(int show){
        List<Product> products = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","test@123");
            System.out.println("connection created");
            Statement statement = connection.createStatement();
            System.out.println("Statement created");
            String sql = "SELECT * FROM products LIMIT "+show+";";
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("Query executed");

            while (resultSet.next()){
                String newId = resultSet.getString(1);
                String name = resultSet.getString(2);
                int quantity = resultSet.getInt(3);
                int price = resultSet.getInt(4);
                Product product = new Product(newId,name,quantity,price);
                products.add(product);
            }
            return products;

        } catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e.getMessage());
        }

    }


    public Product findProductById(String id){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","test@123");
            System.out.println("connection created");
            Statement statement = connection.createStatement();
            System.out.println("Statement created");
            String sql = "SELECT * FROM products WHERE id='"+id+"';";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                String newId = resultSet.getString(1);
                String name = resultSet.getString(2);
                int quantity = resultSet.getInt(3);
                int price = resultSet.getInt(4);
                return new Product(newId,name,quantity,price);
            }

        } catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e.getMessage());
        }
        return null;
    }

    public boolean updateProductsToDB(String name,String productIdWantsToChange){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","test@123");
            System.out.println("connection created");
            Statement statement = connection.createStatement();
            System.out.println("Statement created");
            String sql = "UPDATE products SET name='"+name+"' WHERE id='"+productIdWantsToChange+"';";
            int resultSet = statement.executeUpdate(sql);
            return resultSet>0;

        } catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public boolean updateProductsToDB(double price,String productIdWantsToChange){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","test@123");
            System.out.println("connection created");
            Statement statement = connection.createStatement();
            System.out.println("Statement created");
            String sql = "UPDATE products SET price='"+price+"' WHERE id='"+productIdWantsToChange+"';";
            int resultSet = statement.executeUpdate(sql);
            return resultSet>0;

        } catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    public boolean updateProductsToDB(int quantity,String productIdWantsToChange){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","test@123");
            System.out.println("connection created");
            Statement statement = connection.createStatement();
            System.out.println("Statement created");
            String sql = "UPDATE products SET quantity='"+quantity+"' WHERE id='"+productIdWantsToChange+"';";
            int resultSet = statement.executeUpdate(sql);
            return resultSet>0;

        } catch (ClassNotFoundException | SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
