package com.arrayPrograms;
import java.util.Scanner;
public class SumOfArray {
	public static int SumOfArrayElem(int a[]) {
		int sum=0;
		for(int i=0; i<a.length;i++) {
			sum=sum+a[i];
		}	
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			System.out.print("Enter element of an array["+i+"] : ");
			arr[i]=s.nextInt();
		}
		s.close();
		int res=SumOfArrayElem(arr);
		System.out.println("The sum of the array elements are : "+res);
	}
}
