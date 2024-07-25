package org.example.testModel;

import org.example.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestProduct {

    Product product1;
    Product product2;

    @BeforeEach
    void setup(){
         product1 = new Product("po1","laptop",90000,1);
         product2 = new Product("po2","mobile",200000,1);
    }

    @Test
    void TestProductConstructor(){
        assertThrows(RuntimeException.class,()-> new Product("po3","car",-0000,0));
    }

    @Test
    void TestSetID(){
       product1.setId("po2");
       assertEquals("po2",product1.getId());
    }

    @Test
    void TestSetName()
    {

    }


}
