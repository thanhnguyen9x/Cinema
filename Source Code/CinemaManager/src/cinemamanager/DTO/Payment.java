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
public class Payment {
    int ID;
    String UserName;
    String Movie;
    String DatePay;
    String Total;
    String Amout;
    int PaidType;
    String Chair;
    int showtimeID;

    public Payment() {
    }

    public Payment(int ID, String UserName, String Movie, String DatePay, String Total, String Amout, int PaidType, String Chair, int showtimeID) {
        this.ID = ID;
        this.UserName = UserName;
        this.Movie = Movie;
        this.DatePay = DatePay;
        this.Total = Total;
        this.Amout = Amout;
        this.PaidType = PaidType;
        this.Chair = Chair;
        this.showtimeID = showtimeID;
    }

    public int getShowtimeID() {
        return showtimeID;
    }

    public void setShowtimeID(int showtimeID) {
        this.showtimeID = showtimeID;
    }

    

    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getMovie() {
        return Movie;
    }

    public void setShowTime(String ShowTime) {
        this.Movie = ShowTime;
    }

    public String getDatePay() {
        return DatePay;
    }

    public void setDatePay(String DatePay) {
        this.DatePay = DatePay;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getAmout() {
        return Amout;
    }

    public void setAmout(String Amout) {
        this.Amout = Amout;
    }

    public int getPaidType() {
        return PaidType;
    }

    public void setPaidType(int PaidType) {
        this.PaidType = PaidType;
    }

    public String getChair() {
        return Chair;
    }

    public void setChair(String Chair) {
        this.Chair = Chair;
    }
    
    
    
}
