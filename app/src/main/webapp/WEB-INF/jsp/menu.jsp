<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Capta��o de talentos</a>
		</div>
		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>

			<c:if test="${not empty usuarioLogado}">
				<li><a href="/empresas">Empresa</a></li>
				<li><a href="/apresentadores">Apresentador</a></li>
				<li><a href="/atores">Ator</a></li>
				<li><a href="/diretores">Diretor</a></li>
				<li><a href="/usuarios">Usu�rio</a></li>
				<li><a href="/talentos">Talento</a></li>
				<li><a href="/oportunidades">Vaga</a></li>
			</c:if>
		</ul>
		<ul class="nav navbar-nav navbar-right">

			<c:if test="${empty usuarioLogado}">
				<li><a href="/usuario"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="/login"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</c:if>

			<c:if test="${not empty usuarioLogado}">
				<li><a href="/logout"><span
						class="glyphicon glyphicon-log-out"></span> Logout,
						${usuarioLogado.nome}</a></li>
			</c:if>
		</ul>
	</div>
</nav>