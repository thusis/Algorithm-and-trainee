package com.be.practice.step4_arr;

//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

//첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.

//문자열 배열 >각 char[] 의 길이가 되어줌.
//char 배열 >점수추출용
//score 배열 >출력용


import java.util.Scanner;
public class Practice8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int t = sc.nextInt();
		int point = 0;
		for(int i = 0 ; i<t ; i++) {
			String s = sc.nextLine();
			
			for( int j = 0; j<s.length(); j++ )	{
				
				char ans = s.toUpperCase().charAt(j);
				
					if(ans == 'O') {
						point++;
					}
					while
				
			}
		}
		
	}
	
	
	
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();//테스트 케이스의 개수
//		String test[] = new String[N];
//		if(N>0 && N<=80) { //N의 범위 정해줌.
//			
//			for(int i=0 ; i<test.length ; i++) {
//				
//				test[i] = sc.next(); 
//				char testChar[] = new char[test[i].length()]; //각각의 String 마다 charAt 이용해 char 배열로 담고, 점수 추출까지 하자.
//				for(int j=0; j<test[i].length(); j++) {
//					testChar[j]	= test[i].charAt(j);
//					System.out.print(testChar[j] + " ");
//				}
//				System.out.println();
//				
//				int scoreArr[] = new int[test[i].length()] ; //char[] 에 대한 점수 int[]로 담아야함.
//				int score = 0;				
//				for (int j = 0; j < testChar.length; j++) {
//					if(testChar[j]=='O') {
//						score+=1;
//						for (int k = 1; j+k <testChar.length; k++) { 
//							if (testChar[j+k] == 'O') { 
//								score += k+1;
//							} else if(testChar[j+k]=='X') {
//								System.out.println(j+k+"번째 문자가 'X' 라서 k반복문 out.");
//								j = j+k;
//								break;
////								testChar[j] = 'X';
//							}
//							j=j+k;
//						}
//					}
////					break;
//					System.out.println(j+"번째 문자에 대한 점수 집계 : " + score);
//					//==여기까지 점수 구하는 구간*
//				}
//				scoreArr[i] = score;
//				System.out.print("scoreArr[" + i + "] : " + scoreArr[i] + " ");
//				}
//			}
//		
//	}
}
