package com.be.practice;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
        int[] answer = {};
        int count = 0;
        
        while(n != 0) {
         count++;
         n = n/10;
         System.out.println(count+","+n);
        }
       
        answer = new int[count];
     
        for(int i = 0;  i < count; i++){
            answer[i] += (int)(n%10);
            n = n / 10;           
            System.out.println(i+","+n);
        }
         for(int i=0; i<answer.length; i++) {
        	 System.out.println(answer[i]);
         }
	        
	}

}