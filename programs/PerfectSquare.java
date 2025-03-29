package com.programs;
// write a program to check whether the given number is prefect square or not
import java.util.Scanner;
public class PerfectSquare {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		int i=1;
		s.close();
		while(true) {
			if(i*i==n) {
				System.out.println("perfect square ");
				break;
			}
			if(i*i>n) {
				System.out.println("not a perfect square ");
				break;
			}
			i++;
		}
				
	}
}
