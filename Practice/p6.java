package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class p6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row size : ");
		int r = s.nextInt();
		System.out.print("Enter the col size : ");
		int c= s.nextInt();
		int a[][]=new int [r][c];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("Enter the coordinate value ["+j+", "+i+" ] : ");
				a[j][i]=s.nextInt();
			}
		}
		for(int res[]:a) {
			System.out.println(Arrays.toString(res));
		}
	}
}
