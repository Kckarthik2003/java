package com.Strings;

//import java.util.Arrays;
// using inbuilt methods
/*
public class AnagramString {
	public static void main(String[] args) {
		String s1 = "Listen";
		String s2 = "Silent";
		if(s1.length()==s2.length()) {
			s1=s1.toLowerCase();
			s2=s2.toLowerCase();
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			// here we should use any sorting techniques i.e, bubble sort
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			String str1 = new String(ch1);
			String str2 = new String(ch2);
			System.out.println(str1);
			System.out.println(str2);                       
			if(str1.equals(str2)) {
				System.out.println("the given both strings are anagrams");
				}
			else {
				System.out.println("not anagrams");
			}
			
		}
		else {
			System.out.println("not a anagram");
		}
	}
}
*/
// using user defined methods
public class AnagramString {
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
		String s1 = "Listen";
		String s2 = "Silent";
		if(s1.length()==s2.length()) {
			s1=LowerCase(s1);
			s2=LowerCase(s2);
			char ch1[]=convertCharArray(s1);
			char ch2[]=convertCharArray(s2);
			ch1=sortChars(ch1);
			ch2=sortChars(ch2);
			boolean flag=false;
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]==ch2[i]) {
					flag = true;
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println("anagrams");
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

