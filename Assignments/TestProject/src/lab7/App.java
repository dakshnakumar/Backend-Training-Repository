package lab7;

public class App {
    public static void main( String[] args )
    {
        System.out.println( "Welcome to GFlights" );
        BookingRepository bookingRepository = new BookingRepository();

        while(true){
            int choice = MainMenuUtil.displayMainMenu();
            if (choice == 1) {
                BookingModel bookingModel = null;
                bookingModel = MenuUtil.bookFlights();
//          store the booking details to repository
                bookingRepository.addBooking(bookingModel);
            } else if (choice == 2) {
//            2. Display Flights
                bookingRepository.displayBookings();
            } else if (choice == 3) {
//            Search bookings by bookingId
                bookingRepository.searchBookings();
            } else if (choice == 4) {
//            Search bookings by bookingId
                bookingRepository.updateBookings();
            } else if (choice == 5) {
                bookingRepository.deleteBooking();
            } else if (choice == 6){break;}
            else System.out.println("Please enter valid input");
        }
    }
}
