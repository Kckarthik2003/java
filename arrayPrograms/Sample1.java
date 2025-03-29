package com.arrayPrograms;
import java.util.Scanner;
public class Sample1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[]= {12,34,17,35,98,87,24};
		int ele = s.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				flag=true;
				break;
			}
			
			
		}
		if(flag) {
			System.out.println("Ele is found");
		}
		else {
			System.out.println("Ele is not found");
		}
	}
}
