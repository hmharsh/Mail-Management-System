<%-- 
    Document   : sendmail
    Created on : Feb 10, 2016, 7:25:26 PM
    Author     : Harshit
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import = "pck.javaclass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "pck.contact"%>
<!DOCTYPE html>
  <%   contact ob=new contact(); 
               
            
                 ResultSet rs=ob.getall();
            %>
            <%   javaclass me=new javaclass(); 
               
            
                 ResultSet rme=me.check();
            %> 
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mail</title>
   <link href="mycss.css" rel="stylesheet" type="text/css"/> 

    </head>
    <body onload="loadcon();">
        <script>
           
                document.getElementById("result").innerHTML = localStorage.getItem("lastname");
           function shcon()
           {
               //to show id= conlis
         document.getElementById("conlis").style.display = "block";
                   
        var x = document.forms["send"]["ti_to"].value;
    var atposs = x.indexOf("@");
    var dotposs = x.lastIndexOf(".");
    if (atposs<1 || dotposs<atposs+2 || dotposs+2>=x.length) {
    document.forms["send"]["ti_to"].value =" ";
      
        
       }

                     }
            </script>
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
        
     
  <script language="javascript"> 

document.getElementById('msgbox').addEventListener('keypress', handlePress);
document.getElementById('myInput2').addEventListener('keypress', handlePress);

function handlePress(evt) 
{
    if( evt.keyCode == 13 )
    {
        // execute your function here
        //console.log('Enter pressed while in desired text input')
   document.getElementById("msgbox").focus();
        }
}
</script>      
        
            <form name="send" action="mail.jsp" method="POST"  style="margin-top: -20px" onsubmit="return sendd();"  >
            <br/>  <br/>  <br/>  
            <input type="text" name="dateval" value="" id="date" size="70" class="hidden" />
           
            <table border="1" align="center">
                <tbody>
                    <tr>
                        <td>To</td>
                        <td ><input type="text" name="ti_to" placeholder="Enter space saparated Email Addresses" value="" onblur="validatemail();" id="cl" size="40" required="required" /></td>
                        <td rowspan="5">
                            <div  id="conlis" class="hidden">
                           
                             <table>
                                 <tr>
                                 <div>Group</div>
                                 <select  name="grpp" id="grpid2" onchange="ldgrp();">
                                     <option>all</option>>
                                 </select>
                                 </tr>
                                <tr>
                                    <td>
                                         <div>Contacts</div>
                                <select id="contact" name="conlist" size="10" onchange="cpycon();">
                              
                            </select>
                                        <td>
                             </tr>
                             
                           </table>
                        <div>
                        </td>
                    </tr>
                      <tr>
                        <td></td>
                        <td><input type="button" value="Contacts" name="sh_con"  onclick="shcon();"/>
            <input type="button" value="Clear" name="clear"  onclick="clr();"/></td>
                      </tr>
                    <tr>
                        <td>Subject</td>
                        <td ><input type="text"  name="ti_subject" required="required" value="" size="40"  /></td>
                    </tr>
                    <tr>
                        <td>Message</td>
                        <td  align="center"><textarea id="msgbox" maxlength="5000" required="required" name="Msg" rows="10" cols="40">
                            </textarea></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><font color="black">Max length:5000</font>   <input type="submit" id="sen" value="Send" name="b_send"  /></td>
                    </tr>
                </tbody>
            </table>

            
            
            
             <select  name="grpp" id="grpid" class="hidden">
                                 </select>
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
  <% rs=ob.getall();%>
 <select id="drgrname" class="hidden">
     <%
                   while(rs.next())
             {%>
                  <option><%=rs.getString("groupn")%></option>
             <% }                        
        %>
 </select>
 <% rs=ob.getall();%>
 <select id="dremail" class="hidden" name="em">
     <%
                   while(rs.next())
             {%>
                  <option><%=rs.getString("email")%></option>
             <% }                        
        %>
 </select>
 
                 
 <select name="temp" id="tid" class="hidden">
 </select>
 <div class="hidden">
  <select id="em" align="center" name="emai"  >
<%
                   while(rme.next())
                {%>

      <option><%=rme.getString("tbemail")%></option> 
      <% 
                            }
%>
 </select>
 
    <%     
                   rme=me.check();
    %> 
 
   <select id="iid" align="center" name="uiid"  >
<%
                   while(rme.next())
                {%>

      <option><%=rme.getString("tbuname")%></option> 
      <% 
                            }
