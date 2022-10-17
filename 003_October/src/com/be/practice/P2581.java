package com.be.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class P2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Integer> list	= new ArrayList<>();
		
		for(int i=m; i<=n; i++) {
			list.add(i);
		}		for(int i=m; i<=n; i++) {
			for(int j=2; j<Math.sqrt(i); j++) {
				if(i%j==0) {
					list.remove(i);
				}
			}
		}
		for(int i=m; i<Math.sqrt(n); i++) {
			if(i%m==0) {
				list.remove(i); //이러면 i번째 인덱스를 지울까, i라는 수를 지울까?
				System.out.println(list);
			} 
		}
		
		
		
	}
}
