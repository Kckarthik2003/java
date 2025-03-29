package com.Strings;

public class InitCap {
	public static void main(String[] args) {
			String s = "           Java is  very easy programming language";
			String res="";
			for(int i=0;i<s.length();i++) {
				if((i==0 && s.charAt(i)!=' ') || ((s.charAt(i)!=' ') && s.charAt(i-1)==' ')) {
					if((s.charAt(i)>='a') && (s.charAt(i)<='z')) {
						res = res + (char)(s.charAt(i) - 32);
					}
					else {
						res =res + s.charAt(i);
					}
				}
				else {
					res = res+s.charAt(i);
				}
			}
			System.out.println(res);	
		}
}
