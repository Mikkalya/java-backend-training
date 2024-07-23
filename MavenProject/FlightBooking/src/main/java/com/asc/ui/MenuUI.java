package com.asc.ui;

import com.asc.model.BookingModel;

import java.util.Scanner;

public class MenuUI {
    void dispalyMainMenu(){
        System.out.println("Welcome to Flights:");
        System.out.println("1. Book Flight");
        System.out.println("2. Display Bookings");
        System.out.println("3. Search Booking using BookingId");
        System.out.println("4. Update Booking");
        System.out.println("5. Delete Booking");
    }
    int getChoice(){
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
    BookingModel bookFlights(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Booking Id");
        String bookingId=sc.nextLine();
        System.out.println("Enter Source");
        String source=sc.nextLine();
        System.out.println("Enter Destination");
        String destination=sc.nextLine();
        System.out.println("Enter TicketClass");
        String ticketClass=sc.nextLine();
        System.out.println("Enter No of Passengers");
        int noOfPassengers=sc.nextInt();
        System.out.println("Enter true/false for roundTrip");
        boolean roundTrip=sc.nextBoolean();
        BookingModel bookingModel=new BookingModel(bookingId,source,destination,ticketClass,noOfPassengers,roundTrip);
        bookingModel.setBookingId(bookingId);
        bookingModel.setSource(source);
        bookingModel.setDestination(destination);
        bookingModel.setTicketClass(ticketClass);
        bookingModel.setNoOfPassengers(noOfPassengers);
        bookingModel.setRoundTrip(roundTrip);
        return bookingModel;
    }
}
