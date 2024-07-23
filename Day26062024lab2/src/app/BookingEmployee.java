package app;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class BookingEmployee {
    String employeeId;
    LocalDate meetingDate;
    LocalTime meetingTime;
    Duration meetingDuration;
    boolean zoomFacility;
    MeetingRoom meetingRoom;
    ZoomMeetingRoom zoomMeetingRoom;
    BookingEmployee(String employeeId,LocalDate meetingDate,LocalTime meetingTime,Duration meetingDuration,MeetingRoom meetingRoom){
        saveBookingDetails(employeeId, meetingDate, meetingTime, meetingDuration);
        this.meetingRoom=meetingRoom;
    }
    BookingEmployee(String employeeId,LocalDate meetingDate,LocalTime meetingTime,Duration meetingDuration,ZoomMeetingRoom zoomMeetingRoom){
        saveBookingDetails(employeeId, meetingDate, meetingTime, meetingDuration);
        this.zoomFacility=true;
        this.zoomMeetingRoom=zoomMeetingRoom;
    }

    private void saveBookingDetails(String employeeId, LocalDate meetingDate, LocalTime meetingTime, Duration meetingDuration) {
        this.employeeId= employeeId;
        this.meetingDate= meetingDate;
        this.meetingTime= meetingTime;
        this.meetingDuration= meetingDuration;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public LocalTime getMeetingTime() {
        return meetingTime;
    }

    public Duration getMeetingDuration() {
        return meetingDuration;
    }

    public boolean getZoomFacility(){
        return zoomFacility;
    }

    public MeetingRoom getMeetingRoom() {
        return meetingRoom;
    }

    public ZoomMeetingRoom getZoomMeetingRoom() {
        return zoomMeetingRoom;
    }
}
