/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Sonu
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Class.forName("com.mysql.jdbc.Driver");

  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonu","root","381994");   
    
  Statement stmt = con.createStatement();  
   
  ResultSet rs=stmt.executeQuery("SELECT * FROM userdata");
  int a=0;
  String a1;
  String a3;
  String a4;       
  String fpassword;
  String uname;
  String password = null;
  String name = null;
  String namel = null;
  String emailid = null;
  String mobile = null;
  Blob imgData;
  Blob img;
  
  String t1data=request.getParameter("t9");
  String t2data=request.getParameter("t10");
        
        try {
            while(rs.next())
     
        {
             name = rs.getString("first");
             namel = rs.getString("last");
             
             emailid = rs.getString("email");
             mobile = rs.getString("phone");
             password = rs.getString("pass");
             imgData = rs.getBlob("image");

                if(emailid.equals(t1data) ||mobile.equals(t1data) && password.equals(t2data)){
                   HttpSession session = request.getSession(true);
             session.setAttribute("uname",name);
             session.setAttribute("fpassword",password);
             session.setAttribute("a1",namel);
             session.setAttribute("a3",emailid);
             session.setAttribute("a4",mobile);
             session.setAttribute("img", imgData);
                    
                 a = 1;    
                }
                   
     }     
            
                    
         if(a==1) {  
              
                    response.sendRedirect("Home.jsp");
                    
     } 
                else
                {
                    
                    
                    out.println("<script type=\"text/javascript\">");
   out.println("alert('Email or password incorrect');");
   out.println("location='index.jsp#loginScreen';");
   out.println("</script>");
                }
     
        }
        
       
        
        
        
        finally {            
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
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
