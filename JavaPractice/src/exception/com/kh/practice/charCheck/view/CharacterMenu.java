package exception.com.kh.practice.charCheck.view;

import java.util.Scanner;

import exception.com.kh.practice.charCheck.controller.CharacterController;
import exception.com.kh.practice.charCheck.exeption.CharCheckException;

public class CharacterMenu {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().toUpperCase();
		CharacterController cc = new CharacterController();
		int num=0;
		try {
			num = cc.countAlpha(s);
			System.out.println(s+"에 포함된 영문자 개수 : " + num);
		} catch (CharCheckException e) {
			e.printStackTrace();
		}
		
	}

}
