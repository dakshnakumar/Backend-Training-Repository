package lab8.model;

import java.sql.SQLException;
import java.util.Scanner;

public class App {
    public static void main( String[] args ) throws SQLException, ClassNotFoundException {
        System.out.println( "Welcome to GFlights" );
        Scanner input = new Scanner(System.in);


        while(true){
            int choice = MainMenuUtil.displayMainMenu();
            if (choice == 1) {
                BookingRepository bookingRepository = null;
                bookingRepository = MenuUtil.bookFlights();

//          store the booking details to repository
                bookingRepository.addBooking();
            }
            else if (choice == 2) {
//            2. Display Flights
                BookingRepository.displayBookings();
            }
            else if (choice == 3) {
//            Search bookings by bookingId
                System.out.println("Enter the bookingID to search");
                int bookingId = input.nextInt();
                BookingRepository.searchBookings(bookingId);
            }
//            else if (choice == 4) {
////            Search bookings by bookingId
//                bookingRepository.updateBookings();
//            }
            else if (choice == 5) {
                System.out.println("Enter the bookingID");
                int bookingId = input.nextInt();
                BookingRepository.deleteBooking(bookingId);
            } else if (choice == 6){
                break;}

        }
    }
}
