<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Driver's License</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div class = "container">
		<h2>New Person</h2>
		<form:form action ="/" method = "POST" modelAttribute = "person">
			<div class = "form-group">
				<form:label path = "firstName">First Name</form:label>
				<form:errors path = "firstName"/>
				<form:input class = "form-control" path = "firstName"/>
			</div>
			<div class = "form-group">
				<form:label path = "lastName">Last Name</form:label>
				<form:errors path = "lastName"/>
				<form:input class = "form-control" path = "lastName"/>
			</div>
			<button class = "btn btn-primary">Add Person</button>
		</form:form>
	</div>
</body>
</html>