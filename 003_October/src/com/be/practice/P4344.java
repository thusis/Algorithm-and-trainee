package com.be.practice;

import java.util.Scanner;

public class P4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for(int i=0; i<c; i++) {
			int[] arr = new int[sc.nextInt()];
			int sum = 0;
			for(int j=0; j<arr.length; j++) {
				arr[j] = sc.nextInt();
				sum+=arr[j];
			}
			double avg = sum/arr.length;
			double count = 0;
			for(int j=0; j<arr.length; j++) {
				if(arr[j]>avg) {
					count ++;
				}
			}
			double result = count/arr.length * 100.000;
			System.out.println(String.format("%.3f", result)+"%");
		}
	}
}
