/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.BUS;

import cinemamanager.DAO.TheaterDAO;
import cinemamanager.DTO.Theater;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Totoro
 */
public class TheaterBUS {

    public ArrayList<Theater> getTheaters() throws SQLException {
        TheaterDAO theaterDAO = new TheaterDAO();
        return theaterDAO.getTheaters();
    }

    public int addTheater(Theater theater) {
        TheaterDAO theaterDAO = new TheaterDAO();
        return theaterDAO.addTheater(theater);
    }

    public int deleteTheater(int theaterID) {
        TheaterDAO theaterDAO = new TheaterDAO();
        return theaterDAO.deleteTheater(theaterID);
    }

    public int updateTheater(Theater theater) {
        TheaterDAO theaterDAO = new TheaterDAO();
        return theaterDAO.updateTheater(theater);
    }

}
