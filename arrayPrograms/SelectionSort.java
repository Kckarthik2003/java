package com.arrayPrograms;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) 
	{
		int a[]= {5,10,1,2,-3};
		for(int i=0; i<a.length;i++) 
		{
			int min=i;
			for(int j=i+1;j<a.length;j++) 
			{
				
				if(a[min]<a[j]) // '<' is used to get to sort in decending order
				{ 
					min=j;
				}
			}
			
			if(min!=i) 
			{
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}
