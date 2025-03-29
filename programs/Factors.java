package com.programs;
// write a program to  print the factors of a given number
import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the n value : ");
		int n = s.nextInt();
		System.out.print("The factors of the given number"+n+" are : ");
		for (int i=1; i<=n ; i++) {
			if (n%i==0) {
				System.out.print(i+", ");
			}
		}
		
	}
}
