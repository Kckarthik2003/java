package com.arrayPrograms;

import java.util.Scanner;

public class AverageArray {
	public static double AverageOfArray(double a[]) {
		double sum=0;
		for(int i=0; i<a.length;i++) {
			sum=sum+a[i];
		}	
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size= s.nextInt();
		double arr[]=new double[size];
		for (int i=0;i<size;i++) {
			System.out.print("Enter element of an array["+i+"] : ");
			arr[i]=s.nextDouble();
		}
		s.close();
		double sum = AverageOfArray(arr);
		System.out.println(sum);		

	}
	
}
