package com.asc.ui;

import com.asc.model.BookingModel;

public class App {
    public static void main(String[] args) {
        MenuUI menuUI=new MenuUI();
        menuUI.dispalyMainMenu();
        int choice=menuUI.getChoice();
        while(choice>0&&choice<6){
            switch (choice){
                case 1:
                    BookingModel bookingModel=menuUI.bookFlight();

                    menuUI.addBooking(bookingModel);

            }
        }
    }
}
