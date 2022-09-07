package com.be.practice.step7_number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Practice2869 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int v = sc.nextInt();
//		
//		int temp = 0;
//		int day = 1;
//		
//		while(temp<v) {
//			temp += a;
//			if(temp >= v) {
//				break;
//			}
//			temp -= b;
//			day++;
//		}
//		System.out.println(day);
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
			
		int temp = 0;
		int day = 1;

		while (temp < v) {
			temp += a;
			if (temp >= v) {
				break;
			}
			temp -= b;
			day++;
		}
		bw.write(String.valueOf(day));
		bw.flush();
		bw.close();
		bf.close();
	}

}
