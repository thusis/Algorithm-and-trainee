package com.be.practice.step5_fucntion;

import java.util.Scanner;

public class runPratice15596 {
	public class Test {
		int[] a() {
			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int a[] = new int[n];

			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}

			return a;

		}

		long sum(int[] a) {
			long ans = 0;

			for (int i = 0; i < a.length; i++) {
				ans += a[i];
			}

			return ans;
		}
	}

}
