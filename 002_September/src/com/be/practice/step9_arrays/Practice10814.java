package com.be.practice.step9_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Map<String, Integer> member = new HashMap<String, Integer>();
		ArrayList<String> nameList = new ArrayList<String>();
		
		for(int i = 0; i<n; i++) {
			String str = sc.nextLine();
			int age = Integer.parseInt(str.split(" ")[0]);
			String name = str.split(" ")[1];
			member.put(name, age);
			nameList.add(name);
		}
		
//		Set<Entry<String, Integer>> mEntry = member.entrySet();
//		Iterator<Entry<String, Integer>> it = mEntry.iterator();
//		while(it.hasNext()) {
//			Entry<String, Integer> entry=it.next();
//			String key = entry.getKey();
//			if(entry.get)
//		}
		
//		Set<String> keySet = member.keySet();
//		Iterator<String> it1 = keySet.iterator();
//		
//		while(it1.hasNext()) {
//			String key = it1.next();
//			S
//			if(member.get(key)
//		}
		for (int i = 0; i < nameList.size(); i++) {
			for (int j = i; j < nameList.size(); j++) {
				if (member.get(nameList.get(i)) > member.get(nameList.get(j))) {
					String temp = nameList.get(i);
					nameList.set(i, nameList.get(j));
					nameList.set(j, temp);
				}
			}
			System.out.println(nameList.get(i) +member.get(nameList.get(i)));
		}
		

	}}
