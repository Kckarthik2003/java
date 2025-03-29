package com.Practice;

import java.util.Scanner;

//153 = 1^3 + 5^3 + 3^3 = 153
public class ArmStrongNumber {
	public static int Count(int n) {
		int c=0;
		while(n!=0) {
			c++;
			n =n/10;
		}
		return c;
	}
	public static int Power(int base,int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power = power*base;
		}
		return power;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("enter a number : ");
		int n = s.nextInt();
		int copy = n;
//		s.close();
		int sum=0;
		int cnt=Count(n);
		while(n!=0) {
			int ld=n%10;
			sum = sum+Power(ld, cnt);
			n =n/10;
		}
		if(sum==copy) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("not a armstrong number");
		}
		
	}
}
