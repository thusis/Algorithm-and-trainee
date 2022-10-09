package com.be.practice.redo;

import java.util.Scanner;

public class P1920 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String str =  sc.nextLine();
//		switch(str){
//		case "1 2 3 4 5 6 7 8":
//			System.out.println("ascending");
//			break;
//		case "8 7 6 5 4 3 2 1":
//			System.out.println("descending");
//			break;
//		default:
//			System.out.println("mixed");
//		}
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[8];
		for(int i=0; i<8; i++) {
			numbers[i] = sc.nextInt();
			System.out.print(numbers[i]+" ");
		}
		
		boolean flag = true;
		for(int i=0; i<8; i++) {
			do {
				if(i>0 && Math.abs(numbers[i]-numbers[i-1])==1) {
					flag = true;				
					if(i==7 && numbers[i]-numbers[i-1]==1) {
						System.out.println("ascending");
						break;
					} else if(i==7 && numbers[i]-numbers[i-1]==-1) {
						System.out.println("descending");
						break;
					}
				} else {
					flag = false;
					System.out.println("mixed");
				}
			} while(flag);
		}
	}
}
