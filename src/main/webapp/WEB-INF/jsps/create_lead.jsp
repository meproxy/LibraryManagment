<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<!--  Live Loading of Server with Dev Tools to see changes instantly by saving and refreshing only -->
	<h2>Creating New Leads</h2>
	<form action="saveLead" method="post">
	<pre>
	First Name : <input type="text" name="firstName" />
	Last Name : <input type="text" name="lastName" />
	Email : <input type="text" name="email" />
	Contact Number : <input type="text" name="mobile" />
	<input type="submit" value="save" />
	</pre>
	</form>
	${msg} <!-- acts like get attribute -->
</body>
</html>