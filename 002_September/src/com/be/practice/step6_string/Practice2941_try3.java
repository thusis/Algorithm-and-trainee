package com.be.practice.step6_string;

import java.util.Scanner;

public class Practice2941_try3 { //finish!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		char ch = '\0';
		int count = 0;
		
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			count++;
			if(i>0) {
				if(ch=='=') {
					switch(str.charAt(i-1)){
					case 'c': case 's': count--; break;
					case 'z': 
						count--;
						if(i>1) {
							if(str.charAt(i-2)=='d') {count--; }
							else {break;}
						}
					}
				} else if(ch=='-') {
					switch(str.charAt(i-1)){
					case 'c': case 'd': count--; break;
					}
				} else if(ch=='j') {
					switch(str.charAt(i-1)){
					case 'l': case 'n': count--; break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
