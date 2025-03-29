package com.patternPrograms;
/*Enter the 'n' value : 9
                1                 
              1 2 1               
            1 2 3 2 1             
          1 2 3 4 3 2 1           
        1 2 3 4 5 4 3 2 1         
      1 2 3 4 5 6 5 4 3 2 1       
    1 2 3 4 5 6 7 6 5 4 3 2 1     
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1   
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
*/
import java.util.Scanner;
public class Pattern11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n=s.nextInt();
		for(int r=1;r<=n;r++) {
			int a=1;
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
