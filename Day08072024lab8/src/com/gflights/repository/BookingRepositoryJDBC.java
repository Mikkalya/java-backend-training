package com.gflights.repository;

import com.gflights.model.BookingModel;

import java.sql.*;

public class BookingRepositoryJDBC {
    public void addBooking(BookingModel bookingModel) throws DuplicateBookingException {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","mysql");
            PreparedStatement statement=connection.prepareStatement("insert into gflights values(?,?,?,?,?)");
            statement.setInt(1,bookingModel.getBookingId());
            statement.setString(2,bookingModel.getSource());
            statement.setString(3,bookingModel.getDestination());
            statement.setString(4,bookingModel.getTicketClass());
            statement.setInt(5,bookingModel.getNoOfPassenger());
//            try{
                statement.executeUpdate();
//            }
//            catch (DuplicateBookingException duplicateBookingException){
//                System.out.println(duplicateBookingException.getMessage());
//            }
            statement.close();
            connection.close();
        }
        catch(ClassNotFoundException classNotFoundException){
            System.out.println(classNotFoundException.getMessage());
        }
        catch (SQLException sqlException){
//            System.out.println(sqlException.getMessage());
            if(sqlException.getErrorCode() == 1062){
                System.out.println("Duplicate Booking Found");
            }
        }
    }
    public void displayBookings(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","mysql");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from gflights");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getInt(5));
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(ClassNotFoundException classNotFoundException){
            System.out.println(classNotFoundException.getMessage());
        }
        catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
        }
    }
    public void searchBooking(int searchId) throws BookingNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","mysql");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from gflights where booking_id="+searchId);
            boolean flag=false;
            while (resultSet.next()){
                flag=true;
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getInt(5));
            }
            if(!flag){
                throw new BookingNotFoundException("Booking Not Found");
            }
            resultSet.close();
//            int search=statement.executeUpdate("select * from gflights where booking_id="+searchId);
//            if (search<1){
//                throw new BookingNotFoundException("Booking Not Found");
//            }
            statement.close();
            connection.close();
        }
        catch(ClassNotFoundException classNotFoundException){
            System.out.println(classNotFoundException.getMessage());
        }
        catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
        }
        catch (BookingNotFoundException bookingNotFoundException){
            System.out.println(bookingNotFoundException.getMessage());
        }
    }
    public void updateBooking(int updatingId){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","mysql");
            Statement statement=connection.createStatement();
            int update=statement.executeUpdate("update gflights set noOfPassengers=4 where booking_id="+updatingId);
            statement.close();
            connection.close();
        }
        catch(ClassNotFoundException classNotFoundException){
            System.out.println(classNotFoundException.getMessage());
        }
        catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
        }
    }
    public void deleteBooking(int deleteId){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","root","mysql");
            Statement statement=connection.createStatement();
            int deletedRow=statement.executeUpdate("delete from gflights where booking_id="+deleteId);
            statement.close();
            connection.close();
        }
        catch(ClassNotFoundException classNotFoundException){
            System.out.println(classNotFoundException.getMessage());
        }
        catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
        }
    }
}