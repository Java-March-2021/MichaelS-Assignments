<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo's and Ninja's</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div class = "container">
		<h2>All Dojos</h2>
		<table class = "table table-dark">
			<thead>
				<tr>
					<td>Name</td>
				</tr>
			</thead>
			<tbody>
			<c:forEach items = "${dojos}" var = "dojo">
				<tr>
					<td><a href = "/dojos/${dojo.id}">${dojo.name}</a></td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
		<a href = "/">Dashboard</a>
	</div>
</body>
</html>