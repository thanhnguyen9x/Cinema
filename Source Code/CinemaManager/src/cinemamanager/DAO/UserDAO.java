/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DAO;

import cinemamanager.Ultils.Constants;
import com.sun.corba.se.impl.orbutil.closure.Constant;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author FTEL
 */
public class UserDAO {
    
    public ResultSet Signin(String UserName,String Pass){
       DataProvider conn = new DataProvider();
       ResultSet rs = conn.ExecuteQuery("Select * from [User] where Username = '" + UserName + "' and Password = '" + Pass +"'");
       return rs;
    }
    
    public ArrayList<String> getListUser(){
        ArrayList<String> lstrs = new ArrayList<>();
        try{
            DataProvider conn = new DataProvider();
            ResultSet rs = conn.ExecuteQuery("Select UserName from [User] where Status = 1");
             while (rs.next()) {
                 lstrs.add(rs.getString("UserName"));
             }
        }catch(Exception ex){
            
        }
        return lstrs;
    }
    
    public ArrayList<String> getListQuyen(){
        ArrayList<String> lstrs = new ArrayList<>();
        try{
            DataProvider conn = new DataProvider();
            ResultSet rs = conn.ExecuteQuery("Select UserTypeName from [UserType]");
             while (rs.next()) {
                 lstrs.add(rs.getString("UserTypeName"));
             }
        }catch(Exception ex){
            ex.getMessage();
        }
        return lstrs;
    }
    
    public String getQuyenByUser(String User){
        String quyen = "";
        try{
            DataProvider conn = new DataProvider();
            String query = "Select b.UserTypeName "
                    + " from User a "
                    + " left join UserType b on a.UserTypeID = b.ID "
                    + " where a.Username = '" + User + "'";
            ResultSet rs = conn.ExecuteQuery(query);
             while (rs.next()) {
                 quyen = rs.getString("UserTypeName");
             }
        }catch(Exception ex){
            ex.getMessage();
        }
        return quyen;
    }
    
    public String setQuyenUser(String User,String Quyen){
        try{
            int id = 0;
            DataProvider conn = new DataProvider();
            String getID = "Select b.ID "
                    + " from UserType b  "
                    + " where b.UserTypeName = '" + Quyen + "'";
            ResultSet rs = conn.ExecuteQuery(getID);
            while (rs.next()) {
                 id = rs.getInt("ID");
            }
            
            String update = "Update User Set UserTypeID = " + id + " where Username = '" + User +"'";
            int result = conn.ExecuteUpdate(update);
            
            if(result > 0)
                return "Thành công";
            else
                return "Thất bại";
            
        }catch(Exception ex){
            ex.getMessage();
            return "Thất bại";
        }
    }
    
}
