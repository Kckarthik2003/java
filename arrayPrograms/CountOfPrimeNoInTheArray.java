package com.arrayPrograms;
// similar to this scenario based questions will be asked in interviews like count of palindromes, armstrong numbers etc., present in an array
public class CountOfPrimeNoInTheArray {
	public static boolean isPrime(int remp) {
		int cf=0;
		for(int i=1;i<=remp;i++) {
			if(remp%i==0) {
				cf++;
			}
		}
		return cf==2;
	}
	public static void main(String[] args) {
		int a[]= {11,32,45,98,12,58,78,478};
		int c=0;
		for(int i=0;i<a.length;i++) {
			if(isPrime(a[i])) {
				c++;
			}
		}
		System.out.println("count of prime numbers in the given array is : "+c);
	}
}
