package com.syens.bank.model;

public class BloodBankFull {
	private int bId;
	private String bName;
	private String bNumber;
	private String bAddress;
	private String bEmail;
	private int bPos;
	private int abPos;
	private int oPos;
	private int aNeg;
	private int bNeg;
	private int abNeg;
	private int oNeg;
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
	public int getbPos() {
		return bPos;
	}
	public void setbPos(int bPos) {
		this.bPos = bPos;
	}
	public int getAbPos() {
		return abPos;
	}
	public void setAbPos(int abPos) {
		this.abPos = abPos;
	}
	public int getoPos() {
		return oPos;
	}
	public void setoPos(int oPos) {
		this.oPos = oPos;
	}
	public int getaNeg() {
		return aNeg;
	}
	public void setaNeg(int aNeg) {
		this.aNeg = aNeg;
	}
	public int getbNeg() {
		return bNeg;
	}
	public void setbNeg(int bNeg) {
		this.bNeg = bNeg;
	}
	public int getAbNeg() {
		return abNeg;
	}
	public void setAbNeg(int abNeg) {
		this.abNeg = abNeg;
	}
	public int getoNeg() {
		return oNeg;
	}
	public void setoNeg(int oNeg) {
		this.oNeg = oNeg;
	}
	@Override
	public String toString() {
		return "BloodBankFull [bId=" + bId + ", bName=" + bName + ", bNumber=" + bNumber + ", bAddress=" + bAddress
				+ ", bEmail=" + bEmail + ", bPos=" + bPos + ", abPos=" + abPos + ", oPos=" + oPos + ", aNeg=" + aNeg
				+ ", bNeg=" + bNeg + ", abNeg=" + abNeg + ", oNeg=" + oNeg + "]";
	}

}
