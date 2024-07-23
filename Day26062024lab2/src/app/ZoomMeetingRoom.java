package app;

public class ZoomMeetingRoom extends MeetingRoom {
    String zoomDeviceId;
    String zoomAccountId;
    ZoomMeetingRoom(String uniqueId,int capacity,int floorNo,String zoomDeviceId,String zoomAccountId){
        super(uniqueId,capacity,floorNo);
        this.zoomDeviceId=zoomDeviceId;
        this.zoomAccountId=zoomAccountId;
    }

    public String getZoomDeviceId() {
        return zoomDeviceId;
    }

    public String getZoomAccountId() {
        return zoomAccountId;
    }
}
