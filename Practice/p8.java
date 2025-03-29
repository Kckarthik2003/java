package com.Practice;

import java.util.Arrays;

public class p8 {
	public static void reverse(int a[]) {
		int i=0;
		int j=a.length-1;
		while(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("before");
		for(int arr[]:a) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("_____________________________-");
//		transpose
		for(int i =0;i<a.length;i++) {
			for(int j=i+1;j<a[i].length;j++) {
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		System.out.println("after transpose");
		for(int arr[]:a) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("_____________________________-");
		
		for(int i=0;i<a.length;i++) {
			reverse(a[i]);
		}
		System.out.println("after rotating");
		for(int arr[]:a) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("_____________________________-");
	}
}
