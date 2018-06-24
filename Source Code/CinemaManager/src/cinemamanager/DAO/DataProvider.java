/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DAO;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FTEL
 */
public class DataProvider {
    Connection connection = null;
    Statement statement = null;
    ResultSet rs = null;
    
    public DataProvider(){
       try {
            File directory = new File("");
            connection =DriverManager.getConnection("jdbc:ucanaccess://"+ directory.getAbsolutePath() + "//Cinema.accdb");
            statement = connection.createStatement();
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
    }
    
    public ResultSet ExecuteQuery(String query){
        try {
            return statement.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int ExecuteUpdate(String query){
        try {
            return statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    public void ExecuteQueryTest(String query){
        try {
            ArrayList<String> column = new ArrayList<>();
            ResultSet rs = statement.executeQuery(query);
            for ( int i = 1 ; i <= rs.getMetaData().getColumnCount() ; i++)
            {
                System.out.print(rs.getMetaData().getColumnName(i) + getSpace(rs.getMetaData().getColumnName(i)));
                column.add(rs.getMetaData().getColumnName(i));
                if ( i == rs.getMetaData().getColumnCount())
                    System.out.print("\n");
            }
            
            while(rs.next()){
                for(int i = 0 ; i < column.size();i++){
                    System.out.print(rs.getString(column.get(i)) + getSpace(rs.getString(column.get(i))));
                }
                System.out.print("\n");
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(DataProvider.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getSpace(String a){
        int max = 20;
        int size = max - a.length();
        String rs = "";
        for(int i = 0 ; i < size ; i++){
            rs += " ";
        }
        return rs;
    }
}
