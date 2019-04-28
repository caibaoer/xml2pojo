package com.huangpan.pojo;

import java.util.List;

public class Bank {
	private String name;
	private String address;
	private List<Account> accounts;
	
	public Bank() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Bank [name=" + name + ", address=" + address + ", accounts=" + accounts + "]";
	}
	
	
}
