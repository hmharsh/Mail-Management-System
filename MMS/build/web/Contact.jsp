<%-- 
    Document   : Contact
    Created on : Feb 10, 2016, 10:25:58 PM
    Author     : Harshit
--%>




<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "pck.contact"%>
<%@page import = "pck.javaclass"%>
<!DOCTYPE html>
  <%   contact ob=new contact(); 
               
            
                 ResultSet rs=ob.getall();
            %>
<html>
    <head>
        <title>Daily UI - Day 1 Sign In</title>

	<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700|Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>

	<link rel="stylesheet" href="css/animate.css">
	<!-- Custom Stylesheet -->
	<link rel="stylesheet" href="css/style.css">

	<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact</title>
      <link href="mycss.css" rel="stylesheet" type="text/css"/>
             

         <script>
           
             function addi()
             {
              document.getElementById("i2").style.display = "none";
              document.getElementById("but").value="Save";
             document.getElementById("i1").style.display = "none";
             document.getElementById("adnewgrp").style.display = "block";
           document.getElementById("r1").style.display = "none";
        document.getElementById("r2").style.display = "none";
        document.getElementById("contac").action = "csaved.jsp";  
    
    document.contact.chk.value="1";
         document.getElementById("cnam").display = "none";
       document.getElementById('cnam').style.visibility = 'visible';
    document.getElementById('lblnam').style.visibility = 'visible';
    }

    function addgrp()
    {
//empty id = grpx
 document.getElementById("grpx").value="";

 document.getElementById("r1").style.display = "block";
    document.getElementById("r2").style.display = "block";
       document.getElementById("r3").style.display = "none";       
          document.getElementById("adnewgrp").focus();
    }
    function savegr()
    {
         document.getElementById("r1").style.display = "none";
        document.getElementById("r2").style.display = "none";
        document.getElementById("r3").style.display = "block";
        
        var zz=document.getElementById("grpx").value;
        if(zz!=="")
            {
      var z = document.getElementById("grpn");
         var option = document.createElement("option");
         option.text = zz;
         z.add(option);
            }
      else{
          alert("Enter Valid group name");
      }
            
        
    }
    
    function done()
    {
        document.getElementById("r1").style.display = "none";
        document.getElementById("r2").style.display = "none";
        document.getElementById("r3").style.display = "block";
        
    }
    function checkgrpnam()
    {
        
          var e = document.getElementById("grpn");
           var x = document.getElementById("grpn").length;
          //  var usn = obj.clusn;
           // var pwd= obj.clpwd;
          var usn=document.grpnamsave.groupname.value;
        
           
           var i=0;
             var j=0;
            for (i = 0; i < x; i++)
             {
              if((usn === e.options[i].value))
                   {
                       
                                       j=1;
                                     
                   }
              }
if(j===1)
    {
    
 alert("Please Select Another Group Name , this Group name has already taken");
 document.getElementById("grpx").value="";
        }
        
        
        
       
    }
    
    function loaddata()
    {
        var e = document.getElementById("nam");
var strUser = e.options[e.selectedIndex].value;

document.getElementById("cnam").value = strUser;
      <%  
                 ResultSet rr=ob. getoneset();
                 
            %>
                     var strUser = e.options[e.selectedIndex].value;
                     var options= document.getElementById('c1').options;
    var nn= options.length;
        for (var ii= 0 ; ii<nn; ii++) {
    if (options[ii].value===strUser) {
     //   options[ii].selected= true;
        break;
        } }
    
  //alert(ii);
      // document.getElementById("grpn").selectedIndex = ii;          
             document.getElementById("c2").selectedIndex = ii; 
            var ez = document.getElementById("c2");
var p = ez.options[ez.selectedIndex].value;
   document.getElementById("cemail").value = p;
   
document.getElementById("c3").selectedIndex = ii;
 var ezz = document.getElementById("c3");
var pz = ezz.options[ez.selectedIndex].value;


  var optionss= document.getElementById('grpn').options;
    var nnn= optionss.length;
        for (var iii= 0 ; iii<nnn; iii++) {
    if (options[iii].value===pz) {
     //   options[ii].selected= true;
     document.getElementById("grpn").selectedIndex = iii;
        break;
        } }

    

          
    }
    
    
    
    
              function checkem()
            {
                //alert("1");
                
                
                
                var e = document.getElementById("myemail");
           var x = document.getElementById("myemail").length;
          //  var usn = obj.clusn;
           // var pwd= obj.clpwd;
          var eemai=document.myForm.txtemail.value;
        
           
           var i;
             var j=0;
            for (i = 0; i < x; i++)
             {
              if((eemai === e.options[i].value))
                   {
                       
                                       j=1;
                                     
                   }
              }
if(j===1)
    {
    
 alert("Please Select Another E-mail ,this E-mail has already taken");
 document.getElementById("emid").value="";
        }
                

   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    function loadgrp()
    { var co= document.cookie;
    
                
        <% 
                
                 ResultSet r=ob.getgrpnam();
                 
            %>
                    
                    
                    
         
          var ee = document.getElementById("druid");
          xe = document.getElementById("druid").length;
        var ff = document.getElementById("c3");
           
           var uie=document.cookie; 

           var fe = document.getElementById("drname");
           var grpna1 = document.getElementById("grpn1");
           var drname = document.getElementById("nam");
           var ie;
       
         
            for (ie = 0; ie < xe; ie++)
             {

              if(uie === ee.options[ie].value)
                   {
                    // alert(1);
                        var option = document.createElement("option");
                       option.text = fe.options[ie].value;
                       drname.add(option);
                       
                       
                          var option = document.createElement("option");
                       option.text = ff.options[ie].value;
                       grpna1.add(option);
                   
                   //    drnam.options.add=e.options[i].value;
                                     //  j=1;
                                  
                   }
              }
//now sorting distinct values
    var i,j,n;
         var n = document.getElementById("grpn1").length;
           var h = document.getElementById("grpn1");
              var m = document.getElementById("grpn");
          
      // alert(n);
        for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                    {
                        if(h.options[i].value === h.options[j].value)
                            {
                                break;
                            }
                    }
                    //now add in grpid2
                    if(i===j)
                        {
                          var option = document.createElement("option");
                          option.text = h.options[j].value;                    
                           m.add(option);
                        }
            }             
    }
             function validate()
             
             {
                 var cc=0;
                 var y = document.forms["contact"]["txtcname"].value;
                 if (y === null || y === "") {
                 alert("Name must be filled out");
            cc=1;    
            return false;}
                 var x = document.forms["contact"]["group"].value;
                 if (x === null || x === "") {
            cc=1;     
            alert("Group name must be filled out");
                 return false;}
                  var z = document.forms["contact"]["txtcemail"].value;
                  if (z === null || z === "") {
            cc=1;     
            alert("email Must be selected or Create A group First");
                
            return false;
                  }
         /*  var x = document.forms["contact"]["txtcemail"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
          cc=1;
        return false;
    }*/
              
  if(cc===0)
          {
      <%
  contact obj=new contact();               

//obj.id=
obj.name =(request.getParameter("txtcname"));
obj.email =(request.getParameter("txtcemail"));
obj.group =(request.getParameter("group"));
                          
      %>        }
              }
        </script>
      
    
    </head>
    <body onload="loadgrp();">
        
      <!--  <bodyb onload="loadgrp();">
	<div class="container">
		<div class="top">
			<h1 id="title" class="hidden"><span id="logo">Daily <span>UI</span></span></h1>
		</div>
		<div class="login-box animated fadeInUp">
			<div class="box-header">
				<h2>Log In</h2>
			</div>
			<label for="username">Username</label>
                        <a href="sendmail.jsp"><span>Send Mail</span></a>
			<br/>
      
			<input type="text" id="username">
			<br/>
			<label for="password">Password</label>
                        <a href="Contact.jsp"><span>Contact</span></a>
			<br/>
			<input type="password" id="password">
			<br/>
			<button type="submit">Sign In</button>
			<br/>
			<a href="#"><p class="small">Forgot your password?</p></a>
		</div>
	</div>
