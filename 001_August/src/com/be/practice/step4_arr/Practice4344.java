package com.be.practice.step4_arr;

import java.util.Scanner;

public class Practice4344 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		for(int i = 0 ; i<C; i++) {
			int N = sc.nextInt(); //학생의 수
			int arr[] = new int[N];
			int sum = 0;
			if(N>=1 && N<=1000) {
				for(int j=0; j<arr.length; j++) {
					arr[j] = sc.nextInt();
					sum += arr[j];
				}
			}
			double avg = sum/N;
			int count = 0;
			for(int k=0; k<arr.length; k++) {
				if(arr[k]>avg) {
					count +=1;
				}
			}
			System.out.println(N/count + '%');
		}
	}

}
