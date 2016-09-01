<%-- 
    Document   : index
    Created on : Jan 21, 2016, 9:19:30 PM
    Author     : Sonu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
<head>
    <title>ecoRides-Let's Share</title>
    
    
    
    
     
        
       <meta name="viewport" content="initial-scale=1.0, user-scalable=no">
    <meta charset="utf-8">
    
    <link type="text/css" rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500">
    <style>
       
     
    </style>

<style type="text/css">  </style>



<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.6/jquery.min.js"></script>

	<script src="core.js"></script>


<link rel="stylesheet" href="css/style1.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style2.css" type="text/css" media="all">
<link rel="stylesheet" href="css/style.css" type="text/css" media="all">
<script src="smoothscroll.js"></script>
<script src="script.js" type="text/javascript"></script> 
<link rel="stylesheet" href="//code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css">
<script src="//code.jquery.com/jquery-1.10.2.js"></script>
<script src="//code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
<link rel="stylesheet" href="/resources/demos/style.css">
<script>
$(function() {
$( "#datepicker" ).datepicker();
});
</script>


</head>
<body>


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

<a href="#loginScreen" class="button"><div style="color:#A9A9A9;border-right: 1px solid black;float:left;margin-top:3%;height:20%;width:23%;background-color:white;text-align:center;">
        <div style="color:#A9A9A9;text-align:center;padding-bottom:20%;font-size:3.7vw;font-size:3.7vh;text-decoration:none;">Login</div> <div id="loginScreen"> <a href="#" class="cancel" style=" background-color: 0066ff;" >&times;</a>

<h1 style="font-size:150%;text-align:center;color:0066ff;">Login</h1>
<h4>New User, <a href="index.jsp#signupScreen">Register Here</a></h4>

<hr style="background-color:0066ff;">


<form name="frm2" action="Login" method="post" onsubmit="return Validate()">

<p>
				
                    <input type="text" id="user" name="t9" placeholder="Your Email/Mobile Number*" />
                </p>

<p> <input type='password' tabindex="1"  name="t10" id="pass" placeholder="Password*" />
                </p>

 <input type="submit" id="button1"  name="submit" value="Login" />

</form>

 </div> 


<div id="cover" ></div>
             
            </div></a>

<a href="#"><div style="margin-left:1.3vw;padding-right:1.3vw;color:#A9A9A9;border-right: 1px solid black;float:left;margin-top:3%;height:20%;width:20%;background-color:white;text-align:center;">
         <div style="color:#A9A9A9;text-align:center;padding-bottom:20%;font-size:3.7vw;font-size:3.7vh;text-decoration:none;">Careers</div></div></a>

<a href="#"><div style="margin-left:1.2vw;padding-right:0px;color:#A9A9A9;float:left;margin-top:3%;height:20%;width:40%;background-color:white;text-align:center;">
         <div style="color:#A9A9A9;text-align:center;padding-bottom:20%;font-size:3.7vw;font-size:3.7vh;text-decoration:none;"> How it works</div></div></a>


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
               
<script language="JavaScript">
var i = 0;
var image = new Array();
 
// LIST OF IMAGES
image[0] = "images/c6.jpg";
image[1] = "images/c2.jpg";
image[2] = "images/c3.jpg";
image[3] = "images/c4.jpg";
image[4] = "images/c1.jpg";

function swapImage()
{
   document.slide.src = image[i];
   if(i < image.length - 1) i++; else i = 0;
   setTimeout("swapImage()",4000);
}
window.onload=swapImage;
</script>
<div stly="z-index:1;">
              <img src="images/c1.jpg" name="slide" id="slidshow"> 
               
</div>
              <div style="width: 100%;height: 13%;margin-top: -12%;z-index: 7;background-color: white;">
                  
                  <h1 style="color:red;font-size: 5vh;font-size: 5vw;">Get a Ride</h1>
                 
              </div>
              
<form name="share" action="result.jsp" method="post" onsubmit="return Sharevalid()">
    
    <div  style="height:7%;width:100%;">
    <div  style="border: 1px solid #DDD;width: 21%;float: left;height: 100%;">
        <img src="images/loc1.jpg" height="60%" width="7.7%"/>
        
     <input id="autocomplete" name="x1" onFocus="geolocate()" type="text"  placeholder="From" style="font-size: 1.5vh;font-size: 1.5vw;background-color: #DCDCDC; border: 0px solid;height: 100%;width: 90%;" > </input>
        
        </div>
        <div style="margin-left: 5%;border: 1px solid #DDD;width: 21%;float: left;height: 100%;">
        <img src="images/loc1.jpg" height="60%" width="7.7%"/>
     <input  id="autocomplete2" name="x2" onFocus="geolocate()" type="text"  placeholder="To" style="font-size: 1.5vh;font-size: 1.5vw;background-color: #DCDCDC; border: 0px solid;height: 100%;width: 90%;" > </input>
    </div>
        
         <div style="margin-left: 5%;border: 1px solid #DDD;width: 22%;float: left;height: 100%;">
        <img src="images/cal.png" height="60%" width="9.7%"/>
     <input type="text" id="datepicker" name="x3" placeholder="Date" style="font-size: 1.5vh;font-size: 1.5vw;background-color: #DCDCDC; border: 0px solid;height: 100%;width: 88.5%;" />
    </div>
        
        <div style="margin-left: 5%;width: 12%;float: left;height: 100%;">
            <input type="submit"  value="Find" style="height:100%;width: 100%;font-size: 1.9vh;font-size: 1.9vw;background-color:#e68a00;color:white; " />   
        </div>
     

    </div> 
     
     </form>

