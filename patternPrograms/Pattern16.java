package com.patternPrograms;
/*Enter the 'n' value : 5
1 2 3 4 5 6 7 8 9 
  1 2 3 4 5 6 7   
    1 2 3 4 5     
      1 2 3       
        1         
*/
import java.util.Scanner;
public class Pattern16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n=s.nextInt();
		s.close();
		
		for(int r=1;r<=n;r++) {
			int a=1;
			
			for(int c=1;c<=n*2-1;c++) {
				if(r<=c && r+c<=n*2) {
						System.out.print(a+" ");
						a++;
					}
					else {
						System.out.print("  ");	
					}
			}
			System.out.println();
		}
	}
}

