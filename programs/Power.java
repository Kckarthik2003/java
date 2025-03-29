package com.programs;
//write  a program ask input from user base and exponent and find the out power
import java.util.Scanner;
public class Power {
	public static void powerVal(int x, int y) {
		int p =1;
		for(int i =1; i<=y;i++) {
			p = p*x;
		}
		System.out.println(p);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base of the number : ");
		int base = sc.nextInt();
		System.out.print("Enter the exponent of the number : ");
		int exp = sc.nextInt();
		powerVal(base,exp);
		
	}
}
