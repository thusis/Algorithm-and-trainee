package com.be.practice;

import java.util.Scanner;

public class P2839t3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int min = n/5+1;
		int max = n/3+1;
		
		int a;
		int b;
		int result=0;
		
		for(int i=min; i<=max; i++) {
			for(a=1; a<=i; a++) {
				b = i-a;
				if(a*3 + b*5 ==n) {
					result = i;
					break;
				}else {
					if(i==max) {
						result = -1;
						break;						
					}
				}
			}
		}
		System.out.println(result);
		
	}
}
