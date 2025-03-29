package com.arrayPrograms;
import java.util.Scanner;
public class MinElemArray {

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
			int res=minElem(arr);
			System.out.println("The minimum element in the given array is : "+res);
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
}


