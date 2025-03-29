package com.Practice;
import java.util.Scanner;
public class Dummy1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n =s.nextInt();
		s.close();
		
		
//		System.out.print("		");
		
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=n; c++) {
				if((r==1 && c!=1 && c!=n)||(c==1 && r!=1) || (c==n && r!=1) || r==(n/2)+1)  {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("	");
		
		
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=n; c++) {
				if(c==1 || (r==(n/2)+1 && c!=n) || (r==1 && c!=n) || (r==n && c!=n) || (c==n && r!=1 && r!=n && r!=(n/2)+1))  {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("	");
		
		
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=n; c++) {
				if((r==1 && c!=1 && c!=n) || (r==n && c!=1 && c!=n) || (c==1 && r!=1 && r!=n))  {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("	");
		
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=n; c++) {
				if((c==1) || (r==1 && c!=n) || (r==n && c!=n) || (c==n && r!=1 && r!=n))  {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("	");
		
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=n; c++) {
				if((r==1) || (r==n) || (c==1) || ((r==(n/2)+1) && c!=n))  {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("	");
		
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=n; c++) {
				if((c==1) || (r==1) || (r==(n/2+1) && c!=n))  {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("	");
		
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=n; c++) {
				if(((c==1) && r!=1 && r!=n) || (r==1 && c!=n) || (r==n && c!=n) || (c==n && r!=n && r==(n/2)+2) || (r==((n/2)+1) && c!=1 && c!=2))  {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("	");
		
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=n; c++) {
				if((c==1) || (c==n) || (r==(n/2)+1))  {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("	");
		
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=n; c++) {
				if(r==1 || r==n || (c==(n/2)+1))  {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("	");
		
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=n; c++) {
				if(((r==1) && (c!=1) && (c!=n)) || ((c==(n/2)+1) && r!=n) || (r==n && c<(n/2)+1 && c!=1) || (c==1 && r==(n-1)))  {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("	");
		
		
		for(int r=1;r<=n;r++) {
			for(int c=1; c<=n; c++) {
				if((c==1) || (r<=(n/2)+1) && (r+c==n+1) || (r>=(n+2)+1) && (r==c))  {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}











// A 
// (r==1 && c!=1 && c!=n)||(c==1 && r!=1) || (c==n && r!=1) || r==(n/2)+1

// B
// c==1 || (r==(n/2)+1 && c!=n) || (r==1 && c!=n) || (r==n && c!=n) || (c==n && r!=1 && r!=n && r!=(n/2)+1)

// C
// (r==1 && c!=1 && c!=n) || (r==n && c!=1 && c!=n) || (c==1 && r!=1 && r!=n)

// D
// (c==1) || (r==1 && c!=n) || (r==n && c!=n) || (c==n && r!=1 && r!=n)

// E
// (r==1) || (r==n) || (c==1) || (r==(n/2)+1)

// F
// (c==1) || (r==1) || (r==(n/2+1) && c!=n)

// G
// ((c==1) && r!=1 && r!=n) || (r==1 && c!=n) || (r==n && c!=n) || (c==n && r!=n && r==(n/2)+2) || (r==((n/2)+1) && c!=1 && c!=2)

// H
// (c==1) || (c==n) || (r==(n/2)+1)

// I
// r==1 || r==n || (c==(n/2)+1)

// J
// ((r==1) && (c!=1) && (c!=n)) || ((c==(n/2)+1) && r!=n) || (r==n && c<(n/2)+1 && c!=1) || (c==1 && r==(n-1))




