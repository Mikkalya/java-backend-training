package com.gflights.util;

import java.util.Scanner;

public class MainMenuUtil {
    public static int displayMainMenu(){
        System.out.println("Welcome to GFlights...");
        System.out.println("1. Book Flights");
        System.out.println("2. Display Bookings");
        System.out.println("3. Search Bookings by bookingId");
        System.out.println("4. Update Bookings");
        System.out.println("5. Delete a Booking");
//        Accept choice from user
        System.out.println("Enter the choice from the above, you want to do for booking: ");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        return choice;
    }
}
