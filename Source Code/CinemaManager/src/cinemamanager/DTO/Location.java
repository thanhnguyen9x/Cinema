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
public class Location {
    int ID;
    String NameLocation;

    public Location(int ID, String NameLocation) {
        this.ID = ID;
        this.NameLocation = NameLocation;
    }

    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNameLocation() {
        return NameLocation;
    }

    public void setNameLocation(String NameLocation) {
        this.NameLocation = NameLocation;
    }
    
    
    
}
