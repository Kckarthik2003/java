package com.programs;
//write a program to check the given number is xylem or pholem
import java.util.Scanner;
public class XlemPholemNo {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the n value : ");
	int n =s.nextInt();
	int ids = 0,eds = 0;
	eds = n%10;
	n = n/10;
	while(n>9) {
		ids = ids+(n%10);
		n=n/10;
	}
	eds = eds+n;
	System.out.println(eds==ids?"xylem no":"pholem no");
	s.close();
}
	
}



