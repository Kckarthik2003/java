package com.BankApplicationExceptionHandling;

public class NegativeAmountException extends Exception{
	String s;
	public NegativeAmountException(String s) {
		super();
		this.s=s;
	}
	@Override
	public String getMessage() {
		return s;
	}
}
