<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SuccessForm</title>
</head>
<%

 /*String name=(String) request.getAttribute("userName");*/
%>
<body>

<h1>${Header }</h1>
<hr>

<h1>Hello, ${user.userName}</h1>
<h2>This is your new email= ${user.userEmail }</h2>
<h3>Welcome in Spring MVC</h3>
</body>
</html>