package com.be.practice;

import java.util.Scanner;

public class P1929 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int m = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		
		boolean flag = false;
		
		//소수는 1과 자기 자신으로 밖에 나뉘어지지 않는 수
		//1, 자기 자신 이외의 수로 나누었을 때 그 나머지가 0이 아님.
		//루프가 두 번 돌아서 시간 초과가...
		for(int i=m; i<=n; i++) {
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			if(flag) {
				System.out.println(i);				
			}
		}
	}
}
