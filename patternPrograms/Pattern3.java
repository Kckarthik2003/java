package com.patternPrograms;

import java.util.Scanner;
// star pattern
/*Enter the 'n' value : 5
        *   
      * *   
    *   *   
  *     *   
* * * * *   
*/
public class Pattern3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		s.close();
		for(int r =1; r<=n ; r++) {
			for(int c=1;c<=n;c++) {
				if(r+c==n+1 || c==n || r==n) {
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
