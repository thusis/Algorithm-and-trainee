package com.be.practice.step3_loop;

import java.util.Scanner;

public class Practice0807 {
	public void method2739() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N>=1 && N<=9) {
			for(int i = 1; i<10; i++) {
				System.out.println( N + " * " + i + " = " + N*i );
			}
		}
	}
	
	public void method10950() {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i < T ; i++ ) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
	}
	
	public void method8393() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>=1 && n<=10000) {
			int sum = 0;
			for(int i=1; i<=n ; i++) {
				sum += i;
			} System.out.println(sum);
		}
	}
}
