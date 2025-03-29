// write a program for 'nth' prime number
package com.programs;
import java.util.Scanner;
public class NthPrimeNo {
	public static boolean isPrime(int n) {
		int cf=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				cf++;
			}
		}
		return cf==2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 'n' value : ");
		int n = sc.nextInt();
		sc.close();
		if (n==0)
			System.out.println("enter a valid number");
		int i=1;
		for(;n>0;i++) {
			boolean temp = isPrime(i);
			if(temp) {
				n--;
			}
//			if(n==0)
//			{
//				System.out.println(i);
//			}
			
			
		}
		System.out.println(i-1);
	}
}
