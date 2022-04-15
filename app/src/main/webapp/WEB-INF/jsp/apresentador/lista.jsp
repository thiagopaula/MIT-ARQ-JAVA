<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Talento</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastramento de apresentador</h2>
		<form action="/apresentador" method="get">
			<button type="submit" class="btn btn-primary">Novo
				apresentador</button>
		</form>

		<c:if test="${not empty listaTalento}">
			<p>Listagem de apresentadores (${listaTalento.size()}):</p>
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
							<td><a href="/apresentador/${item.id}/delete">excluir</a></td>
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