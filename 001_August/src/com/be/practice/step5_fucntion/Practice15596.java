package com.be.practice.step5_fucntion;

import java.util.Scanner;

public class Practice15596 {
	long sum;
	int[] a;
	int n;

	public int[] a() {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		if (n >= 1 && n <= 3000000) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
		}
		
		return a;
	}

	public long sum(int[] a) {
		for(int i=0; i<n; i++) {
			sum += a[i];
		}
		return sum;
	}

}
