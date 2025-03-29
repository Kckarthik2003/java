// write a program to check the given number is tech number or not
package com.programs;
//import java.util.Scanner;
//public class TechNumber {
//	public static int CountNo(int n) {
//		int c=0;
//		while(n!=0) {
//			n=n/10;
//			c++;
//		}
//		return n;
//	}
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter th 'n' value : ");
//		int n = s.nextInt();
//		int copy = n;
//		int cd = CountNo(n);
//		int od = n%100;
//		System.out.println(od);
//		int nd = n/100;
//		System.out.println(nd);
//		if(cd%2==0) {
//			int tech=(od)+(nd);
//			int res = tech*tech;
//			System.out.println(res);
//			if(res==copy) {
//				System.out.println(n+" is a Tech Number");
//			}
//			else {
//				System.out.println("not a tech no");
//			}
//		}
//		else
//			System.out.println("not a tech no");
//		s.close();
//	}
//	
//}
//******************************************************************************
import java.util.Scanner;
class TechNumber{
	public static int CountNo(int n) {
		int c=0;
		while(n!=0) {
			n=n/10;
			c++;
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter th 'n' value : ");
		int n = s.nextInt();
		int copy = n;
		int cd = CountNo(n);
		if(cd%2==0) {
			int div=(int)Math.pow(10,cd/2);
			int fh = n/div;
			int lh = n%div;
			int sum = fh+lh;
			int sq=sum*sum;
			if(sq==copy) {
				System.out.println("tech no");
			}
			else
				System.out.println("not a tech no");
		}
		else {
			System.out.println("not a tech no");
		}
	}
}




