package com.be.practice.step7_number;

import java.util.Scanner;

public class Practice2941_base {
	public static void main(String[] args) {
		
		//일단 반례는 다 맞거든 ㅠㅠ
		

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		char ch = '\0';
		int count = 0;
		
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			count++;
			if (ch == '=' || ch == '-' || ch == 'j') {
				switch(str.charAt(i-1)){
				case 'c': case 'd': case 'n': case 'l': case 's': count--; break;
				case 'z': 
					count--;
					if(str.charAt(i-2)=='d') {
						count--; 
						} else {
							break;
						}
				default: break;
				}
			}
		}
		System.out.println(count);

		
	}
}
