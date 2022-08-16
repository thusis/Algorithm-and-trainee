package com.be.practice.step3_loop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Practice15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T =  Integer.parseInt(br.readLine());
		
		for(int i =0; i<T; i++) {
			int a = br.read();
			int b = br.read();
			bw.write(a+b);
		}
		br.close();
		bw.close();
		
		
	}
}
