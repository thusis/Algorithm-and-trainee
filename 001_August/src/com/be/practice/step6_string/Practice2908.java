package com.be.practice.step6_string;

import java.util.Scanner;

public class Practice2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		
		int anum = Integer.parseInt(a.charAt(2)+"")*100
		+ Integer.parseInt(a.charAt(1)+"")*10
		+ Integer.parseInt(a.charAt(0)+"") ;
	
		int bnum = Integer.parseInt(b.charAt(2)+"")*100
				+ Integer.parseInt(b.charAt(1)+"")*10
				+ Integer.parseInt(b.charAt(0)+"") ;

		System.out.println(Math.max(anum, bnum));
	}

}
