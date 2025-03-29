package com.arrayPrograms_2DArrays;

public class MaximumelementEachAndEveryRow {
	public static void main(String[] args) {
		int[][]a= {{12,37,68,93},{-34,-57,-1,-235},{4,5,6,7},{1,2,3,4}};
		for(int i=0;i<a.length;i++) {
			int max=Integer.MIN_VALUE;
			for(int j=0;j<a[i].length;j++) {
				if(a[i][j]>max) {
					max=a[i][j];
				}
			}
			System.out.println((i+1)+"th row max element is : "+max);
		}
	}
}
