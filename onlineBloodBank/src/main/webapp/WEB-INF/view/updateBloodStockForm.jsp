<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateBloodStock" method="post">
<table>
<tr>
<td>
Blood Bank Id
</td>
<td>


${bloodStock.bId}
<input type="hidden" name="bId" value="${bloodStock.bId}">
</td>
</tr>
<tr>
<td>
A positive
</td>
<td>
<input type="number" name="aPos" value="${bloodStock.aPos}">
</td>
</tr>
<tr>
<td>
B Positive
</td>
<td>
<input type="number" name="bPos" value="${bloodStock.bPos}">

</td>
</tr>
<tr>
<td>
AB Positive
</td>
<td>
<input type="number" name="abPos" value="${bloodStock.abPos}">

</td>
</tr>
<tr>
<td>
O Positive
</td>
<td>
<input type="number" name="oPos" value="${bloodStock.oPos}">

</td>
</tr>
<tr>
<td>
A negative
</td>
<td>
<input type="number" name="aNeg" value="${bloodStock.aNeg}">

</td>
</tr>
<tr>
<td>
B Negative
</td>
<td>
<input type="number" name="bNeg" value="${bloodStock.bNeg}">

</td>
</tr>
<tr>
<td>
AB Negative
</td>
<td>
<input type="number" name="abNeg" value="${bloodStock.abNeg}">

</td>
</tr>
<tr>
<td>
O Negative
</td>
<td>
<input type="number" name="oNeg" value="${bloodStock.oNeg}">

</td>
</tr>
<tr>
<td colspan="2">
      <button type="submit" class="btn">Update</button>   
</td></tr>




</table>

</form>
</body>
</html>