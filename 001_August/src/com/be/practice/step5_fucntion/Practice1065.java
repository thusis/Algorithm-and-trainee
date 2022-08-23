package com.be.practice.step5_fucntion;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice1065 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		for(int i = 1 ; i <= N ; i++) {
			int a;
			int b;
			int c;
			
			a = i/100;
			b = ( i - 100*a ) / 10 ; 
			c = i - 100*a - 10*b ;
			
			if((a-b)==(b-c)) {
				list.add(i);
			} else if (i<100) {
				list.add(i);
			}
		}
		
		System.out.println(list.size());
				
	}

}
