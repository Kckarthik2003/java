package com.patternPrograms;
/*Enter the 'n' value : 5
        1         
      0 1 0       
    -1 0 1 0 -1     
  -2 -1 0 1 0 -1 -2   
-3 -2 -1 0 1 0 -1 -2 -3 
*/
import java.util.Scanner;
public class Pattern14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n=s.nextInt();
		int a=1;
		for(int r=1;r<=n;r++) {
			
			for(int c=1;c<=n*2-1;c++) {
				
				if(r+c>=n+1 && c-r<=n-1) {
					if(c<n) {
						System.out.print(a+" ");
						a++;
					}
					else {
						System.out.print(a+" ");
						a--;
					}
					
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
