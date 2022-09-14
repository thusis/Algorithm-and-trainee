package com.be.practice.step7_number;

import java.util.Scanner;

public class Practice2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		char ch = '\0';
		int count = 0;
		
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			count++;
			if (ch == '=' || ch == '-' || ch == 'j') {
				switch(str.charAt(i-1)){
				case 'c': if(ch=='='||ch=='-') {count--; break;}
				case 'd': if(ch=='-') {count--; break;}
				case 'n': case 'l': if(ch=='j') {count--; break;} 
				case 's': if(ch=='=') {count--; break;}
				
				case 'z': 
					if(ch=='=') {
						count--;
						if(i>1) {
							if(str.charAt(i-2)=='d') {count--; }
							else {break;}
						}
					}
				default: break;
				}
			}
		}
		System.out.println(count);
	}
}
