<%-- 
    Document   : contactinfo
    Created on : Feb 19, 2016, 8:39:43 PM
    Author     : Harshit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import = "pck.contact"%>
<!DOCTYPE html>
 <%   contact ob=new contact(); 
               
            
                 ResultSet rs=ob.getall();
            %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="mycss.css" rel="stylesheet" type="text/css"/>
    </head>
    <body onload="loadcon();">
       
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
       

        
        <br/>
        <script>
             function loadcon()
    { var co= document.cookie;
          var ee = document.getElementById("c0");
          var ff=document.getElementById("c1");
          var gg=document.getElementById("c2");
          var hh=document.getElementById("c3");
                  
        xe = document.getElementById("c0").length;
            var ie;
            for (ie = 0; ie < xe; ie++)
            {
                  if(co === ee.options[ie].value)
                      {
                                      //alert(1)
                                      var table = document.getElementById("myTable");
                                      var row = table.insertRow(1);
                                      var cell1 = row.insertCell(0);
                                      var cell2 = row.insertCell(1);
                                      var cell3 = row.insertCell(2);
                                       cell1.innerHTML = ff.options[ie].value;
                                       cell2.innerHTML = gg.options[ie].value;
                                       cell3.innerHTML = hh.options[ie].value;
                          
                      }
            }
     
    }
            </script>
            
            <table id="myTable" border="1" align="center">
                
                <tbody>
                <tr>
            
                 <td>
                     <b>Contact Name</b>
                 </td>
                 <td>
                     <b> E-mail</b>
                  </td>
                  <td>
                      <b>Group Name</b>
                  </td>
                 </tr>
                
          <!--  <tr>
                    <td id="cnam"></td>
                    <td id="emai"></td>
                    <td id="group"></td>
          
                  
                 </tr>-->
          
                </tbody>
            </table>

<div class='hidden'>
     
 <%
    rs=ob.getall();
 %>
 
 <select id="c0" align="center" name="user0" >
<%
                   while(rs.next())
                {%>
     <option><%=rs.getString("uid")%></option>
      <%}
%>
 </select>
 <%
    rs=ob.getall();
 %>           
<select id="c1" align="center" name="user1" >
<%
                   while(rs.next())
                {%>
     <option><%=rs.getString("cname")%></option>
      <%}
%>
 </select>
<%
    rs=ob.getall();
 %>
 <select id="c2" align="center" name="user2"  >
<%
                   while(rs.next())
                {%>

      <option><%=rs.getString("email")%></option> 
      <% 
                            }
%>
 </select>
 <%
    rs=ob.getall();
     
%>
 <select id="c3" align="center" name="user3"  >
<%
                   while(rs.next())
                {%>

      <option><%=rs.getString("groupn")%></option> 
      <% 
                            }
%>
 </select>
</div>
                

                
                
                
    </body>
</html>
