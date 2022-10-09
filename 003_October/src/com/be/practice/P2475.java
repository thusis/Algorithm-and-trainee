package com.be.practice;

import java.util.Scanner;

public class P2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArr = sc.nextLine().split(" ");
		int[] numbers = new int[strArr.length];
		for(int i = 0; i<strArr.length; i++) {
			numbers[i] = Integer.parseInt(strArr[i]);
		}
		int sumOfSquare = 0;
		for(int x : numbers) {
			sumOfSquare += x*x;
		}
		System.out.println(sumOfSquare%10);
	}

}
