package com.be.practice.step5_fucntion;

import java.util.ArrayList;

public class runPractice4673 {

	public static void main(String[] args) {
	
		ArrayList<Integer> d = new ArrayList<Integer>();
		ArrayList<Integer> notd = new ArrayList<Integer>();

		for (int i = 1; i <= 10000; i++) {
			int n;
			int a;
			int b;
			int c;
			int e;
			int dn;

			n = i;
			a = n / 1000;
			b = ( n - 1000*a ) / 100;
			c = ( n - 1000*a - 100*b ) / 10;
			e = n - 1000*a - 100*b - 10*c ;
			dn = n + a + b + c + e ;

			if (dn <= 10000 && !d.contains(dn)) {
				d.add(dn);
			}
		}
		
		for (int i = 1; i <= 10000; i++) {
			if (!d.contains(i)) {
				notd.add(i);
			}
		}
		
		for (Integer i : notd) {
			System.out.println(i);
		}
	}

}
