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
public class ShowTime {
    int ID;
    int MovieID;
    int RoomID;
    String StartTime;
    String ChairBook;

    public ShowTime() {
    }
    
    public ShowTime(int ID, int MovieID, int RoomID, String StartTime, String ChairBook) {
        this.ID = ID;
        this.MovieID = MovieID;
        this.RoomID = RoomID;
        this.StartTime = StartTime;
        this.ChairBook = ChairBook;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMovieID() {
        return MovieID;
    }

    public void setMovieID(int MovieID) {
        this.MovieID = MovieID;
    }

    public int getRoomID() {
        return RoomID;
    }

    public void setRoomID(int RoomID) {
        this.RoomID = RoomID;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getChairBook() {
        return ChairBook;
    }

    public void setChairBook(String ChairBook) {
        this.ChairBook = ChairBook;
    }
    
    
    
    
}
