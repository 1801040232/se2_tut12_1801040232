<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<%-- TO-DO: Include navigation bar (nav-bar.jsp)  --%>
	<jsp:include page="nav-bar.jsp"></jsp:include>
	<br>
	<%-- TO-DO: CREATE A FORM FOR ADDING USER --%>
	<form action="insert" method="post">
		<h3 class="text-center">ADD NEW USER</h3>
		<fieldset>
			<label>Name</label> <input type="text" class="form-control"
				name="name" required="required">
		</fieldset>

		<fieldset>
			<label>Address</label> <input type="text" class="form-control"
				name="address" required="required">
		</fieldset>

		<fieldset>
			<label>Mobile</label> <input type="text" class="form-control"
				name="mobile" required="required">
		</fieldset>

		<div class="col text-center">
			<button type="submit" class="btn btn-success">ADD</button>
		</div>
	</form>

</body>
</html>
