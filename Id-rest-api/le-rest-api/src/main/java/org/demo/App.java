package org.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Java App.........." );
        System.out.println( "Loading spring & springBoot framework" );
        SpringApplication.run(App.class,args);
    }
}
