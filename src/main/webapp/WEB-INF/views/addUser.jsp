<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add USER</title>
</head>
<body>
	<%@include file="header.jsp"%>

<h3>${result}</h3>

	<form:form action="${pageContext.request.contextPath}/addUser"
		commandName="employee">
		First Name: <input type="text" name="firstName">
		<br /> 
		Last Name: <input type="text" name="lastName" />
		<br /> 
		 Designation: <input type="text" name="designation" />
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>