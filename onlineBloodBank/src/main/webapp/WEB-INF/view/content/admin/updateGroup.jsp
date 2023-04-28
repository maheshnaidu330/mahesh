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
	<f:form modelAttribute="bloodStock" action="bloodstockSer">
		<table>
			<tr>
			<tr>
				<td colspan="2"><f:hidden path="id" /></td>
			</tr>
			<tr>
				<td><label> A POSITIVE </label></td>
				<td><f:input path="aPos" placeholder="aPos " /> <f:errors
						path="aPos" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label> B POSITIVE </label></td>
				<td><f:input path="bPos" placeholder="bPos " /> <f:errors
						path="bPos" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label> AB POSITIVE </label></td>
				<td><f:input path="abPos" placeholder="abPos " /> <f:errors
						path="abPos" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label> O POSITIVE </label></td>
				<td><f:input path="oPos" placeholder="oPos " /> <f:errors
						path="oPos" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label> A NEGATIVE </label></td>
				<td><f:input path="aNeg" placeholder="aNeg " /> <f:errors
						path="aNeg" cssClass="error" /></td>
			</tr>
				<tr>
				<td><label> B NEGATIVE </label></td>
				<td><f:input path="bNeg" placeholder="bNeg " /> <f:errors
						path="bNeg" cssClass="error" /></td>
			</tr>
				<tr>
				<td><label> AB NEGATIVE </label></td>
				<td><f:input path="abNeg" placeholder="abNeg " /> <f:errors
						path="abNeg" cssClass="error" /></td>
			</tr>
				<tr>
				<td><label> O NEGATIVE </label></td>
				<td><f:input path="oNeg" placeholder="oNeg " /> <f:errors
						path="oNeg" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="2" class ="submit"><input type="submit" value="Update" /></td>
			</tr>
		</table>

	</f:form>
</body>
</html>