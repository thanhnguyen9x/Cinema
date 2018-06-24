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
public class Chair {
    int ID;
    String NameChair;
    int RoomID;
    int TypeChair;
    int LocationX;
    int LocationY;
    int status;

    public Chair(int ID, String NameChair, int RoomID, int TypeChair, int LocationX, int LocationY,int status) {
        this.ID = ID;
        this.NameChair = NameChair;
        this.RoomID = RoomID;
        this.TypeChair = TypeChair;
        this.LocationX = LocationX;
        this.LocationY = LocationY;
        this.status = status;
    }
    
    public Chair(int ID, String NameChair, int RoomID, int TypeChair, int LocationX, int LocationY) {
        this.ID = ID;
        this.NameChair = NameChair;
        this.RoomID = RoomID;
        this.TypeChair = TypeChair;
        this.LocationX = LocationX;
        this.LocationY = LocationY;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameChair() {
        return NameChair;
    }

    public void setNameChair(String NameChair) {
        this.NameChair = NameChair;
    }

    public int getRoomID() {
        return RoomID;
    }

    public void setRoomID(int RoomID) {
        this.RoomID = RoomID;
    }

    public int getTypeChair() {
        return TypeChair;
    }

    public void setTypeChair(int TypeChair) {
        this.TypeChair = TypeChair;
    }

    public int getLocationX() {
        return LocationX;
    }

    public void setLocationX(int LocationX) {
        this.LocationX = LocationX;
    }

    public int getLocationY() {
        return LocationY;
    }

    public void setLocationY(int LocationY) {
        this.LocationY = LocationY;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    
}
