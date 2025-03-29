package com.programs;
//to find the maximum digit in the given number
import java.util.Scanner;
public class MaximumDigit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = s.nextInt();
		int max=0;
		while(n!=0) {
			int rem = n%10;
			if(rem>max) {
				max=rem;
			}
			n = n/10;
		}
		System.out.println("Maximum Digit in the given number is : "+max);
	}
}
