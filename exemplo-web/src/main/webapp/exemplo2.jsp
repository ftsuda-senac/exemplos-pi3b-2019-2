<%-- 
    Document   : exemplo2
    Created on : 12/09/2019, 21:35:44
    Author     : fernando.tsuda
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exemplo 2 - JSP com código Java (scriptlet)</h1>
        <p><b style="color: red">NÃO USAR ESTE RECURSO NO PROJETO</b></p>
        <%
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        %>
        <p>Data e hora de acesso: <%= formatter.format(new Date()) %></p>
        <%
            for (int i = 1; i <=100; i++) {
        %>
        <p>Item <%= i %></p>
        <%
            }
        %>
    </body>
</html>
