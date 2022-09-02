package com.be.practice.step7_number;

import java.util.Scanner;

public class Practice2292 {
	public static void main(String[] args) {
		
/*겉을 감싼 수의 개수
1
6
12
18
24*/
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[500];
		int X = 0;
		
		int kan = 1;
		for(int i=0; i<100 ; i++) {
			arr[i] = kan;
			if(n==1) {
				X=1;
			} else if(n<arr[i]) {
				X = i;
				break;
			}
			kan += 6*i;
		}
		System.out.println(X);
	}
}
