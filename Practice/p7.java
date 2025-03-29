package com.Practice;

import java.util.Arrays;

public class p7 {
	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int arr[]:a) {
			System.out.println(Arrays.toString(arr));
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a[i].length;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		for(int arr[]:a) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
