package lab7;

public class BookingModel {
    private int bookingId;
    private String source;
    private String destination;
    private String ticketClass;
    private int n0OfPassengers;
    private String roundTrip;
//  add destination, ticketClass, noOfPassengers, roundTrip


//  override toString method
//  create default and parameterized constructors

    BookingModel(){

    }

    BookingModel(int bookingId , String source , String destination,String ticketClass,
                 int n0OfPassengers,String roundTrip){
        this.bookingId = bookingId;
        this.source = source;
        this.destination = destination;
        this.ticketClass = ticketClass;
        this.n0OfPassengers = n0OfPassengers;
        this.roundTrip = roundTrip;
    }

    //  generate getters/ setters
    public void setBookingId(int bookingId) {
        try{
            this.bookingId = bookingId;
        }catch (RuntimeException e){
            BookingRepository bookingRepository = new BookingRepository();
            bookingRepository.DuplicateBookingException(bookingId);

        }
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public void setN0OfPassengers(int n0OfPassengers) {
        this.n0OfPassengers = n0OfPassengers;
    }

    public int getN0OfPassengers() {
        return n0OfPassengers;
    }

    public void setRoundTrip(String roundTrip) {
        this.roundTrip = roundTrip;
    }

    public String getRoundTrip() {
        return roundTrip;
    }

}

