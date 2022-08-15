package com.be.practice.step3_loop;

import java.util.Scanner;

public class Practice1110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int standard = sc.nextInt();
		int testNum = standard;
		int count = 0;
		boolean flag = false;
		
		if(testNum>=0 && testNum<=99) {
			while(!flag) {

				int A = testNum/10; //10의 자리수
				int B = testNum%10; //10으로 나눈 나머지(1의 자리수)
				int X = A + B; //각 자릿수의 합

				if(X>=10) {
					X = X - 10;
				} //10보다 크면 1의 자리만 취하고, 그렇지 않으면 그대로 사용
				
				int newNum = B*10 + X;
				count += 1;
				System.out.println("A:" + A + ", B:" + B + ", X:" + X + ", newNum:" +newNum );
				if(standard == newNum) {
					flag = true;
				}
				
				testNum = newNum;	
			}
		}
		System.out.println(count);
		
	}
}	