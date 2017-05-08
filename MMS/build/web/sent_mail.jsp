<%-- 
    Document   : sent_mail
    Created on : Feb 19, 2016, 8:38:42 PM
    Author     : Harshit
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import = "pck.mai"%>
<%@page import = "pck.javaclass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
   <%   mai ob=new mai(); 
               
            
                 ResultSet rss=ob.sentmail();
            %>
            
            <%

javaclass obj=new javaclass();
//obj.clusn=(request.getParameter("txtuser"));
//obj.clpwd = (request.getParameter("txtpass"));
 ResultSet rs=obj.check();
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sent mails</title>
        <link href="mycss.css" rel="stylesheet" type="text/css"/>
   <style>
       body {
 
    overflow: scroll;
}
textarea{
    overflow: scroll;
}
       </style>
    
    </head>
    <body onload="myFunction();">
      
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
       

        <table id="myTable" border="1" align="center" onload="sortemail()">
            <thead>
                <tr>
                    <th width="20%">E-mail</th>
                    <th width="15%">Subject</th>
                    <th width="25%">Time</th>
                    <th width="40%">Message </th>
                </tr>
            </thead>
            
            <tbody>
             
              
                
               
            </tbody>
        </table>
     
        <div align="center">
 <select id="email" align="center" name="user" class="hidden" >
<%while(rss.next())
                {%>

      <option><%=rss.getString("byy")%></option> 
      <% 
                            }
%>
 </select>

 <select id="too" align="center" name="usr" class="hidden" >
<%
rss=ob.sentmail();
while(rss.next())
                {%>

      <option><%=rss.getString("to")%></option> 
      <% 
                            }
%>
 </select>
  <select id="subject" align="center" name="usr" class="hidden" >
<%
rss=ob.sentmail();
while(rss.next())
                {%>

      <option><%=rss.getString("sub")%></option> 
      <% 
                            }
%>
 </select>
  <select id="time" align="center" name="user" class="hidden" >
<%rss=ob.sentmail();
while(rss.next())
                {%>

      <option><%=rss.getString("tim")%></option> 
      <% 
                            }
%>
 </select>
 <select id="message" align="center" name="user" class="hidden" >
<%rss=ob.sentmail();
while(rss.next())
                {%>

      <option><%=rss.getString("msg")%></option> 
      <% 
                            }
%>
 </select>
         
         
         
            
                
            </div>    
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            <%
    
     rs=obj.check();
%>
<div align="center">
 <select id="mySelect" align="center" name="user" class="hidden">
<%
                   while(rs.next())
                {%>

      <option><%=rs.getString("tbuname")%></option>
      
    
 
      <% 
                            }
%>


 </select>
<%
    
     rs=obj.check();
%>
 <select id="pwdid" align="center" name="user" class="hidden" >
<%
                   while(rs.next())
                {%>

      <option><%=rs.getString("tbemail")%></option> 
      <% 
                            }
%>
 </select>

            
            
           <input type="text" id="emaill" name="email" value="" size="50" class="hidden" />
           
           
           <script>
                 function myFunction()
            {
                
               
           var e = document.getElementById("mySelect");
           var x = document.getElementById("mySelect").length;
           var f = document.getElementById("pwdid");
           var i=0;
            
            
            for (i = 0; i < x; i++)
             {
               
              if(e.options[i].value===document.cookie )
                   { 
                        
                      document.getElementById("emaill").value = f.options[i].value;
                    
               
                    
               }
             }
      sortemail();
  }
            
            
            function sortemail()
            {
            //eliminatiog those rows having another by emails
             var i;
                 var ee = document.getElementById("emaill");
        var hh = document.getElementById("email");     
        var xx = document.getElementById("email").length;
        var fff=document.getElementById("too"); 
        var ggg=document.getElementById("subject"); 
        var hhh=document.getElementById("time"); 
        var iii=document.getElementById("message"); 
               for (i = 0; i < xx; i++)
             {
                
                   // alert(ee.value+"="+hh.options[i].value);  
                      
               if( ee.value === hh.options[i].value)
                     {
                                         var table = document.getElementById("myTable");
                                      var row = table.insertRow(1);
                                      var cell1 = row.insertCell(0);
                                      var cell2 = row.insertCell(1);
                                      var cell3 = row.insertCell(2);
                                      var cell4 = row.insertCell(3);
                                     cell1.innerHTML = fff.options[i].value;
                                     //  cell1.innerHTML = "hh";
                                      // alert(fff.options[i].value);
                                       cell2.innerHTML = ggg.options[i].value;
                                       cell3.innerHTML = hhh.options[i].value;
                                       cell4.innerHTML = iii.options[i].value;
            }                         
             
               

            }}
            
        </script>  
    </body>
</html>