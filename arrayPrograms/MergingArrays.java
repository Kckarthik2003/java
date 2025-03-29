package com.arrayPrograms;

import java.util.Arrays;

public class MergingArrays {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {11,12,13,14,15,16,17,18,19,20,21};
		int mergedArray[]=mergeArray(a,b);
		System.out.println(Arrays.toString(mergedArray));
		System.out.println(a.length);
		System.out.println(b.length);
		System.out.println(mergedArray.length);
	}
	
	public static int[] mergeArray(int a[], int b[]) {
		int res [] =new int[a.length+b.length];
		int j=0;
		for(int i=0;i<res.length;i++) {
			if(i<a.length) {
				res[i]=a[i];
			}
			else {
				res[i]=b[j];
				j++;
			}
		}
		return res;
	}
}
