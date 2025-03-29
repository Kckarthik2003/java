package com.arrayPrograms;
import java.util.*;
public class CountOfMoneyRequiredInTheArrayForTheGivenMoney {
	// also take the variety of notes in an array by taking user input
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the size of an array : ");
		int size=s.nextInt();
		int a[] = new int[size];
		for(int i =0;i<a.length;i++) {
			System.out.println("Enter the requried currency note : ");
			a[i]=s.nextInt();
		}
		System.out.print("Enter the Amount to Deposit : ");
		int n = s.nextInt();
//		int a[]= {500,200,100,50,20,10,5,1};// descending order only this array
		for(int i=0;i<a.length && n!=0;i++) {
			int q=n/a[i];
			if(q>0) {
				System.out.println("The count of "+a[i]+" required for the given amount is/are : "+q);
				n=n-(q*a[i]);
			}
		}
		
	}
}

/*Enter the size of an array : 5
Enter the required currency note : 
100
Enter the required currency note : 
50
Enter the required currency note : 
20
Enter the required currency note : 
10
Enter the required currency note : 
5
Enter the Amount to Deposit : 12345
The count of 100 required for the given amount is/are : 123
The count of 20 required for the given amount is/are : 2
The count of 5 required for the given amount is/are : 1
*/
