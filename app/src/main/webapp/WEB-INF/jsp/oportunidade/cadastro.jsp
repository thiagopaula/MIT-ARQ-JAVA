<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Oportunidade</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

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