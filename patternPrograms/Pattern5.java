package com.patternPrograms;

import java.util.Scanner;
// character pattern
/*Enter the 'n' value : 5
a                 
b  c              
d  e  f           
g  h  i  j        
k  l  m  n  o     */
public class Pattern5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		s.close();
		char a ='a';
		for(int r =1; r<=n ; r++) {
			for(int c=1;c<=n;c++) {
				if(r>=c) {
					System.out.print(a+"  ");
					a++;
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println("   ");
		}
	}
}
