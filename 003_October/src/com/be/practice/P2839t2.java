package com.be.practice;

import java.util.Scanner;

public class P2839t2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int min = n/5+1;
		int max = n/3+1;
		int result=0;
		
		for(int i=min; i<=max; i++) {
			int a = n/5;
			int mod = n%5;
			int b = mod/3;
			if(mod%3==0 && a+b==i) {
				result=i;
				break;
			} else {
				a = n/3;
				mod = n%3;
				b = mod/5;
				if(mod%5==0 && a+b==i) {
					result=i;
					break;
				} else {
					for(a=1; a<=i; a++) {
						b = i-a;
						if(a*3 + b*5 ==n) {
							result=i;
							break;
						}else {
							result=-1;
							break;
						}
					}
				}
			}
		}
		System.out.println(result);
	}

}
