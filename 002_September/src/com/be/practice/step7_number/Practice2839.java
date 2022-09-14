package com.be.practice.step7_number;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextInt();
		int a = 0; //5
		int b = 0; //3
		ArrayList<Integer> resultNums = new ArrayList<Integer>();//중간결과값 three+five
		
		for(int i = 0; i<= (int)num/3 ; i++) {
			for(int j = (int)num/3; j>=0; j--) {
				if(5*i+3*j==num) {
					a = i;
					b = j;
					resultNums.add(a+b);
				}
				System.out.println("5*"+i+"+3*"+j+"="+5*i+3*j);
			}
		}
		
		int result = 1667; // resultNums 중 작은 값
		for(int i = 0; i<resultNums.size(); i++) {
			if(resultNums.get(i)<result) {
				result = resultNums.get(i);
			}
		}
		
		if(resultNums.isEmpty()) {
			System.out.println(-1);
		} else {
			System.out.println(result);
		}
	}
}
