package com.patternPrograms;
/*Enter the 'n' value : 10
1                   
2 1                 
3 2 1               
4 3 2 1             
5 4 3 2 1           
6 5 4 3 2 1         
7 6 5 4 3 2 1       
8 7 6 5 4 3 2 1     
9 8 7 6 5 4 3 2 1   
10 9 8 7 6 5 4 3 2 1 
9 8 7 6 5 4 3 2 1   
8 7 6 5 4 3 2 1     
7 6 5 4 3 2 1       
6 5 4 3 2 1         
5 4 3 2 1           
4 3 2 1             
3 2 1               
2 1                 
1                   
*/
import java.util.Scanner;
public class Paatern18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n=s.nextInt();
		s.close();
		for(int r=1;r<=n*2-1;r++) {
			int a=r<=n?r:n*2-r;
			for(int c=1;c<=n;c++) {
				
				if(r>=c && r+c<=n*2) {
				
					System.out.print(a+" ");
					a--;
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}