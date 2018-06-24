/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DAO;

import cinemamanager.DTO.Chair;
import cinemamanager.DTO.Movie;
import cinemamanager.DTO.ShowTime;
import cinemamanager.DTO.ShowTimeManagerTableModel;
import cinemamanager.Ultils.Constants;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author FTEL
 */
public class ShowTimeDAO {
    
    public ArrayList<Movie> getMoviesShowing() throws SQLException {
        ArrayList<Movie> movies = new ArrayList<>();
        String query = "Select A.Name "
                + "from [Movie] as A LEFT JOIN [ShowTime] as B ON A.ID = B.MovieID "
                + "Where B.StartTime > " + System.currentTimeMillis()
                + " GROUP BY A.Name";
        ResultSet rs2 = new DataProvider().ExecuteQuery(query);
        
        ArrayList<String> array = new ArrayList<>();
        while (rs2.next())
        {
            array.add(rs2.getString("Name"));
        }
        
        String query2 = "Select * From Movie where Name in (";
        for(int i = 0 ; i < array.size() ; i++){
            query2 += "'" + array.get(i) + "',";
        }
        query2 = query2.substring(0, query2.length() -1);
        query2 += ")";
       ResultSet rs = new DataProvider().ExecuteQuery(query2);
        
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            Date startDate = rs.getDate(3);
            String description = rs.getString(4);
            String style = rs.getString(5);
            Integer time = rs.getInt(6);
            String language = rs.getString(7);
            String rating = rs.getString(8);
            String poster = rs.getString(9);
            Integer status = rs.getInt(10);
            Movie movie = new Movie(id, name, startDate,
                    description, style, time, language, rating, poster, status);
            movies.add(movie);
        }
        return movies;
    }

    public ArrayList<String> getTheaterShowByShowTime(String Location,int MovieID) throws SQLException{
        
        String query = "Select A.Name "
                + "from [Theater] as A LEFT JOIN [Room] as C ON A.ID = C.TheaterID "
                + "LEFT JOIN [ShowTime] as B ON C.ID = B.RoomID "
                + "LEFT JOIN [Location] as D ON D.ID = A.Location "
                + "Where B.StartTime > " + System.currentTimeMillis()
                + " AND B.MovieID = " + MovieID
                + " AND D.NameLocation = '" + Location + "'"
                + " GROUP BY A.Name";
        ResultSet rs2 = new DataProvider().ExecuteQuery(query);
        
        ArrayList<String> array = new ArrayList<>();
        while (rs2.next())
        {
            array.add(rs2.getString("Name"));
        }
        return array;
    }
    
    public ArrayList<String> getTimeShowingByTheater(String Theater,int MovieID) throws SQLException{
        ArrayList<Movie> movies = new ArrayList<>();
        String query = "Select B.StartTime "
                + "from [Theater] as A "
                + "LEFT JOIN [Room] as C ON A.ID = C.TheaterID "
                + "LEFT JOIN [ShowTime] as B ON C.ID = B.RoomID "
                + "Where B.StartTime > " + System.currentTimeMillis()
                + " AND B.MovieID = " + MovieID
                + " AND A.Name = '" + Theater + "'"
                + "ORDER BY B.StartTime";
        ResultSet rs2 = new DataProvider().ExecuteQuery(query);
        
        ArrayList<String> array = new ArrayList<>();
        while (rs2.next())
        {
            array.add(rs2.getString("StartTime"));
        }
        return array;
        
    }
    
    public ShowTime getShowTimeByCondition(String timeSele,String Theater,int MovieID) throws SQLException{
        
        String query = "Select B.ID, B.MovieID,B.RoomID,B.StartTime,B.ChairBook "
                + " From [Theater] as A "
                + " LEFT JOIN [Room] as C ON A.ID = C.TheaterID "
                + " LEFT JOIN [ShowTime] as B ON C.ID = B.RoomID "
                + " Where B.StartTime > " + System.currentTimeMillis()
                + " AND B.MovieID = " + MovieID
                + " AND A.Name = '" + Theater + "'"
                + " AND B.StartTime = " + timeSele;
        ResultSet rs2 = new DataProvider().ExecuteQuery(query);
        
        ShowTime showtime = new ShowTime();
        
        while (rs2.next())
        {
            showtime = new ShowTime(rs2.getInt("ID"), rs2.getInt("MovieID"), rs2.getInt("RoomID"), rs2.getString("StartTime"),(rs2.getString("ChairBook") == null ? "":rs2.getString("ChairBook")));
        }
        return showtime;
    }
    
    public ArrayList<Chair> getArrayChair(int RoomID)throws SQLException{
        
        ArrayList<Chair> movies = new ArrayList<>();
        String query = " Select * "
                + " FROM [Chair] as A "
                + " Where A.RoomID = " + RoomID;
               
        ResultSet rs2 = new DataProvider().ExecuteQuery(query);
        
        ArrayList<Chair> array = new ArrayList<>();
        while (rs2.next())
        {
            array.add(new Chair(rs2.getInt("ID"), rs2.getString("NameChair"), rs2.getInt("RoomID"), rs2.getInt("TypeChairID"), rs2.getInt("X"), rs2.getInt("Y")));
        }
        return array;
    }
    
    public ArrayList<String> getTheater(String Location) throws SQLException{
        String query = "Select A.Name "
                + "from [Theater] as A "
                + "LEFT JOIN [Location] as D ON D.ID = A.Location "
                + "Where D.NameLocation = '" + Location + "'";
        ResultSet rs2 = new DataProvider().ExecuteQuery(query);
        
        ArrayList<String> array = new ArrayList<>();
        while (rs2.next())
        {
            array.add(rs2.getString("Name"));
        }
        return array;
    }

    public ArrayList<ShowTimeManagerTableModel> getShowTimeByTheater(String theater)throws SQLException{
        
        ArrayList<ShowTimeManagerTableModel> array = new ArrayList<>();
        
        String query = "Select B.ID, D.Name MovieName, C.NameRoom, B.StartTime, D.Duration "
                + " From [Theater] as A "
                + " LEFT JOIN [Room] as C ON A.ID = C.TheaterID "
                + " LEFT JOIN [ShowTime] as B ON C.ID = B.RoomID "
                + " LEFT JOIN [Movie] as D on D.ID = B.MovieID "
                + " Where B.StartTime > " + System.currentTimeMillis()
                + " AND A.Name = '" + theater + "'"
                + " ORDER BY B.StartTime";
        
        
        ResultSet rs2 = new DataProvider().ExecuteQuery(query);
        
        while(rs2.next()){
            
            int id = rs2.getInt("ID");
            String MovieName =  rs2.getString("MovieName");
            String NameRoom =  rs2.getString("NameRoom");
            String StartTime = Constants.spdt.format(new Date(Long.parseLong(rs2.getString("StartTime"))));
            String Duration = String.valueOf(Long.parseLong(rs2.getString("StartTime")) + Long.parseLong(rs2.getString("Duration")) * 60000);
            ShowTimeManagerTableModel item = new ShowTimeManagerTableModel(id,MovieName,NameRoom,StartTime,Constants.spdt.format(new Date(Long.parseLong(Duration))));
            array.add(item);
        }
       
        return array;
    }
    
    public int deleteShowTime(int ID){
        String query = "DELETE FROM [ShowTime] where id = " + ID;
        return new DataProvider().ExecuteUpdate(query);
    }
    
    public ArrayList<String> getRoomFromTheater(String Theater)throws SQLException{
        String query = "Select D.NameRoom "
                + "from [Theater] as A "
                + "RIGHT JOIN [Room] as D ON D.TheaterID = A.ID "
                + "Where A.Name = '" + Theater + "'";
        ResultSet rs2 = new DataProvider().ExecuteQuery(query);
        
        ArrayList<String> array = new ArrayList<>();
        while (rs2.next())
        {
            array.add(rs2.getString("NameRoom"));
        }
        return array;
    }
    
    public ArrayList<String> getMovieByStatus(int Status)throws SQLException{
        String query = "Select A.Name "
                + "from [Movie] as A "
                + "Where A.Status = " + Status;
        ResultSet rs2 = new DataProvider().ExecuteQuery(query);
        
        ArrayList<String> array = new ArrayList<>();
        while (rs2.next())
        {
            array.add(rs2.getString("Name"));
        }
        return array;
    }
    
    public int addShowTime(String MovieName, String NameRoom,String StartTime, String Theater)throws SQLException{
        
        String query = "Select A.ID "
                + "from [Movie] as A "
                + "Where A.Name = '" + MovieName + "'";
        
        ResultSet rs = new DataProvider().ExecuteQuery(query);
        int idMovie = 0;
        while (rs.next())
        {
            idMovie = rs.getInt("ID");
        }
        
        String query2 = "Select A.ID From [Room] as A LEFT JOIN [Theater] as B on A.TheaterID = B.ID Where A.NameRoom = '"+ NameRoom +"' AND B.Name = '"+ Theater +"'";
        
        ResultSet rs2 = new DataProvider().ExecuteQuery(query2);
        int idRoom = 0;
        while (rs2.next())
        {
            idRoom = rs2.getInt("ID");
        }
        
        String checkTime = "Select * "
                + "From [ShowTime] as A "
                + "LEFT JOIN [Movie] as B on A.MovieID = B.ID "
                + "Where A.RoomID = " + idRoom + " "
                + "AND ((A.StartTime + B.Duration * 60000) > " + StartTime + " AND A.StartTime < " + StartTime + ")";
        
        ResultSet rs3 = new DataProvider().ExecuteQuery(checkTime);
        
        if(rs3.next())
            return 0;
        
        if(idMovie != 0 && idRoom !=0)
        {
            String slqInsert = String.format("INSERT INTO ShowTime(MovieID,RoomID,StartTime,ChairBook,Status) "
                + "VALUES(%s,%s,'%s','',1)",idMovie,idRoom,StartTime);
            
            return new DataProvider().ExecuteUpdate(slqInsert);
            
        }else
            return 0;
    }
    
    public int updateShowTime(String MovieName, String NameRoom,String StartTime, String Theater,int ID)throws SQLException{
        String query = "Select A.ID "
                + "from [Movie] as A "
                + "Where A.Name = '" + MovieName + "'";
        
        ResultSet rs = new DataProvider().ExecuteQuery(query);
        int idMovie = 0;
        while (rs.next())
        {
            idMovie = rs.getInt("ID");
        }
        
        String query2 = "Select A.ID From [Room] as A LEFT JOIN [Theater] as B on A.TheaterID = B.ID Where A.NameRoom = '"+ NameRoom +"' AND B.Name = '"+ Theater +"'";
        
        ResultSet rs2 = new DataProvider().ExecuteQuery(query2);
        int idRoom = 0;
        while (rs2.next())
        {
            idRoom = rs2.getInt("ID");
        }
        
        String checkTime = "Select * "
                + "From [ShowTime] as A "
                + "LEFT JOIN [Movie] as B on A.MovieID = B.ID "
                + "Where A.RoomID = " + idRoom + " "
                + "AND ((A.StartTime + B.Duration * 60000) > " + StartTime + " AND A.StartTime < " + StartTime + ")";
        
        ResultSet rs3 = new DataProvider().ExecuteQuery(checkTime);
        
        if(rs3.next())
            return 0;
        
        
        if(idMovie != 0 && idRoom !=0)
        {
            String slqInsert = String.format("UPDATE ShowTime SET "
                + "MovieID = %s,RoomID = %s,StartTime = '%s' WHERE ID = %s",idMovie,idRoom,StartTime,ID);
            
            return new DataProvider().ExecuteUpdate(slqInsert);
            
        }else
            return 0;
    }
    
}
