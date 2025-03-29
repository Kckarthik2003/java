package com.patternPrograms;

import java.util.Scanner;
// numbers pattern
/*Enter the 'n' value : 5
1           
2 3         
4 5 6       
7 8 9 10     
11 12 13 14 15*/
public class Pattern4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		s.close();
		int a =1;
		for(int r =1; r<=n ; r++) {
			for(int c=1;c<=n;c++) {
				if(r>=c) {
					System.out.print(a+" ");
					a++;
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
	}
}
