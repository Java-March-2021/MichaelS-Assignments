<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Songs</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<a href = "/lookify/songs">Dashboard</a>
	<div class = "container">
		<form:form method = "POST" action = "/lookify/new" modelAttribute = "song">
			<div class = "form-group">
				<form:label path = "title">Title
				<form:errors path = "title"/>
				<form:input path = "title"/></form:label>
			</div>
			<div class = "form-group">
				<form:label path = "artist">Artist
				<form:errors path = "artist"/>
				<form:input path = "artist"/></form:label>
			</div>
			<div class = "form-group">
				<form:label path = "rating">Rating(1-10)
				<form:errors path = "rating"/>
				<form:input path = "rating"/></form:label>
			</div>
			<button>Add Song</button>
		</form:form>
	</div>
</body>
</html>