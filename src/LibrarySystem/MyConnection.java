/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LibrarySystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author misal
 */
public class MyConnection {
    Connection con;
//    String url="jdbc:mysql://localhost:3306/librarysystem";
//    String userName="root";
//    String password=""; 
    
    String url="jdbc:mysql://nvtibaddegama.tech:3306/nvtibad1_2023_04_librarysystem";
    String userName="nvtibad1_Misal";
    String password="misalsathsara123";

public void MyCon(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}