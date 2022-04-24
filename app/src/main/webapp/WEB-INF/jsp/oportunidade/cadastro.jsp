<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Oportunidade</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastramento de oportunidade</h2>
		<form action="/oportunidade/create" method="post">
			<div class="mb-3 mt-3">
				<label>Descrição:</label> <input type="text" class="form-control"
					placeholder="Entre com descrição da vaga" name="descricao">
			</div>
			<div class="checkbox">
				<label> <input type="checkbox" name="transporte">
					Transporte:
				</label>
			</div>
			<div class="checkbox">
				<label><input type="checkbox" name="planoSaude">
					Plano Saúde :</label>
			</div>
			<div class="checkbox">
				<label> <input type="checkbox" name="alimentacao" checked
					value="true"> Alimentação:
				</label>
			</div>

			<div class="mb-3 mt-3">
				<label>Empresa:</label> <select name="empresa.id"
					class="form-control">
					<c:forEach var="o" items="${listaEmpresas}">
						<option value="${o.id}">${o.nome}</option>
					</c:forEach>
				</select>
			</div>

			<div class="mb-3 mt-3">
				<label>Talentos:</label>
				<div class="checkbox">
					<c:forEach var="t" items="${listaTalentos}">
						<label> <input type="checkbox" value="${t.id}"
							name="idsTalentos" checked> ${t.nomeArtistico}
						</label>
					</c:forEach>
				</div>
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>