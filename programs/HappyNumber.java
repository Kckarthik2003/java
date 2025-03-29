package com.programs;
// write a program to check the given number is Happy Number or not
import java.util.Scanner;
public class HappyNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		s.close();
		while(true) {
			int sum = 0;
			while(n!=0) {
				int rem = n%10;
				sum = sum+(rem*rem);
				n=n/10;
				
			}
//			System.out.println(sum);
			if(sum==1) {
				System.out.println("Happy number");
				break;
			}
			if(sum==4) {
				System.out.println("Un-Happy number");
				break;
			}
			n=sum;
		}
	}
}
