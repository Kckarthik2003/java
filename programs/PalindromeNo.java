package com.programs;
//write a program to check the given number is palindrome or not
import java.util.Scanner;
public class PalindromeNo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		int rev=0;
		int copy=n;
		s.close();
		while(n!=0) {
			int rem = n%10;
			rev = rev*10+rem;
			n=n/10;
			
		}
		if(copy==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
	}
}
