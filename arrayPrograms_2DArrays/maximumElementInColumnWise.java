package com.arrayPrograms_2DArrays;
// 1. minimum element in each column
// 2. maximum element in each column
public class maximumElementInColumnWise {
			public static void main(String[] args) {
				int[][]a= {{12,37,68,93},{-34,-57,-1,-235},{4,5,6,7},{1,2,3,4}};
				for(int i=0;i<a.length;i++) {
					int max=Integer.MIN_VALUE;
					for(int j=0;j<a[i].length;j++) {
						if(a[j][i]>max) {
							max=a[j][i];
						}
					}
					System.out.println((i+1)+" max element is : "+max);
				}
			}
		}

