package com.Practice;

import java.util.Arrays;

public class p3 {
	public static void main(String[] args) {
		int a[][]= {{2,4,5},{3,6,8},{9,7,5}};
		for(int i=0;i<a[0].length;i++) {
			reverse(a[i]);
		}
		for(int arr[]:a) {
			System.out.println(Arrays.toString(arr));
		}
	}
	public static void reverse(int a[]) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
}
