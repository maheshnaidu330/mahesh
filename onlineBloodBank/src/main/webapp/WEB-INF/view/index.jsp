<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Online Blood Bank</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.error {
	color: red;
	position: fixed;
	margin-left: 10px;
}

.success {
	color: green;
}

label {
	float: middle;
	width: 6em;
	text-align: left;
}

table {
	margin-left: auto;
	margin-right: auto;
}

td {
	text-align: left;
}

div {
	margin: 30px;
}

.header, .menu, .content {
	text-align: center;
}
.menu
{

}
.content
{

}
.submit {
	text-align: center
}

body {
	color: white;
	background-color: #a0d2eb;
}

a {
	text-decoration: none;
	color: red;
	margin: 10px;
}

a:hover {
	background-color: #e5eaf5;
}

.center {
	width: 90%;
}
</style>
</head>
<body>
	<div class="project">
		<div class="header">
			<h1>Online Blood bank</h1>
			<hr>

		</div>
		<div class="menu">
			<jsp:include page="include/menu.jsp"></jsp:include>
		</div>
		<div class="content">
			<jsp:include page="include/content.jsp"></jsp:include>
		</div>
		<div class="footer">
			<jsp:include page="include/footer.jsp"></jsp:include>
		</div>
	</div>
</body>
</html>
