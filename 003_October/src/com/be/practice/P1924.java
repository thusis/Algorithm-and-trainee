package com.be.practice;

import java.util.Scanner;

public class P1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int days = 0;
		String yoil = null;
		
		if(x>1) {
			for(int i=1; i<x; i++) //x=3
				switch(i) { //1,2
				case 1:	case 3: case 5: case 7:
				case 8:	case 10: case 12: days+=31; break;
				
				case 4: case 6:
				case 9:	case 11: days +=30; break;
				
				case 2: days += 28; break;
				}
		}
		days+=y;
		
		int result = days%7; //1월 1일 나머지는 1=>mon
		switch(result) {
		case 1: System.out.println("MON"); break;
		case 2: System.out.println("TUE"); break;
		case 3: System.out.println("WED"); break;
		case 4: System.out.println("THU"); break;
		case 5: System.out.println("FRI"); break;
		case 6: System.out.println("SAT"); break;
		case 0: System.out.println("SUN"); break;
		}
	}
}
