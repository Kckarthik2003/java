package com.programs;
import java.util.Scanner;
public class FirstDigitEvenOdd {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		while(n>9){
			n=n/10;
		}
		if(n%2==0) {
			System.out.println("First digit is even");
		}
		else {
			System.out.println("first digit is odd");
		}
		s.close();
	}
}
