package com.patternPrograms;

import java.util.Scanner;

public class Dummy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		s.close();
		for(int c=1; c<=2*n-1 ; c--) {
			for(int r=1;r<=n;r--) {
				if(c>=r && c+r<=n*2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
