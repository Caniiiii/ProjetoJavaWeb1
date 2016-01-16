<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Usuarios</title>
</head>
<body>
	<h1>Lista de Usuarios</h1>


	<table border="1px" cellpadding="0" cellspacing="0">
		<thead>
			<tr>
				<th width="10%">id</th>
				<th width="15%">Nome do Usuario</th>
				<th width="10%">Senha</th>
				<th width="10%">Perfil</th>
				<th width="10%">Acao</th>
			</tr>
		</thead>
		<c:forEach var="usuario" items="${usuarios}">

			<tbody>
				<tr>
					<td>${usuario.id}</td>
					<td>${usuario.userName}</td>
					<td>${usuario.senha}</td>
					<td>${usuario.perfil}</td>
					<td><a
						href="${pageContext.request.contextPath}/usuario/edita/${usuario.id}.html">Edit</a><br>
						<a
						href="${pageContext.request.contextPath}/usuario/delete/${usuario.id}.html">Delete</a><br>
					</td>
				</tr>
		</c:forEach>

		</tbody>

	</table>

	<p>
		<a href="${pageContext.request.contextPath}/adminPage.html">GestaoHome</a>
	</p>
</body>
</html>