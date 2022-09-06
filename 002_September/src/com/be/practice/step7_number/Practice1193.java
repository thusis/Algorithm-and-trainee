package com.be.practice.step7_number;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice1193 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		
		ArrayList<Integer> bunja = new ArrayList<Integer>();
		ArrayList<Integer> bunmo = new ArrayList<Integer>();
		
		for(int i=1; bunja.size()>X ;i+=2) { 
			int j=0;
			while (j!=i) { j++; bunja.add(j);} 
			while (j!=1) { j--;bunja.add(j);}
			
			if(bunja.size()>X) {break;}
			
		}
		
		for(int i=1; bunmo.size()>X; i+=2) {
			int j=0;
			while (j!=i+1) { j++; bunmo.add(j);}
			while (j!=1) { j--;bunmo.add(j);}
			if(bunmo.size()>X) {
				System.out.println(bunja.get(X-1) + "/" + bunmo.get(X-1));

				break;
			}
		}
		sc.close();
		System.out.println(bunmo);
		System.out.println(bunja);
	}
}
