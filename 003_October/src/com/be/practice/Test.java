package com.be.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(93);
		nums.add(181);
		nums.add(245);
		nums.add(36);
		nums.add(214);
		nums.add(315);
		nums.add(185);
		nums.add(138);
		nums.add(216);
		nums.add(295);
		Collections.sort(nums,Comparator.reverseOrder());
		System.out.println(nums);
	}
}
//1+2가 이미 초과하는지 검증
//	초과 아니라면 1+2+3 초과하는지 검증