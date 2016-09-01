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

/**
 *
 * @author Sonu
 */
@WebServlet(name = "Signup", urlPatterns = {"/Signup"})
public class Signup extends HttpServlet {

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
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        Class.forName("com.mysql.jdbc.Driver");
        
         String first=request.getParameter("t1");
        String last =request.getParameter("t2");
 String email=request.getParameter("t5");
        String mobile =request.getParameter("t6");
        String pass=request.getParameter("t7");
        

    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sonu","root","381994");
    
    
     Statement stmt = con.createStatement();  
   
 
   int a=0;
    
     try {
         
          ResultSet rs1=stmt.executeQuery("SELECT phone FROM userdata where phone='"+mobile+"'");
          if(rs1.next())
          {
              a=1;
          }
          else{
             a=0;
 
          }
         
         
           
     ResultSet rs=stmt.executeQuery("SELECT email FROM userdata where email='"+email+"'");
     
    if(rs.next())
    {
    out.println("<script type=\"text/javascript\">");
   out.println("alert('Email already registered');");
   out.println("location='index.jsp#signupScreen';");
   out.println("</script>");
    }
   
    
   else if(a==1)
    {
    out.println("<script type=\"text/javascript\">");
   out.println("alert('Mobile number already registered');");
   out.println("location='index.jsp#signupScreen';");
   out.println("</script>");
    }
    

    else{
    PreparedStatement pst = con.prepareStatement("insert into userdata  values(?,?,?,?,?,?)");
 
   
      

     pst.setString(1, first  );
     pst.setString(2, last );
     pst.setString(3, email);
     pst.setString(4, mobile );
     
 pst.setString(5, pass  );
     pst.setString(6, null  );
     
     int status =pst.executeUpdate();
     if(status > 0)
	{
  out.println("<script type=\"text/javascript\">");
   out.println("alert('Registration Successful');");
   out.println("location='index.jsp';");
   out.println("</script>");
	}
	else{
      out.println("<script type=\"text/javascript\">");
   out.println("alert('Error, Signup Again');");
   out.println("location='index.jsp#signupScreen';");
   out.println("</script>");
	}
        
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
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
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
