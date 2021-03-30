<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Correct Code Entered</title>
</head>
<body>
	<ul>
	<c:forEach items = "${qualities}" var = "quality">
		<li><c:out value = "${quality}"/></li>
	</c:forEach>
	</ul>
</body>
</html>