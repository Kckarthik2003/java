package com.arrayPrograms;

public class PrintOnlyUniqueNumbers {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,6,7,6,5,4,3,4,5};
		printUniqueElem(a);
	}
	public static void printUniqueElem(int[]a) {
		for(int i=0;i<a.length;i++) {
			if(a[i]!=Integer.MIN_VALUE) {
				int c=0;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						c++;
						a[j]=Integer.MIN_VALUE;
					}
				}
				if(c==0) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
