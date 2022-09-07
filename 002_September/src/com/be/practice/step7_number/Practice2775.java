package com.be.practice.step7_number;

import java.util.Scanner;

public class Practice2775 {//다시해야겟다 전혀몰겟넹!
	public static void main(String[] args) {
		//Scanner 버전
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<t; i++) {
			double k = Integer.parseInt(sc.nextLine());
			double n = Integer.parseInt(sc.nextLine());
			
			double gob = Math.pow(n,k); //n의 제곱
			int result = (int) ((1+n)*n/2*gob);
			
			System.out.println(result);
		}
	}
}
