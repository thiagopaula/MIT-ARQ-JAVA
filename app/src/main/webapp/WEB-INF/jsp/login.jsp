<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

	<div class="container mt-3">
		<h2>Autenticação</h2>

		<c:if test="${not empty mensagem }">
			<div class="alert alert-warning">
				<strong>Problemas na autenticação! </strong>${mensagem}
			</div>
		</c:if>

		<form action="/login" method="post">
			<div class="mb-3 mt-3">
				<label>Email:</label> <input type="email" class="form-control"
					placeholder="Informe o seu e-mail" name="email" value="thiago@teste.com">
			</div>
			<div class="mb-3">
				<label>Password:</label> <input type="password" class="form-control"
					placeholder="Informe a sua senha" name="senha" value="123456">
			</div>

			<button type="submit" class="btn btn-primary">Logar</button>
		</form>
	</div>

</body>
</html>