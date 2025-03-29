package com.arrayPrograms;
import java.util.Scanner;
public class AverageOfEvenElements {

		public static double AverageOfEvenElementArray(double a[]) {
			double sum=0;int c=0;
			for(int i=0; i<a.length;i++) {
				if(a[i]%2==0) {
				sum=sum+a[i];
				c++;
				}
			}	
			return sum/c;
		}
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
			double res = AverageOfEvenElementArray(arr);
			System.out.println("Avarage of Even elements in an array: "+res);		
		}
		
	}

