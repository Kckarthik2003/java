package com.patternPrograms;

import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		s.close();
		for(int r =1; r<=n ; r++) {
			for(int c=1;c<=r+n-1;c++) {
				if(c==n || c-r == n-1 || r+c==n+1) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
