package com.be.practice.step7_number;

import java.util.Scanner;

public class Practice2839 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			double num = Integer.parseInt(sc.nextLine());
			int result = 0;			
			int b5;
			int b3;

			if( num%5 != 0 && num%3 != 0 && ((int)(num%5))%3 != 0 && ((int)(num%3))%5 !=0 ) {
				result = -1;
			} else if(num%5 == 0) {
				result = (int) (num/5);
			} else if((num%5)%3 != 0) {
				b5 = (int)(num/5);
				result = (int)(num/5) + (int)(num%5)/3;
			} else if(num%3 != 0) {
				result = (int) (num/3);
			} else if((num%3)%5 !=0) {
				result = (int) (num/3) + (int)(num%3)/5;
			}
			
			System.out.println(result);
		}
	}
}
