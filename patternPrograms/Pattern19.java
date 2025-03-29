package com.patternPrograms;
/*Enter the 'n' value : 3
1       1 
2 2   2 2 
3 3 3 3 3 
2 2   2 2 
1       1 
   
*/
import java.util.Scanner;
public class Pattern19 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n=s.nextInt();
		s.close();
		for(int r=1;r<=n*2-1;r++) {
			int a=r<=n?r:n*2-r;
			for(int c=1;c<=n*2-1;c++) {
				if((r<=c && r+c>=n*2)|| (r+c<=n*2 && r>=c) ||(r>=n+1 && c-r<=n-1 && r-c<=n-1 && r+c<=n-1)) {
					System.out.print(a+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}