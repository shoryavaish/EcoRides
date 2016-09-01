/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "shareride", urlPatterns = {"/shareride"})
public class shareride extends HttpServlet {

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
       
        HttpSession session=request.getSession(false);  
        String n=(String)session.getAttribute("a3"); 
        String name=(String)session.getAttribute("uname");
        String lname=(String)session.getAttribute("a1");
       
       
        
         String from=request.getParameter("x1");
        String to =request.getParameter("x2");
 String date=request.getParameter("x3");
        String hour =request.getParameter("x4");
        String min=request.getParameter("x5");
         String time =request.getParameter("x6");
 String vehicle=request.getParameter("x7");
        String seat =request.getParameter("x8");
        String cnumber=request.getParameter("x9");
        String price=request.getParameter("x10");
        

    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sonu","root","381994");
    
    
     Statement stmt = con.createStatement();  
   
 
    
     try {
         
         
         
         
           
  
    PreparedStatement pst = con.prepareStatement("insert into ridedata  values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
 
   
      

     pst.setString(1, from  );
     pst.setString(2, to );
     pst.setString(3, date);
     pst.setString(4, hour );
     
 pst.setString(5, min  );
     pst.setString(6, time );
      pst.setString(7, vehicle );
     pst.setString(8, seat);
     pst.setString(9, cnumber );
     pst.setString(10, price);
     pst.setString(11, n);
     pst.setString(12, name);
      pst.setString(13, lname);
     
     int status =pst.executeUpdate();
     if(status > 0)
	{
  out.println("<script type=\"text/javascript\">");
   out.println("alert('Ride Successfully Shared');");
   out.println("location='share.jsp';");
   out.println("</script>");
	}
	else{
      out.println("<script type=\"text/javascript\">");
   out.println("alert('Error, Share Again');");
   out.println("location='share.jsp';");
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
            Logger.getLogger(shareride.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(shareride.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(shareride.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(shareride.class.getName()).log(Level.SEVERE, null, ex);
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
