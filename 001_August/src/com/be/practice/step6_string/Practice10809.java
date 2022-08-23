package com.be.practice.step6_string;

import java.util.Scanner;

//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
public class Practice10809 {
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String s = sc.next();
//		int index[] = new int[26];
//		
//		for(int i =0; i<s.length(); i++) {
//			s.charAt(i);
//			
//			switch(s.charAt(i)) {
//			
//			case 'a': index[0] = i; break;
//			case 'b': index[1] = i; break;
//			case 'c': index[2] = i; break;
//			case 'd': index[3] = i; break;
//			case 'e': index[4] = i; break;
//			case 'f': index[5] = i; break;
//			case 'g': index[6] = i; break;
//			case 'h': index[7] = i; break;
//			case 'i': index[8] = i; break;
//			case 'j': index[9] = i; break;
//			case 'k': index[10] = i; break;
//			case 'l': index[11] = i; break;
//			case 'm': index[12] = i; break;
//			case 'n': index[13] = i; break;
//			case 'o': index[14] = i; break;
//			case 'p': index[15] = i; break;
//			case 'q': index[16] = i; break;
//			case 'r': index[17] = i; break;
//			case 's': index[18] = i; break;
//			case 't': index[19] = i; break;
//			case 'u': index[20] = i; break;
//			case 'w': index[21] = i; break;
//			case 'v': index[22] = i; break;
//			case 'x': index[23] = i; break;
//			case 'y': index[24] = i; break;
//			case 'z': index[25] = i; break;
//			default : 
//			
//			}
//		}
//		
//	}
//	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char index[] = new char[26];
		int indexI[] = new int[26];
		
		for(int i = 0 ; i<index.length; i++) {
			index[i] = (char)(97+i);
			for(int j = 0; j<s.length(); j++) {
				if(index[i] == s.charAt(j)) {
					indexI[i] = j;
				} else {
					indexI[i] = -1;
				}
			}
			System.out.print(indexI[i] + " ");
		}

	}

}
