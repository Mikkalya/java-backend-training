package com.meet.model;

public class MeetingRoom {
    String uniqueId;
    int capacity;
    int floorNo;
    MeetingRoom(String uniqueId,int capacity,int floorNo){
        this.uniqueId=uniqueId;
        this.capacity=capacity;
        this.floorNo=floorNo;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFloorNo() {
        return floorNo;
    }
}