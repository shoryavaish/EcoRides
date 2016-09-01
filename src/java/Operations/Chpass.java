/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
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
@WebServlet(name = "Chpass", urlPatterns = {"/Chpass"})
public class Chpass extends HttpServlet {

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
        
        
         HttpSession session=request.getSession(false);  
        String name=(String)session.getAttribute("a3");  
        String user="";
        String password = "";
        String OldPassword = request.getParameter("t9");
String Newpass = request.getParameter("t8");
String conpass = request.getParameter("t10");
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection  ("jdbc:mysql://localhost:3306/sonu", "root" , "381994");
     
      Statement stmt = con.createStatement();  
ResultSet rs = stmt.executeQuery("select * from userdata where pass= '"+ OldPassword + "'");
if (rs.next()) { 
user=rs.getString("email");    
password = rs.getString("pass");




if(Newpass.equals(conpass))
{
if (user.equals(name)) {
stmt = con.createStatement();
 int i = stmt.executeUpdate("update userdata set pass='"+ Newpass + "' where email='"+ name +"'");
 if(i==1)
 {out.println("<script type=\"text/javascript\">");
   out.println("alert('Password Successfully Changed');");
   out.println("location='Home.jsp';");
   out.println("</script>");
stmt.close();
con.close();
} else {
out.println("Old Password doesn't match");
}

}
} 
          
/*}else{
out.println("new password and confirm new password is not matching");
}*/
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
            Logger.getLogger(Chpass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Chpass.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Chpass.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Chpass.class.getName()).log(Level.SEVERE, null, ex);
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
