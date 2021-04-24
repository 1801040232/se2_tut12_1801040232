<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello</title>
<style>
form {
	width: fit-content;
	text-align: center;
	margin-top: 30px;
}
</style>
</head>
<body>
	<center>
		<form action="validate">
			<fieldset>
				Enter your username: <input type="text" name="user" size="20">
				<br> Enter your password: <input type="password" name="pass"
					size="20"> <br> <br> <input type="submit"
					value="Submit">
			</fieldset>
		</form>
	</center>
</body>
</html>