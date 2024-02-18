/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Controller.MahasiswaDB;

/**
 *
 * @author robertusadi
 */
@WebServlet(name = "SimpanMahasiswaServlet", urlPatterns = {"/SimpanMahasiswaServlet"})
public class SimpanMahasiswaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nim = request.getParameter("nim");
        String nama = request.getParameter("nama");
        Double ipk = Double.parseDouble(request.getParameter("ipk"));
        
        Connection conn = null;
        Statement st = null;
       
        MahasiswaDB dbConn = new MahasiswaDB();
        conn = dbConn.getConnection();
        
        String sql = "insert into mahasiswa (nim,nama,ipk) values ('"+nim+"','"+nama+"',"+ipk+")";
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(SimpanMahasiswaServlet.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            try {
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(SimpanMahasiswaServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Simpan</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Data Berhasil Di Simpan</h1>");
            out.println("<a href='./input_mahasiswa.jsp'>Kembali</a>");
            out.println("</body>");
            out.println("</html>");
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
