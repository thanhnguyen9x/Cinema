/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.GUI;

import cinemamanager.DTO.Movie;
import cinemamanager.DTO.Room;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Totoro
 */
public class RoomTableModel extends AbstractTableModel{

  private String[] headers = {};
    private ArrayList<Room> rooms = new ArrayList();

    public RoomTableModel(String[] headers, ArrayList<Room> rooms) {
        this.headers = headers;
        this.rooms = rooms;
    }

    @Override
    public int getRowCount() {
        if (this.rooms != null) {
            return rooms.size();
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
        Room room = rooms.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return room.getId();
            case 1:
                return room.getRoomName();
            case 2:
                return room.getTheaterID();
            case 3:
                return room.getStatus();
            case 4:
                return false;
            default:
                return "";
        }
    }
    
}
