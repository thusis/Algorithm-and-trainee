package com.be.practice;

import java.util.Scanner;

public class P2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] strArr = sc.nextLine().split(" ");
		int[] numbers = new int[strArr.length];
		for(int i=0; i<strArr.length; i++) {
			numbers[i]=Integer.parseInt(strArr[i]);
		}
		String temp = null;
		for(int i=0; i<numbers.length;i++) {
			if(i==numbers.length) {
				switch(temp) {
				case "a": System.out.println("ascending"); break;
				case "b": System.out.println("descending"); break;
				case "c": System.out.println("mixed"); break;
				}
			} 
		}
		
	}
}
