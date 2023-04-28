package com.syens.bank.command;

import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;


public class LoginCommand 
{

private int role;
@NotBlank(message ="*Required")
private String phone;
@Size(min=3, max=10, message="password should be in between 3 to 10")
private String password;
public int getRole() {
	return role;
}
public void setRole(int role) {
	this.role = role;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "LoginCommand [role=" + role + ", phone=" + phone + ", password=" + password + "]";
}

}
