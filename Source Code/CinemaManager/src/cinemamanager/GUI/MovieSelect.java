package cinemamanager.GUI;

import cinemamanager.BUS.LocationBUS;
import cinemamanager.BUS.MovieBUS;
import cinemamanager.BUS.ShowTimeBUS;
import cinemamanager.DTO.Location;
import cinemamanager.DTO.Movie;
import com.sun.javafx.tk.Toolkit;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.Option;

public class MovieSelect extends javax.swing.JFrame {

    private ArrayList<Movie> listOfMovies = null;
    private int idMovieSelected = 0;
    private void getData() {
        MovieBUS movieBUS = new MovieBUS();
        try {
            listOfMovies = ShowTimeBUS.getMoviesShowing();
            DefaultTableModel modelMovies = (DefaultTableModel) tableMovies.getModel();
            modelMovies.setRowCount(0);

            for (int i = 0 ;i < listOfMovies.size();i++) {
                Object[] row = new Object[9];
                row[0] = listOfMovies.get(i).getID();
                row[1] = listOfMovies.get(i).getName();
                row[2] = listOfMovies.get(i).getDescription();
                row[3] = listOfMovies.get(i).getStyle();
                row[4] = listOfMovies.get(i).getTime();
                row[5] = listOfMovies.get(i).getLanguage();
                row[6] = listOfMovies.get(i).getRating();
                row[7] = listOfMovies.get(i).getStartDate();
                row[8] = listOfMovies.get(i).getPoster();
                modelMovies.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MovieSelect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex){
            ex.getMessage();
        }
    }

    /**
     * Creates new form MovieSelect
     */
    public MovieSelect() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMovieName = new javax.swing.JTextField();
        txtStyle = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtLanguage = new javax.swing.JTextField();
        txtRating = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnDatve = new javax.swing.JButton();
        scrollbarMovie = new javax.swing.JScrollPane();
        tableMovies = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(239, 249, 249));

        jLabel1.setText("Tên phim:");

        jLabel3.setText("Thể loại:");

        jLabel4.setText("Thợi lượng:");

        jLabel5.setText("Ngôn ngữ:");

        jLabel6.setText("Độ tuổi");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jLabel2.setText("Nội dung:");

