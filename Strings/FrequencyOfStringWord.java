package com.Strings;

import java.util.Arrays;
public class FrequencyOfStringWord {
	public static void main(String[] args) {
		String s="java   is not 'java'    but java is java only";
		String str[]=s.split(" ");
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++) {
			if(!str[i].equals("@") && !str[i].equals("")) {
				int c=1;
				for(int j=i+1;j<str.length;j++) {
					if(str[i].equals(str[j])) {
						str[j]="@";
						c++;
					}
				}
				System.out.println(str[i]+" --> "+c);
			}	
		}
	}
}

