package com.programs;

import java.util.Scanner;
// prime number
/*
public class PrimeNumber {
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
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the n value : ");
		int n = s.nextInt();
		System.out.println(isPrime(n)?"prime":"not a prime");
	}
}
*/

// prime numbers in a range

/*public class PrimeNumber {
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
		System.out.print("Enter the start value : ");
		int s = sc.nextInt();
		System.out.print("Enter the end  value : ");
		int e = sc.nextInt();
		for(int i=s;i<=e;i++) {
			if(isPrime(i)) {
				System.out.println("prime no : "+i);
			}
		}
		}
}*/

//count of number of prime numbers in the given range

public class PrimeNumber {
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
		System.out.print("Enter the start value : ");
		int s = sc.nextInt();
		System.out.print("Enter the end  value : ");
		int e = sc.nextInt();
		for(int i=s;i<=e;i++) {
			if(isPrime(i)) {
				int count = i;
				int cpd =0;
				while(count!=0) {
					int rem = count/10;
					if(isPrime(rem)) {
						cpd++;
					}
					count=count/10;
					}
				System.out.println(count);
				}
			}
		}
	}



