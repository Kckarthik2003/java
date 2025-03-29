package com.Strings;

public class CountOnlyWords {
	public static void main(String[] args) {
		String s = " Java is  very easy programming language";
		int c=0;
		for(int i=0;i<s.length();i++) {
			if((i==0 && s.charAt(i)!=' ') || ((s.charAt(i)!=' ') && s.charAt(i-1)==' ')) {
				c++;
			}
		}
		System.out.println(c);
	}
}
