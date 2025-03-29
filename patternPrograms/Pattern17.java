package com.patternPrograms;
/*Enter the 'n' value : 5
a b c d e f g h i 
  j k l m n o p   
    q r s t u     
      v w x       
        y         
*/
import java.util.Scanner;
public class Pattern17 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n=s.nextInt();
		s.close();
		char a ='a';
		for(int r=1;r<=n;r++) {
			
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
