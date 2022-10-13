package com.be.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class P2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		ArrayList<Integer> cards= new ArrayList<>();
		
		
		for(int i=0; i<n; i++) {
			cards.add(sc.nextInt());
		}
		Collections.sort(cards, Comparator.reverseOrder());  //cards 내림차순 정렬
		
		int temp=0;
		int sum=0;
		
		for(int i=0; i<cards.size()-2; i++) {		 
			for(int j=i+1; j<cards.size()-1; j++) { 
				for(int k=j+1; k<cards.size(); k++) {
					sum = cards.get(i)+cards.get(j)+cards.get(k);

					if(temp<sum && sum<=m) {
						temp=sum;
					}

					if(sum==m) {
						System.out.println(sum);
						System.exit(0);
					}
				}
			}
		}
		System.out.println(temp);
	}
}
