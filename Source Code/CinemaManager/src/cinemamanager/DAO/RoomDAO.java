/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DAO;

import cinemamanager.DTO.Chair;
import cinemamanager.DTO.Room;
import cinemamanager.DTO.Theater;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Totoro
 */
public class RoomDAO {

    public ArrayList getRooms() throws SQLException {
        ArrayList rooms = new ArrayList<>();
        String query = "SELECT * FROM Room";
        //String query = "Select r.ID,r.NameRoom,r.TheaterID,r.Status, t.Name"
        //      + " From Room r inner join Theater t on r.TheaterID = t.TheaterID";
        DataProvider dataProvider = new DataProvider();
        ResultSet rs = dataProvider.ExecuteQuery(query);
        while (rs.next()) {
            int roomID = rs.getInt(1);
            String roomName = rs.getString(2);
            int theaterID = rs.getInt(4);
            int status = rs.getInt(4);
            Room room = new Room(roomID, roomName, theaterID, status);
            rooms.add(room);
        }
        return rooms;
    }

    public ArrayList getRooms(int idTheater) throws SQLException {
        ArrayList rooms = new ArrayList<>();
        String query = String.format("SELECT * FROM Room Where Room.TheaterID = %s", idTheater);

        DataProvider dataProvider = new DataProvider();
        ResultSet rs = dataProvider.ExecuteQuery(query);
        while (rs.next()) {
            int roomID = rs.getInt(1);
            String roomName = rs.getString(2);
            int theaterID = rs.getInt(3);
            int status = rs.getInt(4);
            Room room = new Room(roomID, roomName, theaterID, status);
            rooms.add(room);
        }
        return rooms;
    }

    public ArrayList getTheaters() throws SQLException {
        ArrayList theaters = new ArrayList();
        String query = "SELECT ID,Name FROM Theater";

        DataProvider dataProvider = new DataProvider();
        ResultSet rs = dataProvider.ExecuteQuery(query);
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            Theater theater = new Theater();
            theater.setId(id);
            theater.setName(name);
            theaters.add(theater);
        }
        return theaters;
    }

    public int addRoom(Room room) {
        int result = 0;
        String slqInsert = String.format("INSERT INTO Room(NameRoom,TheaterID,Status) VALUES('%s',%s,%s)",
                room.getRoomName(), room.getTheaterID(), room.getStatus());
        result = new DataProvider().ExecuteUpdate(slqInsert);
        return result;
    }

    public int deleteRoom(int roomID) {
        int result = 0;
        String sqlDelete = String.format("DELETE from Room WHERE Room.ID = %s", roomID);
        result = new DataProvider().ExecuteUpdate(sqlDelete);
        return result;
    }

    public int updateRoom(Room room) {
        int result = 0;
        String sqlUpdate = String.format("UPDATE Room SET NameRoom = '%s',"
                + "TheaterID = %s,Status = %s WHERE ID = %s",
                room.getRoomName(),
                room.getTheaterID(),
                room.getStatus(),
                room.getId());
        result = new DataProvider().ExecuteUpdate(sqlUpdate);
        return result;
    }

    public ArrayList getChais(int roomID) throws SQLException {
        ArrayList chairs = new ArrayList();
        String query = String.format("SELECT * FROM Chair WHERE RoomID = %s", roomID);

        DataProvider dataProvider = new DataProvider();
        ResultSet rs = dataProvider.ExecuteQuery(query);
        while (rs.next()) {
            int id = rs.getInt(1);
            String nameChair = rs.getString(2);
            int roomId = rs.getInt(3);
            int typeCharid = rs.getInt(4);
            int x = rs.getInt(5);
            int y = rs.getInt(6);
            int status = rs.getInt(7);

            Chair chair = new Chair(id, nameChair, roomId, typeCharid, x, y, status);
            chairs.add(chair);
        }
        return chairs;
    }

    public int deleteChair(String chairName, int roomID) {
        int result = 0;
        String sqlDelete = String.format("DELETE from Chair WHERE Chair.RoomID = %s and Chair.NameChair = '%s'", roomID, chairName);
        result = new DataProvider().ExecuteUpdate(sqlDelete);
        return result;
    }

    public int insertChair(Chair chair) {
        int result = 0;
        String slqInsert = String.format("INSERT INTO Chair(NameChair,RoomID,TypeChairID,X,Y,Status)"
                + " VALUES('%s','%s',%s,%s,%s,%s)",
                chair.getNameChair(), chair.getRoomID(), chair.getTypeChair(),
                chair.getLocationX(), chair.getLocationY(), chair.getStatus());
        result = new DataProvider().ExecuteUpdate(slqInsert);
        return result;
    }
}
