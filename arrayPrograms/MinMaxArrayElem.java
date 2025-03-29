package com.arrayPrograms;
import java.util.Arrays;
import java.util.Scanner;
public class MinMaxArrayElem {
//	//********* sir program ********
//	public static void main(String[] args) {
//		int a[]= {-40,32,34,5,6,7};
//		int[] result = minAndMax(a);
//		System.out.println(Arrays.toString(result));
//	}
//	
//	public static int[] minAndMax(int[]a) {
//		int min = a[0];
//		int max = a[0];
//		for(int i=1;i<a.length;i++)
//		{
//			if(min>a[i])
//				min=a[i];
//			if(a[i]>max)
//				max=a[i];
//		}
//		int res[]=new int[2];
//		res[0]=min;
//		res[1]=max;
//		
//	
//	return res;
//	}
//}
	//******* my program *********//
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the array size : ");
		int size= s.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++) {
			System.out.print("Enter element of an array["+i+"] : ");
			arr[i]=s.nextInt();
		}
		s.close();
		int min=minElem(arr);
		int max=maxElem(arr);
		int a[]= {min,max};
		System.out.print(Arrays.toString(a));
		
	}
	public static int minElem(int[]a) {
		int min=a[0];
		for(int i =0; i<a.length; i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	public static int maxElem(int[]a) {
		int max=a[0];
		for(int i =0; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
}
