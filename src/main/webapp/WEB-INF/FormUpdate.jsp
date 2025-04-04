<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gênero: update</title>
</head>
<body>
    <h1>Editar Gêneros</h1>
    <form action="/generos/update" method="post">
        <input type="hidden" name="id" value="${genero.id}" />
        <label>Nome do gênero</label>
        <input type="text" name="nome" value="${genero.nome}" required />
        <button type="submit">Salvar</button>
    </form>
    <a href="/generos/list">Voltar para Lista</a>
</body>
</html>