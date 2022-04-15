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
				<label> <input type="checkbox" name="alimentacao">
					Alimentação:
				</label>
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>


</body>
</html>