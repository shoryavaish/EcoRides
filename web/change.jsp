<%-- 
    Document   : change
    Created on : 3 Jun, 2015, 8:16:13 PM
    Author     : sonu
--%>
<%
    if ((session.getAttribute("uname") == null) || (session.getAttribute("uname") == "")) {
      response.sendRedirect("index.html"); }  
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Change Password</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" type="image/jpg" href="img/dit.jpg">
<link rel="stylesheet" href="style.css" type="text/css" />
    </head>
    <body>
        <div style="width: 100%;">
            <div id="image">
            <a href="www.dituniversity.edu.in"> <img src="img/dit.jpg" height="120" width="150" >
            </a> 
            </div> 
            
            
            <div id="content">
                <h1 style="font-size: 200%;color:orange;">Change Password</h1> <hr style="color: brown;">
                <form action="cpass.jsp" method="post">
                 
                 <p> <input type='text' tabindex="1"  name="t4" id="pwd" placeholder="College ID*" />
                </p>    
                <p> <input type='password' tabindex="1"  name="t1" id="pwd" placeholder="Old Password*" />
                </p>
                 <p> <input type='password' tabindex="1"  name="t2" id="pwd" placeholder="New Password*" />
                </p>
                
                <p> <input type='password' tabindex="1"  name="t3" id="pwd" placeholder="Confirm New Password*" />
                </p>
                <input type="submit" id="button"  name="submit" value="Submit" />
                </form>
            </div>
                
        </div>
    </body>
</html>
