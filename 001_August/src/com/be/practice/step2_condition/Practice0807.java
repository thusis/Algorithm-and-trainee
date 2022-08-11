package com.be.practice.step2_condition;

import java.util.Scanner;

public class Practice0807 {
	public void method1330() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if((a>=-10000 && a<=10000) && (b>=-10000 && b<=10000)) {
			if(a>b) {
				System.out.println(">");
			} else if(a<b) {
				System.out.println("<");
			} else {
				System.out.println("==");
			}
		}
	}
	
	public void method9498() {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score >= 0 && score <= 100) {
			if (score >= 90 && score <= 100) {
				System.out.println("A");
			} else if (score >= 80 && score <= 89) {
				System.out.println("B");
			} else if (score >= 70 && score <= 79) {
				System.out.println("C");
			} else if (score >= 60 && score <= 69) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}
	
	public void method2753() {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if (y >= 1 && y <= 4000) {
			if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {
				System.out.println(1);
			} else {
				System.out.println(0);
			}
		}	
	}
	public void method14681() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if ((x >= -1000 && x != 0 && x<=1000) &&
				(y >= -1000 && y != 0 && y <= 1000 )){
			if (x > 0 && y > 0) {
				System.out.println("1");
			} else if (x < 0 && y > 0) {
				System.out.println("2");
			} else if (x < 0 && y < 0) {
				System.out.println("3");
			} else {
				System.out.println("4");
			}
		}
	}
	public void method2884() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if((H >= 0 && H <= 23) && (M >= 0 && M <= 59)) {
			if(H!=0) {
				if (M >= 45) {
					M -= 45;
				} else {
					H -= 1;
					M = 60 - (45 - M);
				}
			}else {
				if (M >= 45) {
					M -= 45;
				} else {
					H = 23;
					M = 60 - (45 - M);
				}
			}
		System.out.println(H + " " + M);
		}
	}
	public void method2525() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if((A >= 0 && A <= 23) && (B >= 0 && B <= 59) && (C >= 0 && C <= 1000)) {
			int H = 0;
			int M = 0;
			if ((B + C) / 60 >= 1) {
				H = A + (B + C) / 60;
				M = (B + C) % 60;
			} else {
				H = A;
				M = B + C;
			} 
			if ( H>=24 ) {
				H -=24;
			}
			System.out.println(H + " " + M );
		}
	}
	public void method2480() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if ((A >= 1 && A <= 6) && (B >= 1 && B <= 6) && (C >= 1 && C <= 6)) {
			if (A == B && B == C) {
				System.out.println(10000 + (A * 1000));
			} else if (A == B || B == C || A == C) {
				if (A == B || A == C) {
					System.out.println(1000 + (A * 100));
				} else {
					System.out.println(1000 + (B * 100));
				}
			} else {
				if (A >= B) {
					System.out.println(Math.max(A, C) * 100);
				} else {
					System.out.println(Math.max(B, C) * 100);
				}
			}
		}
	}
		
}

