package com.BankApplicationExceptionHandling;

public class OtpException extends Exception{
	String s;
	public OtpException(String s) {
		this.s=s;
	}
	@Override
	public String getMessage() {
		return s;
	}
}
