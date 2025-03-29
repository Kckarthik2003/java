package com.arrayPrograms_2DArrays;

import java.util.Arrays;

public class Rotate2DArrayIn90Deg {
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
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		Actual Array
		System.out.println("Actual Array");
		for(int[]arr :a) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("___________________________________________");
//		transpose
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a[i].length;j++) {
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
			}
		}
//		swapping
		for(int i=0;i<a.length;i++) {
			reverse(a[i]);
		}
//		result
		System.out.println("After rotating 2d Array in 90 deg");
		for(int[]arr :a) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("___________________________________________");
	}
		
}
