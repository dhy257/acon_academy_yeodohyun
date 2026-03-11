package javaprj.day07.실습;

import java.util.Scanner;

public class 실습6_예뻐지는법 {
	
	/*
	   함수의 머리 부분(선언부)을 보면 어디가 입력이고 어디가 반환인지 바로 알 수 o.

	   입력(Parameter, 매개변수): 함수 이름 뒤의 괄호 ( ) 안. 여기가 '데이터가 들어오는 입구'
	   반환(Return Value, 결과값): 함수 이름 왼쪽. void가 아닌 int, String 등이 써있다면 
	                            '데이터가 나가는 출구'가 있다는 뜻
	
	*/
	
	/*
      기능명(함수명): 선택 메뉴 보여주기 
	  입력(매개변수) : x
	  반환 : x

	*/
	
	
	
	public static void start() {
		System.out.println("\n🫧 About Beauty 🫧");
		System.out.println(" → 궁금한 메뉴의 번호를 입력 해 주세요 ←");
		System.out.println("🌼 1. SkinCare 2. Makeup 3. PersonalColor 4. Diet 🌼");
		
	}
	
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("궁금한 메뉴 번호 : ");
		int num = scanner.nextInt();
		
		switch(num) {
		case 1:
			skinCare();
		break;
		
		case 2:
			makeup();
			break;
			
		case 3:
			personalColor();
			break;
			
		case 4:
			diet();
			break;
		
		}
		
		
	}
	
	public static void skinCare() {
		System.out.println("1.SkinCare");
		System.out.println("=>에스트라 아토베리어 장벽크림");
		System.out.println("=>바이오더마 클렌징워터");
		System.out.println("=>온그리디언츠 베리어 카밍 로션");
	}
	public static void makeup() {
		System.out.println("2.Makeup");
		System.out.println("=>설화수 에어리 쿠션");
		System.out.println("=>바닐라코 핑크구아바 글로우 틴트");
		System.out.println("=>에스쁘아 더브로우 밸런스 펜슬 ");
		
	}
	public static void personalColor() {
		System.out.println("3.PersonalColor");
		System.out.println("=>봄 웜");
		System.out.println("=>여름 쿨");
		System.out.println("=>가을 웜");
		System.out.println("=>겨울 쿨");
	}
	public static void diet() {
		System.out.println("Diet");
		System.out.println("=>폼롤러로 붓기와 몸 독소 빼주기");
		System.out.println("=>수면");
		System.out.println("=>");
		System.out.println("=>");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		start();
		menu();

	}

}
