<%-- 
    Document   : logout
    Created on : Jan 17, 2016, 5:53:08 PM
    Author     : Sonu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="text-align: center;">
<h1> You are successfully Loged out...</h1><br>
<h1>  Redirecting to Login Page...</h1>
       <%
          
       session.setAttribute("a3", null);
session.invalidate();

out.write("<script type='text/javascript'>\n");
out.write("setTimeout(function(){window.location.href='index.jsp'},3000);");
out.write("</script>\n");

%>
    </body>
</html>
