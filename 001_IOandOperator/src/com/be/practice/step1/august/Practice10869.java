package com.be.practice.step1.august;

import java.util.Scanner;

public class Practice10869 { //사칙연산
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	if(A>=1 && B<=10000) {
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println((double)A/B);
		System.out.println(A%B);
	}

}
