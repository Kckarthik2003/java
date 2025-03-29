package com.Strings;

public class CountOfUpperLowerDigitSpecialCharacters {
	public static void main(String[] args) {
		String s = "Hello World @ 1234 ";
		int uc =0;
		int lc = 0;
		int nc = 0;
		int sc =0;
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>='A' && ch<='Z') {
				uc++;
			}
			else if(ch>='a' && ch<='z') {
				lc++;
			}
			else if(ch>='0' && ch<='9') {
				nc++;
			}
			else {
				sc++;
			}
		}
		System.out.println("upper character count : "+uc);
		System.out.println("lower character count : "+lc);
		System.out.println("number character count : "+nc);
		System.out.println("special character count : "+sc);
	}
}
