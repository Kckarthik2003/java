package com.Strings;

public class Panagram {
	public static void main(String[] args) {
		String s="The Quick brown fox jumps over a lazy dog".toLowerCase();
		String ref="abcdefghijklmnopqrstuvwxyz";
		boolean flag=true;
		for(int i=0;i<ref.length();i++) {
			if(s.indexOf(ref.charAt(i))==-1){
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("panagram");
		}
		else {
			System.out.println("not a panagram");
		}
	}
}
