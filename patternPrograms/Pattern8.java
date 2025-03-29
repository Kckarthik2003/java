package com.patternPrograms;

import java.util.Scanner;
/*Enter the 'n' value : 5
*    
**   
***  
**** 
*****
**** 
***  
**   
*    
     
*/
public class Pattern8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		s.close();
		for(int r=1; r<=2*n ; r++) {
			for(int c=1;c<=n;c++) {
				if(r>=c && r+c<=n*2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
