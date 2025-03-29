package com.arrayPrograms;

import java.util.Arrays;

public class RemoveDuplicatesFromTheGivenArrayElements 
{
	public static void main(String[] args) 
	{
			int a[]= {10,12,23,12,20,34,12,12};
			int res[]=removedDuplicates(a);
			System.out.println(Arrays.toString(res));
	}
	
	public static int[] removedDuplicates(int[] arr) 
	{
		int c=0;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]!=-1) 
			{
				for(int j=i+1;j<arr.length;j++) 
				{
					if(arr[i]==arr[j]) 
					{
						arr[j]=-1;
						c++;
					}
				}
			}
		}
		int res[]=new int[arr.length-c];
		int k=0;
		for(int i=0;i<=arr.length-c;i++) 
		{
			if(arr[i]!=-1) 
			{
				res[k]=arr[i];
				k++;
			}
			
		}
		return res;
	}
}


