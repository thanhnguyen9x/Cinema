/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.GUI;

import cinemamanager.BUS.MovieBUS;
import cinemamanager.DTO.Movie;
import cinemamanager.Ultils.Common;
import cinemamanager.Ultils.Validation;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.apache.commons.lang.NumberUtils;

/**
 *
 * @author Totoro
 */
public class MovieManager extends javax.swing.JFrame {

    public MovieManager() {
        initComponents();
        hideControls();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPhim = new javax.swing.JTabbedPane();
        tabThemMoi = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtMaPhim = new javax.swing.JTextField();
        txtTenPhim = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNgayCongChieu = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGioiThieu = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        txtTheLoai = new javax.swing.JTextField();
        txtNgonNgu = new javax.swing.JTextField();
        lbNgayCongChieu = new javax.swing.JLabel();
        lbTenPhim = new javax.swing.JLabel();
        cbbTrangThai = new javax.swing.JComboBox<>();
        lbThoiLuong = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtApPhich = new javax.swing.JTextField();
        lbNgonNgu = new javax.swing.JLabel();
        lbApPhich = new javax.swing.JLabel();
        lbTheLoai = new javax.swing.JLabel();
        txtDoTuoi = new javax.swing.JTextField();
        lbDoTuoi = new javax.swing.JLabel();
        scrollbarMovie = new javax.swing.JScrollPane();
        tableMovies = new javax.swing.JTable();
        btnThemMoi = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoaBo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTraCuu = new javax.swing.JTextField();
        btnTraCuu = new javax.swing.JButton();
        btnBackCinema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabPhim.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        tabThemMoi.setBackground(new java.awt.Color(255, 255, 255));
        tabThemMoi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Mã phim:");
        tabThemMoi.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 14, -1, -1));

        txtMaPhim.setEnabled(false);
        tabThemMoi.add(txtMaPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 11, 190, -1));
        tabThemMoi.add(txtTenPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 190, -1));

        jLabel12.setText("Tên phim:");
        tabThemMoi.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 20));
        tabThemMoi.add(txtNgayCongChieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 190, -1));

        jLabel13.setText("Giới thiệu:");
        tabThemMoi.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, 20));

        txtGioiThieu.setColumns(20);
        txtGioiThieu.setRows(5);
        jScrollPane2.setViewportView(txtGioiThieu);

        tabThemMoi.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 10, 240, 120));

        jLabel14.setText("Ngày công chiếu:");
        tabThemMoi.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        jLabel15.setText("Thể loại:");
        tabThemMoi.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel16.setText("Thời lượng:");
        tabThemMoi.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel17.setText("Ngôn ngữ:");
        tabThemMoi.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel18.setText("Độ tuổi:");
        tabThemMoi.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, -1, 20));

        jLabel19.setText("Trạng thái:");
        tabThemMoi.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 60, 20));

        txtThoiLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThoiLuongActionPerformed(evt);
            }
        });
        tabThemMoi.add(txtThoiLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, -1));

        txtTheLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTheLoaiActionPerformed(evt);
            }
        });
        tabThemMoi.add(txtTheLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 210, -1));
        tabThemMoi.add(txtNgonNgu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 230, -1));

        lbNgayCongChieu.setForeground(new java.awt.Color(255, 51, 51));
        lbNgayCongChieu.setText("Vui lòng nhập ngày công chiếu !");
        tabThemMoi.add(lbNgayCongChieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        lbTenPhim.setForeground(new java.awt.Color(255, 51, 51));
        lbTenPhim.setText("Tên phim không được để trống !");
        tabThemMoi.add(lbTenPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        cbbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp chiếu", "Đang chiếu", "Ngưng chiếu" }));
        tabThemMoi.add(cbbTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 210, 20));

        lbThoiLuong.setForeground(new java.awt.Color(255, 51, 51));
        lbThoiLuong.setText("Vui lòng nhập thời lượng film !");
        tabThemMoi.add(lbThoiLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        jLabel33.setText("Áp phích:");
        tabThemMoi.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));
        tabThemMoi.add(txtApPhich, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 210, -1));

        lbNgonNgu.setForeground(new java.awt.Color(255, 51, 51));
        lbNgonNgu.setText("Vui lòng nhập ngôn ngữ !");
        tabThemMoi.add(lbNgonNgu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        lbApPhich.setForeground(new java.awt.Color(255, 51, 51));
        lbApPhich.setText("Vui lòng nhập link áp phích !");
        tabThemMoi.add(lbApPhich, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, -1, -1));

        lbTheLoai.setForeground(new java.awt.Color(255, 51, 51));
        lbTheLoai.setText("Vui lòng nhập thể loại !");
        tabThemMoi.add(lbTheLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, -1));

        txtDoTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoTuoiActionPerformed(evt);
            }
        });
        tabThemMoi.add(txtDoTuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 210, -1));

        lbDoTuoi.setForeground(new java.awt.Color(255, 51, 51));
        lbDoTuoi.setText("Vui lòng nhập độ tuổi !");
        tabThemMoi.add(lbDoTuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        tabPhim.addTab("Quản lý phim", tabThemMoi);

        scrollbarMovie.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tableMovies.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tableMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableMovies.setAlignmentX(0.0F);
        tableMovies.setAlignmentY(0.0F);
        tableMovies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMoviesMouseClicked(evt);
            }
        });
        scrollbarMovie.setViewportView(tableMovies);

        btnThemMoi.setBackground(new java.awt.Color(0, 102, 102));
        btnThemMoi.setText("Thêm mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        btnCapNhat.setBackground(new java.awt.Color(0, 102, 102));
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoaBo.setBackground(new java.awt.Color(0, 102, 102));
        btnXoaBo.setText("Xóa bỏ");
        btnXoaBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaBoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Phim");

        btnTraCuu.setBackground(new java.awt.Color(0, 102, 102));
        btnTraCuu.setText("Tra cứu");

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
            .addComponent(tabPhim)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollbarMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(btnThemMoi)
                        .addGap(3, 3, 3)
                        .addComponent(btnCapNhat)
                        .addGap(3, 3, 3)
                        .addComponent(btnXoaBo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBackCinema)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollbarMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoaBo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTraCuu, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnThemMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBackCinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        scrollbarMovie.getVerticalScrollBar().setPreferredSize(new Dimension(0, 0));
        scrollbarMovie.getHorizontalScrollBar().setPreferredSize(new Dimension(0, 0));
        try {
            // TODO add your handling code here:
            MovieBUS movieBUS = new MovieBUS();
            movies = movieBUS.getMovies();
            ShowMovies(movies);
        } catch (SQLException ex) {
            Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtTraCuu.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    MovieBUS movieBUS = new MovieBUS();
                    movies = movieBUS.getMovies(txtTraCuu.getText());
                    ShowMovies(movies);

                } catch (SQLException ex) {
                    Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                try {
                    MovieBUS movieBUS = new MovieBUS();
                    movies = movieBUS.getMovies(txtTraCuu.getText());
                    ShowMovies(movies);

                } catch (SQLException ex) {
                    Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                try {
                    MovieBUS movieBUS = new MovieBUS();
                    movies = movieBUS.getMovies(txtTraCuu.getText());
                    ShowMovies(movies);

                } catch (SQLException ex) {
                    Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }//GEN-LAST:event_formWindowOpened

    private void tableMoviesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMoviesMouseClicked
        MovieTableModel movieTableModel = (MovieTableModel) tableMovies.getModel();
        int selectRowIndex = tableMovies.getSelectedRow();

        txtMaPhim.setText(movieTableModel.getValueAt(selectRowIndex, 0).toString());
        txtTenPhim.setText(movieTableModel.getValueAt(selectRowIndex, 1).toString());
        txtNgayCongChieu.setText(movieTableModel.getValueAt(selectRowIndex, 2).toString());
        txtGioiThieu.setText(movieTableModel.getValueAt(selectRowIndex, 3).toString());
        //cbbTheLoai.setText(movieTableModel.getValueAt(selectRowIndex, 4).toString());
        txtThoiLuong.setText(movieTableModel.getValueAt(selectRowIndex, 5).toString());
        txtNgonNgu.setText(movieTableModel.getValueAt(selectRowIndex, 6).toString());

        txtTheLoai.setText(movieTableModel.getValueAt(selectRowIndex, 7).toString());
        //cbbTrangThai.setSelectedItem(movieTableModel.getValueAt(selectRowIndex, 9).toString());        
    }//GEN-LAST:event_tableMoviesMouseClicked

    private void txtTheLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTheLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTheLoaiActionPerformed

    private void txtThoiLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThoiLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThoiLuongActionPerformed

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        hideControls();
        boolean ck = checkValidation();
        if (ck == true) {
            int rs = addMovie();
            if (rs > 0) {
                Common.messageBox("Thông báo", "Thêm mới phim thành công !");
                try {
                    MovieBUS movieBUS = new MovieBUS();
                    movies = movieBUS.getMovies();
                    ShowMovies(movies);
                } catch (SQLException ex) {
                    Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                Common.messageBox("Thông báo", "Thêm mới phim thất bại !");
            }
        }

    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        String tenPhim = txtTenPhim.getText();
        //String ngayCongChieu = txtNgayCongChieu1.getText();
        String gioiThieu = txtGioiThieu.getText();
        String theLoai = txtTheLoai.getText();
        int thoiLuong = Integer.parseInt(txtThoiLuong.getText());
        String ngonNgu = txtNgonNgu.getText();
        String doTuoi = txtDoTuoi.getText();
        int trangThai = cbbTrangThai.getSelectedIndex();
        Movie movie = new Movie();
        movie.setName(tenPhim);
        //movie.setStartDate(ngayCongChieu);
        movie.setDescription(gioiThieu);
        movie.setStyle(theLoai);
        movie.setTime(thoiLuong);
        movie.setLanguage(ngonNgu);
        movie.setStatus(trangThai);
        movie.setRating(doTuoi);
        
        movie.setID(Integer.parseInt(txtMaPhim.getText()));
        int rs = updateMovie(movie);
        if (rs > 0) {
            try {
                Common.messageBox("Thông báo", "Cập nhật phim thành công !");
                MovieBUS movieBUS = new MovieBUS();
                movies = movieBUS.getMovies();
                ShowMovies(movies);
            } catch (SQLException ex) {
                Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Common.messageBox("Thông báo", "Cập nhật phim thất bại !");
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaBoActionPerformed
        int maPhim = Integer.parseInt(txtMaPhim.getText());
        int rs = deleteMovie(maPhim);
        if (rs > 0) {
            try {
                Common.messageBox("Thông báo", "Xóa phim thành công !");
                MovieBUS movieBUS = new MovieBUS();
                movies = movieBUS.getMovies();
                ShowMovies(movies);
            } catch (SQLException ex) {
                Logger.getLogger(MovieManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            Common.messageBox("Thông báo", "Xóa phim thất bại !");
        }
    }//GEN-LAST:event_btnXoaBoActionPerformed

    private void txtDoTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoTuoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoTuoiActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackCinema;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnTraCuu;
    private javax.swing.JButton btnXoaBo;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbApPhich;
    private javax.swing.JLabel lbDoTuoi;
    private javax.swing.JLabel lbNgayCongChieu;
    private javax.swing.JLabel lbNgonNgu;
    private javax.swing.JLabel lbTenPhim;
    private javax.swing.JLabel lbTheLoai;
    private javax.swing.JLabel lbThoiLuong;
    private javax.swing.JScrollPane scrollbarMovie;
    private javax.swing.JTabbedPane tabPhim;
    private javax.swing.JPanel tabThemMoi;
    private javax.swing.JTable tableMovies;
    private javax.swing.JTextField txtApPhich;
    private javax.swing.JTextField txtDoTuoi;
    private javax.swing.JTextArea txtGioiThieu;
    private javax.swing.JTextField txtMaPhim;
    private javax.swing.JTextField txtNgayCongChieu;
    private javax.swing.JTextField txtNgonNgu;
    private javax.swing.JTextField txtTenPhim;
    private javax.swing.JTextField txtTheLoai;
    private javax.swing.JTextField txtThoiLuong;
    private javax.swing.JTextField txtTraCuu;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Movie> movies = null;

    private void ShowMovies(ArrayList<Movie> movies) throws SQLException {
        String[] headers = {"Mã phim", "Tên phim", "Ngày công chiếu",
            "Giới thiệu", "Thể loại", "Thời lượng", "Ngôn ngữ", "Độ tuổi",
            "Áp phích", "Trạng thái"};
        MovieTableModel movieTableModel = new MovieTableModel(headers, movies);
        tableMovies.setModel(movieTableModel);
    }

    public int addMovie() {
        String tenPhim = txtTenPhim.getText();
        //String ngayCongChieu = txtNgayCongChieu1.getText();
        String gioiThieu = txtGioiThieu.getText();
        //String theLoai = cbbTheLoai1.getSelectedItem().toString();
        int thoiLuong = Integer.parseInt(txtThoiLuong.getText());
        String ngonNgu = txtNgonNgu.getText();
        //String apPhich;
        int trangThai = 0;
        Movie movie = new Movie();
        movie.setName(tenPhim);
        //movie.setStartDate(ngayCongChieu);
        movie.setDescription(gioiThieu);
        //movie.setStyle(theLoai);
        movie.setTime(thoiLuong);
        movie.setLanguage(ngonNgu);
        movie.setStatus(trangThai);

        MovieBUS movieBUS = new MovieBUS();
        int result = movieBUS.addMovie(movie);
        return result;
    }

    public int deleteMovie(int idMovie) {
        MovieBUS movieBUS = new MovieBUS();
        int result = movieBUS.deleteMovie(idMovie);
        return result;
    }

    public int updateMovie(Movie movie){      
        MovieBUS movieBUS = new MovieBUS();
        int result = movieBUS.updateMovie(movie);
        return result;
    }
    public void hideControls() {
        lbTenPhim.setVisible(false);
        lbThoiLuong.setVisible(false);
        lbTheLoai.setVisible(false);
        lbNgonNgu.setVisible(false);
        lbApPhich.setVisible(false);
        lbNgayCongChieu.setVisible(false);
        lbDoTuoi.setVisible(false);
    }

    public boolean checkNull(JTextField textField) {
        if (textField.getText().length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkNumber(JTextField textField) {
        return NumberUtils.isNumber(textField.getText());
    }

    private boolean checkValidation() {
        boolean is = true;
        if (checkNull(txtTenPhim)) {
            lbTenPhim.setVisible(true);
            is = false;
        }
        if (checkNull(txtNgayCongChieu)) {
            lbNgayCongChieu.setVisible(true);
            is = false;
        }
        if (checkNull(txtThoiLuong)) {
            lbThoiLuong.setVisible(true);
            is = false;
        } else {
            if (!checkNumber(txtThoiLuong)) {
                Common.messageBox("Cảnh báo", "Thời lượng phim phải là số!");
                is = false;
            }

        }

        if (checkNull(txtTheLoai)) {
            lbTheLoai.setVisible(true);
            is = false;
        }
        if (checkNull(txtDoTuoi)) {
            lbDoTuoi.setVisible(true);
            is = false;
        } else {
            if (!checkNumber(txtDoTuoi)) {
                Common.messageBox("Cảnh báo", "Độ tuổi phải là số !");
                is = false;
            }
        }
        if (checkNull(txtApPhich)) {
            lbApPhich.setVisible(true);
            is = false;
        }
        return is;
    }

}
