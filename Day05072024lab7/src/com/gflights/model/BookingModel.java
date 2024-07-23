package com.gflights.model;
public class BookingModel {
    private int bookingId;
    private String source;
    private String destination;
    private String ticketClass;
    private int noOfPassenger;
    public BookingModel(){

    }
    public BookingModel(int bookingId,String source,String destination,String ticketClass,int noOfPassenger){
        this.bookingId=bookingId;
        this.source=source;
        this.destination=destination;
        this.ticketClass=ticketClass;
        this.noOfPassenger=noOfPassenger;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getTicketClass() {
        return ticketClass;
    }

    public int getNoOfPassenger() {
        return noOfPassenger;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setTicketClass(String ticketClass) {
        this.ticketClass = ticketClass;
    }

    public void setNoOfPassenger(int noOfPassenger) {
        this.noOfPassenger = noOfPassenger;
    }

    @Override
    public String toString() {
        return bookingId+" "+source+" "+destination+" "+ticketClass+" "+noOfPassenger;
    }

}
