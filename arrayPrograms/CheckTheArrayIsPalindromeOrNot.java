package com.arrayPrograms;

public class CheckTheArrayIsPalindromeOrNot 
{
	public static void main(String[] args) 
	{
		int a[]= {11,2,3,2,11};
		int i=0;
		int j=a.length-1;
		boolean bool = true;
		while(i<j) {
			if(a[i]==a[j]) {
				i++;j--;
			}
			else {
				bool = false;
				break;
			}
		}
		if(bool==true) {
			System.out.println("It is a palindromic Array");
		}
		else {
			System.out.println("It is not a palindromic Array");
		}
		
	}
		
}
		

