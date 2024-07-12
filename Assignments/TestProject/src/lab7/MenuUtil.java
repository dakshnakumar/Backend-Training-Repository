package lab7;

import java.util.Scanner;

public class MenuUtil {
    public static BookingModel bookFlights() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Booking Id : ");
        int bookingId = input.nextInt();
        input.nextLine();

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
        String roundTrip = input.nextLine();


//        accept all the values, use parameterized constructor and/or getters/setters
        BookingModel bookingModel = new BookingModel();
        bookingModel.setBookingId(bookingId);
        bookingModel.setSource(source);
        bookingModel.setDestination(destination);
        bookingModel.setTicketClass(ticketClass);
        bookingModel.setN0OfPassengers(passangers);
        bookingModel.setRoundTrip(roundTrip);
        return bookingModel;
    }
}
