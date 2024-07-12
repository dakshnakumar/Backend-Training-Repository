public class Laptop {

    // Create variable
    String brand;
    int width;
    int height;
    String colour;
    int price;

    // Create method
    void Display(){
        System.out.println("The laptop brand is" + brand);
        System.out.println("The width is "+ width + "the height is " + height);
        System.out.println(colour);
        System.out.println(price);
    }

    // change brand
    void change_brand(String name){
        this.brand = name;
    }

    void change_colour(String Colour){
        this.colour = Colour;
    }

    void change_price(int Price){
        this.price = Price;
    }




    public static void main(String[] args) {

        Laptop obj1 = new Laptop();

        obj1.brand = "lenovo";
        obj1.colour = "Red";
        obj1.width = 123;
        obj1.height = 14;
        obj1.price = 500000;

        Laptop obj2 = new Laptop();

        obj2.brand = "HP";
        obj2.colour = "Blue";
        obj2.width = 345;
        obj2.height = 4;
        obj2.price = 5340000;



        obj1.Display();
        obj1.change_brand("Mac");
        obj1.Display();


        obj2.Display();
        obj2.change_brand("Dell");
        obj2.change_colour("Red");
        obj2.Display();


    }
}
