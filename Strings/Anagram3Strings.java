package com.Strings;

public class Anagram3Strings {
	public static String LowerCase(String s) 
	{
		String res="";
		for(int i=0;i<s.length();i++) 
		{                       
			char ch = s.charAt(i);
			if(ch<='Z' && ch>='A') 
			{
				res += (char)(ch+32);	
			}
			else 
			{
				res += ch;
			}
		}
		return res;
	}
	public static char[] convertCharArray(String s) 
	{
		char []ch=new char[s.length()];
		for(int i=0;i<s.length();i++) {
		ch[i]=s.charAt(i);
		}
		return ch;
	}
	public static char[] sortChars(char[] ch) {
		for(int i=0;i<ch.length;i++) {
			int min =i;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[min]<ch[j]) {
					min=j;
				}
			}
			if(min!=i) {
				char temp =ch[i];
				ch[i]=ch[min];
				ch[min]=temp;
			}
		}
		return ch;
		
	}
	public static void main(String[] args) {
		String s1 = "top";
		String s2 = "pot";
		String s3 = "otp";
		if(s1.length()==s2.length() && s1.length()==s3.length() && s2.length()==s3.length()) {
			s1=LowerCase(s1); 
			s2=LowerCase(s2);
			s3=LowerCase(s3);
			char ch1[]=convertCharArray(s1);
			char ch2[]=convertCharArray(s2);
			char ch3[]=convertCharArray(s3);
			ch1=sortChars(ch1);
			ch2=sortChars(ch2);
			ch3=sortChars(ch3);
			boolean flag=false;
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]==ch2[i] && ch1[i]==ch3[i] && ch2[i]==ch3[i]) {
					flag = true;
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println("the given three strings are   anagrams");
			}
			else {
				System.out.println("not anagrams");
			}
		}
		else {
			System.out.println("not anagrams");
		}
	}
}
