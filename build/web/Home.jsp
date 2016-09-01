<%-- 
    Document   : Home
    Created on : Jan 17, 2016, 2:14:39 PM
    Author     : Sonu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    if ((session.getAttribute("a3") == null) || (session.getAttribute("a3") == "")) {
      response.sendRedirect("index.jsp"); }  
%>

<html>
<head>
<title>ecoRides-Let's Share</title>


<style type="text/css">  </style>


<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6/jquery.min.js"></script>

	<script src="core.js"></script>


<script src="script.js" type="text/javascript"></script> 
<link rel="stylesheet" href="css/style1.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style2.css" type="text/css" media="all">
<script src="smoothscroll.js"></script>
</head>
<body >


<div id="a1">

<div id="a2">
</div>

<div id="a3">

<div id="a4">
<div id="a5">
<div style="height:100%;width:60%;float:left;">
<img src="images/logo3d.gif" id="logo"> 
</div>

<div style="height:100%;width:40%;float:left;">



 

<a href="#" class="button"><div style="color:#A9A9A9;border-right: 1px solid black;float:left;margin-top:3%;height:20%;width:23%;background-color:white;text-align:center;">
        <div style="color:#A9A9A9;text-align:center;padding-bottom:20%;font-size:3.7vw;font-size:3.7vh;text-decoration:none;">Support</div> <div id="loginScreen"> <a href="#" class="cancel" style=" background-color: 0066ff;" >&times;</a>

<h1 style="font-size:150%;text-align:center;color:0066ff;">Change Password</h1>


<hr style="background-color:0066ff;">


<form name="frm2" action="Chpass" method="post" onsubmit="return Validate()">

<p> <input type='password' tabindex="1"  name="t9" id="pass" placeholder="Old Password*" />
                </p>
                
                <p> <input type='password' tabindex="1"  name="t8" id="pass" placeholder="New Password*" />
                </p>

<p> <input type='password' tabindex="1"  name="t10" id="pass" placeholder="Confirm New Password*" />
                </p>

 <input type="submit" id="button1"  name="submit" value="Change" />

</form>

 </div> 


<div id="cover" ></div>
             
            </div></a>

             
            

<a href="#"><div style="margin-left:1.3vw;padding-right:1.3vw;color:#A9A9A9;border-right: 1px solid black;float:left;margin-top:3%;height:20%;width:20%;background-color:white;text-align:center;">
         <div style="color:#A9A9A9;text-align:center;padding-bottom:20%;font-size:3.7vw;font-size:3.7vh;text-decoration:none;">Careers</div></div></a>

<a href="#"><div style="margin-left:1.2vw;padding-right:0px;color:#A9A9A9;float:left;margin-top:3%;height:20%;width:40%;background-color:white;text-align:center;">
         <div style="color:#A9A9A9;text-align:center;padding-bottom:20%;font-size:3.7vw;font-size:3.7vh;text-decoration:none;"> How it works</div></div></a>


         
      <div id="profile">
        <ul id="navl">
            <li><a href="#">Welcome, <%=session.getAttribute("uname")%></a>
                <div>
                    <ul>
                        <li><a href="profile.jsp">Profile</a></li>
                        <li><a href="#loginScreen">Change Password</a></li>
                        <li><a href="logout.jsp">Logout</a></li>
                        
                    </ul>
                </div>
                </div>
                
                 <a href="profile.jsp"> <div style="float:right;position: relative;height:7vh;width:5vw;margin-top: 4.5vh;">
    <img src="<%=session.getAttribute("img")%>" width="46vw" height="46vh" alt="" class="myAvatar" style="position:absolute; top:0; left:0; z-index:1;" />
    
</div></a>
                
</div>

</div>

<div id="example" >


        <ul id="nav">
            <li><a href="#home">Home</a></li>
            <li><a href="#about">About us</a>
                
            </li>
            <li><a href="#services">Contact us</a>
               
            </li>
            
        </ul>
   



                   
</div>
</div>



<div id="a6">
    

            
            
            <section id="home">
                
                
                
                <a href="need.jsp">  <img src="images/nr.jpg" name="slide" id="need"></a>
                <a href="share.jsp">  <img src="images/sr.jpg" name="slide" id="share"></a><hr>
                <h2 style="text-align: center;">Ride History</h2>
                
                
                   
                   
                 
<%
  
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

