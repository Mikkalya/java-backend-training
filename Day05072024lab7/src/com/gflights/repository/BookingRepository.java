package com.gflights.repository;

import com.gflights.model.BookingModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingRepository {
    public static int getIndex(List<BookingModel> bookingModelList1,int id){
        for(int i=0;i<bookingModelList1.size();i++){
            if(bookingModelList1.get(i).getBookingId()==id) {
                return i;
            }
        }
        return -1;
    }
    Map<Integer,BookingModel> bookingModelMap= new HashMap<>();
    List<BookingModel> bookingModelList=new ArrayList<>();
    List<Integer> bookingIdList=new ArrayList<>();
    public void addBooking(BookingModel bookingModel) {
//        bookingModelList.add(bookingModel);
        try{
            if(bookingIdList.contains(bookingModel.getBookingId())){
                throw new DuplicateBookingException("Duplicate Entry For Booking");
            }
            else{
                bookingModelList.add(bookingModel);
                bookingIdList.add(bookingModel.getBookingId());
            }
        }
        catch(DuplicateBookingException duplicateBookingException){
            System.out.println(duplicateBookingException.getMessage());
        }
//        System.out.println("Saved booking : "+bookingModel);
//        bookingModelMap.put(bookingModel.getBookingId(),bookingModel);
        try{
            if(bookingModelMap.containsKey(bookingModel.getBookingId())){
                throw new DuplicateBookingException("Duplicate Entry Of Booking");
            }
            else{
                bookingModelMap.put(bookingModel.getBookingId(),bookingModel);
            }
        }
        catch (DuplicateBookingException duplicateBookingException){
            System.out.println(duplicateBookingException.getMessage());
        }
    }
    public void displayBookings(){
//        for(BookingModel model:bookingModelList){
//            System.out.println(model);
//        }
//        for(Map.Entry<Integer,BookingModel> bookingModelEntry:bookingModelMap.entrySet()){
//            System.out.println(bookingModelEntry.getKey()+" "+bookingModelEntry.getValue());
//        }
        System.out.println(bookingModelList.toString());
        System.out.println(bookingModelMap.toString());
    }
    public void searchBooking(int searchId) {
        boolean flag=false;

        for (BookingModel bookingModel : bookingModelList) {
            if (bookingModel.getBookingId() == searchId) {
                flag = true;
                System.out.println(bookingModel.toString());
                break;
            }
        }
        try{
//            for(int entry=0;entry<bookingModelList.size();entry++){
//                if(bookingModelList.get(entry).getBookingId()==searchId){
//                    System.out.println(bookingModelList.get(entry));
//                }
//                else throw new BookingNotFoundException("Booking Not Found");
//            }
            if(!flag){
                throw new BookingNotFoundException("Booking Not Found");
            }
        }
        catch (BookingNotFoundException bookingNotFoundException){
            System.out.println(bookingNotFoundException.getMessage());
        }
        flag=false;
        for(Map.Entry<Integer,BookingModel> bookingModelEntry:bookingModelMap.entrySet()){
            if(bookingModelEntry.getKey()==searchId){
                flag=true;
                System.out.println(bookingModelEntry.getKey()+" "+bookingModelEntry.getValue());
                break;
            }
        }
        try{
            if(!flag){
                throw new BookingNotFoundException("Booking Not Found");
            }
        }
        catch (BookingNotFoundException bookingNotFoundException){
            System.out.println(bookingNotFoundException.getMessage());
        }
    }
    public void updateBooking(int updatingId){
//        for(int i=0;i<bookingModelList.size();i++){
//            if(bookingModelList.get(i).getBookingId()==updatingId){
//                bookingModelList.get(i).setNoOfPassenger(bookingModelList.get(i).getNoOfPassenger()+1);
//            }
//        }
        for (BookingModel bookingModel : bookingModelList) {
            if (bookingModel.getBookingId() == updatingId) {
                bookingModel.setNoOfPassenger(bookingModel.getNoOfPassenger() + 1);
            }
        }
        for(Map.Entry<Integer,BookingModel> bookingModelEntry:bookingModelMap.entrySet()){
            if(bookingModelEntry.getKey()==updatingId){
                bookingModelEntry.getValue().setNoOfPassenger(bookingModelEntry.getValue().getNoOfPassenger()+1);
            }
        }
    }
    public void deleteBooking(int deleteId){
        bookingModelList.remove(getIndex(bookingModelList,deleteId));
        bookingModelMap.remove(deleteId);
    }
}
class BookingNotFoundException extends RuntimeException{
    BookingNotFoundException(String message){
        super(message);
    }
}
class DuplicateBookingException extends RuntimeException{
    DuplicateBookingException(String message){
        super(message);
    }
}
