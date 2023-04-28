package com.syens.bank.command;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Value;

public class SearchCommand {
	@NotBlank(message = "*Required")
	private String bGroup;
	@NotBlank(message = "*Required")
	private String search;
	@Value("yes")
	private String donor;

	public String getbGroup() {
		return bGroup;
	}

	public void setbGroup(String bGroup) {
		this.bGroup = bGroup;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public String getDonor() {
		return donor;
	}

	public void setDonor(String donor) {
		this.donor = donor;
	}

	@Override
	public String toString() {
		return "SearchCommand [bGroup=" + bGroup + ", search=" + search + ", donor=" + donor + "]";
	}

}
