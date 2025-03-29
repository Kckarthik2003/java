package com.arrayPrograms;

public class UniQueElem {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,5,4,5,6,7,8,76,5};
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					c++;          
				}
			}
			if(c==1) {
				System.out.println(a[i]);
			}
		}
	}
}
