package com.be.practice.step1.august;

import java.util.Scanner;

public class Practice2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if((a>=100 && a<1000) && (b>=100 && b<1000)) {
			int b3 = b/100;
			int b2 = b/10 - b3*10;
			int b1 = b - b3*100 - b2*10;
			System.out.println(a*b1);
			System.out.println(a*b2);
			System.out.println(a*b3);
			System.out.println(a*b);
		}
	}
}
