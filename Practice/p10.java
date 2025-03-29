package com.Practice;

import java.util.Arrays;

public class p10 {
	public static void BubbleSort(int a[][],int col) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j][col]>a[j+1][col]) {
					int temp = a[j][col];
					a[j][col]=a[j+1][col];
					a[j+1][col]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[][]= {{3,2,1},{35,4,5},{9,7,8}};
		for(int arr[]:a) {
			System.out.println(Arrays.toString(arr));
		}
		for(int i=0;i<a[0].length;i++) {
			BubbleSort(a,i);
		}
		for(int arr[]:a) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
