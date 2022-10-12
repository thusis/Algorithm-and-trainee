package com.be.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class P1929t2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int m = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		
		boolean flag = false;
		
		//m부터 n까지 		
		//반례 2,4
		for(int i=m; i<=n; i++) {
			for(int j=2; j<Math.sqrt(i)+1; j++) {
				if(i%j==0) {
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			if(flag) {
				System.out.println(i);				
			}
		}
	}

}
