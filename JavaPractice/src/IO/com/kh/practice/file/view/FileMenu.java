package IO.com.kh.practice.file.view;

import java.util.Scanner;

import IO.com.kh.practice.file.controller.FileController;

public class FileMenu {

	Scanner sc = new Scanner(System.in);
	FileController fc = new FileController();
	
	public void mainMenu() {
		
		int menuNum = 0;
		do {
			System.out.println(" ***** My Note ***** ");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			menuNum = Integer.parseInt(sc.nextLine());
			
			switch(menuNum) {
			case 1: fileSave(); break; 
			case 2: fileOpen(); break;
			case 3: fileEdit(); break;
			case 9: System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		} while(menuNum==9);
	}

	private void fileSave() {
		System.out.println("파일에 저장할 내용을 입력하세요.\n ex끝it 이라고 입력하면 종료됩니다.");
		System.out.print("내용 : ");
		
		StringBuilder sb = new StringBuilder();
		String str = null;
		str = sc.nextLine();
		
		//ex끝it 을 입력할 때까지 사용자가 입력하고, 저장됨.
		
		char sel = '\0';
		do {
			System.out.print("저장할 파일 명을 입력해주세요 : ");
			// 이미 존재하는 파일 명이면
			if(/**/true) {
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n) : ");
				sel = sc.nextLine().toLowerCase().charAt(0);
				if( sel == 'y') {
					fc.fileSave(sb);
				} 
			} else {
				fc.fileSave(sb);
			}
		} while(sel=='n');

	}

	private void fileOpen() {
		// TODO Auto-generated method stub
		
	}

	private void fileEdit() {
		System.out.println("파일에 저장할 내용을 입력하세요.");
		// TODO Auto-generated method stub
		
	}

}
