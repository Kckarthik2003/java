package com.patternPrograms;

import java.util.Scanner;
/*Enter the 'n' value : 4
1 5 9 13  
2 6 10 14  
3 7 11 15  
4 8 12 16  */
public class Pattern6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n = s.nextInt();
		s.close();;
		for(int r =1; r<=n ; r++) {
			int a =r;
			for(int c=1;c<=n;c++) {
					System.out.print(a+" ");
					a=a+n;
				
			}
			System.out.println(" ");
		}
	}
}
