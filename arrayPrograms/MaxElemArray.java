package com.arrayPrograms;
import java.util.Scanner;
public class MaxElemArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size= s.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			System.out.print("Enter element of an array["+i+"] : ");
			arr[i]=s.nextInt();
		}
		s.close();
		int res=MaxElem(arr);
		System.out.println("The maximum element in the given array is : "+res);
	}
	public static int MaxElem(int[]a) {
		int max=a[0];
		for(int i =0; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
}
