<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages Table and Add</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div class = "container">
		<table class = "table table-dark">
			<thead>
				<tr>
					<td>Name</td>
					<td>Creator</td>
					<td>Version</td>
					<td>action</td>
				</tr>
			</thead>
			<tbody>
			<c:forEach items = "${allLanguages}" var = "language">
				<tr>
					<td><a href = "/languages/${language.id}">${language.name}</a></td>
					<td>${language.creator}</td>
					<td>${language.currentVersion}</td>
					<td><a href = "/languages/edit/${language.id}">Edit</a> | <a href = "/languages/delete/${language.id}">Delete</a></td>
				</tr>
			</c:forEach>	
			</tbody>
		</table>
		<form action = "/languages" method = "POST">
			<div class = "form-group">
				<c:forEach items = "${errors}" var = "err">
					<p>${err}</p>
				</c:forEach>
				<label for ="name">Name</label>
				<input type = "text" name = "name">
			</div>
			<div class = "form-group">
				<c:forEach items = "${errors}" var = "err">
					<p>${err}</p>
				</c:forEach>
				<label for ="creator">Creator</label>
				<input type = "text" name = "creator">
			</div>
			<div class = "form-group">
				<label for ="currentVersion">Version</label>
				<input type = "text" name = "currentVersion">
			</div>
			<button>Submit</button>
		</form>
	</div>
</body>
</html>