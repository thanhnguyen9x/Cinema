/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DAO;

import cinemamanager.DTO.Location;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author FTEL
 */
public class LocationDAO {
    
    public ArrayList<Location> getLocation() throws SQLException {
        ArrayList<Location> listOfLocation = new ArrayList<>();

        String query = "SELECT * FROM Location";

        DataProvider dataProvider = new DataProvider();
        ResultSet rs = dataProvider.ExecuteQuery(query);
        while (rs.next()) {
            Location loca = new Location(rs.getInt("ID"), rs.getString("NameLocation"));
            listOfLocation.add(loca);
        }
        return listOfLocation;
    }
}
