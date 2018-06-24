/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DTO;

import java.util.Date;

/**
 *
 * @author FTEL
 */
public class User {

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the FullName
     */
    public String getFullName() {
        return FullName;
    }

    /**
     * @param FullName the FullName to set
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the BirthDay
     */
    public Date getBirthDay() {
        return BirthDay;
    }

    /**
     * @param BirthDay the BirthDay to set
     */
    public void setBirthDay(Date BirthDay) {
        this.BirthDay = BirthDay;
    }

    /**
     * @return the CreateDay
     */
    public Date getCreateDay() {
        return CreateDay;
    }

    /**
     * @param CreateDay the CreateDay to set
     */
    public void setCreateDay(Date CreateDay) {
        this.CreateDay = CreateDay;
    }

    /**
     * @return the Type
     */
    public int getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(int Type) {
        this.Type = Type;
    }

    /**
     * @return the Status
     */
    public int getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(int Status) {
        this.Status = Status;
    }
    private int ID;
    private String Email;
    private String FullName;
    private String Address;
    private Date BirthDay;
    private Date CreateDay;
    private int Type;
    private int Status;
}
