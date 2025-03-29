package com.programs;
import java.util.Scanner;
// write a program to check the given number is sunny number or not
public class SunnyNumber {
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the 'n' value : ");
			int n = s.nextInt();
			int i=1;
			s.close();
			while(true) {
				if(i*i==n+1) {
					System.out.println(n+" is a sunny number");
					break;
				}
				if(i*i>n+1) {
					System.out.println(n+" is not a sunny number");
					break;
				}
				i++;
			}
	}
}