%>
 </select>
 
 </div>
 
 
 <input type="text" id="from" name="txtsenderemail" value="" size="50" class="hidden"/>
 
 
        </form>
             
          <script>
             
              function cpycon()
              {
                  var v=document.getElementById("cl").value;
                  var mail;
                  
                  
                       var e = document.getElementById("contact");
                       var strUser = e.options[e.selectedIndex].value;
            
                      var options= document.getElementById('drname').options;
                      var nn= options.length;
                      for (var ii= 0 ; ii<nn; ii++)
                     {
                      if (options[ii].value===strUser) {
                      break;
                     }
                    }
                  
              
      
                  
                  
                  
                  
                  
                  
                    
                      var y = document.getElementById("dremail").options;
                     // alert(y[ii].text);
                      mail=y[ii].text;
                      document.getElementById("cl").value = v+" "+mail;
              
              }
              function clr()
              {
                  document.getElementById("cl").value = "";
              }
   
    
    function loadcon()
    {
    document.getElementById('date').value=Date();
       
        //id=em
        //from
        //iid
        
        
        
        
        
        
          
        
        
        
        
        
        
        
        
        
          var uie=document.cookie; 
          
          
          
          
         xe = document.getElementById("em").length;
        // alert(xe);
         var ff = document.getElementById("em");
           var ee = document.getElementById("iid");
           var ie;
            for (ie = 0; ie < xe; ie++)
                {
                   if(uie === ee.options[ie].value)
                    {
                      document.getElementById('from').value  =ff.options[ie].value; 
                    }
                }
        
        
        
        
           var ee = document.getElementById("druid");
          xe = document.getElementById("druid").length;
       
          
        
   
            var fe = document.getElementById("drname");
           
            var drnam = document.getElementById("contact");
            var temp = document.getElementById("tid");
            var ie;
           
            for (ie = 0; ie < xe; ie++)
             {
      
              if(uie === ee.options[ie].value)
                   {
                       
                         var option = document.createElement("option");
                        option.text = fe.options[ie].value;                    
                        temp.add(option);
                        var option = document.createElement("option");
                        option.text = fe.options[ie].value;          
                        drnam.add(option); 
                        
                       
                   }
              }
              
              
              
              
              
              
              
              
                var drnam = document.getElementById("grpid");
                var fe = document.getElementById("drgrname");
               for (ie = 0; ie < xe; ie++)
             {
      
              if(uie === ee.options[ie].value)
                   {
                       
                        var option = document.createElement("option");
                       option.text = fe.options[ie].value;                    
                       drnam.add(option);                                     
                   }
              }
              
              
              

        var i,j,n;
         var n = document.getElementById("contact").length;
           var h = document.getElementById("grpid");
              var m = document.getElementById("grpid2");
          
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
        
                   
                if(document.getElementById("contact").options.length>0)
                    {
                    }
                    else
                    {
                            alert("Welcome 1st time \n to start \n  1st go to contacts than start adding your few contacts \n      (email and name)with their group name(like friends family) \n   2nd come back to send mail page and start sending mail(/s)\n      to individual or in group");
         
             
                    }
               
        

    
    }
    
    
    function ldgrp()
    {
         var m = document.getElementById("tid");
       var n = document.getElementById("contact");
       var e = document.getElementById("grpid2");
var strUser = e.options[e.selectedIndex].value; 
if(strUser === "all")
    {
        //alert("all");
         xe = document.getElementById("tid").length;
         var i;
         for(i=0;i<xe;i++)
             {
              //   alert("all");
                   var option = document.createElement("option");
                          option.text = m.options[i].value;                    
                           n.add(option);
             }
    }
       else
           {
         document.getElementById("contact").options.length=0;
       
        /**/
          x = document.getElementById("tid").length;
          var nam = document.getElementById("tid");
          var grp = document.getElementById("grpid");
          var con = document.getElementById("contact");
           //uie=selected information of grpid2
             var er = document.getElementById("grpid2");
             var uie = er.options[er.selectedIndex].value;
         var nnn=document.getElementById("contact").length;
           var ie;
           var j;
            for (ie = 1; ie < x; ie++)
             {
                 
                 
  
           if( grp.options[ie].value=== uie )
                   {
                      
                        var option = document.createElement("option");
                       option.text = nam.options[ie].value;                    
                       con.add(option);   
                    
                   }
              }
             
       
       /**/
       
           }
       
       
       
       
    }
    function validatemail()
    {
       
    }
      function sendd()
              {
        var i=1;         
        var x = document.forms["send"]["ti_to"].value;
    var atpos = x.indexOf("@");
    var dotpos = x.lastIndexOf(".");
    if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
        alert("Not a valid e-mail address");
        i=0;
        return false;
    }
  if(i===1)
      {
       //  alert("success:code to send mail here");
      }       
    }
   
        
</script>
    </body>
</html>
