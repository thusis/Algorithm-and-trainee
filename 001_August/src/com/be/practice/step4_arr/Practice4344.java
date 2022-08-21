package com.be.practice.step4_arr;
//첫째줄에는 테스트 케이스의 개수 C
//둘째 줄부터 각 테스트 케이스마다 학생수N(정수)이 첫 수로 주어지고, 이어서 N명의 점수
//점수는 0~100 정수
//각 케이스마다 한줄씩 평균을 넘는 학생들의 비율을 반올림해서 소수점 셋째 자리까지 출력.
import java.util.Scanner;

public class Practice4344 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		for(int i = 0 ; i<C; i++) {
			int N = sc.nextInt(); //학생의 수
			double arr[] = new double[N];
			double sum = 0;
			
			if(N>=1 && N<=1000) {
				for(int j=0; j<arr.length; j++) {
					arr[j] = sc.nextDouble();
					sum += arr[j];
				}
			}
			
//			double a = 12.3456789;
//			System.out.println((double)Math.round(a*100)); // 1235.0
//			System.out.println((double)Math.round(a*100)/100); //12.35 

			double avg = sum/N;
			System.out.println(i+"번째 평균: " + avg);
			int count = 0;
			
			for(int k=0; k<arr.length; k++) {
				if(arr[k]>avg) {
					count +=1;
				}
			}
			System.out.println(count);
//			double A = (double) count/N;
			double result = Math.round((double)
					count/N*1000)/1000.0;
			System.out.println(result*100+ "%");
			
		}
	}

}
