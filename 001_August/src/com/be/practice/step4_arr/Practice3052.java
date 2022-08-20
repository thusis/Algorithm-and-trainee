package com.be.practice.step4_arr;

//		수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램
//		첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
import java.util.Scanner;

public class Practice3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int arr[] = new int[10];
		int mod[] = new int[10];
		int count = mod.length;
		for(int i = 0 ; i < arr.length ; i++ ) {
			arr[i] = sc.nextInt();
			mod[i] = arr[i]%42;
		}
		
		for(int i = 0 ; i < mod.length ; i++ ) { //0~10
			for(int j = i+1 ; j<mod.length; j++) {
				if(mod[i] == mod[j]) {
					count -= 1;
					break;
				}
			}
		}
		System.out.println(count);
		}
}
