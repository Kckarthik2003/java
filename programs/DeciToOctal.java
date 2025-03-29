package com.programs;
import java.util.Scanner;
// write a program to convert decimal number to octal number
// for this 0 to 7 only 
public class DeciToOctal {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter th 'n' value : ");
			int n = s.nextInt();
			s.close();
			String oct="";
			while(n!=0) {
				int rem = n%8;
				oct = rem+oct;
				n = n/8;
			}
				System.out.println(oct);
			}
	}

