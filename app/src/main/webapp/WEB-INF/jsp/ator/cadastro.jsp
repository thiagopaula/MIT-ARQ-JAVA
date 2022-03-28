<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Talento</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	
	<div class="container mt-3">
  <h2>Cadastramento de talento</h2>
  <form action="/ator/create" method="post">
    <div class="mb-3 mt-3">
      <label>Descri��o:</label>
      <input type="text" class="form-control" placeholder="Entre com o nome do talento" name="descricao">
    </div>   
    <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
</div>
	
	
</body>
</html>