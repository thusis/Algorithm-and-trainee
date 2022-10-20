package com.be.practice.redo;

import java.util.Scanner;

// 참고 : https://st-lab.tistory.com/85
public class P4948 {
	public static boolean[] prime = new boolean[246913];
	// 에라토스테네스의 체를 이용해 소수인 경우 false, 소수가 아닌 경우 true를 반환
	// 입력 n 이 주어지면, 해당 배열에서 n~2n 까지 순회하면서 false 의 개수를 세기
	// n의 조건이 최대 123456이므로, 배열은 2n+1인 246913으로 사이즈를 정함
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		get_prime();	//소수를 얻는 메소드
		
		while(true) {
			int n = sc.nextInt();
			if(n==0) break; // n 이 0일 경우 종료
			
			int count = 0; //소수 개수를 셀 변수
			
			for(int i=n+1; i<=2*n; i++) {
				if(!prime[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
	//소수를 얻는 메소드
	private static void get_prime() {
		// 0과 1은 소수가 아니므로 true
		prime[0] = prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			// 소수임을 검증하는 가장 큰 범위는
			// 2부터 가능한 n의 크기에 루트를 씌운 값 
			
			if(prime[i]) { 
				//소수가 아니면(true면) 검증을 계속
				continue;
			}
			for(int j=i*i; j<prime.length; j+=i) {
				//
				prime[j]=true;
			}
		}
	}
}
