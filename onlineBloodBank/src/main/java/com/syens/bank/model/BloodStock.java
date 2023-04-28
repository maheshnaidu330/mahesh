package com.syens.bank.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class BloodStock {

	private int id;
	
	//@NotNull(message = "1Required")
	@Min(value=1, message="*Required") 
	private int aPos;
	@NotNull(message = "*Required")
	private int bPos;
	@NotNull(message = "*Required")
	private int abPos;
	@NotNull(message = "*Required")
	private int oPos;
	@NotNull(message = "*Required")
	private int aNeg;
	@NotNull(message = "*Required")
	private int bNeg;
	@NotNull(message = "*Required")
	private int abNeg;
	@NotNull(message = "*Required")
	private int oNeg;

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public int getaPos() {
		return aPos;
	}

	public void setaPos(int aPos) {
		this.aPos = aPos;
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

}
