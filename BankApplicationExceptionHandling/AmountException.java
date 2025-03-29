package com.BankApplicationExceptionHandling;

public class AmountException extends Exception{
	String s;
	public AmountException(String s) {
		this.s=s;
	}
	@Override
	public String getMessage() {
		return s;
	}
}
