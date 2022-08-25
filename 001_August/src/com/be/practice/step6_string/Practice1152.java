package com.be.practice.step6_string;

import java.util.Scanner;

public class Practice1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		
		for(int i =0; i<s.trim().length(); i++) {
			char a = s.trim().charAt(i);
			if (a==' ') {
				count++;
			}
		}
		System.out.println(count+1);
		
	}

}
