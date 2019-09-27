<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado - Parametros informados</h1>
        <p>Nome: <c:out value="${nome}" /></p>
        <p>Data nascimento: <c:out value="${dtNasc}" /></p>
        <p>Idade: <c:out value="${idade}" /></p>
        <hr />
        <h2>Usando expressão <code>\${param.nome}</code></h2>
        <p>Nome: <c:out value="${param.nome}" /></p>
        <p>Senha: <c:out value="${param.senha}" /></p>
        
    </body>
</html>
