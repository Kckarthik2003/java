package com.Strings;

public class CountOfVowelsAndConsonants {
	public static void main(String[] args) {
		String s = "Hello World 123".toLowerCase();
		int vc = 0;
		int cc = 0;
		for(int i=0; i<s.length();i++) {
			char ch =s.charAt(i);
			if(ch>='a' && ch<='z') {
				if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u') {
					vc++;
				}
				else {
					cc++;
				}
			}
		}
		System.out.println("vowel Count : "+vc);
		System.out.println("Consonant Count : "+cc);
	}
}
