package com.be.practice.step4_arr;

import java.util.Scanner;

public class Practice10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arr[] = new int[N];
		int Max = arr[0];
		int Min = arr[0];
		if (N >= 1 && N <= 1000000) {
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
				if (arr[i] > Max) {
					Max = arr[i];
				} else if (arr[i] < Min) {
					Min = arr[i];
				}
				System.out.println(Min +" "+ Max);
			}
		}
		System.out.println(Min + " " + Max);
	}
}
