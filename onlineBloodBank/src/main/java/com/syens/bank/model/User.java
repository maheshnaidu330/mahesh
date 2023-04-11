package com.syens.bank.model;

public class User 
{
private int id;
private String name;
private long number;

private String email;
private String password;
private String bGroup;
private String donor;
private String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getbGroup() {
	return bGroup;
}
public void setbGroup(String bGroup) {
	this.bGroup = bGroup;
}
public String getDonor() {
	return donor;
}
public void setDonor(String donor) {
	this.donor = donor;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", number=" + number + ", email=" + email + ", password=" + password
			+ ", bGroup=" + bGroup + ", donor=" + donor + ", address=" + address + "]";
}

}
