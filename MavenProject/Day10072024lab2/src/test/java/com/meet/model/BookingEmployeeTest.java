package com.meet.model;

import org.junit.jupiter.api.BeforeAll;

import java.time.LocalDate;
import java.time.LocalTime;
import static java.time.Duration.*;

public class BookingEmployeeTest {
    static MeetingRoom meetingRoom;
    static ZoomMeetingRoom zoomMeetingRoom;
    static BookingEmployee bookingEmployee;
    @BeforeAll
    static void setUpBookingEmployee(){
        meetingRoom=new MeetingRoom("ASC1",65,8);
        zoomMeetingRoom=new ZoomMeetingRoom("ASC2",58,8,"D1","A1");
        bookingEmployee=new BookingEmployee("EMP1", LocalDate.of(2024,07,12), LocalTime.of(1,30),ofMinutes(45),meetingRoom);

    }

}
