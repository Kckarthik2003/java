package com.programs;
// write a program to convert reverse of a number
import java.util.Scanner;
public class ReverseOfAnumber {
	public static int reverse(int n) {
		int rev = 0;
		while(n!=0) {
			rev =rev*10+(n%10);
			n = n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		s.close();
		System.out.println("reverse of the "+n+" value is "+reverse(n));
}
}