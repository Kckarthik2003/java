package com.Practice;

import java.util.Scanner;

public class c1 {
	public static void main(String[] args) {
		
////		swapping numbers
		
//		int a = 10;
//		int b = 20;
//		System.out.println(a+"    "+b+"   ---> before swapping ");
////		logic 1
////		int temp =a;
////		a=b;
////		b=temp;
////		logic 2
////		a=a+b;
////		b=a-b;
////		a=a-b;
////		logic 3
////		a=a^b;
////		b=a^b;
////		a=a^b;
////		logic 4
////		a=a*b;
////		b=a/b;
////		a=a/b;
////		logic 5
//		b=a+b-(a=b);
//		System.out.println(a+"    "+b+"   ---> after swapping ");
		
//	*************************************************************************************************	
//		reverse a number
		
//		logic 1 -algorithm
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter a number : ");
//		int num = s.nextInt();
//		int rev =0;
//		while(num!=0) {
//			rev =rev*10 + num%10;
//			num = num/10;
//		}
//		System.out.println("Reverse number is : "+rev);
		
//		logic 2 - String buffer class 
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter a number : ");
//		int num = s.nextInt();
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		System.out.println("Reverse number is : "+rev);
		
//		logic 3 - String Builder class
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter a number : ");
//		int num = s.nextInt();
//		StringBuilder sbl = new StringBuilder();
//		sbl.append(num);
//		System.out.println("Reverse number is : "+sbl.reverse());
		
//		*************************************************************************************************	
		
//		reverse a string 
//		logic 1
//		Scanner s = new Scanner(System.in);
//		String str = new String();
//		System.out.print("Enter a string : ");
//		str = s.next();
//		String rev="";
//		int len = str.length();
//		for(int i=len-1;i>=0;i--) {
//			rev =rev+str.charAt(i);
//		}
//		System.out.println("Reversed String is : "+ rev);
		
//		logic 2 - char array
//		Scanner s = new Scanner(System.in);
//		String str = new String();
//		System.out.print("Enter a string : ");
//		str = s.next();
//		String rev="";
//		char a[]=str.toCharArray();
//		for(int i=a.length-1;i>=0;i--) {
//			rev =rev +a[i];
//		}
//		System.out.println("The reversed String is : "+rev);
		
//		logic 3 - stringBuffer class
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter a string : ");
//		StringBuffer str = new StringBuffer(s.next());
//		System.out.println(str.reverse());
		
//		logic 4 - stringBuilder class
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter a string : ");
//		StringBuilder str = new StringBuilder();
//		str.append(s.next());
//		System.out.println(str.reverse());

//		*************************************************************************************************	
		
//		palindrome number
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter a number : " );
//		int num = s.nextInt();
//		int num1=num;
//		int num2=0;
//		while(num!=0) {
//			num2=num2*10+num%10;
//			num=num/10;
//		}
//		System.out.println(num1==num2?num1+" is a palindrome number":num1+" is not a palindrome number");
		
//		*************************************************************************************************	
//		palindrome string
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter a String : " );
//		String str =s.next();
//		String rev = "";
//		for(int i=str.length()-1;i>=0;i--) {
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(str.equals(rev)?str+" is a palindromic string":str+" is not a palindromic string");
		
//		*************************************************************************************************	
		
//		count of numbers
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n1 = s.nextInt();
		int count=0;
		while(n1!=0) {
			n1=n1/10;
			count++;
			
		}
		System.out.println("The count of the given number is : "+count);
	}
}
