<%-- 
    Document   : mail
    Created on : Feb 19, 2016, 11:25:13 PM
    Author     : Harshit
--%>
<%@page import = "pck.mai"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,javax.mail.*"%>
<%@ page import="javax.mail.internet.*,javax.activation.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<!DOCTYPE html>
   <%
mai obj=new mai();   


obj.time=(request.getParameter("dateval"));

obj.by =(request.getParameter("txtsenderemail"));
obj.msg =(request.getParameter("Msg"));
obj.sub=(request.getParameter("ti_subject"));
out.println(obj.time);


    obj.to =(request.getParameter("ti_to"));
    obj.insert();

      %>
  
      
      
  

      
      
      
      
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <script>
            function redirect()
            {
                  window.location="sendmail.jsp";
            }
        </script>
    <body onload="setTimeout(redirect, 1500)">
        
        <h1>Mail Sent</h1>
        <p align="center">

</p>
    </body>
</html>
