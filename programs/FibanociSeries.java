// write a program to check the given number is fibonacci series
package com.programs;
import java.util.Scanner;
public class FibanociSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first series : ");
		long a = sc.nextInt();
		System.out.print("Enter the second series : ");
		long b = sc.nextInt();
		System.out.print("Enter the count of the series : ");
		long s = sc.nextInt();
		sc.close();
		for(long i=1;i<=s;i++) {
			System.out.println(a+"");
			long c = a+b;
			a=b;
			b=c;	
		}
	}
}

