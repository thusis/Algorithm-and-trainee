package com.be.practice.step8_number;

import java.util.Scanner;

public class Practice1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int x = 0;
		int count = 0;
		
		String[] arr=(sc.nextLine()).split(" ");
		System.out.println(arr);
		for(int m=0; m<n; m++) {
			System.out.println("arr["+m+"]은"+arr[m]+"입니다");
			x = Integer.parseInt(arr[m]);
			System.out.println("x는 "+ x+"입니다");
			
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
				System.out.println(x+"는 소수입니다.");		
				count++;
			}else {
				System.out.println(x+"는 소수가 아닙니다.");
			}
		}
		System.out.println("소수는 총 "+count+"개입니다.");
		

	}
}
