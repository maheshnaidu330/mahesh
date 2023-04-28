<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- invalid valid credidentials also can do but for trying different things iam using this -->

	<c:if test="${success != null || error != null}"><jsp:include
			page="message.jsp" /></c:if>

	<c:choose>
		<c:when test="${sessionScope.user==null}">
			<c:choose>
				<c:when test="${content == 'userRegister'}"><jsp:include
						page="../content/user/userRegister.jsp" />
				</c:when>
				<c:when test="${content == 'adminRegister'}"><jsp:include
						page="../content/admin/adminRegister.jsp" />
				</c:when>
				<c:when test="${content == 'login'}"><jsp:include
						page="../content/login.jsp"></jsp:include>
				</c:when>
			</c:choose>
		</c:when>
		<c:when test="${sessionScope.user!=null && sessionScope.role == 1}">
			<c:choose>
				<c:when test="${content == 'searchGroup'}"><jsp:include
						page="../content/user/searchGroup.jsp" />
				</c:when>
				<c:when test="${content == 'updateUser'}"><jsp:include
						page="../content/user/updateUser.jsp" />
				</c:when>
				<c:when test="${content == 'yourOrders'}"><jsp:include
						page="../content/user/yourOrders.jsp" />
				</c:when>
				<c:when test="${content == 'searchDonor'}"><jsp:include
						page="../content/user/searchDonor.jsp" />
				</c:when>
				
			</c:choose>
		</c:when>
		<c:when test="${sessionScope.user!=null && sessionScope.role == 2}">
			<c:choose>
				<c:when test="${content == 'updateGroup'}"><jsp:include
						page="../content/admin/updateGroup.jsp" />
				</c:when>
				<c:when test="${content == 'checkOrders'}"><jsp:include
						page="../content/admin/checkOrders.jsp" />
				</c:when>
				<c:when test="${content == 'searchDonor'}"><jsp:include
						page="../content/user/searchDonor.jsp" />
				</c:when>
				<c:when test="${content == 'updateBank'}"><jsp:include
						page="../content/admin/updateBank.jsp" />
				</c:when>
			</c:choose>
		</c:when>
		<c:otherwise>
		This is other wise ${sessionScope.userId}, ${sessionScope.role}
		</c:otherwise>



	</c:choose>
	<%-- <c:choose>
		<c:when test="${param.act eq 'login'}">
			<c:choose>
				<c:when test="${sessionScope.userId==null}">
					<h4 class="error">Logging Process not Completed</h4>
				</c:when>
				<c:when
					test="${sessionScope.userId!=null && sessionScope.role == 1}">
					<jsp:include page="../content/user/searchGroup.jsp"></jsp:include>
				</c:when>
				<c:when
					test="${sessionScope.userId!=null && sessionScope.role == 2}">
					<jsp:include page="../content/admin/checkOrders.jsp"></jsp:include>
				</c:when>
				<c:otherwise>
					<p class="error">Something went reach us</p>
				</c:otherwise>
			</c:choose>
		</c:when>
		<c:when test="${param.act eq 'logout'}">
			<p class="success">Logout Successful</p>
		</c:when>
		<c:when test="${sessionScope.userId!=null}">
			<jsp:include page="../content/contentmain.jsp"></jsp:include>
		</c:when>
		<c:otherwise>
			<jsp:include page="../content/login.jsp"></jsp:include>
		</c:otherwise>
	</c:choose> --%>
</body>
</html>