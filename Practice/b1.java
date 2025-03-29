package com.Practice;

import java.util.Scanner;

public class b1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the 'n' value : ");
		int n= s.nextInt();
		for(int i=1;i<=n;i++) {
			int a=i;
			for(int j=1;j<=n;j++) {
					System.out.print(a+" ");
					a+=n;
				}
			System.out.println();
			}
			
		}
	}
