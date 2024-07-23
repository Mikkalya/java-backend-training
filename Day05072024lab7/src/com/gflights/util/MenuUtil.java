package com.gflights.util;
import  com.gflights.model.BookingModel;

import java.util.Scanner;

public class MenuUtil {
    public static BookingModel bookFlights(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Booking Id : ");
        int bookingId=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter source : ");
        String source=sc.nextLine();
        System.out.println("Enter destination : ");
        String destination=sc.nextLine();
        System.out.println("Enter ticketClass : ");
        String ticketClass=sc.nextLine();
        System.out.println("Enter noOfPassengers : ");
        int noOfPassengers= sc.nextInt();

        BookingModel bookingModel=new BookingModel();
        bookingModel.setBookingId(bookingId);
        bookingModel.setSource(source);
        bookingModel.setDestination(destination);
        bookingModel.setTicketClass(ticketClass);
        bookingModel.setNoOfPassenger(noOfPassengers);
        return bookingModel;
    }
}
