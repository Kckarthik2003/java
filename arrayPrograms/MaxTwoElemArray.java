package com.arrayPrograms;
public class MaxTwoElemArray {
	// sir executed
	// with multiple duplicates also it will work 
	public static void main(String[] args) {
		int a[]= {40,120,30,60,90,120};
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i]>max1) {
				max1=a[i];
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>max2 && a[i]!=max1) {
				max2=a[i];
			}
		}
		System.out.println("Max1 is : "+max1);
		System.out.println("Max2 is : "+max2);
	}
}
//23-08-2024 Friday
//1. average of an odd elements in an array
//2. average of an odd index elements in an array
//3. average of an even index elements in an array
//4. find the second minimum element in an array
