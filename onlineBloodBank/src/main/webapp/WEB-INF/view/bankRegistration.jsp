<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="bankRegister" method="post">  
  <div class="container">  
  <center>  <h1> Blood Bank Registeration Form</h1>
  <hr> 
  <table><tr><td> 
  <label> Name </label> </td><td>  
<input type="text" name="bName" placeholder= "Name" size="15"  />  </td></tr>
<tr><td><label>   
Phone :  
</label>  </td><td>
<input type="text" name="bNumber" placeholder="phone no." size="10" /></td></tr>
<tr><td> <label for="email"><b>Email</b></label> </td><td> 
 <input type="email" placeholder="Enter Email" name="bEmail" >  </td></tr>
 <tr><td> 
    <label for="psw"><b>Password</b></label> </td><td> 
    <input type="password" placeholder="Enter Password" name="bPassword" > </td></tr>
 <tr><td>Current Address :  </td><td>
<textarea cols="20" rows="5" placeholder="Current Address" name="bAddress" > 
</textarea>  
</td></tr>
<tr> <td colspan="2">
      <button type="submit" class="registerbtn">Register</button>   
</td></tr>
</table>
</center>
</div>
</form>
</body>
</html>