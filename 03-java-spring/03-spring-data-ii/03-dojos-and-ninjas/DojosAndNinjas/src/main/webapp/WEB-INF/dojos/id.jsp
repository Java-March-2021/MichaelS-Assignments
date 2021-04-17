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
		<h2>${dojo.name} Ninjas</h2>
		<c:if test = "${empty dojo.ninjas}">
		No Ninjas yet...
		</c:if>
		<ol>
		<c:forEach items = "${dojo.ninjas}" var = "ninja">
			<li>${ninja.firstName} ${ninja.lastName} Age:${ninja.age}</li>
		</c:forEach>
		</ol>
	</div>
</body>
</html>