package com.be.practice.step6_string;

import java.util.Scanner;

public class Practice1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char ch[] = new char[26];
		int count[] = new int[26];
		
		for(int i = 0; i<ch.length; i++) {
			ch[i] = (char) (97+i);
			for(int j=0; j<s.length(); j++) {
				if(s.toLowerCase().charAt(j)==ch[i]) {
					count[i] += 1;
				}
			}
		}
		
		int temp = 0;
		int index = 0 ;
		boolean same = false;
		for(int i=0; i<count.length; i++) {
			for(int j=i+1; j<count.length; ) {
				if(count[i]>=count[j]) {
					if(j == count.length-1) {
						temp = count[i];
					}
					j++;
				} else if(count[i]<count[j]) {
					break;
				} 	
			}
		}
		if(!same) {			
			System.out.println(ch[index]);
		} else {
			System.out.println("?");
		}

		
	}

}
