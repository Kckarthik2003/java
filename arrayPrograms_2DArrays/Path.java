package com.arrayPrograms_2DArrays;

//import java.util.Scanner;

public class Path {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
		String dir[] = {"right","right","right","left","down","left","up","down"};
		int [][]a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int r = 0;
		int c = 0;
		for(int i=0; i<dir.length;i++) {
			String mov = dir[i];
			if(mov.equals("right")) {
				if(c>=0 && c<a[0].length-1) {
					c++;
					System.out.println("["+r+","+c+"]");
				}
				else {
					System.out.println("wrong direction");
				}
			}
			else if(mov.equals("left")) {
				if(c>0 && c<=a[0].length-1) {
					c--;
					System.out.println("["+r+","+c+"]");
				}
				else {
					System.out.println("wrong direction");
				}
			}
			else if(mov.equals("up")) {
				if(r>0 && r<=a.length-1) {
					r--;
					System.out.println("["+r+","+c+"]");
				}
				else {
					System.out.println("wrong direction");
				}
			}
			else if(mov.equals("down")) {
				if(r>=0 && r<a.length-1) {
					r++;
					System.out.println("["+r+","+c+"]");
				}
				else {
					System.out.println("wrong direction");
				}
			}
			else if(mov.equals("stop")) {
				break;
			}
			else {
				System.out.println("enter a correct direction");
			}
		}
		System.out.println(a[r][c]);
		
	}
}