<div style="float:left;margin-left:10%;height:4%;width:50%;background-color:white;text-align:center;">

<p style="color:#e68a00;font-size:4.5vw;font-size:4.5vh;margin-left:25%;">Not Registered Yet?</p>
</div>

 <a href="#signupScreen" class="button"><div style="float:left;margin-top:3%;height:7%;width:18%;background-color:#669900;text-align:center;">
         <div style="color:white;text-align:center;padding-bottom:15px;font-size:150%;text-decoration:none;">Sign Up</div> <div id="signupScreen"> <a href="#" class="cancel" style="background-color:0066ff;">&times;</a>

<h1 style="font-size:150%;text-align:center;color: 0066ff;">Sign Up</h1><hr>



<form name="frm1" action="Signup" method="post" onsubmit="return Valid()">
                 <p>
                     <input type="text" id="name" name="t1" placeholder="First Name*" /> <input type="text" id="last" name="t2" placeholder="Last Name*" />
              </p>
            	
				<p>
				
                    <input type="text" id="email" name="t5" placeholder="Your Email*" />
                </p>

                 <p>
                     <input type="text" id="phone" name="t6" placeholder="Mobile Number*" maxlength="10" />
                </p>
                 <p> <input type='password' tabindex="1"  name="t7" id="pwd" placeholder="Password*" />
                </p>
                <p> <input type='password' tabindex="1"  name="t8" id="pwd" placeholder="Confirm Password*" />
                </p>
                <input type="submit" id="button"  name="submit" value="Submit" />
                </form>



 </div> <div id="cover" ></div>
             
            </div></a> 


            </section>

            <section id="about"style="height:110%;width:100%;background:url(images/contact.jpg)  center top;">
        
            <img src="images/c.jpg" style="width:100%;height:15%;"> 


            

             <div class="box effect7">
	<h1>About us</h1>
        <p  style="padding: 3%;font-size:4vw;font-size:4vh; color :#669900; ">ecoRides is a web application which is taken into account by the students of DIT University, designed and functioned by Shorya, Sonu and Priya. 
This web application provide access of information regarding pollution control premises and your convinience to go easy with 
your hasty schedule by saving time and it also give us the  capacity to quickly go after the whole exome.It is also a 
web application which will shoot two birds with single arrow as this helps in pollution control as well as it helps in the rise 
in growth of an economy of a country.</p>
        
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
                    <img style="height:90%;width:80%;" src="images/imgcont.jpg"> 
                </div>
        
                    
</div>
                
                <div style="width:100%;height:20%;float:bottom;background-color: blue;"></div>
            
            </section>
           
           
        </div>
        </div>

<div id="a7">
    
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
</div>

</div>


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    <script>
// This example displays an address form, using the autocomplete feature
// of the Google Places API to help users fill in the information.

// This example requires the Places library. Include the libraries=places
// parameter when you first load the API. For example:
// <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&libraries=places">

var placeSearch, autocomplete;
var componentForm = {
  street_number: 'short_name',
  route: 'long_name',
  locality: 'long_name',
  administrative_area_level_1: 'short_name',
  country: 'long_name',
  postal_code: 'short_name'
};

function initAutocomplete() {
  // Create the autocomplete object, restricting the search to geographical
  // location types.
  autocomplete = new google.maps.places.Autocomplete(
      /** @type {!HTMLInputElement} */(document.getElementById('autocomplete')),
      {types: ['geocode']});
      
      
      autocomplete2 = new google.maps.places.Autocomplete(document.getElementById('autocomplete2'), { types: [ 'geocode' ] });
google.maps.event.addListener(autocomplete2, 'place_changed', function() {
  fillInAddress();
});

  // When the user selects an address from the dropdown, populate the address
  // fields in the form.
  autocomplete.addListener('place_changed', fillInAddress);
}

// [START region_fillform]
function fillInAddress() {
  // Get the place details from the autocomplete object.
  var place = autocomplete.getPlace();

  for (var component in componentForm) {
    document.getElementById(component).value = '';
    document.getElementById(component).disabled = false;
  }

  // Get each component of the address from the place details
  // and fill the corresponding field on the form.
  for (var i = 0; i < place.address_components.length; i++) {
    var addressType = place.address_components[i].types[0];
    if (componentForm[addressType]) {
      var val = place.address_components[i][componentForm[addressType]];
      document.getElementById(addressType).value = val;
    }
  }
}
// [END region_fillform]

// [START region_geolocation]
// Bias the autocomplete object to the user's geographical location,
// as supplied by the browser's 'navigator.geolocation' object.
function geolocate() {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(function(position) {
      var geolocation = {
        lat: position.coords.latitude,
        lng: position.coords.longitude
      };
      var circle = new google.maps.Circle({
        center: geolocation,
        radius: position.coords.accuracy
      });
      autocomplete.setBounds(circle.getBounds());
    });
  }
}




// [END region_geolocation]

    </script>
    <script src="https://maps.googleapis.com/maps/api/js?v3&signed_in=true&libraries=places&callback=initAutocomplete"
        async defer></script>
        
        


        
       

</body>
</html>
