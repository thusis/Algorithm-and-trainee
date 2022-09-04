package com.be.practice.step7_number;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice1193 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		ArrayList<Integer> bunja = new ArrayList<Integer>();
		ArrayList<Integer> bunmo = new ArrayList<Integer>();
//		ArrayList<String> result = new ArrayList<String>();
		
		for(int i=1; i<X*4;i+=2) { //2씩 커지는 최대값, i의 범위를 어떻게 설정해야 할지 고민된다.
			
			int j=0;
			while (j!=i) { j++; bunja.add(j); } //123..12345..1234567..
			while (j!=1) { j--;bunja.add(j); } //21..4321..654321..
			while (j!=i+1) { j++; bunmo.add(j); } //12..1234..123456..
			while (j!=1) { j--;bunmo.add(j); }//1..321..54321..
			
			if(Math.min(bunja.size(), bunmo.size())>X) {
				System.out.println(bunja.get(X)+"/"+bunmo.get(X));
				break;
			}
		}
		
	}
	

	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int X = sc.nextInt();
//		
//		ArrayList<Integer> bunja = new ArrayList<Integer>();
//		ArrayList<Integer> bunmo = new ArrayList<Integer>();
//		
//		for(int i=1; i<X*10 ;i+=2) { //2씩 커지는 최대값, i의 범위를 어떻게 설정해야 할지 고민된다.
//			
//			int j=0;
//			while (j!=i) { j++; bunja.add(j); } //123..12345..1234567..
//			while (j!=1) { j--;bunja.add(j); } //21..4321..654321..
//			while (j!=i+1) { j++; bunmo.add(j); } //12..1234..123456..
//			while (j!=1) { j--;bunmo.add(j); }//1..321..54321..
//		}
//		
//		System.out.println("["+X + ":" + bunja.get(X)+"/"+bunmo.get(X)+"] ");
//		
//		
//		
////		for(int i=2; i<10 ;i+=2) {
////			int j=0;
////			while (j!= i) { j++; bunmo.add(j); }
////			while (j!=1) { j--;bunmo.add(j); }
////		}
//	}
	
}
