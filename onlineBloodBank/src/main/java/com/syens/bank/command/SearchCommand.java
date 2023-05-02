package com.syens.bank.command;

import javax.validation.constraints.NotBlank;

public class SearchCommand {
	@NotBlank(message = "*Required")
	private String bGroup;
	@NotBlank(message = "*Required")
	private String search;

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

	@Override
	public String toString() {
		return "SearchCommand [bGroup=" + bGroup + ", search=" + search + "]";
	}

	
	
}
