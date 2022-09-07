package com.be.practice.step7_number;

import java.util.Scanner;

public class Practice2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			double num = Integer.parseInt(sc.nextLine());
			int result = 0;			
			int b5;
			int b3;
			
			
			// num == 5*b5 + 3*b3 이면 봉지개수 구하기
			// num != 5*b5 + 3*b3 이면 -1
			
			for(int i)
			if( num == 5a + 3b ) {
				
			} else {
				result = -1;
			}
			
			
			
			
			
			
			
			
			
			if((num % 5) == 0 ) { //5의 배수일 때
				result = (int)(num/5);
			} else if((num % 5) % 3 == 0 ) { //5로 나눈 나머지가 3의 배수일 때
				int bongi5 = (int) (num / 5);
				int bongi3 = (int) (num % 5) / 3;
				result = bongi5 + bongi3;
			}else if((num%3) == 0) { //3의 배수일 때
				result = (int)(num/3);
			} else if((num%3)%5 == 0) {
				int bongi3 = (int)(num/3);
				int bongi5 = (int)(num%3)/5;
			} else {
				result = -1;
			}
			System.out.println(result);
			
		}
	}
}
