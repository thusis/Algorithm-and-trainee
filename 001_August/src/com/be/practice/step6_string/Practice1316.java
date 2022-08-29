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
			
			for(int j=0; j<s.length(); j++) {
				l.add(s.charAt(i));
				if (l.contains(s.charAt(i))) {
//					연속된 값이면 ㅇㅋ
//					비연속이면 count -= 1;
				}
			}
		}
	}

}
