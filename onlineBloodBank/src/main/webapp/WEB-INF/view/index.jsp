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

.header, .menu {
	text-align: center;
}

.content {
	text-align: center;
}


a {
	text-decoration: none;
}
</style>
</head>
<body>
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
</body>
</html>
