package com.gflights.ui;

import java.util.Scanner;
import com.gflights.model.BookingModel;
import com.gflights.repository.BookingRepository;
import com.gflights.util.MainMenuUtil;
import com.gflights.util.MenuUtil;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to GFlights");
        BookingRepository bookingRepository=new BookingRepository();
        int choice=MainMenuUtil.displayMainMenu();
        while(choice>=1&&choice<=5){
            if(choice==1){
                BookingModel bookingModel=null;
                bookingModel=MenuUtil.bookFlights();
                bookingRepository.addBooking(bookingModel);
            }
            else if(choice==2){
                bookingRepository.displayBookings();
            }
            else if(choice==3){
                System.out.println("Enter bookingId for searching: ");
                bookingRepository.searchBooking(sc.nextInt());
            }
            else if(choice==4){
                System.out.println("Enter bookingId for updating: ");
                bookingRepository.updateBooking(sc.nextInt());
            }
            else{
                System.out.println("Enter bookingId for deleting: ");
                bookingRepository.deleteBooking(sc.nextInt());
            }
            choice=MainMenuUtil.displayMainMenu();
        }
    }
}
