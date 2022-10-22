package com.be.practice;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = factorial(n);
		System.out.println(sum);
	}

	private static int factorial(int n) {
		if(n<=1) return 1;
		return n*factorial(n-1);
	}
}