package lab8.model;

import lab8.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingRepository extends BookingModel {
    Scanner input = new Scanner(System.in);

    BookingRepository( String source, String destination, String ticketClass, int n0OfPassengers, boolean roundTrip) {
        super( source, destination, ticketClass, n0OfPassengers, roundTrip);
    }

//    List<BookingModel> bookingModelList = new ArrayList<BookingModel>();


    public void addBooking() throws SQLException, ClassNotFoundException {

        int affectedRows;
        String sql = "INSERT INTO bookings (source,destination,ticket_class,no_of_passengers,round_trip) VALUES (?, ?, ?, ?, ?)";
        try(Connection connection = DatabaseConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);) {

            System.out.println("Statement prepared");
            statement.setString(1,getSource());
            statement.setString(2,getDestination());
            statement.setString(3,getTicketClass());
            statement.setInt(4,getN0OfPassengers());
            statement.setBoolean(5,getRoundTrip());

            affectedRows = statement.executeUpdate();
            System.out.println("No.of.AffectedRows"+affectedRows);

        }


    }

    //        2. Display bookings
    public static void displayBookings() {
        // iterate through the database and display the bookings.
        // iterate through a map and display details

        String sql = "SELECT * FROM bookings";

            try { // 1.Load the driver, its is optional
//            Class.forName("com.mysql.jdbc.Driver");

                // 2.Establish the connection to the database
                Connection conn = DatabaseConnection.getConnection();

                // 3.Create a statement object
                Statement statement = conn.createStatement();

                // 4.Execute the query
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()){
                    System.out.println("BookingId: "+resultSet.getInt(1));
                    System.out.println("Source: "+resultSet.getString(2));
                    System.out.println("destination: "+resultSet.getString(3));
                    System.out.println("Ticket class: "+resultSet.getString(4));
                    System.out.println("NoOfPassengers: "+resultSet.getInt(5));
                    System.out.println("RoundTrip: "+resultSet.getBoolean(6));
                    System.out.println("BookingDate: "+resultSet.getTimestamp(7));
                    System.out.println("-----------****------------");
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
//        3. Search bookings by bookingId
    public static void searchBookings(int bookingId) throws SQLException, ClassNotFoundException {

        String sql = "SELECT * FROM bookings WHERE booking_id="+bookingId;
        try(Connection conn = DatabaseConnection.getConnection();
            Statement statement = conn.createStatement();){

            System.out.println("Statement Created");

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println("BookingId: "+resultSet.getInt(1));
                System.out.println("Source: "+resultSet.getString(2));
                System.out.println("Destination: "+resultSet.getString(3));
                System.out.println("Ticket class: "+resultSet.getString(4));
                System.out.println("NoOfPassengers: "+resultSet.getInt(5));
                System.out.println("Round: "+resultSet.getBoolean(6));
                System.out.println("Booking date: "+resultSet.getTimestamp(7));
                System.out.println("----------****-----------");
            }
        }


    }
//
//    //        4. update bookings
//    public void updateBookings() {
//
//        System.out.println("Enter the booking id ");
//        int bookingId = input.nextInt();
//
//        for (BookingModel b : bookingModelList) {
//            if (b.getBookingId() == bookingId) {
//                System.out.println("Which one you want to update");
//                System.out.println("1.Source");
//                System.out.println("2.destination");
//                System.out.println("3.Ticket class");
//                System.out.println("4.NoOfPassengers");
//                System.out.println("5.Round Trip");
//
//                int num = input.nextInt();
//                input.nextLine();
//
//                if (num == 1) {
//                    System.out.println("Enter the udpated source ");
//                    b.setSource(input.nextLine());
//                    System.out.println("Source udpated ");
//                } else if (num == 2) {
//                    System.out.println("Enter the udpated destination ");
//                    b.setDestination(input.nextLine());
//                    System.out.println("destination udpated ");
//                } else if (num == 3) {
//                    System.out.println("Enter the udpated ticket class ");
//                    b.setTicketClass(input.nextLine());
//                    System.out.println("ticket class udpated ");
//                } else if (num == 4) {
//                    System.out.println("Enter the udpated noOfPassangers");
//                    b.setN0OfPassengers(input.nextInt());
//                    System.out.println("noOfPassangers udpated ");
//                } else if (num == 5) {
//                    System.out.println("Enter the udpated roundtrip");
//                    b.setSource(input.nextLine());
//                    System.out.println("roundtrip udpated ");
//                } else System.out.println("please enter valid input");
//            }else System.out.println("Booking ID is not found");
//        }
//
//    }
//
//
////        5. delete a booking
//
    public static void  deleteBooking(int bookingId) throws SQLException, ClassNotFoundException {

        String sql = "DELETE FROM bookings WHERE BOOKING_ID="+bookingId;

        try(Connection connection = DatabaseConnection.getConnection();
        Statement statement = connection.createStatement();){

            // 4. Write query you want to execute
            int affectedRows = statement.executeUpdate(sql);
            System.out.println("No.of.Rows affected"+affectedRows);
            System.out.println("successfully deleted");
        }

    }

////        6. Create and handle BookingNotFoundException for both List and Map
//              public void BookingNotFoundException(int bookingId) throws RuntimeException {
//
//                boolean bookingFound = false;
//                for(BookingModel b:bookingModelList){
//
//                    if(b.getBookingId() == bookingId){
//                        bookingFound = true;
//                        System.out.println("booking Id" + bookingId + " found!");
//                          break;
//                    }
//                }
//                   if(!bookingFound) {
//                       System.out.println("No booking");
//                       throw new RuntimeException("Booking Id not found");
//                   }
//    }
//
////        7. Create and handle DuplicateBookingException if a duplicate key is added.
//            public void DuplicateBookingException(int bookingId) throws RuntimeException{
//                    for(BookingModel b:bookingModelList){
//                        if(b.getBookingId() == bookingId){
//                                    throw new RuntimeException("Already booking found");
//                        }
//                    }
//
//            }
}
