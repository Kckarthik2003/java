// write a program for 'n' no of prime numbers
package com.programs;
import java.util.Scanner;
public class NprimeNo {
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
		for(int i=1;n>0;i++) {
			boolean temp = isPrime(i);
			if(temp==true) {
				System.out.println(i+" is prime number");
				i++;
			}
		}
		
	}
}
