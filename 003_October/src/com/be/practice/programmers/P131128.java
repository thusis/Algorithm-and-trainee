package com.be.practice.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P131128 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String X = sc.nextLine();
		String Y = sc.nextLine();
		
		ArrayList<Character> chars = new ArrayList<>();//결과 담을
		ArrayList<Character> yArr = new ArrayList<>();//y의 각 문자 담을
		for(int i=0; i<Y.length(); i++) {
			yArr.add(Y.split("")[i].charAt(0));
		}
		
		for(int i=0; i<X.length(); i++) {
			for(int j=0; j<yArr.size(); j++) {
				if(X.charAt(i)==yArr.get(j)) {
					chars.add(X.charAt(i));
					yArr.remove(j);//
					break;
				}			
			}
		}
		
		String result="";
		if(chars.isEmpty()) {
			result="-1";
		} else {
			Collections.sort(chars, Collections.reverseOrder());
			for(int i=0; i<chars.size();i++) {
				result+=chars.get(i);
			}
			if(Integer.parseInt(result)==0) {
				result="0";
			}
		}
		System.out.println(result);
	}	
}
