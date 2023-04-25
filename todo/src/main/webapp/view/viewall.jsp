<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
</body>
</html>