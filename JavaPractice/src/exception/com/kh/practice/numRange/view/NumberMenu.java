package exception.com.kh.practice.numRange.view;

import java.util.Scanner;

import exception.com.kh.practice.numRange.controller.NumberController;
import exception.com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : " );
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("정수2 : " );
		int b = Integer.parseInt(sc.nextLine());

		NumberController nc = new NumberController();
		
		try {
			boolean result = nc.checkDouble(a, b);
			System.out.println(a+"는(은) "+b+"의 배수인가?"+result);
		} catch (NumRangeException e) {
			e.printStackTrace();
		}
		
	}

}
