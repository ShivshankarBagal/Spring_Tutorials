<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	
	<h1>This is Home Page</h1>
	<h2>Called by home controller</h2>
	<h2>url /home</h2>
	
	<%
	String name=(String)request.getAttribute("name");
	Integer id=(Integer) request.getAttribute("id");
	
	List<String> partners= (List<String>)request.getAttribute("part");
	%>
	<h1>Hello, <%=name %> .</h1>
	<h2>Your id is= <%=id %> .</h2>
	
	<%
	for(String s: partners){
		%>
		<h2><%=s %></h2>
		
	<% }
	%>

</body>
</html>