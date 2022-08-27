package com.be.practice.step6_string;

import java.util.Scanner;

public class Practice5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int second = 0;
		
		for(int i = 0; i<s.length(); i++) {
			
			switch(s.charAt(i)) {
			case 'A' : case 'B' : case 'C' : //2
				second += 3; break;
			case 'D' : case 'E' : case 'F' : //3
				second += 4; break;
			case 'G' : case 'H' : case 'I' : //4
				second += 5; break;
			case 'J' : case 'K' : case 'L' : //5
				second += 6; break;
			case 'M' : case 'N' : case 'O' : //6
				second += 7; break;
			case 'P' : case 'Q' : case 'R' : case 'S' : //7
				second += 8; break;
			case 'T' : case 'U' : case 'V' : //8
				second += 9; break;
			case 'W' : case 'X' : case 'Y' : case 'Z': //9
				second += 10; break;
			}
			
		}
		System.out.println(second);
	}
}
