package com.programs;
//write a program to convert binary to decimal
import java.util.Scanner;
public class BinaryToDeci {
	
//	public static int pow(int a, int b) {
//		
//	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter th 'binary' value : ");
		int n = s.nextInt();
		int copy = n;
		s.close();
		int exp = 0;
		int sum=0;
		while(n!=0) {
			int p = (int)Math.pow(2,exp);
			int rem = n%10;
			sum+=rem*p;
			n = n/10;
			exp++;
		}
		System.out.println("The Decimal Value for '"+copy+"' value is "+sum);
}
}
// write a program to convert octal to decimal