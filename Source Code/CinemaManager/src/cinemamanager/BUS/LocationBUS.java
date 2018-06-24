/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.BUS;

import cinemamanager.DAO.LocationDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author FTEL
 */
public class LocationBUS {
    
    public static ArrayList GetLocation() throws SQLException{
        LocationDAO dao = new LocationDAO();
        return dao.getLocation();
    }
}
