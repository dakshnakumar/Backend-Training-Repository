import java.util.ArrayList;
import java.util.List;

public class Television {
    // single line comment entries
    // create variables
    // created and intitialized
    List<String> nameList =  new ArrayList<>();
    String model = "Sony Some Model";
    int width;
    int height;
    float price;
    String color;
    boolean availble;
    // create methods

    void displayDetails(){
       System.out.println(model);
        System.out.println("The width of the TV is : " + width);
        System.out.println("Total price : "  + (price + 5000));
        System.out.println(color);
        System.out.println(availble);
    }

   void add_Laptops(){
        nameList.add(this.model);
   }

   List<String> show_laptops(){
       return nameList;
   }

}
