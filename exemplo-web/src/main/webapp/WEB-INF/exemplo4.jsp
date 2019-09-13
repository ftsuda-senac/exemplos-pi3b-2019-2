<%-- 
    Document   : exemplo4
    Created on : 12/09/2019, 22:16:14
    Author     : fernando.tsuda
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exemplo 4 - Servlet + JSP em conjunto (MVC)</h1>
        <p>Data e hora de acesso: <fmt:formatDate value="${dtAcesso}" pattern="dd/MM/yyyy - HH:mm:ss"/></p>
        <c:forEach begin="1" end="100" var="i">
            <p>Item <c:out value="${i}" /></p>
        </c:forEach>
</body>
</html>
