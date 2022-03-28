<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<h2>Cadastramento de apresentador</h2>
		<form action="/apresentador/create" method="post">

			<div class="mb-3 mt-3">
				<label>Nome completo:</label> <input type="text"
					class="form-control" placeholder="Entre com o nome do completo"
					name="nomeCompleto">
			</div>

			<div class="mb-3 mt-3">
				<label>Nome artistico:</label> <input type="text"
					class="form-control" placeholder="Entre com o nome artistico"
					name="nomeArtistico">
			</div>

			<div class="mb-3 mt-3">
				<label>Descrição:</label> <input type="text"
					class="form-control" placeholder="Entre com a descrição do cargo apresentador"
					name=descricao>
			</div>

			<div class="mb-3 mt-3">
				<label>Salario bruto:</label> <input type="text"
					class="form-control" placeholder="Entre com o salario bruto"
					name="valor">
			</div>

			<div class="mb-3 mt-3">
				<label>Programa:</label> <input type="text" class="form-control"
					placeholder="Entre com o nome do programa" name="programa">
			</div>

			<div class="mb-3 mt-3">
				<label>Desconto:</label> <input type="text" class="form-control"
					placeholder="Entre com o desconto" name="desconto">
			</div>


			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>


</body>
</html>