package com.cg.bean;

public abstract class Account {
	

	private int aid;
	private int mobile;
	private String accountholder;
	private double balance;
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int aid, int mobile, String accountholder, double balance) {
		super();
		this.aid = aid;
		this.mobile = mobile;
		this.accountholder = accountholder;
		this.balance = balance;
	}
	
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public String getAccountholder() {
		return accountholder;
	}
	public void setAccountholder(String accountholder) {
		this.accountholder = accountholder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	@Override
	public String toString() {
		return "Account [aid=" + aid + ", mobile=" + mobile + ", accountholder=" + accountholder + ", balance="
				+ balance + "]";
	}
}
