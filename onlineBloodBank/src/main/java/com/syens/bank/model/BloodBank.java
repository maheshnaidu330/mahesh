package com.syens.bank.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class BloodBank {
	private int bId;
	@NotBlank(message = "*Required")
	private String bName;
	@NotBlank(message = "*Required")
	private String bNumber;
	@NotBlank(message = "*Required")
	private String bAddress;
	@NotBlank(message = "*Required")
	private String bEmail;
	@Size(min=3, max=10, message="password should be in between 3 to 10")
	private String bPassword;
	private int role;
	
	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbNumber() {
		return bNumber;
	}

	public void setbNumber(String bNumber) {
		this.bNumber = bNumber;
	}

	public String getbAddress() {
		return bAddress;
	}

	public void setbAddress(String bAddress) {
		this.bAddress = bAddress;
	}

	public String getbEmail() {
		return bEmail;
	}

	public void setbEmail(String bEmail) {
		this.bEmail = bEmail;
	}

	public String getbPassword() {
		return bPassword;
	}

	public void setbPassword(String bPassword) {
		this.bPassword = bPassword;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "BloodBank [bId=" + bId + ", bName=" + bName + ", bNumber=" + bNumber + ", bAddress=" + bAddress
				+ ", bEmail=" + bEmail + ", bPassword=" + bPassword + ", role=" + role + "]";
	}

}
