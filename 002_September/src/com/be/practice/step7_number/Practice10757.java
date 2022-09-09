package com.be.practice.step7_number;

import java.util.Scanner;

public class Practice10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = Double.parseDouble(sc.next()+".0");
		double c = sc.nextLong();
		double d = Long.parseLong(sc.next());
		double result = a+b;
		
		System.out.println(a + ", " + b + ", " + c );
		System.out.println(result);
		
	}
}
