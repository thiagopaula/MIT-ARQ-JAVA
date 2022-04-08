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
		<h2>Cadastramento da vaga</h2>
		<form action="/oportunidade" method="get">
			<button type="submit" class="btn btn-primary">Nova
				 vaga</button>
		</form>

		<c:if test="${not empty listaOportunidade}">
			<p>Listagem de vagas (${listaOportunidade.size()}):</p>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Descrição</th>
						<th>Transporte</th>
						<th>Plano Saúde</th>
					    <th>Alimentação</th>
						<th></th>

					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${listaOportunidade}">
						<tr>
							<td>${item.id}</td>
							<td>${item.descricao}</td>
							<td>${item.transporte}</td>
							<td>${item.planoSaude}</td>
							<td>${item.alimentacao}</td>
							<td><a href="/oportunidade/${item.id}/delete">excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</c:if>

		<c:if test="${empty listaOportunidade}">
			<p>Não encontrado:</p>
		</c:if>
	</div>
</body>
</html>