<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style type="text/css">
body {
	text-align: center;
	background-image: url("https://wallpapercave.com/wp/wp3165107.jpg");
	}

.center {
	margin-left: auto;
	margin-right: auto;
}

h1 {
	color: #008CBA;
	text-align: center;
}

table, td, th {
	border-bottom: 1px solid #ddd;
	padding: 15px;
	text-align: left;
	vertical-align: top;

}

table {
	width: 100%;
	border-collapse: collapse;
}

th {
	background-color: aqua;
}

td a:hover {
	background-color: #005f7f;
}

a {
	text-decoration: none;
	color: red;
	padding: 5px;
}
</style>
</head>
<body>

	<h2>ToDo</h2>
	<hr>
	<table border="0">
		<tr>
			<td width="10%"><br><a href="addform">Add ToDo</a><br>
			<br>
			<br>
			<br>
			<br> <a href="viewall">View ToDo's</a><br>
			<td>
			<td><c:if test="${todo == 'addform'}">
					<jsp:include page="/view/addform.jsp"></jsp:include>
				</c:if> <c:if test="${todo == 'viewform'}">
					<jsp:include page="/view/viewall.jsp"></jsp:include>
				</c:if> <c:if test="${todo == 'editform'}">
					<jsp:include page="/view/editform.jsp"></jsp:include>
				</c:if></td>
		</tr>
	</table>
</body>
</html>
