package com.asc.model;

public class BookingModel {
    private String bookingId;
    private String source;
    private String destination;
    private String ticketClass;
    private int noOfPassengers;
    private boolean roundTrip;
    public BookingModel(String bookingId,String source,String destination,String ticketClass,int noOfPassengers,boolean roundTrip){
        this.bookingId=bookingId;
        this.source=source;
        this.destination=destination;
        this.ticketClass=ticketClass;
        this.noOfPassengers=noOfPassengers;
        this.roundTrip=roundTrip;
    }
    public void setBookingId(String bookingId){
        this.bookingId=bookingId;
    }
    public void setSource(String source){
        this.source=source;
    }
    public void setDestination(String destination){
        this.destination=destination;
    }
    public void setTicketClass(String ticketClass){
        this.ticketClass=ticketClass;
    }
    public void setNoOfPassengers(int noOfPassengers){
        this.noOfPassengers=noOfPassengers;
    }
    public void setRoundTrip(boolean roundTrip){
        this.roundTrip=roundTrip;
    }
    public String getBookingId(){
        return bookingId;
    }
    public String getSource(){
        return source;
    }
    public String getDestination(){
        return destination;
    }
    public String getTicketClass(){
        return ticketClass;
    }
    public int getNoOfPassengers(){
        return noOfPassengers;
    }
    public boolean getRoundTrip(){
        return roundTrip;
    }
    @Override
    public String toString() {
        return "Booking{BookingId = "+bookingId+" Source = "+source+" Destination = "+destination+" TicketClass = "+ticketClass+" NoOfPassengers = "+noOfPassengers+" RoundTrip = "+roundTrip+"}";
    }
}
