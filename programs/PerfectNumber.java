package com.programs;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the n value : ");
		int n = s.nextInt();
		int sum =0;
		for (int i =1; i<=n/2 ; i++) {
			if (n%i==0) {
				sum = sum+i;
			}
		}
		if(sum==n) {
		System.out.println("the number "+n+" is the perfect number");
		}
		else {
			System.out.println("the number "+n+" is not a perfect number");
		}
	}
}