</body>-->

                 <nav id="nav">	
	<ul>		
		<li>
                   
			<a href="sendmail.jsp"><span>Send Mail</span></a>
		</li>
		<li>
                    <a href="Contact.jsp"><span>Contact</span></a>
		</li>
		<li>
			<a href="inbox.jsp"><span>Inbox</span></a>
		</li>
		<li>
			<a href="sent_mail.jsp"><span>Sent Mails</span></a>
		</li>
                 
		
                <li>
			<a href="index.jsp"><span>Logout</span></a>
		</li>
	</ul>
</nav> 
       

        <form name="contact" id='contac' action="csaved.jsp" method="POST"  onsubmit="return validate();" >
            <select name="sortedgrp" id="grpn1" class="hidden">
            </select>
         
          <div>
              <!--<input type="button" value="Add More New Contact" name="add" onclick="addi();"/>-->
             <br/> <input type="button" id="updateid" value="Update Saved Contacts" name="Manage" onclick="manage();"/>
            <table border="0" align="center">
               
                <tbody>
                    <tr class="hidden" id="i1">
                    <td>Contact_name</td>    
                    <td><select id="nam" name="con_name" onchange="loaddata();">

                        </select></td>    
                    </tr>
                    <tr class="hidden" id="i2">
                         <td></td>    
                         <td><input class="hidden" type="button" value="Select" name="con_select"  onclick="loaddata();"/><br/></td>    
                    </tr>
                    
                    <tr>
                        <td id="lblnam">Name</td>
                        <td><input type="text" required="required" name="txtcname" id='cnam' placeholder="name of new contact" value="" size="50"  onblur="checkcon();" /></td>
                    </tr>
                    <tr>
                        <td>E-mail</td>
                        <td><input type="text" required="required" name="txtcemail" id='cemail' placeholder="mms email address of contact" onkeypress='return event.charCode >= 48 && event.charCode >= 57' value="" size="50" />@mms.com</td>
                    </tr>
                    <tr>
                        <td >Group</td>
                        <td><select id="grpn" name="group" lemgth="50" >
                              
                                
                                
                                
              


                            </select>
                       
                            <input type="button" id="adnewgrp" value="Add New Group" name="addnew" onclick="addgrp();" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            
                            </td>
                            <td>
                               
                                
                                
                            </td>
                        
                    </tr>
                    <tr id="r3">
                        
                        <td>
                            <input type="text" class='hidden' id='ch' name="chk" value="1" size="5" />
                            <input type="text" class="hidden" name="coockie" id="myText" value="" size="50" /></td>
                        <td><input  type="reset" value="clear" name="con_clear" />
                           <input id="but" type="submit" value="Save" name="con_save"  />
                      
                        </td>
                    </tr>
                </tbody>
            </table>    
                 
                 
                 
                 
                 
                 
                 
                 <!-- hidden portion of drop down box-->
 
 <select id="druid" class="hidden">
        <%
                   while(rs.next())
             {%>
                  <option><%=rs.getString("uid")%></option>
             <% }                        
        %>
 </select>
  <% rs=ob.getall();%>
 <select id="drname" class="hidden">
    
     <%
   
                   while(rs.next())
             {%>
                  <option><%=rs.getString("cname")%></option>
             <% }                        
        %>
 </select>
 
                 
                 
                 
                 
                 
                 
        </form>
  
        </div>
                 
               <div>
                                  <!--  <form name="grpnamsave" action="grpsaved.jsp" method="POST">-->
                                 
                                    <table align="center">
                                        
                    <tr align="center" id="r1" class="hidden">
                        <td></td>
                        <td>Group Name</td>
                        <td><input type="text" id="grpx" placeholder="Name Of new group here" name="groupname" value="" size="42" onblur="checkgrpnam();"/></td>
                        </tr>
                           <tr id="r2" class="hidden">
                       
                        <td><input type="Submit" id="abc" value="Save group name"  name="savegrp" onclick="savegr();"/>
                        <input type="button"  value="Do not Save" name="savegrp" onclick="done();"/>
                        </td>
                        </tr>
                         
                            
                                        </table>
                                  <div align="center"><a href="contactinfo.jsp" align="center"><span>Contact Info</span></a></div>
                                  <script language="javascript"> 

