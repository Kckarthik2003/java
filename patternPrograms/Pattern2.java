package com.patternPrograms;

import java.util.Scanner;
// number pattern
/*Enter the 'n' value : 5
* * * * *   
  *     *   
    *   *   
      * *   
        *   
*/
public class Pattern2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		s.close();
		for(int r =1; r<=n ; r++) {
			for(int c=1;c<=n;c++) {
				if(r==c || c==n || r==1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}
	}
}
