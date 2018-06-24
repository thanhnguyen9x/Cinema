/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.GUI;

import cinemamanager.BUS.ShowTimeBUS;
import cinemamanager.DTO.Movie;
import cinemamanager.DTO.ShowTime;
import cinemamanager.DTO.ShowTimeManagerTableModel;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.github.lgooddatepicker.components.DateTimePicker;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JComboBox;
import cinemamanager.Ultils.Constants;
import java.text.ParseException;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FTEL
 */
public class AddShowTime extends javax.swing.JFrame {

    final String TAG_ADD = "ADD";
    final String TAG_UPDATE ="UPDATE";
    static String type = "";
    String theater;
    JTable tableMovies;
    String movieName = "";
    String roomName ="";
    int showTimeID = 0;
    /**
     * Creates new form AddShowTime
     */
    public AddShowTime(String theater,JTable tableMovies) {
        initComponents();
        this.theater = theater;
        this.tableMovies = tableMovies;
        getData();
        type = TAG_ADD;
    }
    
    public AddShowTime(String Theater,JTable tableMovies,String movieName,String roomName,int showTimeID){
        initComponents();
        this.theater = Theater;
        this.tableMovies = tableMovies;
        this.movieName = movieName;
        this.roomName = roomName;
        this.showTimeID = showTimeID;
        getData();
        type = TAG_UPDATE;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbMovieName = new javax.swing.JComboBox<>();
        cbbNameRoom = new javax.swing.JComboBox<>();
        dpStartTime = new com.github.lgooddatepicker.components.DateTimePicker();
        btnThem = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên phim:");

        jLabel3.setText("Tên phòng:");

        jLabel4.setText("Thời gian bắt đầu:");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbbMovieName, 0, 173, Short.MAX_VALUE)
                                .addComponent(cbbNameRoom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHuy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dpStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbMovieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbNameRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dpStartTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnHuy))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(type == TAG_ADD)
        {
            try {
                if(!dpStartTime.getDatePicker().getDateStringOrEmptyString().equals("") && !dpStartTime.timePicker.getTimeStringOrEmptyString().equals("")){
                    Date date = Constants.spdtPicker.parse(dpStartTime.getDatePicker().getDateStringOrEmptyString() + " " + dpStartTime.timePicker.getTimeStringOrEmptyString());
                    int id = ShowTimeBUS.addShowTime(cbbMovieName.getSelectedItem().toString(), cbbNameRoom.getSelectedItem().toString(), String.valueOf(date.getTime()),theater);
                    if(id > 0 )
                    {
                        ArrayList<ShowTimeManagerTableModel> listShowTime = new ArrayList<>();
                        listShowTime = ShowTimeBUS.getShowTimeByTheater(theater);
                        DefaultTableModel modelMovies = (DefaultTableModel) tableMovies.getModel();
                        modelMovies.setRowCount(0);
                        for (int i = 0 ;i < listShowTime.size();i++) {
                            Object[] row = new Object[5];
                            row[0] = listShowTime.get(i).getShowTimeID();
                            row[1] = listShowTime.get(i).getMovieName();
                            row[2] = listShowTime.get(i).getRoomName();
                            row[3] = listShowTime.get(i).getStartTime();
                            row[4] = listShowTime.get(i).getEndTime();
                            modelMovies.addRow(row);
                        }
                        JOptionPane.showMessageDialog(null, "Thêm suất chiếu thành công.");  
                    }else{
                        JOptionPane.showMessageDialog(null, "Thêm suất chiếu không thành công."); 
                    }

                    this.dispose();
                }


            } catch (Exception ex) {
                Logger.getLogger(AddShowTime.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Throwable ex) {
                Logger.getLogger(AddShowTime.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (type == TAG_UPDATE) {
            try {
                if(!dpStartTime.getDatePicker().getDateStringOrEmptyString().equals("") && !dpStartTime.timePicker.getTimeStringOrEmptyString().equals("")){
                    Date date = Constants.spdtPicker.parse(dpStartTime.getDatePicker().getDateStringOrEmptyString() + " " + dpStartTime.timePicker.getTimeStringOrEmptyString());
                    int id = ShowTimeBUS.updateShowTime(cbbMovieName.getSelectedItem().toString(), cbbNameRoom.getSelectedItem().toString(), String.valueOf(date.getTime()),theater,showTimeID);
                    if(id > 0 )
                    {
                        ArrayList<ShowTimeManagerTableModel> listShowTime = new ArrayList<>();
                        listShowTime = ShowTimeBUS.getShowTimeByTheater(theater);
                        DefaultTableModel modelMovies = (DefaultTableModel) tableMovies.getModel();
                        modelMovies.setRowCount(0);
                        for (int i = 0 ;i < listShowTime.size();i++) {
                            Object[] row = new Object[5];
                            row[0] = listShowTime.get(i).getShowTimeID();
                            row[1] = listShowTime.get(i).getMovieName();
                            row[2] = listShowTime.get(i).getRoomName();
                            row[3] = listShowTime.get(i).getStartTime();
                            row[4] = listShowTime.get(i).getEndTime();
                            modelMovies.addRow(row);
                        }
                        JOptionPane.showMessageDialog(null, "Sửa suất chiếu thành công.");  
                    }else{
                        JOptionPane.showMessageDialog(null, "Sửa suất chiếu không thành công.");
                    }
                    this.dispose();
                }
            } catch (Exception ex) {
                Logger.getLogger(AddShowTime.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Throwable ex) {
                Logger.getLogger(AddShowTime.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     
     
     
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddShowTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddShowTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddShowTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddShowTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbbMovieName;
    private javax.swing.JComboBox<String> cbbNameRoom;
    private com.github.lgooddatepicker.components.DateTimePicker dpStartTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private void getData() {
        try{
            ArrayList<String> listMovie = ShowTimeBUS.getMovieByStatus(1);
            for(String i : listMovie)
                cbbMovieName.addItem(i);
            
            ArrayList<String> ArrayRoom = ShowTimeBUS.getRoomFromTheater(theater);
            for(String i : ArrayRoom)
                cbbNameRoom.addItem(i);
            
            if(!movieName.equals("") && !roomName.equals("")){
                cbbMovieName.setSelectedItem(movieName);
                cbbNameRoom.setSelectedItem(roomName);
                btnThem.setText("Cập nhật");
            }
            
            
            
        }catch(Exception ex)
        {
            
        }
    }
}
