package com.be.practice.step6_string;

import java.util.Scanner;

public class Practice2675 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 0; i<T; i++) {
			int R = sc.nextInt();
			String s = sc.next();
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<R; k++) {
					System.out.print(s.charAt(j));					
				}
			}
			System.out.println();
		}
		
		sc.close();
	
	}
}
