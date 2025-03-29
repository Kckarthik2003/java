package com.BankApplicationExceptionHandling;

public class MobileNumberException extends Exception{
	String s;
	public MobileNumberException(String s) {
		this.s=s;
	}
	@Override
	public String getMessage() {
		return s;
	}
}
