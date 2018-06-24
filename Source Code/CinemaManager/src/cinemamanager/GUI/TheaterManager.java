/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.GUI;

import cinemamanager.BUS.LocationBUS;
import cinemamanager.BUS.TheaterBUS;
import cinemamanager.DTO.Location;
import cinemamanager.DTO.Theater;
import cinemamanager.Ultils.Common;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Totoro
 */
public class TheaterManager extends javax.swing.JFrame {

    /**
     * Creates new form TheaterManager
     */
    public TheaterManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plTitle = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        tabPhong = new javax.swing.JTabbedPane();
        plTaoPhong = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtMaRap = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        sfdfd = new javax.swing.JScrollPane();
        txtDiaChiRap = new javax.swing.JTextArea();
        btnTaoRap = new javax.swing.JButton();
        txtTrangThaiRap = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        cbbKhuVuc = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtTenRap = new javax.swing.JTextField();
        tabXoaPhong = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cbbKhuVuc1 = new javax.swing.JComboBox<>();
        txtTenRap1 = new javax.swing.JTextField();
        txtMaRap1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        sfdfdfdf = new javax.swing.JScrollPane();
        txtDiaChiRap1 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        cbbTrangThaiRap1 = new javax.swing.JComboBox<>();
        btnXoaRap = new javax.swing.JButton();
        tabCapNhat = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        cbbKhuVuc2 = new javax.swing.JComboBox<>();
        txtTenRap2 = new javax.swing.JTextField();
        txtMaRap2 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        fdffsdsd = new javax.swing.JScrollPane();
        txtDiaChiRap2 = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        cbbTrangThaiRap2 = new javax.swing.JComboBox<>();
        btnSuaThongTinRap = new javax.swing.JButton();
        scrollbarMovie = new javax.swing.JScrollPane();
        tableTheater = new javax.swing.JTable();
        btnBackCinema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        plTitle.setBackground(new java.awt.Color(255, 153, 153));

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("QUẢN LÝ RẠP");
        lbTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout plTitleLayout = new javax.swing.GroupLayout(plTitle);
        plTitle.setLayout(plTitleLayout);
        plTitleLayout.setHorizontalGroup(
            plTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        plTitleLayout.setVerticalGroup(
            plTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        tabPhong.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        plTaoPhong.setBackground(new java.awt.Color(255, 255, 255));
        plTaoPhong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Mã rạp:");
        plTaoPhong.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtMaRap.setEnabled(false);
        plTaoPhong.add(txtMaRap, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 190, -1));

        jLabel20.setText("Địa chỉ:");
        plTaoPhong.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, 20));

        txtDiaChiRap.setColumns(20);
        txtDiaChiRap.setRows(5);
        sfdfd.setViewportView(txtDiaChiRap);

        plTaoPhong.add(sfdfd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 240, -1));

        btnTaoRap.setText("Tạo mới");
        btnTaoRap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoRapActionPerformed(evt);
            }
        });
        plTaoPhong.add(btnTaoRap, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 150, 110));

        txtTrangThaiRap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngừng hoạt động", "Đang hoạt động" }));
        plTaoPhong.add(txtTrangThaiRap, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 240, -1));

        jLabel21.setText("Trạng thái:");
        plTaoPhong.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, 20));
        plTaoPhong.add(cbbKhuVuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 190, 20));

        jLabel22.setText("Khu vực:");
        plTaoPhong.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        jLabel23.setText("Tên rạp:");
        plTaoPhong.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));
        plTaoPhong.add(txtTenRap, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 190, -1));

        tabPhong.addTab("Tạo Rạp", plTaoPhong);

        tabXoaPhong.setBackground(new java.awt.Color(255, 255, 255));
        tabXoaPhong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setText("Mã rạp:");
        tabXoaPhong.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel25.setText("Tên rạp:");
        tabXoaPhong.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel26.setText("Khu vực:");
        tabXoaPhong.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        cbbKhuVuc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tabXoaPhong.add(cbbKhuVuc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 190, 20));
        tabXoaPhong.add(txtTenRap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 190, -1));

        txtMaRap1.setEnabled(false);
        tabXoaPhong.add(txtMaRap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 190, -1));

        jLabel27.setText("Địa chỉ:");
        tabXoaPhong.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 20));

        txtDiaChiRap1.setColumns(20);
        txtDiaChiRap1.setRows(5);
        sfdfdfdf.setViewportView(txtDiaChiRap1);

        tabXoaPhong.add(sfdfdfdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 240, 100));

        jLabel28.setText("Trạng thái:");
        tabXoaPhong.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, 20));

        cbbTrangThaiRap1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngừng hoạt động", "Đang hoạt động" }));
        tabXoaPhong.add(cbbTrangThaiRap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 240, -1));

        btnXoaRap.setText("Xóa bỏ");
        btnXoaRap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaRapActionPerformed(evt);
            }
        });
        tabXoaPhong.add(btnXoaRap, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 150, 110));

        tabPhong.addTab("Xóa Rạp", tabXoaPhong);

        tabCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        tabCapNhat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setText("Mã rạp:");
        tabCapNhat.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel30.setText("Tên rạp:");
        tabCapNhat.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel31.setText("Khu vực:");
        tabCapNhat.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 20));

        cbbKhuVuc2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tabCapNhat.add(cbbKhuVuc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 190, 20));
        tabCapNhat.add(txtTenRap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 190, -1));

        txtMaRap2.setEnabled(false);
        tabCapNhat.add(txtMaRap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 190, -1));

        jLabel32.setText("Địa chỉ:");
        tabCapNhat.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 20));

        txtDiaChiRap2.setColumns(20);
        txtDiaChiRap2.setRows(5);
        fdffsdsd.setViewportView(txtDiaChiRap2);

        tabCapNhat.add(fdffsdsd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 240, 100));

        jLabel33.setText("Trạng thái:");
        tabCapNhat.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, 20));

        cbbTrangThaiRap2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngừng hoạt động", "Đang hoạt động" }));
        tabCapNhat.add(cbbTrangThaiRap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 240, -1));

        btnSuaThongTinRap.setText("Chỉnh sửa");
        btnSuaThongTinRap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaThongTinRapActionPerformed(evt);
            }
        });
        tabCapNhat.add(btnSuaThongTinRap, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 150, 110));

        tabPhong.addTab("Sửa Thông Tin", tabCapNhat);

        scrollbarMovie.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableTheater.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableTheater.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableTheater.setAlignmentX(0.0F);
        tableTheater.setAlignmentY(0.0F);
        tableTheater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTheaterMouseClicked(evt);
            }
        });
        scrollbarMovie.setViewportView(tableTheater);

        btnBackCinema.setText("Go to Cinema Manager");
        btnBackCinema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackCinemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(scrollbarMovie, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
            .addComponent(tabPhong)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackCinema)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(plTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollbarMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnBackCinema, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableTheaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTheaterMouseClicked
        TheaterTableModel theaterTableModel = (TheaterTableModel) tableTheater.getModel();
        int selectRowIndex = tableTheater.getSelectedRow();

        txtMaRap1.setText(theaterTableModel.getValueAt(selectRowIndex, 0).toString());
        txtTenRap1.setText(theaterTableModel.getValueAt(selectRowIndex, 1).toString());
        int index = Integer.parseInt(theaterTableModel.getValueAt(selectRowIndex, 3).toString())-1;
        cbbKhuVuc1.setSelectedIndex(index);
        int i = Integer.parseInt(theaterTableModel.getValueAt(selectRowIndex, 4).toString());
        cbbTrangThaiRap1.setSelectedIndex(i);
        txtDiaChiRap1.setText(theaterTableModel.getValueAt(selectRowIndex, 2).toString());

        txtMaRap2.setText(theaterTableModel.getValueAt(selectRowIndex, 0).toString());
        txtTenRap2.setText(theaterTableModel.getValueAt(selectRowIndex, 1).toString());
        cbbKhuVuc2.setSelectedIndex(index);
        cbbTrangThaiRap2.setSelectedIndex(i);
        txtDiaChiRap2.setText(theaterTableModel.getValueAt(selectRowIndex, 2).toString());
    }//GEN-LAST:event_tableTheaterMouseClicked

    private void btnTaoRapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoRapActionPerformed
        int result = addTheater();
        if (result > 0) {
            try {
                Common.messageBox("Thông báo", "Thêm mới rạp thành công !");
                TheaterBUS theaterBUS = new TheaterBUS();
                theaters = theaterBUS.getTheaters();
                ShowTheaters(theaters);
            } catch (SQLException ex) {
                Logger.getLogger(TheaterManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Common.messageBox("Thông báo", "Thêm mới rạp thất bại !");
        }
    }//GEN-LAST:event_btnTaoRapActionPerformed

    private void btnXoaRapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaRapActionPerformed
        int theaterID = Integer.parseInt(txtMaRap1.getText());
        int result = 0;
        result = deleteTheater(theaterID);
        if (result > 0) {
            try {
                Common.messageBox("Thông báo", "Xóa bỏ rạp thành công !");
                TheaterBUS theaterBUS = new TheaterBUS();
                theaters = theaterBUS.getTheaters();
                ShowTheaters(theaters);
            } catch (SQLException ex) {
                Logger.getLogger(TheaterManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Common.messageBox("Thông báo", "Xóa bỏ rạp thất bại !");
        }

    }//GEN-LAST:event_btnXoaRapActionPerformed

    private void btnSuaThongTinRapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaThongTinRapActionPerformed
        int id = Integer.parseInt(txtMaRap2.getText());
        String name = txtTenRap2.getText();
        String address = txtDiaChiRap2.getText();
        int location = cbbKhuVuc2.getSelectedIndex();
        int status = cbbTrangThaiRap2.getSelectedIndex();
        Theater theater = new Theater(id, name, address, location, status);
        int result = updateTheater(theater);
        if (result > 0) {
            try {
                Common.messageBox("Thông báo", "Cập nhật rạp thành công !");
                TheaterBUS theaterBUS = new TheaterBUS();
                theaters = theaterBUS.getTheaters();
                ShowTheaters(theaters);
            } catch (SQLException ex) {
                Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Common.messageBox("Thông báo", "Cập nhật rạp thất bại !");

        }
    }//GEN-LAST:event_btnSuaThongTinRapActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            locations = LocationBUS.GetLocation();
            showLocaitonToCombobox(locations);
            
            TheaterBUS theaterBUS = new TheaterBUS();
            theaters = theaterBUS.getTheaters();
            ShowTheaters(theaters);
        } catch (SQLException ex) {
            Logger.getLogger(TheaterManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnBackCinemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackCinemaActionPerformed
        new CinemaMagager().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackCinemaActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TheaterManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheaterManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheaterManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheaterManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheaterManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackCinema;
    private javax.swing.JButton btnSuaThongTinRap;
    private javax.swing.JButton btnTaoRap;
    private javax.swing.JButton btnXoaRap;
    private javax.swing.JComboBox<String> cbbKhuVuc;
    private javax.swing.JComboBox<String> cbbKhuVuc1;
    private javax.swing.JComboBox<String> cbbKhuVuc2;
    private javax.swing.JComboBox<String> cbbTrangThaiRap1;
    private javax.swing.JComboBox<String> cbbTrangThaiRap2;
    private javax.swing.JScrollPane fdffsdsd;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel plTaoPhong;
    private javax.swing.JPanel plTitle;
    private javax.swing.JScrollPane scrollbarMovie;
    private javax.swing.JScrollPane sfdfd;
    private javax.swing.JScrollPane sfdfdfdf;
    private javax.swing.JPanel tabCapNhat;
    private javax.swing.JTabbedPane tabPhong;
    private javax.swing.JPanel tabXoaPhong;
    private javax.swing.JTable tableTheater;
    private javax.swing.JTextArea txtDiaChiRap;
    private javax.swing.JTextArea txtDiaChiRap1;
    private javax.swing.JTextArea txtDiaChiRap2;
    private javax.swing.JTextField txtMaRap;
    private javax.swing.JTextField txtMaRap1;
    private javax.swing.JTextField txtMaRap2;
    private javax.swing.JTextField txtTenRap;
    private javax.swing.JTextField txtTenRap1;
    private javax.swing.JTextField txtTenRap2;
    private javax.swing.JComboBox<String> txtTrangThaiRap;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Theater> theaters = null;
    private ArrayList<Location> locations = null;

    private Vector maKhuVuc = new Vector();
    private Vector tenKhuVuc = new Vector();

    public void showLocaitonToCombobox(ArrayList<Location> locations) {
        for (int i = 0; i < locations.size(); i++) {
            maKhuVuc.add(locations.get(i).getID());
            tenKhuVuc.add(locations.get(i).getNameLocation());
        }
        
        cbbKhuVuc.setModel(new DefaultComboBoxModel<>(tenKhuVuc));
        cbbKhuVuc1.setModel(new DefaultComboBoxModel<>(tenKhuVuc));
        cbbKhuVuc2.setModel(new DefaultComboBoxModel<>(tenKhuVuc));
    }

    private void ShowTheaters(ArrayList<Theater> theaters) throws SQLException {
        String[] headers = {"Mã rạp", "Tên rạp", "Địa chỉ", "Khu vực",
            "Trạng thái"};
        TheaterTableModel theaterTableModel = new TheaterTableModel(headers, theaters);
        tableTheater.setModel(theaterTableModel);
    }

    public int addTheater() {
        int result = 0;
        int id = 0;
        String name = txtTenRap.getText();
        String address = txtDiaChiRap.getText();
        int location = cbbKhuVuc.getSelectedIndex()+1;
        int status = txtTrangThaiRap.getSelectedIndex();
        Theater theater = new Theater(id, name, address, location, status);
        TheaterBUS theaterBUS = new TheaterBUS();
        result = theaterBUS.addTheater(theater);
        return result;
    }

    public int deleteTheater(int theaterID) {
        int result = 0;
        TheaterBUS theaterBUS = new TheaterBUS();
        result = theaterBUS.deleteTheater(theaterID);
        return result;
    }

    public int updateTheater(Theater theater) {
        int result = 0;
        TheaterBUS theaterBUS = new TheaterBUS();
        result = theaterBUS.updateTheater(theater);
        return result;
    }

}