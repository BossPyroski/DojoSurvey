<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	DojoSurvey! Submit your information, code slave!
	<form method="POST" action="/submit">
		<label>Your Name<input type="text" name="name"></label></br> <label>Dojo
			Location<input type="text" name="dojo">
		</label></br> <label>Favorite Language<input type="text" name="language"></label></br>
		<label>Comment(optional)e<input type="text" name="comment"></label></br>
		<button type="submit">Submit!</button>
	</form>



</body>
</html>