package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class p9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter row 1 index");
		int c1=s.nextInt();
		System.out.println("Enter row 2 index");
		int c2=s.nextInt();
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int arr[]:a) {
			System.out.println(Arrays.toString(arr));
		}
		if(c1>=0 &&c1<a.length && c2>=0 &&c2<a.length) {
			for(int i=0;i<a.length;i++) {
				int temp = a[i][c1];
				a[i][c1]=a[i][c2];
				a[i][c2]=temp;
			}
		}
		for(int arr[]:a) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
