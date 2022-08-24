package com.be.practice.step6_string;

import java.util.Scanner;

//	N개의 숫자가 공백없이 쓰여있을 떄, 숫자를 모두 합해 출력하는 프로그램을 작성. 첫째 줄에 숫자의 개수N(1~100), 둘쨰 줄에 숫자N개가 공백없이 주어짐
public class Practice11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String a = sc.next();
		int sum = 0;
		
		for(int i=0; i<N ; i++) {
			sum += Integer.parseInt(Character.toString(a.charAt(i)));
		}
		
		System.out.println(sum);
		
		
	}

}
