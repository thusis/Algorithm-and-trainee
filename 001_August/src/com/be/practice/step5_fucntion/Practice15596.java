package com.be.practice.step5_fucntion;

// 정수 n 개가 주어졌을 때 n 개의 합을 구하는 함수를 작성하시오.
// long sum(int[] a); (클래스 이름: Test)
// a: 합을 구해야 하는 정수 n 개가 저장되어 있는 배열(0<=a[i]<=1,000,000, 1<=n<=3,000,000)
// 리턴값 : a에 포함되어 있는 정수 n 개의 합

//범위 지정 어케함?
//Scanner 말고 다른 거 쓰는 법 > 자바의 정석 찾아보자.

//어디까지 주어져있고, 주어져있는게 뭐고, 입력값과 출력값 어떻게 굼분되어있는거고...가 헷갈리넹

import java.util.Scanner;

public class Practice15596 { //제출하기 전에 클래스 이름 Test 로 변경
	
//	public int[] a;
	
	long sum = 0;
	Scanner sc = new Scanner(System.in);
	
	int n;
	int a[] = new int[n];
	
	
	for(int i =0; i<a.length; i++) {
		a[i] = sc.nextInt();
	}

	sc.close();
	
	public long sum(int[] a) {
		
		for(int i = 0 ; i<a.length; i++) {
			sum += a[i];
		}
		
		return sum;
		
	}
	
}
