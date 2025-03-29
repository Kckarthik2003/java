package com.Practice;

import java.util.Arrays;

public class p11 {
	public static void main(String[] args) {
		int a[][]=new int[5][5];
		String mov="right";
		int r=0;
		int c=-1;
		for(int i=1;i<=a.length*a[0].length;i++) {
			switch(mov) {
			case "right":
				c++;
				a[r][c]=i;
				if(c==a[0].length-1 || a[r][c+1]!=0) {
					mov= "down";
				}	
				break;
			case "down":
				r++;
				a[r][c]=i;
				if(r==a.length-1 || a[r+1][c]!=0) {
					mov = "left";
				}
				break;
			case "left":
				c--;
				a[r][c]=i;
				if(c==0 || a[r][c-1]!=0) {
					mov="up";
				}
				break;
			case "up":
				r--;
				a[r][c]=i;
				if(r==0 || a[r-1][c]!=0) {
					mov="right";
				}
				break;
		
		}
			
	}
		for(int arr[]:a) {
			System.out.println(Arrays.toString(arr));
		}
}
}
