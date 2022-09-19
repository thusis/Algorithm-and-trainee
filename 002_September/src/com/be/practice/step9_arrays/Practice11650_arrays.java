package com.be.practice.step9_arrays;

public class Practice11650_arrays {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for(int i = 0; i<6; ) {
			int random = (int)(Math.random()*45+1);
			boolean dblcheck = false;
			for(int j=0; j<i; j++) {
				if(lotto[j]==random) {
					dblcheck=true;
					break;
				}
			}
			if(!dblcheck) {
				lotto[i]=random;
				i++;
			}
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = i; j < 6; j++) {
				if(lotto[i]>lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
			System.out.print(lotto[i] + " ");
		}
	}

}
