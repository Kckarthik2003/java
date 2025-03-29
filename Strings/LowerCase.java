package com.Strings;

public class LowerCase 
{
	public static void main(String[] args) 
	{
		String s = "KURUKOOTI CH@NDRA KARTH!K 123 ";
		System.out.println(toLowerCase(s));	
	}
	public static String toLowerCase(String s) 
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
}
