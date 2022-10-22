package com.be.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P10872 {
	public static void main(String[] args) {
		method1();
		method2();
		method3();
		method4();
	}

	private static void method1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int sum = factorial(n);
		//N 의 범위가 0 ~ 12 이기 때문에 int 로도 가능하지만, 13 을 넘어가면 13! = 6227020800 으로 int 형의 범위를 벗어나기 때문에 long 타입으로 해주어야 한다.
		System.out.println(sum);
	}
	
	private static void method2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			//BufferedReader 는 항상 문자열로만 리턴되므로 필요에 따라 자료형을 변환시켜야 한다.
			int sum = factorial(n);
			System.out.println(sum);
			br.close();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static int factorial(int n) {
		if(n<=1) return 1; // 재귀 종료 조
		return n*factorial(n-1);
		
		// return N * factorial(N - 1);
		/*
		6 * factorial(5){
			5 * factorial(4){
				4 * factorial(3){
					3 * factorial(2){
						2 * factorial(1){
							return 1;
						}
						return 2 * 1;
					}
					return 3 * 2 * 1;
				}
				return 4 * 3 * 2 * 1;
			}
			return 5 * 4 * 3 * 2 * 1;			
		}
		return 6 * 5 * 4 * 3 * 2 * 1;
		*/
	}
	
	//반복문으로 구성하면 재귀 호출이 없어 메모리도 덜 차지한다.
	private static void method3() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int sum = 1;
        
		// n 이 0이 아닐 때 까지 1씩 감소하면서 sum에 반복적으로 곱해준다
		while(n != 0) {
			sum = sum * n;
			n--;
		}
        
		System.out.println(sum);
	}

	private static void method4() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		try {
			n = Integer.parseInt(br.readLine());
			int sum = 1;
			while(n!=0) {
				sum = sum*n;
				n--;
			}
			System.out.println(sum);			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
