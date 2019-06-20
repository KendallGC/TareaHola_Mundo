<%-- 
    Document   : hm
    Created on : 18/06/2019, 05:36:05 PM
    Author     : kcerv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hola Mundo En Web</title>
    </head>
    <body>
         <%
        for(int i = 1; i < 3; i++)
        {
        %>
        HOLA MUNDO!
        <br>
        <%
        }
        %>
    </body>
</html>
