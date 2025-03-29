package com.arrayPrograms;
import java.util.Scanner;
public class EvenElementsOfAnArray {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the array size : ");
			int size= s.nextInt();
			double arr[]=new double[size];
			for (int i=0;i<size;i++) {
				System.out.print("Enter element of an array["+i+"] : ");
				arr[i]=s.nextDouble();
			}
			s.close();
			EvenElem(arr);
		}
		public static void EvenElem(double[]a) {
			for(double ar:a) {
				if(ar%2==0) {
					System.out.println((int)ar);
				}
			}
		}
		
}
