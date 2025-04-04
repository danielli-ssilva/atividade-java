<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gêneros: remove</title>
</head>
<body>
    <h1>Remover Gênero</h1>
    <p>Tem certeza que deseja remover esse gênero <strong>${genero.nome}</strong>?</p>
    <form action="/generos/delete" method="post">
        <input type="hidden" name="id" value="${genero.id}" />
        <button type="submit">Remover</button>
    </form>
    <a href="/generos/list">Cancelar</a>
</body>
</html>