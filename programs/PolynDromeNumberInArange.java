package com.programs;
import java.util.Scanner;
// write a program to check and print only polyndrome numbers from the given range upto n no.of values
public class PolynDromeNumberInArange {
	public static int reverse(int n) {
		int rev = 0;
		while(n!=0) {
			rev =rev*10+(n%10);
			n = n/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		System.out.print("Enter the Starting Value : ");
		int start = s.nextInt();
		s.close();
		while(n>0) {
			if(start==reverse(start)) {
				System.out.println(start);
				n--;
			}
			start++;
		}
	}
}
