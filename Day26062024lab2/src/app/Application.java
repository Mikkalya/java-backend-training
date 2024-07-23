package app;

import java.util.Scanner;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import static java.time.Duration.ofMinutes;
import static java.time.LocalTime.*;
import static java.time.LocalDate.*;


public class Application {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        MeetingRoom meetingRooms[]=new MeetingRoom[2];
        ZoomMeetingRoom zoomMeetingRooms[]=new ZoomMeetingRoom[2];
        BookingEmployee bookingEmployees[]=new BookingEmployee[4];

        meetingRooms[0]=new MeetingRoom("MR1",6,8);
        meetingRooms[1]=new MeetingRoom("MR2",43,8);

        zoomMeetingRooms[0]=new ZoomMeetingRoom("ZMR1",7,8,"ZD1","ZA1");
        zoomMeetingRooms[1]=new ZoomMeetingRoom("ZMR2",21,8,"ZD2","ZA2");

        bookingEmployees[0]=new BookingEmployee("ASC1",LocalDate.of(2024,06,14),of(12,30),ofMinutes(30),meetingRooms[0]);
        bookingEmployees[1]=new BookingEmployee("ASC2",LocalDate.of(2024,06,21),of(2,15),ofMinutes(15),meetingRooms[1]);
        bookingEmployees[2]=new BookingEmployee("ASC3",LocalDate.of(2024,06,25),of(1,45),ofMinutes(20),zoomMeetingRooms[0]);
        bookingEmployees[3]=new BookingEmployee("ASC4",LocalDate.of(2024,06,28),of(3,00),ofMinutes(45),zoomMeetingRooms[1]);

        for(int employeeCounter=0;employeeCounter<4;employeeCounter++){
            System.out.print(bookingEmployees[employeeCounter].getEmployeeId()+" "+bookingEmployees[employeeCounter].getMeetingDate()+" "+bookingEmployees[employeeCounter].getMeetingTime()+" "+bookingEmployees[employeeCounter].getMeetingDuration()+" ");
            if(!bookingEmployees[employeeCounter].getZoomFacility()){
                System.out.println(bookingEmployees[employeeCounter].getMeetingRoom().getUniqueId()+" "+bookingEmployees[employeeCounter].getMeetingRoom().getCapacity()+" "+bookingEmployees[employeeCounter].getMeetingRoom().getFloorNo());
            }
            else{
                System.out.println(bookingEmployees[employeeCounter].getZoomMeetingRoom().getUniqueId()+" "+bookingEmployees[employeeCounter].getZoomMeetingRoom().getCapacity()+" "+bookingEmployees[employeeCounter].getZoomMeetingRoom().getFloorNo()+" "+bookingEmployees[employeeCounter].getZoomMeetingRoom().getZoomDeviceId()+" "+bookingEmployees[employeeCounter].getZoomMeetingRoom().getZoomAccountId());
            }
        }
        System.out.println("Provide date");
        int year=sc.nextInt();
        int month=sc.nextInt();
        int dayOfMonth=sc.nextInt();
        LocalDate gettingDate=LocalDate.of(year,month,dayOfMonth);

        for(int employeeCounter=0;employeeCounter<4;employeeCounter++){
            if((gettingDate.compareTo(bookingEmployees[employeeCounter].getMeetingDate()))==0){
                System.out.print(bookingEmployees[employeeCounter].getEmployeeId()+" "+bookingEmployees[employeeCounter].getMeetingDate()+" "+bookingEmployees[employeeCounter].getMeetingTime()+" "+bookingEmployees[employeeCounter].getMeetingDuration()+" ");
                if(!bookingEmployees[employeeCounter].getZoomFacility()){
                    System.out.println(bookingEmployees[employeeCounter].getMeetingRoom().getUniqueId()+" "+bookingEmployees[employeeCounter].getMeetingRoom().getCapacity()+" "+bookingEmployees[employeeCounter].getMeetingRoom().getFloorNo());
                }
                else{
                    System.out.println(bookingEmployees[employeeCounter].getZoomMeetingRoom().getUniqueId()+" "+bookingEmployees[employeeCounter].getZoomMeetingRoom().getCapacity()+" "+bookingEmployees[employeeCounter].getZoomMeetingRoom().getFloorNo()+" "+bookingEmployees[employeeCounter].getZoomMeetingRoom().getZoomDeviceId()+" "+bookingEmployees[employeeCounter].getZoomMeetingRoom().getZoomAccountId());
                }
            }
        }
    }
}
