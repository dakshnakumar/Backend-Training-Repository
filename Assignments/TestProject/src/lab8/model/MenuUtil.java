package lab8.model;

import java.util.Scanner;

public class MenuUtil {
    public static BookingRepository bookFlights() {

        Scanner input = new Scanner(System.in);

//        System.out.println("Enter Booking Id : ");
//        int bookingId = input.nextInt();
//        input.nextLine();

        System.out.println("Enter source: ");
        String source = input.nextLine();

        System.out.println("Enter destination : ");
        String destination = input.nextLine();

        System.out.println("Enter ticket class : ");
        String ticketClass = input.nextLine();

        System.out.println("Enter NoOfPassangers : ");
        int passangers = input.nextInt();
        input.nextLine();

        System.out.println("Enter roudTrip : ");
        boolean roundTrip = input.nextBoolean();


//        accept all the values, use parameterized constructor and/or getters/setters
        BookingRepository bookingRepository = new BookingRepository(source,destination,ticketClass,passangers,roundTrip);

        return bookingRepository;
    }
}
