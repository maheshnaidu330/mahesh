<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style type="text/css">
body {
	text-align: center;
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
a
{
text-decoration: none;

color: red;
padding:5px;
}
</style>
</head>
<body>
	<h2>ToDo</h2>
	<hr>
	<table border="0">
		<tr>
			<td width="10%"><a href="addform">Add ToDo</a><br><br><br><br><br> <a href="viewall">View
					ToDo's</a><br>
			<td>
			<td><c:if test="${todo == 'addform'}">
					<form:form action="add" >
						<input type="text" name="title" placeholder="Title">
						<br>
						<textarea rows="10" cols="100" name="content" placeholder="Content"></textarea>
						<br>
						<input type="submit" value="Add" />
					</form:form>
				</c:if> <c:if test="${todo == 'viewform'}">
					<table class="center">
						<thead>
							<tr>
								<th>TITLE</th>
								<th>CONTENT</th>
								<th>DATE</th>
								<th>Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="book" items="${list}">
								<tr>
									<td><c:out value="${book.title}" /></td>
									<td><c:out value="${book.content}" /></td>
									<td><c:out value="${book.date}" /></td>
									<td><a href="editTodo?id=${book.id}">Edit</a> <br><br><a
										href="deleteBook?id=${book.id}"
										onclick="return confirm('Are you sure you want to delete this TODO?')">Delete</a>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</c:if> <c:if test="${todo == 'editform'}">
					<form:form action="update">
					<input type="hidden" name="id" value="${book.id}">
						<input type="text" name="title" value="${book.title}">
						<br>
						<textarea rows="10" cols="100" name="content">${book.content}</textarea>
						<br>
						<input type="submit" value="Update" />
					</form:form>
				</c:if></td>
		</tr>
	</table>
</body>
</html>
