package com.programs;
// write a program to find the given number is armstrong number or not
import java.util.Scanner;

public class ArmStrongNumber {
	// count method
	public static int CountDigits(int n) {
		int c = 0;
		while (n!=0) {
			c++;
			n=n/10;
			
		}
		return c;
	}
	// power method
	public static int Pow(int base, int exp) {
		int pow=1;
		for(int i = 1;i<=exp;i++) {
			pow = pow*base;
		}
		return pow;
	}
	// main method      
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
			System.out.print("Enter the n value : ");
			int n = s.nextInt();
			int n1 = n;
			int cd =CountDigits(n);
			int sum =0;
			while(n!=0) {
				int rem = n%10;
				sum = sum+Pow(rem,cd);
				n=n/10;
			}
			if(sum==n1) {
				System.out.println("armstrong");
			}
			else {
				System.out.println("not a armstron");
			}
			
		
	}
}

