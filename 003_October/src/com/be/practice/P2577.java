package com.be.practice;

import java.util.Scanner;

public class P2577 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(a+","+b+","+c);
		
		int x = a*b*c;
		String test = ""+x;
		int result;
		for (int i=0; i<10;i++) {
			result=0;
			for(int j=0; j<test.length();j++) {
				String t = test.charAt(j)+"";
				if((""+i).equals(t)) {
					result += 1;
				}
			}
			System.out.println(result);
		}
	}
}
