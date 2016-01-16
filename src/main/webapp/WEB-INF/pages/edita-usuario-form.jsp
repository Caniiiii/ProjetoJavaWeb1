<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edite o Usuario</title>
</head>
<body>
	<h1>Pagina de edicao de usuarios</h1>
	<p>${message}</p>
	<form:form method="POST" commandname="usuario" modelAttribute="usuario"
		action="${pageContext.request.contextPath}/usuario/edita/${usuario.id}.html">
		<table>
			<tbody>
				<tr>
					<td>Nome do Usuario:</td>
					<td><form:input path="userName"></form:input></td>
				</tr>
				<tr>
					<td>Senha:</td>
					<td><form:input type="password" path="senha"></form:input></td>
				</tr>
				<tr>
					<td><input type="submit" value="Editar"></td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</form:form>

	<p>
		<a href="${pageContext.request.contextPath}/adminPage.html">GestaoHome</a>
	</p>
</body>
</html>