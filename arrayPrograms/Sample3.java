package com.arrayPrograms;
// searching elements by binary search algorithm
public class Sample3 {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int ele=90;
		int ind=binarysearch(a,ele);
		System.out.println(ind);
	}
	public static int binarysearch(int[]a,int key) {
		int s=0;
		int e=a.length-1;
		while(s<=e) {
			int mid =(s+e)/2;
			if(a[mid]==key) {
				return mid;
			}
			else if(key>a[mid]) {
				s=mid+1;
			}
			else {
				e=mid-1;
			}
			
		}
		return -1;
	}
}
