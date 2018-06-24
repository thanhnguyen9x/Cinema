/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.BUS;

import cinemamanager.DAO.MovieDAO;
import cinemamanager.DTO.Movie;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Totoro
 */
public class MovieBUS {

    public ArrayList getMovies() throws SQLException {
        MovieDAO movieDAO = new MovieDAO();
        return movieDAO.getMovies();
    }

    public ArrayList getMovies(String value) throws SQLException {
        MovieDAO movieDAO = new MovieDAO();
        return movieDAO.getMovies(value);
    }

    public int addMovie(Movie movie) {
        MovieDAO movieDAO = new MovieDAO();
        return movieDAO.addMovie(movie);
    }

    public int deleteMovie(int id) {
        MovieDAO movieDAO = new MovieDAO();
        return movieDAO.deleteMovie(id);
    }

    public int updateMovie(Movie movie) {
        MovieDAO movieDAO = new MovieDAO();
        return movieDAO.updateMovie(movie);
    }

}
