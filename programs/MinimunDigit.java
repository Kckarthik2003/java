package com.programs;
//to find the minimum digit in the given number
import java.util.Scanner;
public class MinimunDigit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");                                                                                
		int n = s.nextInt();
		s.close();
		int min=9;
		while(n!=0) {
			int rem = n%10;
			if(rem<min) {
				min=rem;
			}
			n = n/10;
		}
		System.out.println("Minimum Digit in the given number is : "+min);
	}
}
