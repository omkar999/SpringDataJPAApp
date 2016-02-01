<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HOME</title>
<!-- JQuery and BootSrap JS and CSS -->
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
<script
	src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
<script type="text/javascript"
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css">
</head>
<body>
	<%@include file="header.jsp"%>
	<h2>This is HOME Page</h2>
	<br />

	<p>This is Home page...Check Out other TABS</p>


	<h3>${deleteResult}</h3>
	<form:form action="${pageContext.request.contextPath}/delete">
	Id to Delete : <input type="text" name="id">
		<input type="submit" value="Submit" />
	</form:form>


	<h3>${updateResult}</h3>
	<form:form action="${pageContext.request.contextPath}/update"
		commandName="employee" class="form form-horizontal">
		Id: <input type="text" name="id">
		<br /> 
		First Name: <input type="text" name="firstName">
		<br /> 
		Last Name: <input type="text" name="lastName" />
		<br /> 
		 Designation: <input type="text" name="designation" />
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>