package com.be.practice.step1_ioAndOperator;

import java.util.Scanner;

public class Practice10430 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println( (a+b)%c );
		System.out.println( ((a%c)+(b%c))%c );
		System.out.println( (a*b)%c );
		System.out.println( ((a%c)*(b%c))%c );
		
		}
	}

