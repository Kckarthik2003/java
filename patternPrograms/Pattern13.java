package com.patternPrograms;
/*Enter the 'n' value : 10
                  a                   
                ` a `                 
              _ ` a ` _               
            ^ _ ` a ` _ ^             
          ] ^ _ ` a ` _ ^ ]           
        \ ] ^ _ ` a ` _ ^ ] \         
      [ \ ] ^ _ ` a ` _ ^ ] \ [       
    Z [ \ ] ^ _ ` a ` _ ^ ] \ [ Z     
  Y Z [ \ ] ^ _ ` a ` _ ^ ] \ [ Z Y   
X Y Z [ \ ] ^ _ ` a ` _ ^ ] \ [ Z Y X 
*/
import java.util.Scanner;
public class Pattern13 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 'n' value : ");
		int n=s.nextInt();
		char a='a';
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