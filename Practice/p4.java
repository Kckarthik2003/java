package com.Practice;

import java.util.Arrays;

public class p4 {
	public static void main(String[] args) {
		int a[][]= {{2,7,6},{4,3,1},{7,8,6}};
		for(int j=0;j<a[0].length;j++) {
			reverse(a,j);
		}
		for(int arr[]:a) {
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void reverse(int a[][],int col) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int temp=a[i][col];
			a[i][col]=a[j][col];
			a[j][col]=temp;
			i++;
			j--;
		}
	}
}
