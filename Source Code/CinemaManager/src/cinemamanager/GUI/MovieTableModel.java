/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.GUI;

import cinemamanager.DTO.Movie;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Totoro
 */
public class MovieTableModel extends AbstractTableModel {

    private String[] headers = {};
    private ArrayList<Movie> movies = new ArrayList();

    public MovieTableModel(String[] headers, ArrayList<Movie> movies) {
        this.headers = headers;
        this.movies = movies;
    }

    @Override
    public int getRowCount() {
        if (this.movies != null) {
            return movies.size();
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        if (this.headers != null) {
            return headers.length;
        }
        return 0;
    }

    @Override
    public String getColumnName(int column) {
        if (column < getColumnCount()) {
            return headers[column];
        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex > getRowCount() || columnIndex > getColumnCount()) {
            return "";
        }
        Movie movie = movies.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return movie.getID();
            case 1:
                return movie.getName();
            case 2:
                return movie.getStartDate();
            case 3:
                return movie.getDescription();
            case 4:
                return movie.getStyle();
            case 5:
                return movie.getTime();
            case 6:
                return movie.getLanguage();
            case 7:
                return movie.getRating();
            case 8:
                return movie.getPoster();
            case 9:
                return movie.getStatus();
            default:
                return "";
        }
    }

}
