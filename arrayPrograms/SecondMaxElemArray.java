package com.arrayPrograms;
import java.util.Scanner;
public class SecondMaxElemArray {
		// main method
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
			int res=MaxElem(arr);
			System.out.println("The second maximum element of an array : "+res);
			
		}
		// second maximum element method
		public static int MaxElem(int[]a) {
			int max=a[0];
			for(int i =0; i<a.length; i++) {
				if(max<a[i]) {
					max=a[i];
				}
			}
			int max2=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]>max2 && a[i]!=max)
					max2=a[i];
			}
			return max2;
		}
}


