
function Sharevalid()
{
    if( document.share.x1.value == "" )
    {
        alert( "Fill the source field !" );
 document.share.x1.focus();
 return false; 
 }
 else if( document.share.x2.value == "" )
 {
     alert( "Fill the destination!" );
  document.share.x1.focus();
  return false;
   }
   else if( document.share.x3.value == "" )
 {
     alert( "Fill the date!" );
  document.share.x3.focus();
  return false;
   }
    else if( document.share.x9.value == "" )
 {
     alert( "Fill the Contact Number!" );
  document.share.x9.focus();
  return false;
   }
    else if( document.share.x10.value == "" )
 {
     alert( "Fill the price per person!" );
  document.share.x10.focus();
  return false;
   }
   else   
   return (true);
} 




function Validate()
{
    if( document.frm2.t9.value == "" )
    {
        alert( "Please provide your Email ID or Mobile Number!" );
 document.frm2.t9.focus();
 return false; 
 }
 else if( document.frm2.t10.value == "" )
 {
     alert( "Please provide your Password!" );
  document.frm2.t10.focus();
  return false;
   }
   else
   return (true);
}

function Valid()
{
    
    
    
    var emailID = document.frm1.t5.value;
    atpos = emailID.indexOf("@");
    dotpos = emailID.lastIndexOf(".");
   var val = document.frm1.t6.value;
    
    
    if( document.frm1.t1.value == "" )
    {
        alert( "Please provide your first name!" );
 document.frm1.t1.focus() ;
 return false; 
 }
 else if( document.frm1.t2.value == "" )
 {
     alert( "Please provide your last name!" );
  document.frm1.t2.focus() ;
  return false;
   }
   
   
    else if (atpos < 1 || ( dotpos - atpos < 2 ))
    { 
        alert("Please enter correct email ID") 
        document.frm1.t5.focus() ;
        return false; 
    }
    
    
    
     else if( document.frm1.t5.value == "" )
    {
        alert( "Please provide your Email ID!" );
 document.frm1.t5.focus() ;
 return false; 
 }
   
    
 
  else if( document.frm1.t6.value == "" )
    {
        alert( "Please provide your Mobile Number!" );
 document.frm1.t6.focus() ;
 return false; 
 }
   
else if (!(/^\d{10}$/.test(val))) {
    //return true;
//} 
  //    else  
    //    {  
        alert("Please provide valid mobile number"); 
        document.frm1.t6.focus() ;
        return false;  
        }  
 else if( document.frm1.t7.value === "" )
    {
        alert( "Please provide Password!" );
 document.frm1.t7.focus() ;
 return false; 
 }
 
  else if( document.frm1.t8.value === "" )
    {
        alert( "Please provide Confirm Password!" );
 document.frm1.t8.focus() ;
 return false; 
 }
   
else if( document.frm1.t7.value !== document.frm1.t8.value )
    {
        alert( "Passwords do not match!" );
 document.frm1.t8.focus() ;
 return false ; 
 }  
else   
   return (true);
} 
