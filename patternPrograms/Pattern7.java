package com.patternPrograms;
import java.util.Scanner;
/*Enter the 'n' value : 5
*********
 ******* 
  *****  
   ***   
    *    */
public class Pattern7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		s.close();
		for(int r=1; r<=n ; r++) {
			for(int c=1;c<=n*2-1;c++) {
				if(r<=c && r+c<=n*2) {
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
