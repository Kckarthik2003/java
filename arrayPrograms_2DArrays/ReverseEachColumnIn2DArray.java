package com.arrayPrograms_2DArrays;

import java.util.Arrays;

public class ReverseEachColumnIn2DArray {
	 public static void main(String[] args) {
	        int a[][] = {{2, 7, 6}, {4, 3, 1}, {7, 8, 6}};
	        for(int j = 0; j < a[0].length; j++) {  
	            reverseColumn(a, j);
	        }
	        for(int[] arr : a) {
	            System.out.println(Arrays.toString(arr));
	        }
	    }

	    public static void reverseColumn(int[][] arr, int col) {
	        int i = 0;
	        int j = arr.length - 1;
	        while(i < j) {
	            int temp = arr[i][col];
	            arr[i][col] = arr[j][col];
	            arr[j][col] = temp;
	            i++;
	            j--;
	        }
	    }
	}

