/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.BUS;

import cinemamanager.DAO.UserDAO;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author FTEL
 */
public class UserBUS {
    public static ResultSet SignIn(String UserName, String Pass){
        UserDAO dao = new UserDAO();
        return dao.Signin(UserName, Pass);
    }
    
    public static ArrayList<String> getListUser(){
        UserDAO dao = new UserDAO();
        return dao.getListUser();
    }
    
    public static ArrayList<String> getListQuyen(){
        UserDAO dao = new UserDAO();
        return dao.getListQuyen();
    }
    
    public static String getQuyenByUser(String User){
        UserDAO dao = new UserDAO();
        return dao.getQuyenByUser(User);
    }
    
    public static String setQuyenUser(String User,String Quyen){
        UserDAO dao = new UserDAO();
        return dao.setQuyenUser(User, Quyen);
    }
    
}
