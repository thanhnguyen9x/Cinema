/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DTO;

/**
 *
 * @author Totoro
 */
public class Theater {
    private int id;
    private String name;
    private String address;
    private int location;
    private int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Theater(int id, String name, String address, int location, int status) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.location = location;
        this.status = status;
    }
    
    public Theater(){
        
    }
    
}
