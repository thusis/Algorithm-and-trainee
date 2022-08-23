package com.be.practice.step5_fucntion;

import java.util.ArrayList;

public class Practice4673 {

	public void useArrayList() {
		ArrayList<Integer> d = new ArrayList<Integer>();
		ArrayList<Integer> notD = new ArrayList<Integer>();
		
		for(int i = 1; i<=100; i++) {
			int n;
			int a;
			int b;
			int dn;
			
			n = i;
			a = n/10;
			b = n - a*10;
			
			dn = n + a + b;
			if(dn<=100) {				
				d.add(dn);	
			}
		}
		
		System.out.println(d);
		System.out.println(d.size());
		for(int i = 0; i<=100 ; i++) {				
			if(!d.contains(i)) {
				notD.add(i);
			}
		}
		
		System.out.println(notD);
		
		
//		while(!notD.isEmpty()) {
//			for(int i = 0; ; i++) {
//				System.out.println(notD.get(i));
//				notD.remove(i);
//			}
//		}

	}
	
	public void try2() {
		ArrayList<Integer> d = new ArrayList<Integer>();		
		ArrayList<Integer> notd = new ArrayList<Integer>();
		
		for(int i = 1; i<=100; i++) {
			int n;
			int a;
			int b;
			int dn;
			
			n = i;
			a = n/10;
			b = n-a*10;
			dn = n + a + b;
			
			if(dn<=100 && !d.contains(dn)) {
				d.add(dn);
			}
		}
		
		System.out.println(d + " " + d.size());

		for(Integer i : d ) {
		    System.out.println(i);
		}
		
		//d의 각 요소와의 일치여부를 이용해서(index아님) d가 포함하지 않은 값 notD에 넣기
		for(int i = 1; i<=100 ; i++) {
			if(!d.contains(i)) {
				notd.add(i);
			}
		}
		
		System.out.println(notd + " " + notd.size());
		
		//위의 식들 이용해서 ~100 말고, ~10,000까지 다시 계산해보자! 굿
		
	}
	
}
