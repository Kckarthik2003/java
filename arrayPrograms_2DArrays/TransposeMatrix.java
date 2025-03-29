package com.arrayPrograms_2DArrays;

import java.util.Arrays;
/* 
it is also solved by swapping elements i.e, diagonal elements are 
same even we transpose the matrix so we can swap the i,j index position
element to j,i element position.
*/
public class TransposeMatrix {
	public static void main(String[] args) {
		int a[][]= {{1,2,3},{5,6,7},{0,0,0}};
//		int res[][]=new int[a.length][a[0].length];
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				res[j][i]=a[i][j];
//			}
//		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a[i].length;j++) {
//				if(i!=j) {
					int temp=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=temp;
//				}
			}
		}
		
		
//		System.out.plprintln(" before transpose elements : ");
		for(int[]arr :a) {
			System.out.println(Arrays.toString(arr));
		}
//		System.out.println(" After transpose elements");
//		for(int[]arr :res) {
//			System.out.println(Arrays.toString(arr));
//		}
	}
}



