package com.be.practice.step6_string;

import java.util.Scanner;

//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
public class Practice10809 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char ch[] = new char[26];
		int indexI[] = new int[26];
		
		for(int i = 0 ; i<ch.length; i++) {
			ch[i] = (char)(97+i);
			for(int j = 0; j<s.length(); j++) {
				if(ch[i] == s.charAt(j)) {
					indexI[i] = j;
					break;
				} else {
					indexI[i] = -1;
				}
			}
			System.out.print(indexI[i] + " ");
		}

	}

}
