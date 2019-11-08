<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Exemplo auth - login</h1>
        <c:if test="${msgErro != null}">
            <div>
                <h3><c:out value="${msgErro}" /></h3>
            </div>
        </c:if>
        <form method="post" 
              action="${pageContext.request.contextPath}/login">
            <div>
                <label>Username</label>
                <input type="text" name="username" />
            </div>
            <div>
                <label>Senha</label>
                <input type="password" name="senha" />
            </div>
            <button type="submit">Entrar</button>
        </form>
    </body>
</html>
