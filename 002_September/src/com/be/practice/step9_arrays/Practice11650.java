package com.be.practice.step9_arrays;

import java.util.Scanner;

public class Practice11650 {
	public void try1() {
		Scanner sc = new Scanner(System.in);
		//1. x 좌표가 증가하는 순으로
		//2. x좌표가 같으면  y 좌표가 증가하는 순으로 정렬

		int n = Integer.parseInt(sc.nextLine());
		//점의 개수 n
		
		//정수형 배열을 X배열, Y배열 두 개 선언하고 받으려 했으나 어려울 것 같아.
		//문자열형 배열을 받은 후에 이를 정렬하는 과정에서 각 글자씩 뽑아서 배열에 순서대로 집어넣자.
		
//		ArrayList<String> temp = new ArrayList<String>();
		String temp[] = new String[n];
		
		
		for(int i=0; i<n; i++) {
			temp[i]=sc.nextLine();
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = 0 ; j <n ; j ++) {
				if(Integer.parseInt(temp[i].charAt(0)+"")<Integer.parseInt(temp[j].charAt(0)+"")) {
					
				}
			}
		}
		
		
		
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] temp = new String[n];
		int[] xArr = new int[n];
		int[] yArr = new int[n];
		
		for(int i = 0; i<temp.length; i++) {
			temp[i] = sc.nextLine();
//			xArr[i] = Integer.parseInt(temp[i].split(" ")[0]);
//			yArr[i]	= Integer.parseInt(temp[i].split(" ")[1]);
		}

		
		for(int i = 0; i<temp.length; i++) {
			int xi = xArr[i];
			int yi = yArr[i];
			System.out.println(i + ": " + xi + ", " + yi);
			
			for(int j=i; j<temp.length; j++) {
				String[] jArr = temp[j].split(" ");
				int xj = Integer.parseInt(jArr[0]);
				int yj = Integer.parseInt(jArr[1]);
				
				if(xi>=xj) {
					String tmp = temp[i];
					temp[i] = temp[j];
					temp[j] = tmp;
				} 
//				else if(xi==xj) {
//					if(yi>yj) {
//						String tmp = temp[i];
//						temp[i] = temp[j];
//						temp[j] = tmp;
//					}
//				}
			}
			System.out.println(temp[i]);
		}
		
	}
}
