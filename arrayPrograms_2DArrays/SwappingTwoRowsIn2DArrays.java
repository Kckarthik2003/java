package com.arrayPrograms_2DArrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingTwoRowsIn2DArrays {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row index");
		int r1 = s.nextInt();
		System.out.print("Enter the row index");
		int r2 = s.nextInt();
		int a[][]= {{2,7,6},{9,5,1},{4,3,8}};
		System.out.println("before swapping");
		for(int [] arr:a) {
			System.out.println(Arrays.toString(arr));
		}
		if(r1>=0 && r1<a.length && r2>=0 && r2<a.length) {
			for(int i=0;i<a.length;i++) {
				int temp =a[r1][i];
				a[r1][i]=a[r2][i];
				a[r2][i]=temp;
			}
			System.out.println("Ater Swapping");
			for(int[]arr:a) {
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}
