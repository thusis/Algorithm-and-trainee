package com.be.practice.step4_arr;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice4344 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int c = Integer.parseInt(sc.nextLine());
		
		for(int i = 0 ; i < c ; i++	) {
			int n = sc.nextInt();
			ArrayList<Double> arr = new ArrayList<Double>(n);
			double hab = 0;
			for(int j = 0 ; j<n; j++) {
				arr.add((double) Integer.parseInt(sc.next()));
				hab += arr.get(j);
			}
			double mok = hab/n;
			int count = 0 ;
			for(int j = 0;j<n;j++) {
				if(arr.get(j) > mok) {
					++count;
				}
			}
			double result = (double) count / n * 100; 
			
			System.out.println(String.format("%,.3f", result)+"%");
		}
		
	}

}
