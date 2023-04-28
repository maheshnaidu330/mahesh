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
	<f:form modelAttribute="user" action="userRegisterSer">
		<table>
			<tr>
				<td><label> Name </label></td>
				<td><f:input path="name" placeholder="Name " /> <f:errors
						path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label> Phone : </label></td>
				<td><f:input path="unumber" placeholder="phone no." /> <f:errors
						path="unumber" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="email"><b>Email</b></label></td>
				<td><f:input path="email" placeholder="Enter Email" /> <f:errors
						path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="psw"><b>Password</b></label></td>
				<td><f:password path="password" placeholder="Enter Password" />
					<f:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Current Address :</td>
				<td><f:textarea path="address" placeholder="Current Address" />
					<f:errors path="address" cssClass="error" /></td>
			</tr>
			<tr>
				<td>BloodGroup :</td>
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

					</f:select>
					<f:errors path="bGroup" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td>Male <f:radiobutton path="gender" value="Male" /> Female <f:radiobutton
						path="gender" value="Female" />
						<f:errors path="gender" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label> Do you want to Become Donar : </label></td>
				<td><f:checkbox path="donor" value="yes"/> Yes 
				<f:errors path="donor" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="2" class="submit"><input type="submit"
					value="Register" /></td>
			</tr>
		</table>

	</f:form>
</body>
</html>