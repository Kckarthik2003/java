package com.arrayPrograms;

import java.util.Scanner;
// if is their any duplicates then remove all the duplicates first in an array to find the sum of paired elements = target;
public class SumOfPairedElesEqualsToTarget {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the target number : ");
		int t=s.nextInt();
		int a[]= {1,2,3,4,5,};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==t) {
					System.out.println(a[i]+"   "+a[j]);
				}
			}
		}
	}
}
