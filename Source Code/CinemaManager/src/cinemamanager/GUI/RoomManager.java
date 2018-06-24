/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.GUI;

import cinemamanager.BUS.MovieBUS;
import cinemamanager.BUS.RoomBUS;
import cinemamanager.DTO.Room;
import cinemamanager.DTO.Theater;
import cinemamanager.Ultils.Common;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Totoro
 */
public class RoomManager extends javax.swing.JFrame {

    public RoomManager() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plTitle = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        tabPhong = new javax.swing.JTabbedPane();
        plTaoPhong = new javax.swing.JPanel();
        txtMaPhong = new javax.swing.JTextField();
        txtTenPhong = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbTheater = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbTrangThaiPhong = new javax.swing.JComboBox<>();
        btnTaoMoi = new javax.swing.JButton();
        tabXoaPhong = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaPhong1 = new javax.swing.JTextField();
        txtTenPhong1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbbTrangThaiPhong1 = new javax.swing.JComboBox<>();
        cbbTheater1 = new javax.swing.JComboBox<>();
        btnXoaBo = new javax.swing.JButton();
        tabCapNhat = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMaPhong2 = new javax.swing.JTextField();
        txtTenPhong2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbbTrangThaiPhong2 = new javax.swing.JComboBox<>();
        cbbTheater2 = new javax.swing.JComboBox<>();
        btnCapNhat = new javax.swing.JButton();
        scrollbarMovie = new javax.swing.JScrollPane();
        tableRooms = new javax.swing.JTable();
        btnBackCinema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        plTitle.setBackground(new java.awt.Color(255, 153, 153));

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("QUẢN LÝ PHÒNG CHIẾU");
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

