package com.be.practice.step6_string;

import java.util.Scanner;

public class Practice2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		
		for(int i =0; i<s.length(); i++) {
			count ++;
			
			if(i<s.length()-2) {
				switch(s.charAt(i)) {
				case 'c':
					if((s.charAt(i+1) == '=') || (s.charAt(i+1) == '-') ) {
						i++;
						break;
					}				
				case 'd':
					if((s.charAt(i+1) == 'z') && (s.charAt(i+2) == '=')) {
					i+=2;
					break;
					} else if(s.charAt(i+1) == '-') {
						i++;
						break;
					}
				case 'l': case 'n':
					if(s.charAt(i+1)=='j') {
						i++;
						break;
					}
				case 's': case 'z':
					if(s.charAt(i+1)=='=') {
						i++;
						break;
					}				
				}
			} 
			else if(i==s.length()-2) {
				switch(s.charAt(i)) {
				case 'c':
					if((s.charAt(i+1) == '=') || (s.charAt(i+1) == '-') ) {
						i++;
						break;
					}				
				case 'd':
					if(s.charAt(i+1) == '-') {
						i++;
						break;
					}
				case 'l': case 'n':
					if(s.charAt(i+1)=='j') {
						i++;
						break;
					}
				case 's': case 'z':
					if(s.charAt(i+1)=='=') {
						i++;
						break;
					}				
				}
			}
		}
		System.out.println(count);
	}
}
