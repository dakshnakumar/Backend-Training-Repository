public class Application {
    public static void main(String[] args) {
// Create the object
        // Create the reference
        Television sonyTv;
        //Create the instance
        sonyTv = new Television();
        //method to store the brand
        sonyTv.add_Laptops();
        //Access the variables
        System.out.println("Model is : "  + sonyTv.model);
        System.out.println("Price " + sonyTv.price);
        //Access the method
        sonyTv.displayDetails();
        sonyTv.price = 50000;
        sonyTv.show_laptops();



    }
}
