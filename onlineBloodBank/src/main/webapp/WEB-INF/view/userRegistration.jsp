<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">  
  <div class="container">  
  <center>  <h1>  Registration Form</h1>
  <hr> 
  <table><tr><td> 
  <label> Name </label> </td><td>  
<input type="text" name="name" placeholder= "Name" size="15"  />  </td></tr>
<tr><td><label>   
Phone :  
</label>  </td><td>
<input type="text" name="number" placeholder="phone no." size="10" /></td></tr>
<tr><td> <label for="email"><b>Email</b></label> </td><td> 
 <input type="email" placeholder="Enter Email" name="email" >  </td></tr>
 <tr><td> 
    <label for="psw"><b>Password</b></label> </td><td> 
    <input type="password" placeholder="Enter Password" name="password" > </td></tr>
 <tr><td>Current Address :  </td><td>
<textarea cols="20" rows="5" placeholder="Current Address" name="address" > 
</textarea>  
</td></tr>
<tr><td>
<label>   
BloodGroup :  
</label>   
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
</td></tr>
<tr><td> 
<label>   
Do you want to Become Donar :  
</label></td><td>  
<input type="radio" value="donor" name="donor" checked > Yes   
<input type="radio" value="no" name="donor"> No     
</td></tr><tr> <td colspan="2">
      <button type="submit" class="registerbtn">Register</button>   
</td></tr></table>
</form>   </center>
</body>
</html>