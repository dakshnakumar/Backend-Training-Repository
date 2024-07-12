package lab8.model;

import java.util.Scanner;

public class MainMenuUtil {

    public static int displayMainMenu(){

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to GFlights...");
        System.out.println("1. Book Flights");
        System.out.println("2. Display Flights");
        System.out.println("3. Search bookings by bookingId");
        System.out.println("4. Update bookings");
        System.out.println("5. Delete a booking");
        System.out.println("6. Stop");
        // Add the following
//        2. Display bookings
//        3. Search bookings by bookingId
//        4. update bookings
//        5. delete a booking

//      accept choice from user
        int choice;
        choice = input.nextInt();
        return choice;

    }
}
