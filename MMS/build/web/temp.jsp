<%-- 
    Document   : temp
    Created on : Feb 18, 2016, 3:20:10 PM
    Author     : Harshit
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "pck.contact"%>


<!DOCTYPE html>
      <%
  contact obj=new contact();   
 

obj.id=(request.getParameter("coockie"));

      %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
