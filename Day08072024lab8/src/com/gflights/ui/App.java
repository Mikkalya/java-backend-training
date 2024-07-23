package com.gflights.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.gflights.model.BookingModel;
import com.gflights.repository.BookingRepositoryJDBC;
import com.gflights.util.MainMenuUtil;
import com.gflights.util.MenuUtil;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to GFlights");
//        bookingRepositoryJDBC bookingRepositoryJDBC=new bookingRepositoryJDBC();
//        int choice=MainMenuUtil.displayMainMenu();
//        while(choice>=1&&choice<=5){
//            if(choice==1){
//                BookingModel bookingModel=null;
//                bookingModel=MenuUtil.bookFlights();
//                bookingRepositoryJDBC.addBooking(bookingModel);
//            }
//            else if(choice==2){
//                bookingRepositoryJDBC.displayBookings();
//            }
//            else if(choice==3){
//                System.out.println("Enter bookingId for searching: ");
//                bookingRepositoryJDBC.searchBooking(sc.nextInt());
//            }
//            else if(choice==4){
//                System.out.println("Enter bookingId for updating: ");
//                bookingRepositoryJDBC.updateBooking(sc.nextInt());
//            }
//            else{
//                System.out.println("Enter bookingId for deleting: ");
//                bookingRepositoryJDBC.deleteBooking(sc.nextInt());
//            }
//            choice=MainMenuUtil.displayMainMenu();
//        }
        BookingRepositoryJDBC bookingRepositoryJDBC=new BookingRepositoryJDBC();

        int choice=MainMenuUtil.displayMainMenu();
        while(choice>=1&&choice<=5){
            if(choice==1){
                BookingModel bookingModel=null;
                bookingModel=MenuUtil.bookFlights();
                bookingRepositoryJDBC.addBooking(bookingModel);
            }
            else if(choice==2){
                bookingRepositoryJDBC.displayBookings();
            }
            else if(choice==3){
                System.out.println("Enter bookingId for searching: ");
                bookingRepositoryJDBC.searchBooking(sc.nextInt());
            }
            else if(choice==4){
                System.out.println("Enter bookingId for updating: ");
                bookingRepositoryJDBC.updateBooking(sc.nextInt());
            }
            else{
                System.out.println("Enter bookingId for deleting: ");
                bookingRepositoryJDBC.deleteBooking(sc.nextInt());
            }
            choice=MainMenuUtil.displayMainMenu();
        }
    }
}
