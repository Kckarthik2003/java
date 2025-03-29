package com.arrayPrograms_2DArrays;

import java.util.Arrays;
import java.util.Scanner;
// 1. align row wise
// 2. align column wise
public class AlignColumnWise {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the row size : ");
		int r=s.nextInt();
		System.out.print("Enter the column size : ");
		int c=s.nextInt();		
		int [][]a=new int[r][c];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("Enter element ara a["+j+"]["+i+"] : ");
				a[j][i]=s.nextInt();
			}
		}
		for(int []arr:a) {
			System.out.println(Arrays.toString(arr));
		}
		
	}
}
