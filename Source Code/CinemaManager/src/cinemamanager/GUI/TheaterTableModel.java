/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.GUI;

import cinemamanager.DTO.Theater;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Totoro
 */
public class TheaterTableModel extends AbstractTableModel {
     private String[] headers = {};
    private ArrayList<Theater> theaters = new ArrayList();

    public TheaterTableModel(String[] headers, ArrayList<Theater> theaters) {
        this.headers = headers;
        this.theaters = theaters;
    }

    @Override
    public int getRowCount() {
        if (this.theaters != null) {
            return theaters.size();
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
        Theater theater = theaters.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return theater.getId();
            case 1:
                return theater.getName();
            case 2:
                return theater.getAddress();
            case 3:
                return theater.getLocation();
            case 4:
                return theater.getStatus();
            case 5:
                return false;
            default:
                return "";
        }
    }
}
