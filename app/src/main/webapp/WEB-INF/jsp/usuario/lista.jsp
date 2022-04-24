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
		<h2>Cadastramento de usuários</h2>

		<c:if test="${not empty listaUsuario}">
			<p>Listagem de usuários (${listaUsuario.size()}):</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>E-mail</th>
						<th>Empresas</th>
						<th>Talentos</th>
						<th>Oportunidades</th>
						<c:if test="${usuarioLogado.admin}">
							<th></th>
						</c:if>

					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${listaUsuario}">
						<tr>
							<td>${item.id}</td>
							<td>${item.nome}</td>
							<td>${item.email}</td>
							<td>${item.empresas.size()}</td>
							<td>${item.talentos.size()}</td>
							<td>${item.oportunidades.size()}</td>
							<c:if test="${usuarioLogado.admin}">
								<td><a href="/usuario/${item.id}/delete">excluir</a></td>
							</c:if>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty listaUsuario}">
			<p>Não encontrado:</p>
		</c:if>
	</div>
</body>
</html>