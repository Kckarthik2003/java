package com.programs;
// convertions
//write a program to convert decimal to binary
import java.util.Scanner;
public class DeciToBinary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter th 'n' value : ");
		int n = s.nextInt();
		s.close();
		String bin="";
		while(n!=0) {
			int rem = n%2;
			bin = rem+bin;
			n = n/2;
		}
			System.out.println(bin);
		}
}
