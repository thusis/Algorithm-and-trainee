package com.be.practice;

import java.util.Scanner;

public class P2839t1 {
	//문제 : 11 => -1 을 반환함 다른 시선으로 접근 필요
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int result;
		
		int mod1 = N%5; //5로 나눈 나머지
		int q1 = N/5; //5로 나눈 몫
		if(mod1%3==0) {
			int q2 = mod1/3;
			result = q1+q2;
		} else {
			if(N%3==0) {
				int mod2 = N%3; 
				result = N/3;
			} else {
				result = -1;
			}
		}
		
		System.out.println(result);
		
	}
}
