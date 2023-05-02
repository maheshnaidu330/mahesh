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

	<f:form modelAttribute="searchCommand" action="searchDonorSer">
		<table>
			<tr>
				<td><f:errors path="bGroup" cssClass="error" /></td>
				<td><f:errors path="search" cssClass="error" /></td>
			</tr>
			<tr>
				<td><f:select path="bGroup">
						<f:option value="" label="Select Blood Group" />
						<f:option value="aPos" label="A POSITIVE" />
						<f:option value="bPos" label="B POSITIVE" />
						<f:option value="abPos" label="AB POSITIVE" />
						<f:option value="oPos" label="O POSITIVE" />
						<f:option value="aNeg" label="A NEGATIVE" />
						<f:option value="bNeg" label="B NEGATIVE" />
						<f:option value="abNeg" label="AB NEGATIVE" />
						<f:option value="oNeg" label="O NEGATIVE" />

					</f:select></td>
				<td><f:input path="search" placeholder="Search..." /></td>
				<td><input type="submit" value="Search"
					style="width: 60px; padding: 10px;" /></td>
			</tr>
		</table>





	</f:form>
	<table>
		<tr style="color: Black;">
			<th>Name</th>
			<th>Number</th>
			<th>Email</th>
			<th>Blood Group</th>
			<th>Address</th>
			<th>Gender</th>
		</tr>
		<c:forEach var="user" items="${users}">
			<tr>
				<th>${user.name}</th>
				<th>${user.unumber}</th>
				<th>${user.email}</th>
				<th>${user.bGroup}</th>
				<th>${user.address}</th>
				<th>${user.gender}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>