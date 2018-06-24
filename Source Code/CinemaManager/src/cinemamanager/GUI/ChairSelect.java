/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.GUI;

import cinemamanager.BUS.PaymentBUS;
import cinemamanager.BUS.ShowTimeBUS;
import cinemamanager.DTO.Chair;
import cinemamanager.DTO.ShowTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author FTEL
 */
public class ChairSelect extends javax.swing.JFrame{

    /**
     * Creates new form ChairSelect
     */
    String timeSele;
    String theater;
    int idMovie;
    String chairSeleted = "";
    ShowTime st;
   ChairSelect(String timeSele, String theater, int idMovieSelected) throws SQLException {
       this.timeSele = timeSele;
       this.theater = theater;
       this.idMovie = idMovieSelected;
       initComponents();
       getData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        btnDatVe = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDatVe.setText("Đặt vé");
        btnDatVe.setActionCommand("btnDatVe");
        btnDatVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatVeActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.setActionCommand("btnHuy");
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
                .addGap(320, 320, 320)
                .addComponent(btnDatVe, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(554, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatVe, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatVeActionPerformed
         ArrayList<String> result = PaymentBUS.addPayment(st.getID(), chairSeleted);
         String noti = "";
         for(String i :result){
             noti += i + "\n";
         }
         JOptionPane.showMessageDialog(this,noti,"Thông báo",JOptionPane.PLAIN_MESSAGE);
         new MovieSelect().show();
         this.dispose();
    }//GEN-LAST:event_btnDatVeActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        new MovieSelect().show();
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChairSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChairSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChairSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChairSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatVe;
    private javax.swing.JButton btnHuy;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    // End of variables declaration//GEN-END:variables

    private void getData() throws SQLException {
        st = ShowTimeBUS.getShowTimeByCondition(timeSele, theater, idMovie);
        
        ArrayList<Chair> array = ShowTimeBUS.getArrayChair(st.getRoomID());
        
        for (Chair i : array){
            JButton b1 = new JButton();
            
            
            b1.setSize(50,50);
            b1.setVisible(true);
            b1.setText(i.getNameChair());
            b1.setLocation(i.getLocationX(), i.getLocationY());
            if(st.getChairBook().contains(i.getNameChair() + ";")){
                b1.setEnabled(false);
            }
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        
                        if (b1.getIcon() == null){
                            BufferedImage icon = ImageIO.read(ClassLoader.getSystemResource( "Resource/icon Check.png" ));
                            b1.setIcon(new ImageIcon(icon));
                            chairSeleted = chairSeleted + b1.getText() + ";";
                        }else{
                            b1.setIcon(null);
                            chairSeleted = chairSeleted.replace(b1.getText() + ";", "");
                        }
                        
                    } catch (IOException ex) {
                        Logger.getLogger(ChairSelect.class.getName()).log(Level.SEVERE, null, ex);
                    } catch( Exception ex){
                        ex.getMessage();
                    }
                    
                    
                    
                }
            });
            
            this.add(b1);
        }
        
        
    }
}
