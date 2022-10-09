package com.be.practice;

import java.util.Scanner;

public class P5622 { //다이얼
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] in = sc.nextLine().split("");
		int seconds = 0;
		int result = 0;
		
		for(int i=0; i< in.length; i++) {
			switch(in[i]) {
				case "A": case "B": case "C":
					seconds = 3;
					break;
				case "D": case "E": case "F":
					seconds = 4;
					break;
				case "G": case "H": case "I":
					seconds = 5;
					break;
				case "J": case "K": case "L":
					seconds = 6;
					break;
				case "M": case "N": case "O":
					seconds = 7;
					break;
				case "P": case "Q": case "R": case "S":
					seconds = 8;
					break;
				case "T": case "U": case "V":
					seconds = 9;
					break;
				case "W": case "X": case "Y": case "Z":
					seconds = 10;
					break;
				} result += seconds;
			}
			System.out.println(result);
		}
	}

