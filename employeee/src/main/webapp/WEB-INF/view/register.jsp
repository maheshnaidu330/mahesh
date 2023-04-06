<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
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

<h1>Add New Employee</h1>
<form action="add" method="post">
<table>
<tr><td><input type="text" name="name" placeholder="name"></td></tr>
<tr><td><input type="number" name="salary" placeholder="salary"></td></tr>
<tr><td><input type="text" name="designation" placeholder="designation"></td></tr>
<tr><td><input type="submit" name="register" placeholder="register"></td></tr>

</table>
</form>
</body>
</html>