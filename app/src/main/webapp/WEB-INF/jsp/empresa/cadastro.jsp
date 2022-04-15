<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp" />

	<div class="container mt-3">
		<h2>Cadastramento da empresa</h2>
		<form action="/empresa/create" method="post">
			<div class="mb-3 mt-3">
				<label>Nome:</label> <input type="text" class="form-control"
					placeholder="Entre com o nome da empresa" name="nome">
			</div>

			<div class="mb-3 mt-3">
				<label>CNPJ:</label> <input type="text" class="form-control"
					placeholder="Entre com o cnpj da empresa" name="cnpj">
			</div>

			<div class="mb-3 mt-3">
				<label>email:</label> <input type="email" class="form-control"
					placeholder="Entre com o email da empresa" name="email">
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>


</body>
</html>