<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Songs and Search for an Artist</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div class = "container">
		<nav>
			<p><a href = "/lookify/new">Add New</a> | <a href = "/lookify/topTen">Top Ten</a>
			<form class = "float-right" action = "/lookify/search">
				<input type = "text" name = "artist">
				<button class = "btn btn-primary">Search Artists</button>
			</form>
		</nav>
		<table class = "table table-dark">
			<thead>
				<tr>
					<td>Title</td>
					<td>Artist</td>
					<td>Rating</td>
					<td>actions</td>
				</tr>
			</thead>
			<tbody>
			<c:forEach items = "${songs}" var = "song">
				<tr>
					<td><a href = "/lookify/${song.id}">${song.title}</a></td>
					<td>${song.artist}</td>
					<td>${song.rating}</td>
					<td><a href = "/lookify/delete/${song.id}">Delete</a></td>	
				</tr>
			</c:forEach>	
			</tbody>
		</table>
	</div>
</body>
</html>