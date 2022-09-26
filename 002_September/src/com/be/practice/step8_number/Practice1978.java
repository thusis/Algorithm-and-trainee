package com.be.practice.step8_number;

import java.util.Scanner;

public class Practice1978 {
	public static void main(String[] args) {
		//소수찾기
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int arr[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count=0;
		for(int i = 0; i<n; i++) {
			if(arr[i]<=1) {
				i++;
			} else if(arr[i]==2) {
				count++;
				i++;
			} else if(arr[i]>2) {
				for(int j=2; j<arr[i];) { //단 arr[i]는 1이 아닐 때,
					if(arr[i]%j==0) {
						break;
					}else{
						if(j==arr[i]-1) {
							System.out.println(arr[i]+"는 소수임.");
							count++;
						}
						j++;
					}
				}				
			}
		}
		System.out.println(count);
		
	}
}
