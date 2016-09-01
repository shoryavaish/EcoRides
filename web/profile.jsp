<%-- 
    Document   : profile
    Created on : Jan 17, 2016, 5:59:44 PM
    Author     : Sonu
--%>

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
<img src="images/lg.png" id="logo"> 
</div>

<div style="height:100%;width:40%;float:left;">

<a href="#"><div style="margin-left:0vw;padding-right:1.3vw;color:#A9A9A9;border-right: 1px solid black;float:left;margin-top:3%;height:20%;width:20%;background-color:white;text-align:center;">
         <div style="color:#A9A9A9;text-align:center;padding-bottom:20%;font-size:3.7vw;font-size:3.7vh;text-decoration:none;">Support</div></div></a>

             
            

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
                        <li><a href="change.jsp">Change Password</a></li>
                        <li><a href="logout.jsp">Logout</a></li>
                        
                    </ul>
                </div>
                </div>
                
                
                
                <a href="profile.jsp"> <div style="float:right;position: relative;height:7vh;width:5vw;margin-top: 4.5vh;">
    <img src="<%=session.getAttribute("img")%>" width="50" height="50" alt="" class="myAvatar" style="position:absolute; top:0; left:0; z-index:1;" />
    
</div></a>
</div>

</div>

<div id="examp" >


        <ul id="na">
            <li><a href="Home.jsp">Home</a></li>
            <li><a href="#home">Profile</a></li>
            <li><a href="#about">About us</a>
                
            </li>
            <li><a href="#services">Contact us</a>
               
            </li>
            
        </ul>
   



                   
</div>
</div>



<div id="a6">

            
            
            <section id="home">
                
             
    <img src="avatar.jpg"  alt="" class="myAvatar" style="height:30vh;width:20vw;" />
    
                <div>
                <form method="post" action="Imgupload" enctype="multipart/form-data">
    <input type="file" name="photo" id="newAvatar" style="width:50px; height:50;" />
    <input type="submit" value="Upload"/>
    
    
    </form>
</div>
               
 <table style="width:100%">
  <tr>
    <td> Name</td>
    <td> <%=session.getAttribute("uname")%> <%=session.getAttribute("a1")%></td>		
  </tr>
  
  <tr></tr>
  <tr>
    <td>Email ID</td>
    <td><%=session.getAttribute("a3")%></td>		
  </tr>
  <tr></tr>
  <tr>
    <td>Mobile Number</td>
    <td><%=session.getAttribute("a4")%></td>		
  </tr>
  <tr></tr>
  
</table> 
            

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
