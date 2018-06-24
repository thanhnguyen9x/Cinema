/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.DAO;

import cinemamanager.DTO.Report;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.time.Year;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/**
 *
 * @author FTEL
 */
public class ReportDAO {
    
        
        public void reportMonth(String filename,String month) {
            try{
                Calendar c = Calendar.getInstance();


                String query = "Select format(DatePay,'short date') Date, Sum(Total) Total "
                    + " from [Payment] "
                    + " where Month(DatePay) = " + month
                    + " and Year(DatePay) = " + c.get(Calendar.YEAR)
                    + " GROUP BY format(DatePay,'short date')";


                ResultSet rs = new DataProvider().ExecuteQuery(query);
                ArrayList<Report> lstrs = new ArrayList<Report>();
                while(rs.next()){
                    String Date = rs.getString("Date");
                    String Total = String.valueOf(rs.getInt("Total"));
                    lstrs.add(new Report(Date, Total));
                }


                WritableWorkbook workbook;
                // create workbook
            
                workbook = Workbook.createWorkbook(new File(filename));
                // create sheet
                WritableSheet sheet1 = workbook.createSheet("Bao Cao", 0);
                // create Label and add to sheet
                sheet1.addCell(new Label(0, 0, "Báo cáo tháng"));
                // row begin write data
                for (int i = 0; i < lstrs.size(); i++) {
                    String obj = lstrs.get(i).getName();
                    if (obj instanceof String)
                        sheet1.addCell(new Label(i, 2, obj));
                }
                
                for (int i = 0; i < lstrs.size(); i++) {
                    String obj = lstrs.get(i).getValue();
                    if (obj instanceof String)
                        sheet1.addCell(new Label(i, 3, obj));
                }
                
                // write file
                workbook.write();
                // close
                workbook.close();
            }catch (IOException e) {
                System.out.println("Error create file\n" + e.toString());
            } catch (RowsExceededException e) {
                System.out.println("Error write file\n" + e.toString());
            } catch (WriteException e) {
                System.out.println("Error write file\n" + e.toString());
            } catch (Exception ex){
                System.out.println("Error \n" + ex.toString());
            }
            System.out.println("create and write success");
    }
    
        public void reportMovie(String filename){
            try{
                
                String query = "Select c.Name, sum(a.Total) Total "
                    + " from [Payment] a "
                    + " left join [ShowTime] b on a.ShowTimeID = b.ID "
                    + " left join [Movie] c on B.MovieID = c.ID "
                    + " GrouP by c.Name";
            
                ResultSet rs = new DataProvider().ExecuteQuery(query);
                ArrayList<Report> lstrs = new ArrayList<Report>();
                while(rs.next()){
                    String Date = rs.getString("Name");
                    String Total = String.valueOf(rs.getInt("Total"));
                    lstrs.add(new Report(Date, Total));
                }
                
                WritableWorkbook workbook;
                // create workbook
            
                workbook = Workbook.createWorkbook(new File(filename));
                // create sheet
                WritableSheet sheet1 = workbook.createSheet("Bao Cao", 0);
                // create Label and add to sheet
                sheet1.addCell(new Label(0, 0, "Báo cáo Phim"));
                // row begin write data
                for (int i = 0; i < lstrs.size(); i++) {
                    String obj = lstrs.get(i).getName();
                    if (obj instanceof String)
                        sheet1.addCell(new Label(i, 2, obj));
                }
                
                for (int i = 0; i < lstrs.size(); i++) {
                    String obj = lstrs.get(i).getValue();
                    if (obj instanceof String)
                        sheet1.addCell(new Label(i, 3, obj));
                }
                
                // write file
                workbook.write();
                // close
                workbook.close();
            }catch (IOException e) {
                System.out.println("Error create file\n" + e.toString());
            } catch (RowsExceededException e) {
                System.out.println("Error write file\n" + e.toString());
            } catch (WriteException e) {
                System.out.println("Error write file\n" + e.toString());
            } catch (Exception ex){
                System.out.println("Error \n" + ex.toString());
            }
            System.out.println("create and write success");
            
        }
    
}
