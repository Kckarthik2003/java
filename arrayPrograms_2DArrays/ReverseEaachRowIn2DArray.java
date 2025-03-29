package com.arrayPrograms_2DArrays;

import java.util.Arrays;

public class ReverseEaachRowIn2DArray {
	public static void main(String[] args) {
		int a[][]= {{2,7,6},{4,3,1},{7,8,6}};
		for(int i=0;i<a.length;i++) {
			reverse(a[i]);
		}
		for(int arr[] : a) {
			System.out.println(Arrays.toString(arr));
		}
		
	}
	public static void reverse(int []arr) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp =arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}
