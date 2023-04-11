<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="donorSearch" method="post">
<table>
<tr>
<td>
BloodGroup :
</td><td>
<select name="bGroup">  
<option value="aPos">A POSITIVE</option>  
<option value="bPos">B POSITIVE</option>  
<option value="abPos">AB POSITIVE</option>  
<option value="oPos">O POSITIVE</option>  
<option value="aNeg">A NEGATIVE</option>  
<option value="bNeg">B NEGATIVE</option>  
<option value="abNeg">AB NEGATIVE</option>  
<option value="oNeg">O NEGATIVE</option>  
</select>  
</td><td>Address</td><td>
<input type="text" name="address" >
</td><td><button type="submit">Search</button></td>
</tr>
</table>
</form>
</body>
</html>