package com.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfSubArrayElementsEqualToTarget {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the target value : ");
		int r=s.nextInt();
		int a[]= {1,2,3,4,5};
		int res[]=sumofSubArrayElem(a,r);
		System.out.println(Arrays.toString(res));
	}
	public static int[] sumofSubArrayElem(int a[],int t) {
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum=sum+a[k];
				}
				if(sum==t) {
					int res[]=new int[2];
					res[0]=i;
					res[1]=j;
					return res;
				}
			}
		}
		int res1[]= {-1,-1};
		return res1;
	}
}
