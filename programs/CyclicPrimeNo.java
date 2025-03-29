package com.programs;
// *** Important ************** 
//write a program to check the given no is cyclic prime no or not
import java.util.Scanner;
public class CyclicPrimeNo {
	public static boolean isPrime(int n) {
		int cf=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				cf++;
			}
		}
		return cf==2;
	}
	public static int countDigits(int n) {
		int c=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = sc.nextInt();
		int cd = countDigits(n);
		int p = (int)Math.pow(10, cd-1);
		while(cd>0) {
			int rem = n%10;
			n=n/10;
			n=rem*p+n;
			if(!isPrime(n)) {
				break;
			}
			cd--;
		}
		System.out.println(cd==0?"Cylic prime no":"not a cyclic prime no");
	}
}

//1193
//3119
//9311
//1931
//*1391
