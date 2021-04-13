<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top 10 Tracks</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div class = "container">
		<h1>Top 10 Songs</h1>
		<a class = "float-right" href = "/lookify/songs">Dashboard</a>
		<table class = "table table-dark"></table>
			<thead>
				<tr>
					<th>Rating</th>
					<th>title</th>
					<th>Artist</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items ="${songs}" var ="song">
				<tr>
					<td>${song.rating}</td>
					<td><a href = "/lookify/${song.id}">${song.title}</a></td>
					<td>${song.artist}</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>