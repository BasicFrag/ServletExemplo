<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Exemplo POO - Francisco</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"  crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"  crossorigin="anonymous" defer></script>
</head>
<body>
    <div class="container-fluid">
       <h1 class="display-1">Lista de funcionários</h1>
        <ul class="list-group">
        ${ServletUrl}
            <c:forEach var="funcionarios" items="${listaFuncionarios}">
                <li class="list-group-item">
                    ${funcionarios}
                </li>
            </c:forEach>
        </ul>
    </div>
</body>
</html>