package com.arrayPrograms_2DArrays;

import java.util.Arrays;

public class SortRowWise 
{
	public static void main(String[] args) 
	{
		int a[][]= {{2,7,6},{9,5,1},{4,3,8}};
		System.out.println("before sorting");
		for(int[] arr:a) 
		{
			System.out.println(Arrays.toString(arr));
		}
		for(int i=0;i<a.length;i++) 
		{
			bubbleSort(a[i]);
		}
		System.out.println("After Sorting");
		for(int[]arr:a)
		System.out.println(Arrays.toString(arr));
	}
	public static void bubbleSort(int arr[]) 
	{
		for(int  i=0;i<arr.length-1;i++) 
		{
			for(int j=0;j<arr.length-1;j++) 
			{
				if(arr[j]>arr[j+1]) 
				{
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
