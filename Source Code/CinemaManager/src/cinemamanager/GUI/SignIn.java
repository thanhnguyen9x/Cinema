/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemamanager.GUI;

import cinemamanager.BUS.PaymentBUS;
import cinemamanager.BUS.ShowTimeBUS;
import cinemamanager.BUS.UserBUS;
import cinemamanager.DAO.DataProvider;
import cinemamanager.DTO.ShowTimeManagerTableModel;
import cinemamanager.Ultils.Constants;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Totoro
 */
public class SignIn extends javax.swing.JFrame {

    private int xx = 0;
    private int xy = 0;

    public SignIn() {
        initComponents();
        getRootPane().setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(207, 231, 231)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSignIn = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        chkSignUp = new javax.swing.JCheckBox();
        panel = new javax.swing.JPanel();
        btnSignIn = new javax.swing.JLabel();
        txtSignInUsername = new javax.swing.JTextField();
        txtSignInPassword = new javax.swing.JPasswordField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelSignIn.setBackground(new java.awt.Color(239, 249, 249));
        panelSignIn.setAlignmentX(0.0F);
        panelSignIn.setAlignmentY(0.0F);
        panelSignIn.setMaximumSize(new java.awt.Dimension(448, 386));
        panelSignIn.setMinimumSize(new java.awt.Dimension(448, 386));
        panelSignIn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelSignInMouseDragged(evt);
            }
        });
        panelSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSignInMousePressed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Forgot password?");

        chkSignUp.setBackground(new java.awt.Color(239, 249, 249));
        chkSignUp.setForeground(new java.awt.Color(102, 102, 102));
        chkSignUp.setSelected(true);
        chkSignUp.setText("Create a new account");
        chkSignUp.setBorder(null);

        panel.setBackground(new java.awt.Color(235, 235, 235));

        btnSignIn.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(102, 102, 102));
        btnSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSignIn.setText("Sign In");
        btnSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignInMouseClicked(evt);
            }
        });
        btnSignIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSignInKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );

        txtSignInUsername.setBackground(new java.awt.Color(239, 249, 249));
        txtSignInUsername.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtSignInUsername.setForeground(new java.awt.Color(102, 102, 102));
        txtSignInUsername.setText("Enter your username");
        txtSignInUsername.setBorder(null);
        txtSignInUsername.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtSignInUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSignInUsernameMouseClicked(evt);
            }
        });

        txtSignInPassword.setBackground(new java.awt.Color(239, 249, 249));
        txtSignInPassword.setForeground(new java.awt.Color(102, 102, 102));
        txtSignInPassword.setText("jPasswordField1");
        txtSignInPassword.setBorder(null);
        txtSignInPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSignInPasswordFocusGained(evt);
            }
        });
        txtSignInPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSignInPasswordKeyPressed(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator9.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator10.setForeground(new java.awt.Color(102, 102, 102));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("PASSWORD");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("USERNAME");

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Sign In");
        jLabel20.setToolTipText("");

        btnExit.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(153, 153, 153));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/exit.png"))); // NOI18N
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panelSignInLayout = new javax.swing.GroupLayout(panelSignIn);
        panelSignIn.setLayout(panelSignInLayout);
        panelSignInLayout.setHorizontalGroup(
            panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignInLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSignInPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSignInLayout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(chkSignUp)
                    .addGroup(panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel20)
                        .addComponent(txtSignInUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSignInLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSignInLayout.setVerticalGroup(
            panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSignInLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel20)
                .addGap(16, 16, 16)
                .addComponent(jLabel19)
                .addGap(11, 11, 11)
                .addComponent(txtSignInUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(txtSignInPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelSignInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSignInLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15)
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(chkSignUp)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignInMouseClicked
        String username = txtSignInUsername.getText();
        String password = txtSignInPassword.getText();
        signIn(username, password);
    }//GEN-LAST:event_btnSignInMouseClicked

    private void btnSignInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSignInKeyPressed
        
    }//GEN-LAST:event_btnSignInKeyPressed

    private void txtSignInUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSignInUsernameMouseClicked
        // TODO add your handling code here:
        txtSignInUsername.setText("");
    }//GEN-LAST:event_txtSignInUsernameMouseClicked

    private void txtSignInPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSignInPasswordFocusGained
        // TODO add your handling code here:
        txtSignInPassword.setText("");
    }//GEN-LAST:event_txtSignInPasswordFocusGained

    private void txtSignInPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSignInPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String username = txtSignInUsername.getText();
            String password = txtSignInPassword.getText();
            signIn(username, password);
        }
    }//GEN-LAST:event_txtSignInPasswordKeyPressed

    private void panelSignInMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSignInMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_panelSignInMouseDragged

    private void panelSignInMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSignInMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_panelSignInMousePressed

    private void btnExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnExitMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SignIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnExit;
    private javax.swing.JLabel btnSignIn;
    private javax.swing.JCheckBox chkSignUp;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelSignIn;
    private javax.swing.JPasswordField txtSignInPassword;
    private javax.swing.JTextField txtSignInUsername;
    // End of variables declaration//GEN-END:variables

    private void signIn(String username, String pass) {
        
          
        ResultSet rs = UserBUS.SignIn(username, pass);
        try{
           while(rs.next()){
               Constants.Username = rs.getString("Username");
               Constants.TypeUser = rs.getInt("UserTypeID");
           }
           
           if(!Constants.Username.equals("")){
               switch(Constants.TypeUser)
               {
                   case 1:
                       new MovieSelect().show();
                       this.dispose();
                       break;
                   case 2:
                       new CinemaMagager().show();
                       this.dispose();
                       break;
                   case 3:
                       new ShowTimeManager().show();
                       this.dispose();
                       break;
               }
               
           }else{
               JOptionPane.showMessageDialog(this,"Tài khoản hoặc mật khẩu không đúng.","Sai thông tin",JOptionPane.WARNING_MESSAGE);
           }
           
         }catch(HeadlessException | SQLException ex)
          {

          }
    }
}
