package com.programs;
import java.util.Scanner;
// write a program to convert the octal to decimal value
public class OctToDeci {
			public static void main(String[] args) {
				Scanner s = new Scanner(System.in);
				System.out.print("Enter th 'n' value : ");
				int n = s.nextInt();
				s.close();
				String oct="";
				while(n!=0) {
					int rem = n%2;
					oct = rem+oct;
					n = n/2;
				}
					System.out.println(oct);
				}
		}



