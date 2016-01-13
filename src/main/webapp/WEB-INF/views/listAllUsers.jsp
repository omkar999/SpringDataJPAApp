<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All USERS</title>

</head>
<body>
	<%@include file="header.jsp" %>
	<div align="center">
		<table id="allUsers" class="table-hover">
			<caption>
				<h2>List of users</h2>
			</caption>
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Profession</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="user" items="${empList}">
					<tr>
						<td><c:out value="${user.id}" /></td>
						<td><c:out value="${user.firstName}" /></td>
						<td><c:out value="${user.lastName}" /></td>
						<td><c:out value="${user.designation}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>