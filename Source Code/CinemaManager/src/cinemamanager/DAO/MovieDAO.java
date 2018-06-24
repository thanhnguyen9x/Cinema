/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DAO;

import cinemamanager.DTO.Movie;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Totoro
 */
public class MovieDAO {

    public ArrayList<Movie> getMovies() throws SQLException {
        ArrayList listOfMovie = new ArrayList<>();

        String query = "SELECT * FROM Movie";

        DataProvider dataProvider = new DataProvider();
        ResultSet rs = dataProvider.ExecuteQuery(query);
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            Date startDate = rs.getDate(3);
            String description = rs.getString(4);
            String style = rs.getString(5);
            Integer duration = rs.getInt(6);
            String language = rs.getString(7);
            String rating = rs.getString(8);
            String poster = rs.getString(9);
            Integer status = rs.getInt(10);
            Movie movie = new Movie(id, name, startDate,
                    description, style, duration, language, rating, poster, status);
            listOfMovie.add(movie);
        }
        return listOfMovie;
    }

    public ArrayList<Movie> getMovies(String value) throws SQLException {
        ArrayList<Movie> movies = new ArrayList<>();
        String query = "select * from Movie where Name like" + "'%" + value + "%'";
        ResultSet rs = new DataProvider().ExecuteQuery(query);
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            Date startDate = rs.getDate(3);
            String description = rs.getString(4);
            String style = rs.getString(5);
            Integer duration = rs.getInt(6);
            String language = rs.getString(7);
            String rating = rs.getString(8);
            String poster = rs.getString(9);
            Integer status = rs.getInt(10);
            Movie movie = new Movie(id, name, startDate,
                    description, style, duration, language, rating, poster, status);
            movies.add(movie);
        }
        return movies;
    }

    public int addMovie(Movie movie) {
        int result = 0;
        String slqInsert = String.format("INSERT INTO Movie(Name,StartDate,Description,Style,Duration,"
                + "Language,Rating,Poster,Status) VALUES('%s','%s','%s','%s',%s,'%s','%s','%s',%s)",
                movie.getName(), java.sql.Date.valueOf("2016-05-31"), movie.getDescription(), "Tình cảm",
                movie.getTime(), movie.getLanguage(), movie.getRating(), movie.getPoster(), movie.getStatus());
        result = new DataProvider().ExecuteUpdate(slqInsert);
        return result;
    }

    public int deleteMovie(int id) {
        int result = 0;
        String sqlDelete = String.format("DELETE FROM Movie WHERE ID = %s", id);
        result = new DataProvider().ExecuteUpdate(sqlDelete);
        return result;
    }

    public int updateMovie(Movie movie) {
        int result = 0;
        String query = String.format("UPDATE Movie SET Name = '%s',"
                + "StartDate = '%s',Description = '%s',Style = '%s', Duration = %s,"
                + "Language = '%s',Rating = '%s',Poster = '%s',Status = %s WHERE ID = %s",
                movie.getName(), java.sql.Date.valueOf("2016-05-31"), movie.getDescription(), movie.getStyle(),
                movie.getTime(), movie.getLanguage(), movie.getRating(), movie.getPoster(), movie.getStatus(),
                movie.getID());
        result = new DataProvider().ExecuteUpdate(query);
        return result;
    }

}
