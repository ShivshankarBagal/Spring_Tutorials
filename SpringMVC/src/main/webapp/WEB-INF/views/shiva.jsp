<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	
	<%@page isELIgnored="false" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Expp. language</title>
</head>
<body>

	<%
		/*String name = (String) request.getAttribute("name");
		Integer id = (Integer) request.getAttribute("id");
		
		LocalDateTime time = (LocalDateTime) request.getAttribute("time");
		*/
	%>
	<h1>${msg }</h1>
	<h1>
		Hello,
		${ name }</h1>
	<h2>
		your id= ${id}
		</h2>
	<h3>
		Todays date = ${ time }
		</h3>
		
		<hr>
		<c:forEach var="item" items="${result }">
		
		<h2> ${item }</h2>
		</c:forEach>

</body>
</html>