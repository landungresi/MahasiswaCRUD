/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author robertusadi
 */
public class MahasiswaDB {
    Connection connection;
    
    Connection getConnection(){
        Connection conn = null;
        try {
            
      
            Class.forName("com.mysql.jdbc.Driver");
            
            String host = "localhost";
            String username = "root";
            String password = "";
        
            String url = "jdbc:mysql://localhost:3306/mahasiswa";
            conn = DriverManager.getConnection(url,username,password);
            if (conn != null) {
                System.out.println("Berhasil");
            } else {
                System.out.println("Gagal");
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MahasiswaDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
    
    public MahasiswaBean getMahasiswa(String nim){
        MahasiswaBean mhs = null;
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        String sql = "select nim, nama, ipk from mahasiswa where nim = '"+nim+"'";
        conn = getConnection();
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                mhs = new MahasiswaBean();
                
                mhs.setNim(rs.getString("nim"));
                mhs.setNama(rs.getString("nama"));
                mhs.setIpk(rs.getDouble("ipk"));
            }            
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return mhs;
    }
}
