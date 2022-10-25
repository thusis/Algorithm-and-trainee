package com.be.practice;

import java.util.Scanner;

public class CombinationP0 {
	/*
	 * 
	조합이란 n 개의 숫자 중에서 r 개의 수를 순서 없이 뽑는 경우를 말함
	예를 들어 [1, 2, 3] 에서 2개의 수를 순서 없이 뽑으려면
 	1 . 현재 인덱스를 선택하는 경우
 	2 . 현재 인덱스를 선택하지 않는 경우
 	두 가지로 모든 경우를 완전 탐색 해주어야 한다.
 	
 		 arr :  조합을 뽑아낼 배열
 		 output : 조합에 뽑혔는지 체크하는 배열
 		 n : 배열의 길이
 		 r : 조합의 길이
 		 	숫자를 하나 뽑을 때마다 r을 하나씩 줄여준다.
 		 	즉, r==0 일 때가 r개의 숫자를 뽑은 경우이다.
	*/
	
	public static void main(String[] args) {
		int n=4;
		int[] arr= {1, 2, 3, 4};
		boolean[] visited = new boolean[n];
		
		System.out.println("재귀 이용한 구현");
		for(int i=1; i<n; i++) {
			System.out.println("\n"+n+" 개 중에서 " + i + " 개 뽑기");
			combination2(arr,visited, 0, n, i);
		}
		
		System.out.println("\n"+"백트래킹 이용한 구현");
		for(int i=1; i<n; i++) {
			System.out.println("\n"+n+" 개 중에서 " + i +" 개 뽑기");
			combination1(arr, visited, 0, n, i);
		}
	}

	/*
		[1] 백트래킹 이용하여 구현
			사용 예시 : combination(arr, visited, 0, n, r)
		start 변수는 기준 인덱스로, 
		i < start 이면 뽑을 후보에서 제외 => 뽑기 전에는 visited[i] = false 
		i > start 라면 뽑을 후보에 해당 => 뽑은 후에는 visited[i] = true
	 */
	
	static void combination1(int[] arr, boolean[] visited, int start, int n, int r) {
		if(r==0) {
			print(arr,visited, n);
			return;
		}
		
		/*
		함수에 들어오면 먼저 i 가 start 부터 시작하는 for 문에 들어갑니다.
		만약 0 인덱스인 1을 뽑는다면 visited[i] 는 true 가 되고 
		뽑지 않는다면 visited[i] 는 false 입니다.
		1을 선택한 경우와 선택하지 않은 경우 둘 다 봐야합니다.
		하지만 더이상 1은 고려 대상이 아니기 때문에 다음 for 문은 무조건 i+1 부터 시작해주어야 합니다.
		*/
		
		for(int i=start; i<n; i++) {
			visited[i]=true;
			combination1(arr,visited,i+1,n,r-1);
			visited[i]=false;
		}
	}
	
	/*
		[2] 재귀 이용하여 구현
			사용 예시 : comb(arr, visited, 0, n, r)
		depth 변수(=현재 인덱스) 사용
		 	- 현재 인덱스를 뽑는다면 visited[depth] = true
			- 뽑지 않는다면 visited[depth] = false
		뽑은 경우와 뽑지 않은 경우 모두 봐야하고, 
		그 때 이전에 본 값들은 더이상 고려 대상이 아니기 때문에 depth 은 무조건 1 씩 증가
		depth == n 이 되면 모든 인덱스를 다 보았으므로 재귀를 종료합니다.	 
	*/
	
	static void combination2(int[] arr, boolean[] visited, int depth, int n, int r) {
	    if (r == 0) {
	        print(arr, visited, n);
	        return;
	    }

	    if (depth == n) {
	        return;
	    }

	    visited[depth] = true;
	    combination2(arr, visited, depth + 1, n, r - 1);

	    visited[depth] = false;
	    combination2(arr, visited, depth + 1, n, r);
	}
	
	//출력
	static void print(int[] arr, boolean[] visited, int n) {
		for(int i=0; i<n; i++) {
			if(visited[i]) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	

	
}
