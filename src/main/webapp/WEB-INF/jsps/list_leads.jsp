<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All</title>
</head>
<body>
<h2>List of All Registrations</h2>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>Mobile No.</th>
</tr>
<c:forEach var="lead" items="${leads}">
<tr>
<td>${lead.firstName}</td>
<td>${lead.lastName}</td>
<td>${lead.email}</td>
<td>${lead.mobile}</td>
</tr>
</c:forEach>
</table>

</body>
</html>