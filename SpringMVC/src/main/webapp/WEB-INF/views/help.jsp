<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>help page</title>
</head>
<body>

	<%
		String name = (String) request.getAttribute("name");
		Integer id = (Integer) request.getAttribute("id");

		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>
	<h1>This is help page</h1>
	<h1>
		Hello,
		<%=name%></h1>
	<h2>
		your id=
		<%=id%></h2>
	<h3>
		Todays date =
		<%=time%></h3>
</body>
</html>