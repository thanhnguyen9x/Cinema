/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DAO;

import cinemamanager.DTO.Payment;
import cinemamanager.Ultils.Constants;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author FTEL
 */
public class PaymentDAO {
    
    public ArrayList<String> addPayment(int ShowTimeID,String listChair) {
            
        ArrayList<String> lstResult = new ArrayList<>();
        
        String[] lstCh = listChair.split(";");

        for( int i = 0 ; i< lstCh.length;i++){
            Date d = new Date(System.currentTimeMillis());
            String slqInsert = String.format("INSERT INTO Payment(UserName,ShowTimeID,DatePay,Total,Amount,PayType,Chair,Status,Coupon)"
                 +"  VALUES('%s',%s,%s,%s,%s,%s,'%s',%s,%s)"
            ,Constants.Username,ShowTimeID,"#"+ Constants.spdtAccess.format(d) + "#",80000,80000,1,lstCh[i],1,0);
            int result = new DataProvider().ExecuteUpdate(slqInsert);
            if(result == 1){
                String sqlUpdate = String.format("UPDATE ShowTime SET ChairBook = ChairBook + '" + lstCh[i] +";' WHERE ID = " + ShowTimeID);
                result = new DataProvider().ExecuteUpdate(sqlUpdate);
                if (result == 1){
                    lstResult.add("Đặt ghế " + lstCh[i] + " thành công cập nhật ShowTime thành công");
                }else{
                    lstResult.add("Đặt ghế " + lstCh[i] + " thành công cập nhật ShowTime thất bại");
                }       
            }else{
                lstResult.add("Đặt ghế " + lstCh[i] + " thất bại");
            }
        }

        return lstResult;
    }
    
    public ArrayList<Payment> getPayment(String theater) throws SQLException, ParseException{
        ArrayList<Payment> lst = new ArrayList<>();
        String query = "Select A.ID,A.UserName, C.Name,A.DatePay,A.Total,A.Amount,A.PayType,A.Chair,A.ShowTimeID "
                + " FROM [Payment] as A "
                + " LEFT JOIN [ShowTime] as B ON A.ShowTimeID = B.ID "
                + " LEFT JOIN [Movie] as C ON B.MovieID = C.ID "
                + " LEFT JOIN [Room] as D ON D.ID = B.RoomID "
                + " LEFT JOIN [Theater] as E ON E.ID = D.TheaterID"
                + " Where B.StartTime > " + System.currentTimeMillis()
                + " AND E.Name = '"+ theater + "' "
                + " AND A.Status = 1";
        
        
       ResultSet rs = new DataProvider().ExecuteQuery(query);
        
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String movie = rs.getString(3);
            String date =  Constants.spdt.format(Constants.spdtAccess.parse(rs.getString(4)));
            int Total = rs.getInt(5);
            int Amout = rs.getInt(6);
            int PayType = rs.getInt(7);
            String Chair = rs.getString(8);
            int ShowTimeID = rs.getInt(9);
            Payment p = new Payment(id, name, movie, date, String.valueOf(Total), String.valueOf(Amout), PayType, Chair,ShowTimeID);
            lst.add(p);
        }
        return lst;
    }
    
    public int cancelPayment(int ID, String Chair,int ShowTimeID){
        try{
            String slqInsert = String.format("UPDATE Payment SET "
                    + "Status = 0 WHERE ID = %s",ID);
            int id = new DataProvider().ExecuteUpdate(slqInsert);

            if(id > 0){
                String showTime = "Select ChairBook from ShowTime where ID = " + ShowTimeID;
                ResultSet rs = new DataProvider().ExecuteQuery(showTime);
                String ch = "";
                while(rs.next()){
                    ch = rs.getString("ChairBook");
                }
                ch = ch.replace(Chair + ";", "");
                String update = "UPDATE ShowTime SET "+ "ChairBook = '" + ch + "' WHERE ID = " + ShowTimeID;

                int rs2 = new DataProvider().ExecuteUpdate(update);
                if(rs2 > 0){
                    return 1;
                }else
                    return 0;
            }else
                return 0;
        }catch(Exception ex)
        {
            return 0;
        }
    
    }
    
}
