package com.syens.bank.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User {
	
	private int id;
	@NotBlank(message = "*Required")
	private String name;
	@NotBlank(message = "*Required")
	private String unumber;
	@NotBlank(message = "*Required")
	private String email;
	@Size(min=3, max=10, message="password should be in between 3 to 10")
	private String password;
	@NotBlank(message = "*Required")
	private String bGroup;
	private String donor;
	@NotBlank(message = "*Required")
	private String address;
	@NotNull(message = "*Required")
	private String gender;
	private int role;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

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

	
	public String getUnumber() {
		return unumber;
	}

	public void setUnumber(String unumber) {
		this.unumber = unumber;
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

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", unumber=" + unumber + ", email=" + email + ", password="
				+ password + ", bGroup=" + bGroup + ", donor=" + donor + ", address=" + address + ", gender=" + gender
				+ ", role=" + role + "]";
	}

	
}
