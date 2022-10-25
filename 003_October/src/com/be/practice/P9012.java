package com.be.practice;

import java.util.Scanner;

public class P9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<x; i++) {
			String str = sc.nextLine();
			int open = 0;
			int close = 0;

			String[] strArr = str.split("");
			
			//홀수거나 닫혀서 시작하거나 열려서 끝나면 X
			if(strArr.length %2 !=0 
					|| strArr[0].equals(")")
					|| strArr[strArr.length-1].equals("(") ) {
				System.out.println("1NO");
				
			// 1. ) 일 때 open >= close 일 것 
			// 2. 끝날 때 open==close 일것
			}else {
				for(int j=0; j<strArr.length; j++) {
					if(strArr[j].equals("(")) {
						open++;
					} else if(strArr[j].equals(")")){
						close++;
						if(open < close) {
							System.out.println("2NO");
							break;
						} else {
							if(j==strArr.length-1) {
								if(open==close) {
									System.out.println("3YES");
								} else {
									System.out.println("4NO");
								}
							}	
						}
					}
				}
				
			}
		}
	}
}	

