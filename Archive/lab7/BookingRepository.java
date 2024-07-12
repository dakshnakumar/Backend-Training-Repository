package lab7;

import java.util.*;

public class BookingRepository {
    Scanner input = new Scanner(System.in);

    List<BookingModel> bookingModelList = new ArrayList<BookingModel>();

    public void addBooking(BookingModel bookingModel) {
        bookingModelList.add(bookingModel);
        System.out.println("Saved booking :  " + bookingModel);
    }

    //        2. Display bookings
    public void displayBookings() {
        // iterate through the arraylist and display the bookings.
        // iterate through a map and display details

            for (BookingModel b : bookingModelList) {
                System.out.println("Booking Id " + b.getBookingId());
                System.out.println("Source " + b.getSource());
                System.out.println("Destination " + b.getDestination());
                System.out.println("Ticket class" + b.getTicketClass());
                System.out.println("noOfPassengers" + b.getN0OfPassengers());
                System.out.println("Round trip" + b.getRoundTrip());


        }
    }
//        3. Search bookings by bookingId
    public void searchBookings() {
        System.out.println("Enter Booking Id you want to search");
        int id = input.nextInt();
        try{
            for (BookingModel b : bookingModelList) {
                if ((b.getBookingId()) == id) {
                    System.out.println("Source " + b.getSource());
                    System.out.println("Destination " + b.getDestination());
                    System.out.println("Ticket class" + b.getTicketClass());
                    System.out.println("noOfPassengers" + b.getN0OfPassengers());
                    System.out.println("Round trip" + b.getRoundTrip());
                }
            }
        }
        catch (RuntimeException e){
            BookingNotFoundException(id);
        }

    }

    //        4. update bookings
    public void updateBookings() {

        System.out.println("Enter the booking id ");
        int bookingId = input.nextInt();

        for (BookingModel b : bookingModelList) {
            if (b.getBookingId() == bookingId) {
                System.out.println("Which one you want to update");
                System.out.println("1.Source");
                System.out.println("2.destination");
                System.out.println("3.Ticket class");
                System.out.println("4.NoOfPassengers");
                System.out.println("5.Round Trip");

                int num = input.nextInt();
                input.nextLine();

                if (num == 1) {
                    System.out.println("Enter the udpated source ");
                    b.setSource(input.nextLine());
                    System.out.println("Source udpated ");
                } else if (num == 2) {
                    System.out.println("Enter the udpated destination ");
                    b.setDestination(input.nextLine());
                    System.out.println("destination udpated ");
                } else if (num == 3) {
                    System.out.println("Enter the udpated ticket class ");
                    b.setTicketClass(input.nextLine());
                    System.out.println("ticket class udpated ");
                } else if (num == 4) {
                    System.out.println("Enter the udpated noOfPassangers");
                    b.setN0OfPassengers(input.nextInt());
                    System.out.println("noOfPassangers udpated ");
                } else if (num == 5) {
                    System.out.println("Enter the udpated roundtrip");
                    b.setSource(input.nextLine());
                    System.out.println("roundtrip udpated ");
                } else System.out.println("please enter valid input");
            }else System.out.println("Booking ID is not found");
        }

    }


//        5. delete a booking

    public void deleteBooking(){
        System.out.println("Enter the booking id to delete ");
        int bookingId = input.nextInt();
         for(BookingModel b : bookingModelList){
             if(b.getBookingId() == bookingId) {
                 bookingModelList.remove(b);
             }
//           Set keys =  new HashMap().keySet();
//           Iterator iterator =   keys.iterator();
//           while(iterator.hasNext()){
//               iterator.next();
//           }
        }
        System.out.println("successfully deleted");
    }
//        6. Create and handle BookingNotFoundException for both List and Map
              public void BookingNotFoundException(int bookingId) throws RuntimeException {

                boolean bookingFound = false;
                for(BookingModel b:bookingModelList){

                    if(b.getBookingId() == bookingId){
                        bookingFound = true;
                        System.out.println("booking Id" + bookingId + " found!");
                          break;
                    }
                }
                   if(!bookingFound) {
                       System.out.println("No booking");
                       throw new RuntimeException("Booking Id not found");
                   }
    }

//        7. Create and handle DuplicateBookingException if a duplicate key is added.
            public void DuplicateBookingException(int bookingId) throws RuntimeException{
                    for(BookingModel b:bookingModelList){
                        if(b.getBookingId() == bookingId){
                                    throw new RuntimeException("Already booking found");
                        }
                    }

            }
}
