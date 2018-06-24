/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.BUS;

import cinemamanager.DAO.ReportDAO;

/**
 *
 * @author FTEL
 */
public class ReportBUS {
    
    public static void reportMonth(String filename,String month ){
        ReportDAO dao = new ReportDAO();
        dao.reportMonth(filename,month);
    }
    
    public static void reportMovie(String filename){
        ReportDAO dao = new ReportDAO();
        dao.reportMovie(filename);
    }
    
}