        txtMaPhong.setEnabled(false);
        plTaoPhong.add(txtMaPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 190, -1));
        plTaoPhong.add(txtTenPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 190, -1));

        jLabel1.setText("Mã phòng:");
        plTaoPhong.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setText("Tên phòng:");
        plTaoPhong.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        cbbTheater.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        plTaoPhong.add(cbbTheater, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 190, 20));

        jLabel3.setText("Rạp:");
        plTaoPhong.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, 20));

        jLabel4.setText("Trạng thái:");
        plTaoPhong.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, 20));

        cbbTrangThaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang hoạt động", "Ngừng hoạt động" }));
        plTaoPhong.add(cbbTrangThaiPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 190, -1));

        btnTaoMoi.setText("Tạo mới");
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });
        plTaoPhong.add(btnTaoMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 100, 70));

        tabPhong.addTab("Tạo phòng chiếu", plTaoPhong);

        tabXoaPhong.setBackground(new java.awt.Color(255, 255, 255));
        tabXoaPhong.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Tên phòng:");
        tabXoaPhong.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel6.setText("Mã phòng:");
        tabXoaPhong.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtMaPhong1.setEnabled(false);
        tabXoaPhong.add(txtMaPhong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 190, -1));
        tabXoaPhong.add(txtTenPhong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 190, -1));

        jLabel7.setText("Trạng thái:");
        tabXoaPhong.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, 20));

        jLabel8.setText("Rạp:");
        tabXoaPhong.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, 20));

        cbbTrangThaiPhong1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang hoạt động", "Ngừng hoạt động" }));
        tabXoaPhong.add(cbbTrangThaiPhong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 190, -1));

        cbbTheater1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tabXoaPhong.add(cbbTheater1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 190, 20));

        btnXoaBo.setText("Xóa bỏ");
        btnXoaBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaBoActionPerformed(evt);
            }
        });
        tabXoaPhong.add(btnXoaBo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 100, 70));

        tabPhong.addTab("Xóa phòng chiếu", tabXoaPhong);

        tabCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        tabCapNhat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Tên phòng:");
        tabCapNhat.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel10.setText("Mã phòng:");
        tabCapNhat.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtMaPhong2.setEnabled(false);
        tabCapNhat.add(txtMaPhong2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 190, -1));
        tabCapNhat.add(txtTenPhong2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 190, -1));

        jLabel11.setText("Trạng thái:");
        tabCapNhat.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, 20));

        jLabel12.setText("Rạp:");
        tabCapNhat.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, 20));

        cbbTrangThaiPhong2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang hoạt động", "Ngừng hoạt động" }));
        tabCapNhat.add(cbbTrangThaiPhong2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 190, -1));

        cbbTheater2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tabCapNhat.add(cbbTheater2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 190, 20));

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        tabCapNhat.add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 100, 70));

        tabPhong.addTab("Sửa thông tin", tabCapNhat);

        scrollbarMovie.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableRooms.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableRooms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableRooms.setAlignmentX(0.0F);
        tableRooms.setAlignmentY(0.0F);
        tableRooms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRoomsMouseClicked(evt);
            }
        });
        scrollbarMovie.setViewportView(tableRooms);

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
            .addComponent(tabPhong, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
            .addComponent(scrollbarMovie)
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
                .addComponent(tabPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollbarMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBackCinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        scrollbarMovie.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        scrollbarMovie.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));
        try {
            // TODO add your handling code here:
            RoomBUS roomBUS = new RoomBUS();

            theaters = roomBUS.getTheaters();
            showTheatersToCombobox(theaters);

            rooms = roomBUS.getRooms(Integer.parseInt(maRap.get(cbbTheater.getSelectedIndex()).toString()));
            ShowRooms(rooms);

        } catch (SQLException ex) {
            Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void tableRoomsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRoomsMouseClicked
        RoomTableModel roomModel = (RoomTableModel) tableRooms.getModel();
        int selectRowIndex = tableRooms.getSelectedRow();

        txtMaPhong1.setText(roomModel.getValueAt(selectRowIndex, 0).toString());
        txtTenPhong1.setText(roomModel.getValueAt(selectRowIndex, 1).toString());
        cbbTrangThaiPhong1.setSelectedIndex(Integer.parseInt(roomModel.getValueAt(selectRowIndex, 3).toString()));
        //cbbTheater1.setText(roomModel.getValueAt(selectRowIndex, 4).toString());

        txtMaPhong2.setText(roomModel.getValueAt(selectRowIndex, 0).toString());
        txtTenPhong2.setText(roomModel.getValueAt(selectRowIndex, 1).toString());
        cbbTrangThaiPhong2.setSelectedIndex(Integer.parseInt(roomModel.getValueAt(selectRowIndex, 3).toString()));
        //cbbTheater2.setText(roomModel.getValueAt(selectRowIndex, 4).toString());

    }//GEN-LAST:event_tableRoomsMouseClicked

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        // TODO add your handling code here:
        int result = addRoom();
        if (result > 0) {
            try {
                Common.messageBox("Thông báo", "Thêm phòng thành công !");
                RoomBUS roomBUS = new RoomBUS();
                rooms = roomBUS.getRooms(Integer.parseInt(maRap.get(cbbTheater.getSelectedIndex()).toString()));
                ShowRooms(rooms);
            } catch (SQLException ex) {
                Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Common.messageBox("Thông báo", "Thêm phòng thất bại !");
        }
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void btnXoaBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaBoActionPerformed
        // TODO add your handling code here:
        int result = deleteRoom();
        if (result > 0) {
            try {
                Common.messageBox("Thông báo", "Xóa phòng thành công !");
                RoomBUS roomBUS = new RoomBUS();
                rooms = roomBUS.getRooms(Integer.parseInt(maRap.get(cbbTheater1.getSelectedIndex()).toString()));
                ShowRooms(rooms);
            } catch (SQLException ex) {
                Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Common.messageBox("Thông báo", "Xóa phòng thất bại !");

        }
    }//GEN-LAST:event_btnXoaBoActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        int result = updateRoom();
        if (result > 0) {
            try {
                Common.messageBox("Thông báo", "Cập nhật phòng thành công !");
                RoomBUS roomBUS = new RoomBUS();
                rooms = roomBUS.getRooms(Integer.parseInt(maRap.get(cbbTheater2.getSelectedIndex()).toString()));
                ShowRooms(rooms);
            } catch (SQLException ex) {
                Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Common.messageBox("Thông báo", "Cập nhật phòng thất bại !");

        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackCinema;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnXoaBo;
    private javax.swing.JComboBox<String> cbbTheater;
    private javax.swing.JComboBox<String> cbbTheater1;
    private javax.swing.JComboBox<String> cbbTheater2;
    private javax.swing.JComboBox<String> cbbTrangThaiPhong;
    private javax.swing.JComboBox<String> cbbTrangThaiPhong1;
    private javax.swing.JComboBox<String> cbbTrangThaiPhong2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel plTaoPhong;
    private javax.swing.JPanel plTitle;
    private javax.swing.JScrollPane scrollbarMovie;
    private javax.swing.JPanel tabCapNhat;
    private javax.swing.JTabbedPane tabPhong;
    private javax.swing.JPanel tabXoaPhong;
    private javax.swing.JTable tableRooms;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtMaPhong1;
    private javax.swing.JTextField txtMaPhong2;
    private javax.swing.JTextField txtTenPhong;
    private javax.swing.JTextField txtTenPhong1;
    private javax.swing.JTextField txtTenPhong2;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Room> rooms = null;
    private ArrayList<Theater> theaters = null;

    Vector maRap = new Vector();
    Vector tenRap = new Vector();

    private void ShowRooms(ArrayList<Room> rooms) throws SQLException {
        String[] headers = {"Mã phòng", "Tên phòng", "Rạp",
            "Trạng thái"};
        RoomTableModel roomTableModel = new RoomTableModel(headers, rooms);
        tableRooms.setModel(roomTableModel);
    }

    private void showTheatersToCombobox(ArrayList<Theater> theaters) {
        for (int i = 0; i < theaters.size(); i++) {
            maRap.add(theaters.get(i).getId());
            tenRap.add(theaters.get(i).getName());
        }
        cbbTheater.setModel(new DefaultComboBoxModel<>(tenRap));
        cbbTheater1.setModel(new DefaultComboBoxModel<>(tenRap));
        cbbTheater2.setModel(new DefaultComboBoxModel<>(tenRap));

        RoomBUS roomBUS = new RoomBUS();
        cbbTheater.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    rooms = roomBUS.getRooms(Integer.parseInt(maRap.get(cbbTheater.getSelectedIndex()).toString()));
                    ShowRooms(rooms);
                } catch (SQLException ex) {
                    Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        cbbTheater1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    rooms = roomBUS.getRooms(Integer.parseInt(maRap.get(cbbTheater1.getSelectedIndex()).toString()));
                    ShowRooms(rooms);
                } catch (SQLException ex) {
                    Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        cbbTheater2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    rooms = roomBUS.getRooms(Integer.parseInt(maRap.get(cbbTheater2.getSelectedIndex()).toString()));
                    ShowRooms(rooms);
                } catch (SQLException ex) {
                    Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public int addRoom() {
        int result = 0;
        int id = 0;
        String name = txtTenPhong.getText();
        int theaterID = Integer.parseInt(maRap.get(cbbTheater.getSelectedIndex()).toString());
        int status = 0;
        Room room = new Room(id, name, theaterID, status);
        RoomBUS roomBUS = new RoomBUS();
        result = roomBUS.addRoom(room);
        return result;
    }

    private int deleteRoom() {
        int result = 0;
        int roomID = Integer.parseInt(txtMaPhong1.getText().toString());
        RoomBUS roomBUS = new RoomBUS();
        result = roomBUS.deleteRoom(roomID);
        return result;
    }

    private int updateRoom() {
        int result = 0;
        int roomID = Integer.parseInt(txtMaPhong2.getText().toString());
        String roomName = txtTenPhong2.getText();
        int theaterID = Integer.parseInt(maRap.get(cbbTheater2.getSelectedIndex()).toString());
        int status = 0;

        Room room = new Room(roomID, roomName, theaterID, status);

        RoomBUS roomBUS = new RoomBUS();
        result = roomBUS.updateRoom(room);
        return result;
    }
}
