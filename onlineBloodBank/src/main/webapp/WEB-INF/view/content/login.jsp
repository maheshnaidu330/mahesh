<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<f:form modelAttribute="loginCommand" action="login">
		<table >
			<tr>
				<td><label>Role </label></td>
				<td><f:select path="role" cssClass="field">
						<f:option value="1" label="User" />
						<f:option value="2" label="Blood Bank" />
					</f:select><f:errors path="role" cssClass="error"></f:errors></td>
			</tr>
			
			<tr>
				<td><label>Phone number </label></td>
				<td><f:input path="phone" cssClass="field" />	<f:errors path="phone" cssClass="error"></f:errors></td>
			</tr>
		
			<tr>
				<td><label>Password </label></td>
				<td><f:input path="password" cssClass="field" /><f:errors
						path="password" cssClass="error"></f:errors> </td>
			</tr>
			<tr>
				<td colspan="2" class ="submit"><input type="submit" value="Login"></td>
			</tr>
		</table>
	</f:form>
<br>
	<br><br>
	
	<br>
	<a href="userRegister">User Registration</a>
	<br>
	<br>
	<a href="adminRegister">Blood Bank Registration</a>
</body>
</html>