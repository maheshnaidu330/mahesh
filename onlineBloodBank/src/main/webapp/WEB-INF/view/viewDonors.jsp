<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
 
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="donorSearchForm.jsp" />
<h1>Donors List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Name</th><th>Number</th><th>Email</th><th>Address</th><th>Group</th></tr>  
   <c:forEach var="user" items="${userList}">   
   <tr>  
  
   <td>${user.name}</td>  
   <td>${user.number}</td>  
   <td>${user.email}</td>  
   <td>${user.address}</td>  
   <td>${user.bGroup}</td>  
   </tr>  
   </c:forEach>  
   </table>  
 

</body>
</html>