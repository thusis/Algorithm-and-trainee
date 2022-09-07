package com.be.practice.step7_number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Practice10250 {
	public static void main(String[] args) throws IOException { //Reader , Writer 버전
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(bf.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			double h = Double.parseDouble(st.nextToken());
			double w = Double.parseDouble(st.nextToken());
			double n = Double.parseDouble(st.nextToken());

			int xx = 0;
			if (n % h == 0) {
				xx = (int) h;
			} else {
				xx = (int) (n % h);
			}
			int yy = (int) Math.ceil(n / h);
			bw.write(String.valueOf(xx * 100 + yy) + "\n");
		}
		bw.flush();
		bw.close();
	}
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int t = Integer.parseInt(sc.nextLine());
//		for(int i =0; i<t; i++) {
//
//			double h = Double.parseDouble(sc.next());
//			double w = Double.parseDouble(sc.next());
//			double n = Double.parseDouble(sc.next());
////자바 Math.ceil 을 그냥 막 쓰면 정수가 나온다. 
////때문에 double로 형변환을 해야 소수점이 발생하여 정상적으로 ceil 을 할 수 있다.
//			
////			int h = sc.nextInt();
////			int w = sc.nextInt();
////			int n = sc.nextInt();
//			
//			int xx = (int) (n%h);
//			if(xx==0) {
//				xx = (int) h;
//			} 
//			
//			int yy = (int) Math.ceil(n/h) ;
//			
//			System.out.println(xx*100 + yy);
//		}
//	}

}
