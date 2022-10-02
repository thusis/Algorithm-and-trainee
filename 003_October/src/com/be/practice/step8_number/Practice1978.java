package com.be.practice.step8_number;

import java.util.Scanner;

public class Practice1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int x = 0;
		int count = 0;
		
		String[] arr=(sc.nextLine()).split(" ");
		for(int m=0; m<n; m++) {
			x = Integer.parseInt(arr[m]);
			boolean result = false;		
			if(x==2) {
				result=true;
			}else if(x>2){
				if(x%1==0 && x%x==0){
					for(int i=2;i<x;i++){
						if(x%i !=0){
							result = true;
						} else {
							result = false;
							break;// 소수이면 true 반환
						}}}}
			if(result) {
				count++;
			}
		}
		System.out.println(count);
		

	}
}
