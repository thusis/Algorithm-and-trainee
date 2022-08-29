package com.be.practice.step6_string;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> l = new ArrayList<Character>();
		
		int N = sc.nextInt();
		int count = N;
		
		for(int i=0; i<N; i++) {
			String s = sc.next();
			if(!l.isEmpty()) {
				l.clear();
			}
			for(int j=0; j<s.length(); j++) {
				if(!l.contains(s.charAt(j))){
					l.add(s.charAt(j));
				} else {
					if(s.charAt(j) != s.charAt(j-1)) {
						count-=1;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}