%>
 <div  style="border-top: 1px solid black;border-bottom: 1px solid black;text-align: left;padding-left: 20%;font-size: 1.5vh;font-size: 1.5vw;height:16%;width:60%;float:left;background-color: #00FFFF;margin-left: 10%;">
    
     <%=rs.getString("frm") %>&nbsp; &rarr; &nbsp;
    <%=rs.getString("tooo") %><br>
   Date -  <%=rs.getString("dat") %> , <%=rs.getString("hour") %>:<%=rs.getString("min") %>
    <%=rs.getString("tim") %><br>
    Vehicle Type -  <%=rs.getString("vehicle") %><br>
   Price per Seat - Rs <%=rs.getString("price") %>
    
    
     </div>
        <%

}
%>
   
    <%
    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }




%> 
                   
                   
                   
                   
              


            </section>

             <section id="about"style="height:110%;width:100%;background:url(images/contact.jpg)  center top;">
        
            <img src="images/c.jpg" style="width:100%;height:15%;"> 


            

             <div class="box effect7">
	<h1>About us</h1>
        <p  style="padding: 3%;font-size:4vw;font-size:4vh; color :#669900; ">ecoRides is a web application which is taken into account by the students of DIT University, designed and functioned by Shorya, Sonu and Priya. 
This web application provide access of information regarding pollution control premises and your convinience to go easy with 
your hasty schedule by saving time and it also give us the  capacity to quickly go after the whole exome.It is also a 
web application which will shoot two birds with single arrow as this helps in pollution control as well as it helps in rise 
in growth of economy of a country.</p>
        
</div>
            
   
            </section>

            <section id="services" style="height:130%;width:100%;background:url(images/contact.jpg)no-repeat  center top;color: #669900;">
                <img src="images/c.jpg" style="width:100%;height:15%;"> 


            

            <div class="box1 effect7">
               
                <h1>Contact us</h1>
        
        
                <form name="contactForm" method="get" action="" >


<table>
		<tr>
		<td style="color:#669900;font-size: 1.9vh;font-size: 1.9vw;">Full name:&nbsp;&nbsp;
		</td>
		<td>
                    <input type="text" name="fullName" value=" " style="border-color:#669900;width:40%;font-size: 1.3vh;font-size: 1.3vw;" />
		</td>
	</tr>
	<tr>
		<td style="color:#669900;font-size: 1.9vh;font-size: 1.9vw;">Email address:&nbsp;&nbsp;
		</td>
		<td>
			<input type="text" name="email" value=""  style="border-color:#669900;width:40%;font-size: 1.3vh;font-size: 1.3vw"/>
		</td>
	</tr>
		
	<tr>
		<td style="color:#669900;font-size: 1.9vh;font-size: 1.9vw;">Your message:&nbsp;&nbsp;
		</td>

<td>
			<textarea name="msgBody" rows="5" cols="70"  style="border-color:#669900;"></textarea>
		</td>
	</tr>
	<tr>
		<td>
		</td>
		<td>
			<input type="submit" name="submit" value="Send"  style="height:40px;width:20%;font-size: 1.9vh;font-size: 1.9vw;background-color: #e68a00;opacity:1;"/>
		</td>
	</tr>
</table>
</form>
                <div  style="width:50%;float:left;height:35%;color:#669900;">
                    <h2 align="center">Contact Details</h2>
                    <img src="images/conticon.jpg" style="margin-left: 5%;height:20px;width:20px;">&nbsp;&nbsp 9572254776, 9457948535, 8439585405<br>
                    <img src="images/conticon1.png" style="margin-left: 5%;height:23px;width:23px;">&nbsp;&nbsp support@ecorides.co.in
                    
                </div>
                <div align="center" style="width:50%;float:left;height:35%;">
                    <img src="images/imgcont.jpg"> 
                </div>
        
                    
</div>
                
                <div style="width:100%;height:20%;float:bottom;background-color: blue;"></div>
            
            </section>
           
           
        </div>
        </div>

<div id="a7">
</div>

</div>



<div class="feedback">

	<a id="feedback_button">Feedback</a>

	
	<div class="form">

<form>
			Name*<br>
                        <input type="text" style="height:30px;width:200px;"><br><br>

			Email ID*<br>
                        <input type="text" style="height:30px;width:200px;"><br><br>
                Message*
		<textarea name="msgBody" rows="5" cols="30"  style="border-color:#669900;"></textarea><br><br>
		<input type="button" value="Send" id="submit_form" style="height:30px;width:60px;background-color:red;color:#FFF;" />

	
</form>

</div>
</div>
</body>
</html>
