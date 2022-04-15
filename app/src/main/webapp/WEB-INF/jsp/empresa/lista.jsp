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
		<h2>Cadastramento da empresa</h2>
		<form action="/empresa" method="get">
			<button type="submit" class="btn btn-primary">Nova empresa</button>
		</form>

		<c:if test="${not empty listaEmpresa}">
			<p>Listagem de empresas (${listaEmpresa.size()}):</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome da empresa</th>
						<th>CNPJ</th>
						<th>E-mail</th>
						<th></th>

					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${listaEmpresa}">
						<tr>
							<td>${item.id}</td>
							<td>${item.nome}</td>
							<td>${item.cnpj}</td>
							<td>${item.email}</td>
							<td><a href="/empresa/${item.id}/delete">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty listaEmpresa}">
			<p>Não encontrado:</p>
		</c:if>
	</div>
</body>
</html>