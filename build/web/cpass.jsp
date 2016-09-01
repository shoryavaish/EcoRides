                <%-- 
    Document   : cpass
    Created on : 4 Jun, 2015, 11:55:34 AM
    Author     : sonu
--%>

<%
    String user = request.getParameter("t4");
    if (!(session.getAttribute("fname") .equals (user))) {
      response.sendRedirect("cherror.jsp"); }  
%>

<%@page import="java.sql.*"%>
<%@page import="java.io.*"%>


<%
String OldPassword = request.getParameter("t1");
String Newpass = request.getParameter("t2");
String conpass = request.getParameter("t3");


     
        

String name = request.getParameter("t4");
String password = "";

int id = 0;
try {
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection  ("jdbc:mysql://localhost:3306/sonu", "root" , "381994");
     
      Statement stmt = con.createStatement();  
ResultSet rs = stmt.executeQuery("select * from studata where pass= '"+ OldPassword + "'");
if (rs.next()) { 
password = rs.getString("pass");
} 
if(Newpass.equals(conpass))
{
if (password.equals(OldPassword)) {
stmt = con.createStatement();
 int i = stmt.executeUpdate("update studata set pass='"+ Newpass + "' where user='"+ name +"'");
response.sendRedirect("changed.jsp");
stmt.close();
con.close();
} else {
out.println("Old Password doesn't match");
}
/*}else{
out.println("new password and confirm new password is not matching");
}*/
}
} catch (Exception e) {
out.println(e);
}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>
</html>
