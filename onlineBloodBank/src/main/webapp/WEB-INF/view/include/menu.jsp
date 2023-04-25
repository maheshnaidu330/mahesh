<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@taglib
	uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${sessionScope.userId==null}">
			<c:choose>
				<c:when test="${param.act eq 'login'}">
				<div class="error center" >Invalid Credentials</div><br>
				</c:when>
			</c:choose>
		</c:when>
		<c:when test="${sessionScope.userId!= null && sessionScope.role == 1}">
			<a href="searchGroup">Search Blood Group</a>
			<a href="searchDonor">Search Donor </a>
			<a href="yourOrders">Your Orders</a>
			<a href="updateUser">Update Your Details</a>
			<a href="logout">Logout</a>
			<hr>
		</c:when>
		<c:when test="${sessionScope.userId!= null && sessionScope.role == 2}">
			<a href="updateGroup">Update Blood Group </a>
			<a href="searchDonor">Search Donor </a>
			<a href="checkOrders">Your Orders</a>
			<a href="updateBank">Update Your Details</a>
			<a href="logout">Logout</a>
			<hr>
		</c:when>
		<c:otherwise>
		This is other wise ${sessionScope.userId}, ${sessionScope.role}
		</c:otherwise>
	</c:choose>
</body>
</html>