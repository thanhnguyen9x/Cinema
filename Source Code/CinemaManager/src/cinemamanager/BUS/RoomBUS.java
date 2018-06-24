/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.BUS;

import cinemamanager.DAO.RoomDAO;
import cinemamanager.DTO.Chair;
import cinemamanager.DTO.Room;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Totoro
 */
public class RoomBUS {

    public ArrayList getRooms() throws SQLException {
        RoomDAO roomDAO = new RoomDAO();
        return roomDAO.getRooms();
    }

    public ArrayList getRooms(int idTheater) throws SQLException {
        RoomDAO roomDAO = new RoomDAO();
        return roomDAO.getRooms(idTheater);
    }

    public ArrayList getTheaters() throws SQLException {
        RoomDAO roomDAO = new RoomDAO();
        return roomDAO.getTheaters();
    }

    public int addRoom(Room room) {
        RoomDAO roomDAO = new RoomDAO();
        return roomDAO.addRoom(room);
    }

    public int deleteRoom(int roomID) {
        RoomDAO roomDAO = new RoomDAO();
        return roomDAO.deleteRoom(roomID);
    }

    public int updateRoom(Room room) {
        RoomDAO roomDAO = new RoomDAO();
        return roomDAO.updateRoom(room);
    }
    
    public ArrayList getChairs(int roomID) throws SQLException{
        RoomDAO roomDAO = new RoomDAO();
        return roomDAO.getChais(roomID);
    }

    public int deleteChair(String chairName, int roomID) {
        RoomDAO roomDAO = new RoomDAO();
        return roomDAO.deleteChair(chairName,roomID);
    }
    
    public int insertChair(Chair chair) {
        RoomDAO roomDAO = new RoomDAO();
        return roomDAO.insertChair(chair);
    }
}
