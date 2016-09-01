package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if ((session.getAttribute("a3") == null) || (session.getAttribute("a3") == "")) {
      response.sendRedirect("index.jsp"); }  

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>ecoRides-Let's Share</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("<style type=\"text/css\">  </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.6/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("\t<script src=\"core.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"script.js\" type=\"text/javascript\"></script> \n");
      out.write("<link rel=\"stylesheet\" href=\"css/style1.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style2.css\" type=\"text/css\" media=\"all\">\n");
      out.write("<script src=\"smoothscroll.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"a1\">\n");
      out.write("\n");
      out.write("<div id=\"a2\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"a3\">\n");
      out.write("\n");
      out.write("<div id=\"a4\">\n");
      out.write("<div id=\"a5\">\n");
      out.write("<div style=\"height:100%;width:60%;float:left;\">\n");
      out.write("<img src=\"images/logo3d.gif\" id=\"logo\"> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div style=\"height:100%;width:40%;float:left;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("<a href=\"#\" class=\"button\"><div style=\"color:#A9A9A9;border-right: 1px solid black;float:left;margin-top:3%;height:20%;width:23%;background-color:white;text-align:center;\">\n");
      out.write("        <div style=\"color:#A9A9A9;text-align:center;padding-bottom:20%;font-size:3.7vw;font-size:3.7vh;text-decoration:none;\">Support</div> <div id=\"loginScreen\"> <a href=\"#\" class=\"cancel\" style=\" background-color: 0066ff;\" >&times;</a>\n");
      out.write("\n");
      out.write("<h1 style=\"font-size:150%;text-align:center;color:0066ff;\">Change Password</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("<hr style=\"background-color:0066ff;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<form name=\"frm2\" action=\"Chpass\" method=\"post\" onsubmit=\"return Validate()\">\n");
      out.write("\n");
      out.write("<p> <input type='password' tabindex=\"1\"  name=\"t9\" id=\"pass\" placeholder=\"Old Password*\" />\n");
      out.write("                </p>\n");
      out.write("                \n");
      out.write("                <p> <input type='password' tabindex=\"1\"  name=\"t8\" id=\"pass\" placeholder=\"New Password*\" />\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("<p> <input type='password' tabindex=\"1\"  name=\"t10\" id=\"pass\" placeholder=\"Confirm New Password*\" />\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write(" <input type=\"submit\" id=\"button1\"  name=\"submit\" value=\"Change\" />\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write(" </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"cover\" ></div>\n");
      out.write("             \n");
      out.write("            </div></a>\n");
      out.write("\n");
      out.write("             \n");
      out.write("            \n");
      out.write("\n");
      out.write("<a href=\"#\"><div style=\"margin-left:1.3vw;padding-right:1.3vw;color:#A9A9A9;border-right: 1px solid black;float:left;margin-top:3%;height:20%;width:20%;background-color:white;text-align:center;\">\n");
      out.write("         <div style=\"color:#A9A9A9;text-align:center;padding-bottom:20%;font-size:3.7vw;font-size:3.7vh;text-decoration:none;\">Careers</div></div></a>\n");
      out.write("\n");
      out.write("<a href=\"#\"><div style=\"margin-left:1.2vw;padding-right:0px;color:#A9A9A9;float:left;margin-top:3%;height:20%;width:40%;background-color:white;text-align:center;\">\n");
      out.write("         <div style=\"color:#A9A9A9;text-align:center;padding-bottom:20%;font-size:3.7vw;font-size:3.7vh;text-decoration:none;\"> How it works</div></div></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("         \n");
      out.write("      <div id=\"profile\">\n");
      out.write("        <ul id=\"navl\">\n");
      out.write("            <li><a href=\"#\">Welcome, ");
      out.print(session.getAttribute("uname"));
      out.write("</a>\n");
      out.write("                <div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"profile.jsp\">Profile</a></li>\n");
      out.write("                        <li><a href=\"#loginScreen\">Change Password</a></li>\n");
      out.write("                        <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                 <a href=\"profile.jsp\"> <div style=\"float:right;position: relative;height:7vh;width:5vw;margin-top: 4.5vh;\">\n");
      out.write("    <img src=\"");
      out.print(session.getAttribute("img"));
      out.write("\" width=\"46vw\" height=\"46vh\" alt=\"\" class=\"myAvatar\" style=\"position:absolute; top:0; left:0; z-index:1;\" />\n");
      out.write("    \n");
      out.write("</div></a>\n");
      out.write("                \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"example\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("        <ul id=\"nav\">\n");
      out.write("            <li><a href=\"#home\">Home</a></li>\n");
      out.write("            <li><a href=\"#about\">About us</a>\n");
      out.write("                \n");
      out.write("            </li>\n");
      out.write("            <li><a href=\"#services\">Contact us</a>\n");
      out.write("               \n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("        </ul>\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                   \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"a6\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <section id=\"home\">\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <a href=\"need.jsp\">  <img src=\"images/nr.jpg\" name=\"slide\" id=\"need\"></a>\n");
      out.write("                <a href=\"share.jsp\">  <img src=\"images/sr.jpg\" name=\"slide\" id=\"share\"></a><hr>\n");
      out.write("                <h2 style=\"text-align: center;\">Ride History</h2>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                 \n");

  
        String n=(String)session.getAttribute("a3");    
   
try
{
Class.forName("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/sonu";
String username="root";
String password="381994";
String query="select * from ridedata where email='"+n+"' ";
Connection conn=DriverManager.getConnection(url,username,password);
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{


      out.write("\n");
      out.write(" <div  style=\"border-top: 1px solid black;border-bottom: 1px solid black;text-align: left;padding-left: 20%;font-size: 1.5vh;font-size: 1.5vw;height:16%;width:60%;float:left;background-color: #00FFFF;margin-left: 10%;\">\n");
      out.write("    \n");
      out.write("     ");
      out.print(rs.getString("frm") );
      out.write("&nbsp; &rarr; &nbsp;\n");
      out.write("    ");
      out.print(rs.getString("tooo") );
      out.write("<br>\n");
      out.write("   Date -  ");
      out.print(rs.getString("dat") );
      out.write(" , ");
      out.print(rs.getString("hour") );
      out.write(':');
      out.print(rs.getString("min") );
      out.write("\n");
      out.write("    ");
      out.print(rs.getString("tim") );
      out.write("<br>\n");
      out.write("    Vehicle Type -  ");
      out.print(rs.getString("vehicle") );
      out.write("<br>\n");
      out.write("   Price per Seat - Rs ");
      out.print(rs.getString("price") );
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     </div>\n");
      out.write("        ");


}

      out.write("\n");
      out.write("   \n");
      out.write("    ");

    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }





      out.write(" \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("              \n");
      out.write("\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("             <section id=\"about\"style=\"height:110%;width:100%;background:url(images/contact.jpg)  center top;\">\n");
      out.write("        \n");
      out.write("            <img src=\"images/c.jpg\" style=\"width:100%;height:15%;\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("             <div class=\"box effect7\">\n");
      out.write("\t<h1>About us</h1>\n");
      out.write("        <p  style=\"padding: 3%;font-size:4vw;font-size:4vh; color :#669900; \">ecoRides is a web application which is taken into account by the students of DIT University, designed and functioned by Shorya, Sonu and Priya. \n");
      out.write("This web application provide access of information regarding pollution control premises and your convinience to go easy with \n");
      out.write("your hasty schedule by saving time and it also give us the  capacity to quickly go after the whole exome.It is also a \n");
      out.write("web application which will shoot two birds with single arrow as this helps in pollution control as well as it helps in rise \n");
      out.write("in growth of economy of a country.</p>\n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("            \n");
      out.write("   \n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("            <section id=\"services\" style=\"height:130%;width:100%;background:url(images/contact.jpg)no-repeat  center top;color: #669900;\">\n");
      out.write("                <img src=\"images/c.jpg\" style=\"width:100%;height:15%;\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <div class=\"box1 effect7\">\n");
      out.write("               \n");
      out.write("                <h1>Contact us</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("                <form name=\"contactForm\" method=\"get\" action=\"\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("\t\t<tr>\n");
      out.write("\t\t<td style=\"color:#669900;font-size: 1.9vh;font-size: 1.9vw;\">Full name:&nbsp;&nbsp;\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td>\n");
      out.write("                    <input type=\"text\" name=\"fullName\" value=\" \" style=\"border-color:#669900;width:40%;font-size: 1.3vh;font-size: 1.3vw;\" />\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td style=\"color:#669900;font-size: 1.9vh;font-size: 1.9vw;\">Email address:&nbsp;&nbsp;\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t\t<input type=\"text\" name=\"email\" value=\"\"  style=\"border-color:#669900;width:40%;font-size: 1.3vh;font-size: 1.3vw\"/>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t\t\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td style=\"color:#669900;font-size: 1.9vh;font-size: 1.9vw;\">Your message:&nbsp;&nbsp;\n");
      out.write("\t\t</td>\n");
      out.write("\n");
      out.write("<td>\n");
      out.write("\t\t\t<textarea name=\"msgBody\" rows=\"5\" cols=\"70\"  style=\"border-color:#669900;\"></textarea>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("\t<tr>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t</td>\n");
      out.write("\t\t<td>\n");
      out.write("\t\t\t<input type=\"submit\" name=\"submit\" value=\"Send\"  style=\"height:40px;width:20%;font-size: 1.9vh;font-size: 1.9vw;background-color: #e68a00;opacity:1;\"/>\n");
      out.write("\t\t</td>\n");
      out.write("\t</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("                <div  style=\"width:50%;float:left;height:35%;color:#669900;\">\n");
      out.write("                    <h2 align=\"center\">Contact Details</h2>\n");
      out.write("                    <img src=\"images/conticon.jpg\" style=\"margin-left: 5%;height:20px;width:20px;\">&nbsp;&nbsp 9572254776, 9457948535, 8439585405<br>\n");
      out.write("                    <img src=\"images/conticon1.png\" style=\"margin-left: 5%;height:23px;width:23px;\">&nbsp;&nbsp support@ecorides.co.in\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div align=\"center\" style=\"width:50%;float:left;height:35%;\">\n");
      out.write("                    <img src=\"images/imgcont.jpg\"> \n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("                    \n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("                <div style=\"width:100%;height:20%;float:bottom;background-color: blue;\"></div>\n");
      out.write("            \n");
      out.write("            </section>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("<div id=\"a7\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"feedback\">\n");
      out.write("\n");
      out.write("\t<a id=\"feedback_button\">Feedback</a>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div class=\"form\">\n");
      out.write("\n");
      out.write("<form>\n");
      out.write("\t\t\tName*<br>\n");
      out.write("                        <input type=\"text\" style=\"height:30px;width:200px;\"><br><br>\n");
      out.write("\n");
      out.write("\t\t\tEmail ID*<br>\n");
      out.write("                        <input type=\"text\" style=\"height:30px;width:200px;\"><br><br>\n");
      out.write("                Message*\n");
      out.write("\t\t<textarea name=\"msgBody\" rows=\"5\" cols=\"30\"  style=\"border-color:#669900;\"></textarea><br><br>\n");
      out.write("\t\t<input type=\"button\" value=\"Send\" id=\"submit_form\" style=\"height:30px;width:60px;background-color:red;color:#FFF;\" />\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
