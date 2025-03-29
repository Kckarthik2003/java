package com.BankApplicationExceptionHandling;

public class AadharNumberException extends Exception{
	String s;
	public AadharNumberException(String s) {
		this.s=s;
	}
	@Override
	public String getMessage() {
		return s;
	}
}
