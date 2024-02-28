package com.cg.exception;

public class InsufficientBalanceException extends Exception {


	private double balance;

	public InsufficientBalanceException() {
		
	}
	
	public InsufficientBalanceException(String msg, double balance) {
		super(msg);
		this.balance = balance;
	}
	
	public String toString() {
		
		return "InsufficientFundException: [balance=]"+balance+"]"+super.getMessage();
		
	}
	
}
