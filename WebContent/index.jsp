<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employees</title>
<link rel="stylesheet" href="resources/css/cadastro.css">
</head>
<body>
	<center>
		<h1>Employees</h1>
	</center>
	<div id="content">
		<form action="EmployerServlet" method="post">
			<div class="container">
				<input type="text" id="pes" name="cod_prod" value="${emp.name}"
					class="field-long"> <input type="submit" value="pesquisar">
				<table class="responsive-table" border="1px">
					<thead>
						<tr>
							<th scope="col">Nome</th>
							<th scope="col">Cargo</th>
							<th scope="col">Salário</th>
						<tr>
					</thead>
					<c:forEach items="${employees}" var="emp">
						<tr>
							<td style="width: 180px"><c:out value="${emp.name}"></c:out></td>
							<td style="width: 150px"><c:out value="${emp.role}"></c:out></td>
							<td style="width: 80px"><c:out value="${emp.salary}"></c:out></td>
						</tr>
					</c:forEach>
				</table>
				<input type="submit" value="Listar">
			</div>
		</form>
	</div>
</body>
</html>