package exception.com.kh.practice.charCheck.controller;

import exception.com.kh.practice.charCheck.exeption.CharCheckException;

public class CharacterController {
	public CharacterController(){}
	
	public int countAlpha(String s) throws CharCheckException {
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			if( (int)s.charAt(i)>=65 && (int)s.charAt(i)<=90 ) {
				count++;
			} else if (s.charAt(i)==' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 있습니다.");
			}
		}
		return count;
	}

}
