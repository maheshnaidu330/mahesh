<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form modelAttribute="bloodBank" action="adminRegisterSer">
		<table>
			<tr>
				<td><label> Name </label></td>
				<td><f:input path="bName" placeholder="Name " /> <f:errors
						path="bName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label> Phone : </label></td>
				<td><f:input path="bNumber" placeholder="phone no." /> <f:errors
						path="bNumber" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="email"><b>Email</b></label></td>
				<td><f:input path="bEmail" placeholder="Enter Email" /> <f:errors
						path="bEmail" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="psw"><b>Password</b></label></td>
				<td><f:password path="bPassword" placeholder="Enter Password" />
					<f:errors path="bPassword" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Current Address :</td>
				<td><f:textarea path="bAddress" placeholder="Current Address" />
					<f:errors path="bAddress" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="2" class ="submit"><input type="submit" value="Register" /></td>
			</tr>
		</table>

	</f:form>
</body>
</html>