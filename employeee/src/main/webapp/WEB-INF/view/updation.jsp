<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
html, body {
    height: 10%;
}

html {
    display: table;
    margin: auto;
}

body {
    display: table-cell;
    vertical-align: middle;
}
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}

.button5:hover {
  background-color: #555555;
  color: white;
}
</style>
</head>
<body>
<h1>Update Employee Details</h1>
	<form action="/employeee/updated" method="post">
		<table>
			<tr>
			<td>Id</td>
				<td>${employee.id }<input type="hidden" name="id" value="${employee.id }" ></td>
			</tr>

			<tr>
			<td>Name</td>

				<td><input type="text" name="name" value="${employee.name }"></td>
			</tr>
			<tr>
						<td>Salary</td>
			
				<td><input type="number" name="salary"
					value="${employee.salary }"></td>
			</tr>
			<tr>
						<td>Designation</td>
			
				<td><input type="text" name="designation"
					value="${employee.designation }"></td>
			</tr>
			<tr>
				<td><input type="submit" name="register" value="update"></td>
			</tr>

		</table>
	</form>

	
</body>
</html>