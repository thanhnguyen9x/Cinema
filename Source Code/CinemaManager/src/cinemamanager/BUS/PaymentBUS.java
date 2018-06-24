/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.BUS;

import cinemamanager.DAO.PaymentDAO;
import cinemamanager.DTO.Payment;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author FTEL
 */
public class PaymentBUS {
    
    public static ArrayList<String> addPayment(int ShowTimeID,String listChair){
        PaymentDAO dao = new PaymentDAO();
        return dao.addPayment(ShowTimeID,listChair);
    }
    
    public static ArrayList<Payment> getPayment(String theater) throws SQLException, ParseException{
        PaymentDAO dao = new PaymentDAO();
        return dao.getPayment(theater);
    }
    
    public static int cancelPayment(int ID, String Chair,int ShowTimeID){
        PaymentDAO dao = new PaymentDAO();
        return dao.cancelPayment(ID, Chair, ShowTimeID);
    }
    
}