document.getElementById('grpx').addEventListener('keypress', handlePress);
document.getElementById('myInput2').addEventListener('keypress', handlePress);

function handlePress(evt) 
{
    if( evt.keyCode == 13 )
    {
        // execute your function here
       document.getElementById("abc").focus();
 // console.log('Enter pressed while in desired text input')
    }
}
</script>
                                  
                                  
                                      <!-- </form>-->
                                    </div>   
                 
       <script>
               
                var x= document.cookie;
                document.getElementById("myText").value = x;
                </script>
                
                
                
        
                
                
                
                
                
                
                
                <div class='hidden'>
                
            
<select id="c1" align="center" name="user1" >
<%
                   while(rr.next())
                {%>
     <option><%=rr.getString("cname")%></option>
      <%}
%>
 </select>
<%
    rr=ob.getoneset();
 %>
 <select id="c2" align="center" name="user2"  >
<%
                   while(rr.next())
                {%>

      <option><%=rr.getString("email")%></option> 
      <% 
                            }
%>
 </select>
 <%
    rr=ob.getoneset();
     
%>
 <select id="c3" align="center" name="user2"  >
<%
                   while(rr.next())
                {%>

      <option><%=rr.getString("groupn")%></option> 
      <% 
                            }
%>
 </select>
                
                </div>
                
 
 
 

 
         
       <script>
               
               
              function checkcon()
         {
                  //to check contact name wather already same present in database
             //check new name with elements of dropdown id=nam
             // form name=txtcname,element name=txtcname of actual input box & id=cnam
             var conu = document.getElementById('cnam').value;
             //conu=new contact number Entered by user
       
             
             
             
                
             
             
          var ee = document.getElementById("nam");
          xe = document.getElementById("nam").length;
      //alert(1);    
           var ie;
            for (ie = 0; ie < xe; ie++)
             {

              if(conu === ee.options[ie].value)
                   {
                       
                     alert("Contact Name Already Used in your Contact Please Select Another Contact Name");
                       document.getElementById('cnam').value="";           
                   }
              }
             
             
             
        
             
             
             
             
             
             
             
             
    
    }
               
             //  var ee,xe;
                            function manage()
             { 
                 
                 
                 
                

     
             document.getElementById("i2").style.display = "block";
             document.getElementById("but").value="Update";
             document.getElementById("i1").style.display = "block";
             document.getElementById("adnewgrp").style.display = "none";
        document.getElementById("r1").style.display = "none";
        document.getElementById("r2").style.display = "none";
        document.getElementById("contac").action = "UPDATE.jsp";   
        document.contact.chk.value="0";
             document.getElementById("cnam").display = "none";
              document.getElementById('cnam').style.visibility = 'hidden';
              document.getElementById('lblnam').style.visibility = 'hidden';
    document.getElementById('updateid').style.visibility = 'hidden';
      




    }
               </script>
                
  <%

javaclass me=new javaclass();
//obj.clusn=(request.getParameter("txtuser"));
//obj.clpwd = (request.getParameter("txtpass"));
 ResultSet rme=me.check();
%>              
                
                
                
                
                
    </body>
     
</html>
