package com.Practice;

public class p1 {
	public static int checkPdsAndSds(int [][]a) {
		int pds = 0;
		int sds =  0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) {
					pds += a[i][j];
				}
				if(i+j==a.length-1) {
					sds += a[i][j];
				}
			}
		}
		return pds==sds ? pds : -1;
	}
	public static boolean checkRowsSum(int a[][],int temp) {
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum +=a[i][j];
			}
			if(sum!=temp) {
				return false;
			}
		}
		return true;	
	}
	public static boolean checkColsSum(int a[][],int temp) {
		for(int i=0;i<a.length;i++) {
			int sum =0;
			for(int j=0;j<a[i].length;j++) {
				sum += a[j][i];
			}
			if(sum!=temp) {
				return false;
			}
		}
		return true;
	}
	public static void main(String [] args) {
		int a[][]= {{2,7,6},{9,5,1},{4,3,8}};
		int temp = checkPdsAndSds(a);
		if(temp!=0) {
			if(checkRowsSum(a,temp)) {
				if(checkColsSum(a,temp)) {
					System.out.println("Magic Square");
				}
				else {
					System.out.println("Not a magic square");
				}
					
			}
			else {
				System.out.println("Not a magic square");
			}
		}
		else{
			System.out.println("Not a magic square");
		}
	}
}
