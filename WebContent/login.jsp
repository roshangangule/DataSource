<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<body>
	<form action="processServlet" method="post">
	
		<input type="text" name="uname" placeholder="User name"/>
		<br><br>
		<input type="submit" value="Submit"/>
		<br><br>
		
		<a href="signupServlet">Sign Up </a>
	</form>
</body>
</html>