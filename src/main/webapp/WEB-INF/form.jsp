<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
<h1>Name: <c:out value="${name}"/> </h1>
<h1>Dojo Location: <c:out value="${dojo}"/> </h1>
<h1>The language is: <c:out value="${language}"/> </h1>
<h1>Comments: <c:out value="${comment}"/> </h1>


</body>
</html>