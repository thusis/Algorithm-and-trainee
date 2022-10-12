package com.be.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class P1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int count=0;
		
		for(int i=0; i<n; i++) {
			String str = sc.nextLine();
			
			ArrayList<Character> ch = new ArrayList<>();
			for(int j=0; j<str.length(); j++) {
				boolean check=true;
				//for문 마쳤을 때 check = true라면 count 올릴 것.
				if(j==0) {
					ch.add(str.charAt(j));
				} else if(j>0) {					
				//0보다 클 때 j-1 이랑 같으면 불린 체크, 아님 불린 폴스
					if(str.charAt(j)!=str.charAt(j-1)) { // 현재 문자랑 직전 문자랑 같지 않은데,
						if(ch.contains(str.charAt(j))) { // 만약 이미 포함하고 있다면 그룹 단어 아님
							check=false;
							break;
						} else { //현재문자랑 직전 문자랑 같지않으면서 새로운 철자라면
							ch.add(str.charAt(j));
						}
					}
				}
				if (j==str.length()-1) {
					if(check==true) {
						count++;
					}
				}
			}
			ch.clear();
		}
		System.out.println(count);
	}

}
