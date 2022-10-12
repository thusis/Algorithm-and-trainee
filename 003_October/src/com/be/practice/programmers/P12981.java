package com.be.practice.programmers;

import java.util.ArrayList;

public class P12981 {
	
	//가장 먼저 탈락하는 사람의 번호와, 그 사람이 자신의 몇 번째 차례에 탈락하는지
	// 2<=n<=10
	// String[] words
	// 정답은 [번호, 차례]
	
	public static void main(String[] args) {
		int n=2;
		String[] words= {"hello", "one", "even", "never", "now", "world", "draw"};
		
		for(int i=0; i<2; i++) {
			System.out.print(solution(n, words)[i]+" ");				
		}
	}

	static int[] solution(int n, String[] words) {
		
		ArrayList<String> list = new ArrayList<>();
		int temp=0;
		boolean check=false;//중복이거나 문제있으면 true;
		
		//중복 체크
		list.add(words[0]);
		
//		for(int i=1; i<words.length; i++) {
//			// 끝말잇기 검증
//			if(words[i-1].charAt(words[i].length()-1)==words[i].charAt(0)) {
//				if(list.contains(words[i])) {
//					temp=i;
//					System.out.println(i+"번째 단어인"+words[i]+"를 얘기한 사람은 누구?");
//					break;
//				} else {
//					list.add(words[i]);
//				}				
//			} else {
//				temp=i;
//				System.out.println(i+"끝말잇기 통과x");
//				break;
//			}
//		}
		
		while(!check) {
			for(int i=1; i<words.length; i++) {
				// 끝말잇기 검증
				if(words[i-1].charAt(words[i].length()-1)==words[i].charAt(0)) {
					if(list.contains(words[i])) {
						temp=i;
						System.out.println(i+"번째 단어인"+words[i]+"를 얘기한 사람은 누구?");
						check=true;
					} else {
						list.add(words[i]);
					}				
				} else {
					temp=i;
					System.out.println(i+"끝말잇기 통과x");
					check=true;
				}
			}
		}

		
		int a=0; int b=0;
		if(temp!=0) {
			a = (temp%n)+1;
			b = (temp/n)+1;
		}
		
        int[] answer = {a,b};
        
        return answer;
    }
  
}
