package com.be.practice.step9_arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice11650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. x 좌표가 증가하는 순으로
		//2. x좌표가 같으면  y 좌표가 증가하는 순으로 정렬

		int n = Integer.parseInt(sc.nextLine());
		//점의 개수 n
		
		ArrayList<Integer> arrX = new ArrayList<Integer>();
		ArrayList<Integer> arrY = new ArrayList<Integer>();
		
		for(int i =0; i<n ; i++) {
			// i 번점의 위치 x와 y
			arrX.add(sc.nextInt());
			arrY.add(sc.nextInt());
		}
		
		for(int i=0; i<n; i++) {
			
		}
	
	}

}
