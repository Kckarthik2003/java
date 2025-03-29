package com.arrayPrograms;
import java.util.Arrays;
import java.util.Scanner;
//bubble sort
public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {10,557,63,90,-1,-2,89,34,26};
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int tem=a[j];
					a[j]=a[j+1];
					a[j+1]=tem;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
