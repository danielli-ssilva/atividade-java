<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gêneros: Lista</title>
</head>
<body>
    <h1>Lista de gêneros</h1>
    <a href="/generos/insert">Novo gênero</a>
    <ul>
        <c:forEach var="item" items="${generos}">
            <li>
                ${item.nome} | 
                <a href="/generos/update?id=${item.id}">Editar</a> |
                <a href="/generos/delete?id=${item.id}">Remover</a>
            </li>
        </c:forEach>
    </ul>
</body>
</html>