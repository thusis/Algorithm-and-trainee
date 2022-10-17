package com.be.practice;

import java.util.Scanner;

public class P1193t2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0; //입력 받은 숫자가 어느 줄에 위치해 있는지 찾을 때 사용
		int x = sc.nextInt();
		int a, b = 0;//최종적으로 출력해줄 좌변 우변?   .. a/b
		for (int i = 0; i < 4472; i++) { //X의 범위 천만은 4472까지 범위 지정하면 다 받을 수 있음.
			sum = sum + (i + 1);
			if (sum >= x) {
				int sum_bef = sum - (i + 1); //계산을 위해 현재 sum의 전의 값을 구해줌.
				a = x - sum_bef; //입력 값 - 전의 sum값을 해주면 입력 값이 몇 번째 위친지 알 수 있음.
				b = (i + 1) - (a - 1);
				if ((i + 1) % 2 == 0) { //짝수 칸이면 위>아래
					System.out.println(a + "/" + b);
					break;
				} else { //홀수 칸이면 아래> 위
					System.out.println(b + "/" + a);
							break;
						}
					}
				}
				
			}
	
	


}
