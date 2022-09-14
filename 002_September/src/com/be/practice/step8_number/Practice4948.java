package com.be.practice.step8_number;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Practice4948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();
		HashSet<Character> wordSet = new HashSet<Character>();
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		int count =0;
		for(int i = 0 ; i<str.length(); i++) {
			boolean check=wordSet.add(str.charAt(i));
			if(!check) {
				count = countMap.get(str.charAt(i))+1;
				countMap.replace(str.charAt(i), count);
			} else {
				countMap.put(str.charAt(i),1);
			}
		}

		int max = 0;
		char maxKey = '\0';
		String result=null;

		Set key = countMap.keySet();
		for(Iterator iterator = key.iterator(); iterator.hasNext();){
			char keyValue = (char)iterator.next();
			int valueVar = countMap.get(keyValue);
			if(valueVar > max){
				max = valueVar;
				maxKey = keyValue;	
			} else if (valueVar == max){
				max = valueVar;
				maxKey = keyValue;	
				result = "?";
			}
		}
		
		if(result!=null) {
			System.out.println(result);
		} else {
			System.out.println(maxKey);
		}

		
	}
}
