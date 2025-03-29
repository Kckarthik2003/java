package com.Practice;

public class p2 {
	public static void main(String[] args) {
		int a[][]= {{12,37,68,93},{-34,-57,-1,-235},{4,0,-234,7},{1,2,389,4}};
		for(int i=0;i<a.length;i++) {
			int min = Integer.MAX_VALUE;
			for(int j=0;j<a[i].length;j++) {
				if(a[j][i]<min) {
					min = a[j][i];
				}
			}
			System.out.println((i+1)+"th row max element is : "+min);
		}
	}
}
