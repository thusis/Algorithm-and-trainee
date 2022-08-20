package com.be.practice.step4_arr;
//9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
//예를 들어, 서로 다른 9개의 자연수 3, 29, 38, 12, 57, 74, 40, 85, 61
//이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.

import java.util.Scanner;

public class Practice2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int Max = 0;
		int countMax = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if(i>=0 && i<arr.length-1) { //0~8까지
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j] && arr[i]>Max) {
						Max = arr[i];
						countMax = i;
					} 
				}
			} else {//9일 때
				if(arr[i]>Max) {
					Max = arr[i];
					countMax = i;
				}
			}
		}
		System.out.println(Max + " " + (countMax + 1));
		sc.close();
	}
}
//	public static void main(String[] args) { //내림차순
//		Scanner sc = new Scanner(System.in);
//		int arr[] = new int[9];
//		int temp = 0;
//		int Max = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		for (int j = 0; j < arr.length; j++) {
//			for (int k = j + 1; k < arr.length; k++) {
//				if (arr[j] < arr[k]) { // 내림차순: k가 더 크면 위치 바꿔야함.
//					temp = arr[j];
//					arr[j] = arr[k];
//					arr[k] = temp;
//				}
//			}
//		}
//		for (int i=0; i<arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
