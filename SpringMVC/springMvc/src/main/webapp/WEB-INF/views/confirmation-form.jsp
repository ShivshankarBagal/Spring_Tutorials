<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


  <%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<body>
	<p>Your reservation is confirmed successfully. Please, re-check the
		details.</p>
	First Name : ${FNAME.firstName}
	<br> Last Name : ${FNAME.lastName}
	<br> Gender: ${FNAME.gender}
	<br> Meals:
	<ul>
		<c:forEach var="meal" items="${FNAME.food}">
			<li>${meal}</li>
		</c:forEach>
	</ul>
</body>
</html>
