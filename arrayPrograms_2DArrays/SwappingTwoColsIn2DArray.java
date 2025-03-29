package com.arrayPrograms_2DArrays;
import java.util.Arrays;
import java.util.Scanner;
public class SwappingTwoColsIn2DArray {
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the col index");
			int c1 = s.nextInt();
			System.out.print("Enter the col index");
			int c2 = s.nextInt();
			int a[][]= {{2,7,6},{9,5,1},{4,3,8}};
			System.out.println("before swapping");
			for(int [] arr:a) {
				System.out.println(Arrays.toString(arr));
			}
			if(c1>=0 && c1<a.length && c2>=0 && c2<a.length) {
				for(int i=0;i<a.length;i++) {
					int temp =a[i][c1];
					a[i][c1]=a[i][c2];
					a[i][c2]=temp;
				}
				System.out.println("After Swapping");
				for(int[]arr:a) {
					System.out.println(Arrays.toString(arr));
				}
			}
		}
	}

