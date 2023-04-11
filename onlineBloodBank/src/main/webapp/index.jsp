<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
	font-family: Calibri, Helvetica, sans-serif;
	background-color: LightGray;
}

.registerbtn:hover {
	opacity: 1;
}
</style>
</head>
<body>
	<a href="userBody">userBody</a>
	<a href="bankRegistration">"Blood Bank Registration"</a>
	<a href="userRegistration">User Registration</a>
	<form action="login">
		<table>
			<tr>
				<td><select name="loginType">
						<option value="user">User</option>
						<option value="bloodBank">BloodBank</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="number" name="number"
					placeholder="Phone Number"></td>
			</tr>
			<tr>
				<td><input type="password" name="password"
					placeholder="password"></td>
			</tr>
			<tr>
				<td>
					<button type="submit">Login</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
