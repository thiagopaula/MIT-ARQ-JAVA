<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Talento</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container mt-3">
		<h2>Cadastramento de ator</h2>
		<form action="/ator" method="get">
			<button type="submit" class="btn btn-primary">Novo
				ator</button>
		</form>

		<c:if test="${not empty listaTalento}">
			<p>Listagem de atores (${listaTalento.size()}):</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome Completo</th>
						<th>Nome Artistico</th>
						<th>Salário</th>
						<th>Descricao do cargo</th>
						<th>Programa</th>
						<th>Desconto</th>
						<th></th>

					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${listaTalento}">
						<tr>
							<td>${item.id}</td>
							<td>${item.nomeCompleto}</td>
							<td>${item.nomeArtistico}</td>
							<td>${item.valor}</td>
							<td>${item.descricao}</td>
							<td>${item.programa}</td>
							<td>${item.desconto}</td>
							<td><a href="/ator/${item.id}/delete">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty listaTalento}">
			<p>Não encontrado:</p>
		</c:if>
	</div>
</body>
</html>