        btnDatve.setBackground(new java.awt.Color(255, 255, 255));
        btnDatve.setText("Đặt vé");
        btnDatve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtStyle, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDatve, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMovieName, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMovieName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtStyle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDatve))
                .addGap(66, 66, 66))
        );

        scrollbarMovie.setBorder(null);

        tableMovies.setBackground(new java.awt.Color(239, 249, 249));
        tableMovies.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        tableMovies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MovieID", "Tên phim", "Nội dung", "Thể loại", "Thời lượng", "Ngôn ngữ", "Độ tuổi", "Ngày khởi chiếu", "Poster"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollbarMovie.setViewportView(tableMovies);

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Danh sách vé đã đặt");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollbarMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollbarMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnDatveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatveActionPerformed
        try {
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
                
                lstArray.clear();
                lstArray = ShowTimeBUS.getTheaterShowByShowTime(location, idMovieSelected);
                String theater = "";
                String dateselected= "";
                // </editor-fold>
                
                // <editor-fold defaultstate="collapsed" desc="Chọn Rạp">
                if(lstArray.size() > 0)
                {
                    options = lstArray.toArray();
                    theater = (String)JOptionPane.showInputDialog(
                                null,
                                "Bạn muốn chọn rạp nào",
                                "Xin chọn rạp bạn muốn xem",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                options,
                                null);
                    if (theater.equals(""))
                        return;
                }else{
                    JOptionPane.showMessageDialog(null, "Đã hết suốt chiếu cho khu vực bạn chọn");
                    return;
                }
                // </editor-fold>
                
                // <editor-fold defaultstate="collapsed" desc="Chọn Ngày giờ">
                ArrayList<String> lstTime = new ArrayList<String>();
                lstTime = ShowTimeBUS.getTimeShowingByTheater(theater, idMovieSelected);
                SimpleDateFormat spd = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat spt = new SimpleDateFormat("hh:mm:ss"); 
                if(lstTime.size() > 0){
                    ArrayList<String> lstDate = new ArrayList<>();
                    for(int i = 0 ; i < lstTime.size();i++){
                        
                        Date d  = new Date(Long.parseLong(lstTime.get(i)));
                        
                        if(lstDate.size() == 0 ){
                             lstDate.add(spd.format(d));
                             continue;
                        }
                            
                        if (!spd.format(d).equals(lstDate.get(lstDate.size() - 1))){
                            lstDate.add(spd.format(d));
                        }
                    }
                    
                    options = lstDate.toArray();
                    dateselected = (String)JOptionPane.showInputDialog(
                                null,
                                "Bạn muốn chọn ngày nào",
                                "Xin chọn ngày bạn muốn xem",
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                options,
                                null);
                    
                    if(dateselected.equals("") )
                        return;
                            
                    lstArray.clear();
                    for(int i = 0; i< lstTime.size(); i++){
                        Date d  = new Date(Long.parseLong(lstTime.get(i)));
                        if (spd.format(d).equals(dateselected)){
                            lstArray.add(lstTime.get(i));
                        }
                    }

                    lstTime.clear();
                    for(String i : lstArray){
                        lstTime.add(spt.format(new Date(Long.parseLong(i))));
                    }

                    options = lstTime.toArray();

                    int timeSelected = JOptionPane.showOptionDialog(null,
                               "Bạn muốn xem giờ nào?", //Object message,
                               "Xin chọn giờ bạn muốn xem", //String title
                               JOptionPane.YES_NO_OPTION, //int optionType
                               JOptionPane.QUESTION_MESSAGE, //int messageType
                               null, //Icon icon,
                               options, //Object[] options,
                               null);

                    if(timeSelected == -1)
                        return;
                    
                    String timeSele = lstArray.get(timeSelected);
                    
                    ChairSelect frame = new ChairSelect(timeSele, theater, idMovieSelected);
                    
                    frame.setResizable(false);
                    frame.show();
                    this.dispose();
                    
                    
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Đã hết suốt chiếu cho rạp bạn chọn");
                    return;
                }
                // </editor-fold>
        
        }catch (SQLException ex) {
            Logger.getLogger(MovieSelect.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception ex){
            ex.getMessage();
        }
    }//GEN-LAST:event_btnDatveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getData();
        tableMovies.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           
            try{
                int a = event.getFirstIndex();

                if(a >= 0 && a < tableMovies.getRowCount())
                {
                    txtMovieName.setText((String) tableMovies.getValueAt(tableMovies.getSelectedRow(), 1));
                    txtDescription.setText((String) tableMovies.getValueAt(tableMovies.getSelectedRow(), 2));
                    txtLanguage.setText((String) tableMovies.getValueAt(tableMovies.getSelectedRow(), 5));
                    txtRating.setText((String) tableMovies.getValueAt(tableMovies.getSelectedRow(), 6));
                    txtStyle.setText((String) tableMovies.getValueAt(tableMovies.getSelectedRow(), 3));
                    txtTime.setText(tableMovies.getValueAt(tableMovies.getSelectedRow(), 4).toString());
                    idMovieSelected = Integer.parseInt(tableMovies.getValueAt(tableMovies.getSelectedRow(), 0).toString());
                    
                    //imgCover.setText("<html><img  height='174' width='280' src='" + tableMovies.getValueAt(tableMovies.getSelectedRow(), 8).toString().replace("#", "")  + "' /></html>");
                    
                }
            }catch(Exception ex)
            {
                ex.getMessage();
            }
        }
        });
    }//GEN-LAST:event_formWindowOpened

  
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MovieSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieSelect().setVisible(true);
            }
        });
        
      
       
        
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatve;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane scrollbarMovie;
    private javax.swing.JTable tableMovies;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtMovieName;
    private javax.swing.JTextField txtRating;
    private javax.swing.JTextField txtStyle;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
