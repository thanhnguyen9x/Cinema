/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DTO;

/**
 *
 * @author FTEL
 */
public class ShowTimeManagerTableModel {
    
    int showTimeID;
    String MovieName;
    String RoomName;
    String StartTime;
    String EndTime;

    public ShowTimeManagerTableModel(int showTimeID, String MovieName, String RoomName, String StartTime, String EndTime) {
        this.showTimeID = showTimeID;
        this.MovieName = MovieName;
        this.RoomName = RoomName;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
    }
    
    

    public int getShowTimeID() {
        return showTimeID;
    }

    public void setShowTimeID(int showTimeID) {
        this.showTimeID = showTimeID;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String MovieName) {
        this.MovieName = MovieName;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String RoomName) {
        this.RoomName = RoomName;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }
    
    
}
