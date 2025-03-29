package com.patternPrograms;

/*Enter the 'n' value : 5
        a         
      a b a       
    a b c b a     
  a b c d c b a   
a b c d e d c b a 
*/
import java.util.Scanner;
public class Pattern12 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n=s.nextInt();
		for(int r=1;r<=n;r++) {
			char a='a';
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
