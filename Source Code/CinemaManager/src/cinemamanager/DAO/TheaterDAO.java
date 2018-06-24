/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DAO;

import cinemamanager.DTO.Theater;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Totoro
 */
public class TheaterDAO {

    public ArrayList<Theater> getTheaters() throws SQLException {
        ArrayList<Theater> theaters = new ArrayList<>();
        String query = "SELECT * FROM Theater";
        DataProvider dataProvider = new DataProvider();
        ResultSet rs = dataProvider.ExecuteQuery(query);
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String address = rs.getString(3);
            int location = rs.getInt(4);
            int status = rs.getInt(5);
            Theater theater = new Theater(id,name,address,location,status);
            theaters.add(theater);
        }
        return theaters;
    }

    public int addTheater(Theater theater) {
        int result = 0;
        String slqInsert = String.format("INSERT INTO Theater(Name,Address,Location,Status) VALUES('%s','%s',%s,%s)",
                theater.getName(), theater.getAddress(), theater.getLocation(),theater.getStatus());
        result = new DataProvider().ExecuteUpdate(slqInsert);
        return result;
    }

    public int deleteTheater(int theaterID) {
        int result = 0;
        String query = String.format("DELETE FROM Theater WHERE Theater.ID = %s",theaterID);
        result = new DataProvider().ExecuteUpdate(query);
        return result;
    }

    public int updateTheater(Theater theater) {
        int result = 0;
        String sqlUpdate = String.format("UPDATE Theater SET Name = '%s',"
                + "Address = '%s',Location = %s,Status = %s WHERE ID = %s",
                theater.getName(),
                theater.getAddress(),
                theater.getLocation(),
                theater.getStatus(),
                theater.getId());
        result = new DataProvider().ExecuteUpdate(sqlUpdate);
        return result;
    }
    
}
