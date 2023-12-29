/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LibrarySystem;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author misal
 */
public class System extends javax.swing.JFrame {
MyConnection db =new MyConnection();
PreparedStatement pst;
ResultSet rs;
DefaultTableModel tableModel;
String oldBookID,oldSTNO;
    //String loadImagePath="D:\NETBEAN\LibrarySystem\src";
    String loadImagePath="F:\\NETBEAN\\LibrarySystem\\src";
    String selectedImagePath;
    /**
     * Creates new form LogReg
     */
    public System() {
        initComponents();
        db.MyCon();
        display1();
        display2();
        display3();
        dt();
    }
    public void dt(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dd =sdf.format(d);
        lblDate.setText(dd);
    }
    
    
 void display1(){
      try {
          String msg1="select * from book";
          pst=db.con.prepareStatement(msg1);
          rs=pst.executeQuery();
          tableModel=(DefaultTableModel) jTable1.getModel();
          while(rs.next()){
              String Name=rs.getString(1);
              String BookID=rs.getString(2);
              String Catagory =rs.getString(3);
              String Author=rs.getString(4);
              String Publisher=rs.getString(5);
              String NoOfPages=rs.getString(6);
              String Edition=rs.getString(7);
              
               String[] dataRow={Name,BookID,Catagory,Author,Publisher,NoOfPages,Edition};
               tableModel.addRow(dataRow);
          }} catch (SQLException ex) {
          Logger.getLogger(System.class.getName()).log(Level.SEVERE, null, ex);
      }
      
 }
  void display2(){
      try {
          String msg2="select * from members";
          pst=db.con.prepareStatement(msg2);
          rs=pst.executeQuery();
          tableModel=(DefaultTableModel) jTable2.getModel();
          while(rs.next()){
              String Name=rs.getString(1);
              String STNO=rs.getString(2);
              String Address =rs.getString(3);
              String Email=rs.getString(4);
              String Contact=rs.getString(5);
 
               String[] dataRow={Name,STNO,Address,Email,Contact};
               tableModel.addRow(dataRow);
          }} catch (SQLException ex) {
          Logger.getLogger(System.class.getName()).log(Level.SEVERE, null, ex);
      }
      
 }
    void display3(){
      try {
          String msg2="select * from issue";
          pst=db.con.prepareStatement(msg2);
          rs=pst.executeQuery();
          tableModel=(DefaultTableModel) jTable3.getModel();
          while(rs.next()){
              String STNO =rs.getString(1);
              String MemberName=rs.getString(2);
              String BookID =rs.getString(3);
              String Book=rs.getString(4);
              String IssueDate=rs.getString(5);
              String ReturnDate=rs.getString(6);
 
               String[] dataRow={STNO,MemberName,BookID,Book,IssueDate,ReturnDate};
               tableModel.addRow(dataRow);
          }} catch (SQLException ex) {
          Logger.getLogger(System.class.getName()).log(Level.SEVERE, null, ex);
      }
      
 }
 void clear(){
        txtBName.setText("");
        txtBookid.setText("");
        txtCatagory.setText("");
        txtAuthor.setText("");
        txtPublisher.setText("");
        txtPages.setText("");
        txtEdition.setText("");
    }
            void print1(){
        
        taDisplay1.setText("");
        String info;
        info="\t Member Detail\n "+
                "==========================\n"+
                "STNO \t"+txtMstno.getText()+"\n"+
                "Address \t"+txtMaddress.getText()+"\n"+
                "Email \t"+txtMemail.getText()+"\n"+
                "Contact \t"+txtMcontact.getText()+"\n"+
                "==========================\n";
        // "\nmisalsathsara@gmail.com\n";
                
        taDisplay1.append(info);
            }
            void print2(){
        taDisplay2.setText("");
        String info;
        info="\t Member Detail\n "+
                "==========================\n"+
                "Name \t"+txtBName.getText()+"\n"+
                "Book ID \t"+txtBookid.getText()+"\n"+
                "Catagory \t"+txtCatagory.getText()+"\n"+
                "Author \t"+txtAuthor.getText()+"\n"+
                "Publisher \t"+txtPublisher.getText()+"\n"+
                "Pages \t"+txtPages.getText()+"\n"+
                "Edition \t"+txtEdition.getText()+"\n"+
                "==========================\n";
        // "\nmisalsathsara@gmail.com\n";
                
        taDisplay2.append(info);
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
        jLabel30 = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMembers = new javax.swing.JButton();
        btnBooks = new javax.swing.JButton();
        btnIssue = new javax.swing.JButton();
        btnBorrow = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMname = new javax.swing.JTextField();
        txtMstno = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtMaddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtMemail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtMcontact = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnMadd = new javax.swing.JButton();
        btnMdelete = new javax.swing.JButton();
        btnMclear = new javax.swing.JButton();
        btnMupdate = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPublisher = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPages = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEdition = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtCatagory = new javax.swing.JTextField();
        txtBName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBookid = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtIstno = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtIname = new javax.swing.JTextField();
        txtIbookid = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtibook = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taDisplay1 = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taDisplay2 = new javax.swing.JTextArea();
        btnIadd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtIsueDate = new com.toedter.calendar.JDateChooser();
        txtReturndate = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        txtBstno = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtBname = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtBid = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtBbook = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtBissueDate = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtBreturnDate = new javax.swing.JTextField();
        btnRecieved = new javax.swing.JButton();
        btnBclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setText("Date -");

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMembers.setBackground(new java.awt.Color(153, 153, 153));
        btnMembers.setText("Members");
        btnMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMembersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMembersMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMembersMouseReleased(evt);
            }
        });
        btnMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembersActionPerformed(evt);
            }
        });
        jPanel2.add(btnMembers, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 98, -1));

        btnBooks.setBackground(new java.awt.Color(153, 153, 153));
        btnBooks.setText("Books");
        btnBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBooksMouseExited(evt);
            }
        });
        btnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBooksActionPerformed(evt);
            }
        });
        jPanel2.add(btnBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 98, -1));

        btnIssue.setBackground(new java.awt.Color(153, 153, 153));
        btnIssue.setText("Issue Book");
        btnIssue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIssueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIssueMouseExited(evt);
            }
        });
        btnIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueActionPerformed(evt);
            }
        });
        jPanel2.add(btnIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 98, -1));

        btnBorrow.setBackground(new java.awt.Color(153, 153, 153));
        btnBorrow.setText("Borrow Book");
        btnBorrow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrowMouseExited(evt);
            }
        });
        btnBorrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        btnHome.setBackground(new java.awt.Color(153, 153, 153));
        btnHome.setText("HOME");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnHomeMouseReleased(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 98, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c40dcb4b50b3c33df0969c10444b996e.jpg"))); // NOI18N
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, -60, 390, 690));

        jPanel3.setLayout(new javax.swing.OverlayLayout(jPanel3));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WHAT-IS-THE-PURPOSE-OF-A-LIBRARY-MANAGEMENT-SYSTEM-min.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel7);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setText("Members");

        jLabel11.setText("Name");

        jLabel12.setText("STNO");

        jLabel13.setText("Address");

        jLabel14.setText("Email");

        jLabel15.setText("Contact");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "STNO", "Address", "Email", "Contact"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        btnMadd.setText("Add");
        btnMadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaddActionPerformed(evt);
            }
        });

        btnMdelete.setText("Delete");
        btnMdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMdeleteActionPerformed(evt);
            }
        });

        btnMclear.setText("Clear");
        btnMclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMclearActionPerformed(evt);
            }
        });

        btnMupdate.setText("Update");
        btnMupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel10))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(49, 49, 49)
                                    .addComponent(txtMname, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel14))
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtMemail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMstno, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnMupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnMclear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(btnMadd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnMdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtMname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtMstno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtMaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtMemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtMcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMadd)
                            .addComponent(btnMdelete))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMclear)
                            .addComponent(btnMupdate))))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel8);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Book");

        jLabel3.setText("Catagory");

        jLabel4.setText("Author");

        jLabel5.setText("Publisher");

        jLabel6.setText("No Of Pages");

        jLabel7.setText("Edition");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Book ID", "Catagory", "Author", "Publisher", "No Of Pages", "Edition"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        txtCatagory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCatagoryActionPerformed(evt);
            }
        });

        txtBName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBNameActionPerformed(evt);
            }
        });

        jLabel8.setText("Name");

        jLabel9.setText("Book ID");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBookid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdition, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtAuthor)
                                        .addComponent(txtCatagory)
                                        .addComponent(txtPublisher)
                                        .addComponent(txtPages, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(21, 21, 21)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtBName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtBookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEdition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear))
                .addGap(57, 57, 57))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel16.setText("Issue Book");

        jLabel17.setText("STNO");

        txtIstno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIstnoKeyPressed(evt);
            }
        });

        jLabel18.setText("Member Name");

        txtIbookid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIbookidKeyPressed(evt);
            }
        });

        jLabel19.setText("Book ID");

        jLabel20.setText("Book");

        jLabel21.setText("Issue Date");

        jLabel22.setText("Return Date");

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Member Detail"));

        taDisplay1.setColumns(20);
        taDisplay1.setRows(5);
        jScrollPane3.setViewportView(taDisplay1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Book Detail"));

        taDisplay2.setColumns(20);
        taDisplay2.setRows(5);
        taDisplay2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taDisplay2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(taDisplay2);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        btnIadd.setText("Add");
        btnIadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIaddActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel16))
                        .addGap(151, 151, 151))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIsueDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtibook, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIstno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(txtIbookid, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtReturndate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtIname, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(btnIadd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(46, 46, 46)))
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel16)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtIstno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtIname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtIbookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtibook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIsueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtReturndate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(41, 41, 41)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIadd)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );

        jPanel3.add(jPanel5);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel23.setText("Borrow Book");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STNO", "Member Name", "BookID", "Book", "IssueDate", "ReturnDate"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3);

        jLabel24.setText("STNO");

        jLabel25.setText("Member Name");

        jLabel26.setText("Book ID");

        jLabel27.setText("Book");

        jLabel28.setText("Issue Date");

        jLabel29.setText("Return Date");

        btnRecieved.setText("Recievd");
        btnRecieved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecievedActionPerformed(evt);
            }
        });

        btnBclear.setText("Clear");
        btnBclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel24))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBreturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBissueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBbook, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBid, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBname, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBstno, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnRecieved, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnBclear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtBstno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtBname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtBid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtBbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtBissueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtBreturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRecieved)
                            .addComponent(btnBclear))))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembersActionPerformed
       jPanel7.setVisible(false);
       jPanel8.setVisible(true);
       jPanel6.setVisible(false);
       jPanel5.setVisible(false);
       jPanel4.setVisible(false);
    }//GEN-LAST:event_btnMembersActionPerformed

    private void btnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBooksActionPerformed
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
       jPanel6.setVisible(true);
       jPanel5.setVisible(false);
       jPanel4.setVisible(false);
    }//GEN-LAST:event_btnBooksActionPerformed

    private void btnIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueActionPerformed
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
       jPanel6.setVisible(false);
       jPanel5.setVisible(true);
       jPanel4.setVisible(false);
    }//GEN-LAST:event_btnIssueActionPerformed

    private void btnBorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowActionPerformed
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
       jPanel6.setVisible(false);
       jPanel5.setVisible(false);
       jPanel4.setVisible(true);
    }//GEN-LAST:event_btnBorrowActionPerformed

    private void btnMembersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMembersMouseEntered
     btnMembers.setBackground(Color.white);
    }//GEN-LAST:event_btnMembersMouseEntered

    private void btnMembersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMembersMouseReleased
        //btnMembers.setBackground(Color.PINK);
    }//GEN-LAST:event_btnMembersMouseReleased

    private void btnMembersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMembersMouseExited
        btnMembers.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnMembersMouseExited

    private void btnBooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBooksMouseEntered
       btnBooks.setBackground(Color.white);
    }//GEN-LAST:event_btnBooksMouseEntered

    private void btnBooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBooksMouseExited
        btnBooks.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnBooksMouseExited

    private void btnIssueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIssueMouseEntered
        btnIssue.setBackground(Color.white);
    }//GEN-LAST:event_btnIssueMouseEntered

    private void btnIssueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIssueMouseExited
       btnIssue.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnIssueMouseExited

    private void btnBorrowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrowMouseEntered
         btnBorrow.setBackground(Color.white);
    }//GEN-LAST:event_btnBorrowMouseEntered

    private void btnBorrowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrowMouseExited
        btnBorrow.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnBorrowMouseExited

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
                   try {

                       String msg = "select * from book WHERE BookID = ?";
              pst=db.con.prepareStatement(msg);
              pst.setString(1,txtBookid.getText()); 
              rs=pst.executeQuery();  
                        tableModel=(DefaultTableModel) jTable1.getModel();
                        if(!rs.next()){
        String msg1="Insert book (Name,BookID,Catagory,Author,Publisher,NoOfPages,Edition) values(?,?,?,?,?,?,?)";
        pst=db.con.prepareStatement(msg1);
        pst.setString(1, txtBName.getText());
        pst.setString(2, txtBookid.getText());
        pst.setString(3, txtCatagory.getText());
        pst.setString(4, txtAuthor.getText());
        pst.setString(5, txtPublisher.getText());
        pst.setString(6, txtPages.getText());
        pst.setString(7, txtEdition.getText());
     

        pst.execute();
        
              String Name=txtBName.getText();
              String BookId=txtBookid.getText();
              String Catagory =txtCatagory.getText();
              String Author=txtAuthor.getText();
              String Publisher=txtPublisher.getText();
              String NoOfPages=txtPages.getText();
              String Edition=txtEdition.getText();
             
        
        String[] dataRow={Name,BookId,Catagory,Author,Publisher,NoOfPages,Edition};
        tableModel.addRow(dataRow);
        
        txtBName.setText("");
        txtBookid.setText("");
        txtCatagory.setText("");
        txtAuthor.setText("");
        txtPublisher.setText("");
        txtPages.setText("");
        txtEdition.setText("");
        
        
        JOptionPane.showMessageDialog(this, "Book ADD SUCCESSFULL");
                        }else{
                            JOptionPane.showMessageDialog(this, "Book ALREADY ADED");
                        }
        
     
        
    } catch (SQLException ex) {
        Logger.getLogger(System.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtCatagoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCatagoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCatagoryActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
                try {
            String msg2="delete from book where BookID=?";
            pst=db.con.prepareStatement(msg2);
            pst.setString(1, txtBookid.getText());
            pst.executeUpdate();

            tableModel=(DefaultTableModel) jTable1.getModel();
            int x=jTable1.getSelectedRow();
            tableModel.removeRow(x);
            
            clear();
            
        JOptionPane.showMessageDialog(this, "RECORD DELETE SUCCESSFULL");
        
        } catch (SQLException ex) {
            Logger.getLogger(LogReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtBNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
                try {
            String msg="Update book SET Name=?, BookID=?, Catagory=?, Author=?,Publisher=?,NoOfPages=?,Edition=? where book.BookID=?";
            pst=db.con.prepareStatement(msg);
            pst.setString(1, txtBName.getText());
            pst.setString(2, txtBookid.getText());
            pst.setString(3, txtCatagory.getText());
            pst.setString(4, txtAuthor.getText());
            pst.setString(5, txtPublisher.getText());
            pst.setString(6, txtPages.getText());
            pst.setString(7, txtEdition.getText());
            pst.setString(8, oldBookID);
            pst.executeUpdate();
            
            tableModel=(DefaultTableModel) jTable1.getModel();
            int x=jTable1.getSelectedRow();
            jTable1.setValueAt(txtBName.getText(), x, 0);
            jTable1.setValueAt(txtBookid.getText(), x, 1);
            jTable1.setValueAt(txtCatagory.getText(), x, 5);
            jTable1.setValueAt(txtAuthor.getText(), x, 3);
            jTable1.setValueAt(txtPublisher.getText(), x, 4);
            jTable1.setValueAt(txtPages.getText(), x, 5);
            jTable1.setValueAt(txtEdition.getText(), x, 6);
            
            JOptionPane.showMessageDialog(this, "RECORD UPDATE SUCCESSFULL");
            
        } catch (SQLException ex) {
            Logger.getLogger(System.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        tableModel=(DefaultTableModel) jTable1.getModel();
        int x=jTable1.getSelectedRow();
        txtBName.setText(tableModel.getValueAt(x,0).toString());
        txtBookid.setText(tableModel.getValueAt(x,1).toString());
        txtCatagory.setText(tableModel.getValueAt(x,2).toString());
        txtAuthor.setText(tableModel.getValueAt(x,3).toString());
        txtPublisher.setText(tableModel.getValueAt(x, 4).toString());
          txtPages.setText(tableModel.getValueAt(x, 5).toString());
          txtEdition.setText(tableModel.getValueAt(x, 6).toString());
  
        
        oldBookID=txtBookid.getText();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
       clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
         btnHome.setBackground(Color.white);
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        btnHome.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeMouseReleased

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        jPanel7.setVisible(true);
        jPanel6.setVisible(false);
       jPanel6.setVisible(false);
       jPanel5.setVisible(false);
       jPanel4.setVisible(false);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnMaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaddActionPerformed
                   try {

                       String msg = "select * from members WHERE STNO = ?" ;
              pst=db.con.prepareStatement(msg);
              pst.setString(1,txtMstno.getText()); 
              rs=pst.executeQuery();  
                        tableModel=(DefaultTableModel) jTable2.getModel();
                        if(!rs.next()){
        String msg2="Insert members (Name,STNO,Address,Email,Contact) values(?,?,?,?,?)";
        pst=db.con.prepareStatement(msg2);
        pst.setString(1, txtMname.getText());
        pst.setString(2, txtMstno.getText());
        pst.setString(3, txtMaddress.getText());
        pst.setString(4, txtMemail.getText());
        pst.setString(5, txtMcontact.getText());
     

        pst.execute();
        
              
              String Name=txtMname.getText();
              String STNO=txtMstno.getText();
              String Address =txtMaddress.getText();
              String Email=txtMemail.getText();
              String Contact=txtMcontact.getText();
             
        
        String[] dataRow={Name,STNO,Address,Email,Contact};
        tableModel.addRow(dataRow);
        
        txtMname.setText("");
        txtMstno.setText("");
        txtMaddress.setText("");
        txtMemail.setText("");
        txtMcontact.setText("");
        
        
        JOptionPane.showMessageDialog(this, "USER ADD SUCCESSFULL");
                        }else{
                            JOptionPane.showMessageDialog(this, "USER STNO ALREADY ADED");
                        }
        
     
        
    } catch (SQLException ex) {
        Logger.getLogger(System.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnMaddActionPerformed

    private void btnMdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMdeleteActionPerformed
                        try {
            String msg3="delete from members where STNO=?";
            pst=db.con.prepareStatement(msg3);
            pst.setString(1, txtMstno.getText());
            pst.executeUpdate();

            tableModel=(DefaultTableModel) jTable2.getModel();
            int x=jTable2.getSelectedRow();
            tableModel.removeRow(x);
            
            txtMname.setText("");
        txtMstno.setText("");
        txtMaddress.setText("");
        txtMemail.setText("");
        txtMcontact.setText("");
            
        JOptionPane.showMessageDialog(this, "RECORD DELETE SUCCESSFULL");
        
        } catch (SQLException ex) {
            Logger.getLogger(LogReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMdeleteActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
               tableModel=(DefaultTableModel) jTable2.getModel();
        int x=jTable2.getSelectedRow();
        txtMname.setText(tableModel.getValueAt(x,0).toString());
        txtMstno.setText(tableModel.getValueAt(x,1).toString());
        txtMaddress.setText(tableModel.getValueAt(x,2).toString());
        txtMemail.setText(tableModel.getValueAt(x,3).toString());
        txtMcontact.setText(tableModel.getValueAt(x, 4).toString());
        
        
        //LoadImage();
  
        
        oldSTNO=txtMstno.getText();
    }//GEN-LAST:event_jTable2MouseClicked

    private void txtIstnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIstnoKeyPressed
display1();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        
            try {
                String mid = txtIstno.getText();
                pst=db.con.prepareStatement("select * from members where STNO=?");
                pst.setString(1, mid);
                rs=pst.executeQuery();
                
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(this, "STNO Not Found");
                }else{
                   
                    String membername=rs.getString("Name");
                    txtIname.setText(membername.trim()); 
                    print1();
                }
            } catch (SQLException ex) { 
                Logger.getLogger(System.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }//GEN-LAST:event_txtIstnoKeyPressed

    private void txtIbookidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIbookidKeyPressed
                if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        
            try {
                String mid = txtIbookid.getText();
                pst=db.con.prepareStatement("select * from book where BookID=?");
                pst.setString(1, mid);
                rs=pst.executeQuery();
                
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(this, "Book ID Not Found");
                }else{
                    String membername=rs.getString("Name");
                    txtibook.setText(membername.trim());
                    print2();
                }
            } catch (SQLException ex) {
                Logger.getLogger(System.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_txtIbookidKeyPressed

    private void taDisplay2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taDisplay2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_taDisplay2MouseClicked

    private void btnIaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIaddActionPerformed
                           try {
             String msg = "select * from issue WHERE STNO = ?" ;
              pst=db.con.prepareStatement(msg);
              pst.setString(1,txtIstno.getText()); 
              rs=pst.executeQuery();  
              
              SimpleDateFormat date_format=new SimpleDateFormat("YYYY-MM-DD");
              String DateIssue=date_format.format(txtIsueDate.getDate());
              
              SimpleDateFormat date_format1=new SimpleDateFormat("YYYY-MM-DD");
              String ReturnDate=date_format.format(txtReturndate.getDate());
                        
                        if(!rs.next()){
        String msg2="Insert issue (STNO,MemberName,BookID,Book,IssueDate,ReturnDate) values(?,?,?,?,?,?)";
        pst=db.con.prepareStatement(msg2);
        pst.setString(1, txtIstno.getText());
        pst.setString(2, txtIname.getText());
        pst.setString(3, txtIbookid.getText());
        pst.setString(4, txtibook.getText());
        //pst.setString(5, txtIsueDate.getText());
       // pst.setString(6, txtibook.getText());
       pst.setString(5, DateIssue);
       pst.setString(6, ReturnDate);
        

        pst.execute();

        txtIstno.setText("");
        txtIname.setText("");
        txtIbookid.setText("");
        txtibook.setText("");
      

        
        
        JOptionPane.showMessageDialog(this, "BOOK ISSUED");
                        }else{
                            JOptionPane.showMessageDialog(this, "USER ALREADY HAVE A BOOK");
                        }
        
     
        
    } catch (SQLException ex) {
        Logger.getLogger(System.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnIaddActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        tableModel=(DefaultTableModel) jTable3.getModel();
        int x=jTable3.getSelectedRow();
        txtBstno.setText(tableModel.getValueAt(x,0).toString());
        txtBname.setText(tableModel.getValueAt(x,1).toString());
        txtBid.setText(tableModel.getValueAt(x,2).toString());
        txtBbook.setText(tableModel.getValueAt(x,3).toString());
        txtBissueDate.setText(tableModel.getValueAt(x, 4).toString());
        txtBreturnDate.setText(tableModel.getValueAt(x, 5).toString());
        
        //LoadImage();
  
        
        oldSTNO=txtBstno.getText();
    }//GEN-LAST:event_jTable3MouseClicked

    private void btnRecievedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecievedActionPerformed
                                try {
            String msg3="delete from issue where STNO=?";
            pst=db.con.prepareStatement(msg3);
            pst.setString(1, txtBstno.getText());
            pst.executeUpdate();

            tableModel=(DefaultTableModel) jTable3.getModel();
            int x=jTable3.getSelectedRow();
            tableModel.removeRow(x);
            
        txtBstno.setText("");
        txtBname.setText("");
        txtBid.setText("");
        txtBbook.setText("");
        txtBissueDate.setText("");
        txtBreturnDate.setText("");
            
        JOptionPane.showMessageDialog(this, "RECIEVED");
        
        } catch (SQLException ex) {
            Logger.getLogger(LogReg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRecievedActionPerformed

    private void btnBclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBclearActionPerformed
         txtBstno.setText("");
        txtBname.setText("");
        txtBid.setText("");
        txtBbook.setText("");
        txtBissueDate.setText("");
        txtBreturnDate.setText("");
    }//GEN-LAST:event_btnBclearActionPerformed

    private void btnMupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMupdateActionPerformed
            try {
            String msg2="Update members SET Name=?,STNO=?,Address=?,Email=?,Contact=? WHERE members.STNO=?";
            pst=db.con.prepareStatement(msg2);
            pst.setString(1, txtMname.getText());
            pst.setString(2, txtMstno.getText());
            pst.setString(3, txtMaddress.getText());
            pst.setString(4, txtMemail.getText());
            pst.setString(5, txtMcontact.getText());
            pst.setString(6, oldSTNO);
            pst.executeUpdate();
            
            tableModel=(DefaultTableModel) jTable2.getModel();
           int x=jTable2.getSelectedRow();
             jTable2.setValueAt(txtMname.getText(), x, 0);
            jTable2.setValueAt(txtMstno.getText(), x, 1);
            jTable2.setValueAt(txtMaddress.getText(), x, 2);
           jTable2.setValueAt(txtMemail.getText(), x, 3);
            jTable2.setValueAt(txtMcontact.getText(), x, 4);

            txtMname.setText("");
        txtMstno.setText("");
        txtMaddress.setText("");
        txtMemail.setText("");
        txtMcontact.setText("");
        
        
            JOptionPane.showMessageDialog(this, "RECORD UPDATE SUCCESSFULL");
            
        } catch (SQLException ex) {
            Logger.getLogger(System.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMupdateActionPerformed

    private void btnMclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMclearActionPerformed
          txtMname.setText("");
        txtMstno.setText("");
        txtMaddress.setText("");
        txtMemail.setText("");
        txtMcontact.setText("");
    }//GEN-LAST:event_btnMclearActionPerformed

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
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new System().setVisible(true);
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBclear;
    private javax.swing.JButton btnBooks;
    private javax.swing.JButton btnBorrow;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnIadd;
    private javax.swing.JButton btnIssue;
    private javax.swing.JButton btnMadd;
    private javax.swing.JButton btnMclear;
    private javax.swing.JButton btnMdelete;
    private javax.swing.JButton btnMembers;
    private javax.swing.JButton btnMupdate;
    private javax.swing.JButton btnRecieved;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel7;
    public javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JTextArea taDisplay1;
    private javax.swing.JTextArea taDisplay2;
    public javax.swing.JTextField txtAuthor;
    public javax.swing.JTextField txtBName;
    private javax.swing.JTextField txtBbook;
    private javax.swing.JTextField txtBid;
    private javax.swing.JTextField txtBissueDate;
    private javax.swing.JTextField txtBname;
    public javax.swing.JTextField txtBookid;
    private javax.swing.JTextField txtBreturnDate;
    private javax.swing.JTextField txtBstno;
    public javax.swing.JTextField txtCatagory;
    public javax.swing.JTextField txtEdition;
    public javax.swing.JTextField txtIbookid;
    public javax.swing.JTextField txtIname;
    public javax.swing.JTextField txtIstno;
    public com.toedter.calendar.JDateChooser txtIsueDate;
    public javax.swing.JTextField txtMaddress;
    public javax.swing.JTextField txtMcontact;
    public javax.swing.JTextField txtMemail;
    public javax.swing.JTextField txtMname;
    public javax.swing.JTextField txtMstno;
    public javax.swing.JTextField txtPages;
    public javax.swing.JTextField txtPublisher;
    public com.toedter.calendar.JDateChooser txtReturndate;
    public javax.swing.JTextField txtibook;
    // End of variables declaration//GEN-END:variables
}
