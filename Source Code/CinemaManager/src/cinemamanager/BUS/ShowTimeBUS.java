/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.BUS;

import cinemamanager.DAO.ShowTimeDAO;
import cinemamanager.DTO.Chair;
import cinemamanager.DTO.ShowTime;
import cinemamanager.DTO.ShowTimeManagerTableModel;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author FTEL
 */
public class ShowTimeBUS {
    public static ArrayList getMoviesShowing() throws SQLException {
        ShowTimeDAO showtimeDAO = new ShowTimeDAO();
        return showtimeDAO.getMoviesShowing();
    }
    
    public static ArrayList getTheaterShowByShowTime(String Location,int MovieID) throws SQLException{
        ShowTimeDAO showtimeDAO = new ShowTimeDAO();
        return showtimeDAO.getTheaterShowByShowTime(Location, MovieID);
    }
    
    public static ArrayList getTimeShowingByTheater(String Theater,int MovieID) throws SQLException{
        ShowTimeDAO showtimeDAO = new ShowTimeDAO();
        return showtimeDAO.getTimeShowingByTheater(Theater, MovieID);
    }
    
    public static ShowTime getShowTimeByCondition(String timeSele,String Theater,int MovieID) throws SQLException{
        ShowTimeDAO showtimeDAO = new ShowTimeDAO();
        return showtimeDAO.getShowTimeByCondition(timeSele,Theater,MovieID);
    }
    
    public static ArrayList<Chair> getArrayChair(int RoomID)throws SQLException{
        ShowTimeDAO showtimeDAO = new ShowTimeDAO();
        return showtimeDAO.getArrayChair(RoomID);
    }
    
    public static ArrayList<String> getTheater(String Location) throws SQLException{
        ShowTimeDAO showtimeDAO = new ShowTimeDAO();
        return showtimeDAO.getTheater(Location); 
    }
    
    public static ArrayList<ShowTimeManagerTableModel> getShowTimeByTheater(String theater) throws SQLException{
        ShowTimeDAO showtimeDAO = new ShowTimeDAO();
        return showtimeDAO.getShowTimeByTheater(theater);
    }
    
    public static int deleteShowTime(int ID){
        ShowTimeDAO showTimeDAO = new ShowTimeDAO();
        return showTimeDAO.deleteShowTime(ID);
        
    }
    
    public static ArrayList<String> getRoomFromTheater(String Theater)throws SQLException{
        ShowTimeDAO showTimeDAO = new ShowTimeDAO();
        return showTimeDAO.getRoomFromTheater(Theater);
    }
    
    public static ArrayList<String> getMovieByStatus(int Status)throws SQLException{
        ShowTimeDAO showTimeDAO = new ShowTimeDAO();
        return showTimeDAO.getMovieByStatus(Status);
    }
    
    public static int addShowTime(String MovieName, String NameRoom,String StartTime,String Theater)throws SQLException{
        ShowTimeDAO showTimeDAO = new ShowTimeDAO();
        return showTimeDAO.addShowTime(MovieName, NameRoom, StartTime,Theater);
    }
    
    public static int updateShowTime(String MovieName, String NameRoom,String StartTime, String Theater,int ID)throws SQLException{
        ShowTimeDAO showTimeDAO = new ShowTimeDAO();
        return showTimeDAO.updateShowTime(MovieName, NameRoom, StartTime,Theater,ID);
    }
    
    
}
