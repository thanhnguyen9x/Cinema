/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.GUI;

import cinemamanager.BUS.LocationBUS;
import cinemamanager.BUS.MovieBUS;
import cinemamanager.BUS.ReportBUS;
import cinemamanager.BUS.ShowTimeBUS;
import cinemamanager.DTO.Location;
import cinemamanager.DTO.Movie;
import cinemamanager.DTO.ShowTimeManagerTableModel;
import java.awt.FileDialog;
import java.awt.Frame;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FTEL
 */
public class ShowTimeManager extends javax.swing.JFrame {

    private static ArrayList<ShowTimeManagerTableModel> listShowTime = null;
    private int idMovieSelected = -1;
    private static String theater = "";
    public ShowTimeManager() {
        initComponents();
        getData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMovieName = new javax.swing.JTextField();
        txtNameRoom = new javax.swing.JTextField();
        txtTimeStart = new javax.swing.JTextField();
        txtTimeEnd = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnHuyVe = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnPhanQuyen = new javax.swing.JButton();
        scrollbarMovie = new javax.swing.JScrollPane();
        tableMovies = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 249, 249));

        jLabel1.setText("Tên phim:");

        jLabel3.setText("Tên phòng:");

        jLabel4.setText("Thời gian bắt đầu");

        jLabel6.setText("Thời gian kết thúc");

        txtMovieName.setEditable(false);

        txtNameRoom.setEditable(false);

        txtTimeStart.setEditable(false);

        txtTimeEnd.setEditable(false);

        btnThem.setBackground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm suất chiếu");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa suất chiếu");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa suất chiếu");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnHuyVe.setText("Hủy vé");
        btnHuyVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyVeActionPerformed(evt);
            }
        });

        btnReport.setText("Báo cáo");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnPhanQuyen.setText("Phân quyền");
        btnPhanQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhanQuyenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTimeStart, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(txtNameRoom))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(txtMovieName))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnReport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(btnPhanQuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHuyVe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(254, 254, 254))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMovieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNameRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTimeStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTimeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnHuyVe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReport)
                    .addComponent(btnPhanQuyen)))
        );

        scrollbarMovie.setBorder(null);

        tableMovies.setBackground(new java.awt.Color(239, 249, 249));
        tableMovies.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tableMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ShowTimeID", "Tên phim", "Tên phòng", "Thời gian bắt đầu", "Thời gian dự kiến kết thúc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollbarMovie.setViewportView(tableMovies);

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Danh sách phim đang chiếu");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollbarMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scrollbarMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if(idMovieSelected != -1){
            if(!(ShowTimeBUS.deleteShowTime(idMovieSelected) != 1)){
                getData();
            };
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        (new AddShowTime(theater, tableMovies,txtMovieName.getText(),txtNameRoom.getText(),idMovieSelected)).show();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        AddShowTime frmAdd = new AddShowTime(theater,tableMovies);
        frmAdd.show();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnHuyVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyVeActionPerformed
        new CancelPayment(theater).show();
    }//GEN-LAST:event_btnHuyVeActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        Object[] options = {"Báo cáo tháng","Báo cáo phim"};
        String report = (String)JOptionPane.showInputDialog(
                            null,
                            "Bạn chọn loại báo cáo nào",
                            "Chọn loại báo cáo mong muốn",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            null);
        
        switch(report){
            case "Báo cáo tháng":
                Object[] opMonth = {"1","2","3","4","5","6","7","8","9","10","11","12"};
                String month = (String)JOptionPane.showInputDialog(
                            null,
                            "Chọn tháng",
                            "Chọn tháng",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opMonth,
                            null);
                FileDialog dialog = new FileDialog((Frame)null, "Chọn nơi lưu");
                dialog.setMode(FileDialog.SAVE);
                dialog.setFile("BaoCao.xls");
                dialog.setVisible(true);
                String file = dialog.getDirectory() + dialog.getFile();
                if(!file.endsWith(".xls"))
                    file += ".xls";
                ReportBUS.reportMonth(file,month);
                
                break;
            case "Báo cáo phim":
                
                FileDialog dialog1 = new FileDialog((Frame)null, "Chọn nơi lưu");
                dialog1.setMode(FileDialog.SAVE);
                dialog1.setFile("BaoCao.xls");
                dialog1.setVisible(true);
                String file1 = dialog1.getDirectory() + dialog1.getFile();
                if(!file1.endsWith(".xls"))
                    file1 += ".xls";
                ReportBUS.reportMovie(file1);
                
                break;
        }
        
        
        
        
        
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnPhanQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhanQuyenActionPerformed
        new FrmPhanQuyen().show();
    }//GEN-LAST:event_btnPhanQuyenActionPerformed

    private void getData() {
        try {
            if(theater.equals("")){
                // <editor-fold defaultstate="collapsed" desc="Chọn khu vực">
                ArrayList<Location> array = new ArrayList<Location>();
                array = LocationBUS.GetLocation();
                ArrayList<String> lstArray = new ArrayList<>();
                for(Location item : array){
                    lstArray.add(item.getNameLocation());
                }
                Object[] options = lstArray.toArray();
                String location = (String)JOptionPane.showInputDialog(
                            null,
                            "Bạn đang ở khu vực nào",
                            "Xin cho mình biết khu vực của bạn",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            null);

                if(location.equals(""))
                    return;

                // </editor-fold>

                // <editor-fold defaultstate="collapsed" desc="Chọn Rạp">
            lstArray.clear();
            lstArray = ShowTimeBUS.getTheater(location);
            theater = "";
            if(lstArray.size() > 0)
            {
                options = lstArray.toArray();
                theater = (String)JOptionPane.showInputDialog(
                            null,
                            "Bạn đang ở rạp nào",
                            "Xin chọn rạp bạn quản lý",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            options,
                            null);
                if (theater.equals(""))
                    return;
            }else{ 
                JOptionPane.showMessageDialog(null, "Không có rạp");
                return;
            }
            
            if(theater.equals("")){
                return;
            }
            // </editor-fold>
            }
            
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
        } catch (SQLException ex) {
            Logger.getLogger(MovieSelect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex){
            ex.getMessage();
        }
        
        tableMovies.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
          int a = event.getFirstIndex();

                if(a >= 0 && a < tableMovies.getRowCount())
                {
                    txtMovieName.setText((String) tableMovies.getValueAt(tableMovies.getSelectedRow(), 1));
                    txtTimeEnd.setText((String) tableMovies.getValueAt(tableMovies.getSelectedRow(), 4));
                    txtNameRoom.setText((String) tableMovies.getValueAt(tableMovies.getSelectedRow(), 2));
                    txtTimeStart.setText((String) tableMovies.getValueAt(tableMovies.getSelectedRow(), 3));
                    idMovieSelected = Integer.parseInt(tableMovies.getValueAt(tableMovies.getSelectedRow(), 0).toString());
                    
                }
            
        }});
        
    }
    
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
            java.util.logging.Logger.getLogger(ShowTimeManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowTimeManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowTimeManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowTimeManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowTimeManager().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyVe;
    private javax.swing.JButton btnPhanQuyen;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollbarMovie;
    private javax.swing.JTable tableMovies;
    private javax.swing.JTextField txtMovieName;
    private javax.swing.JTextField txtNameRoom;
    private javax.swing.JTextField txtTimeEnd;
    private javax.swing.JTextField txtTimeStart;
    // End of variables declaration//GEN-END:variables
}
