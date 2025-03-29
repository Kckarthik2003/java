package com.arrayPrograms;

import java.util.Arrays;

public class RotateAnArrayToRightSide {
	
	
	public static void main(String[] args) {
		
		//left rotating array
		int a[] = {1,2,3,4,5};
		int t=a[0];
		int i=1;
		while(i<a.length) {
			a[i-1]=a[i];
			i++;
		}
		a[a.length-1]=t;
		System.out.print("Left Rotating Array is : ");
		System.out.println(Arrays.toString(a));
		System.out.println("------------------------------------------------------");
		
		
		// right rotating array
		int b[] = {11,12,13,14,15};
		int t1=b[b.length-1];
		int i1=b.length-2;
		while(i1>=0) {
			b[i1+1]=b[i1];
			i1--;
		}
		b[0]=t1;
		System.out.print("Right Rotating Array is : ");
		System.out.println(Arrays.toString(b));
	}
	
	// right rotating array
//	public static void main(String[] args) {
//		
//		
//	}
	
		
}
