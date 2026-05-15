package day1prac.라이브러리만들기;

class MyLib {

	// 1. 별(★ )을   3번 출력하는 매서드 만들기 
	void printStar() {
		for (int i = 0; i < 3; i++) {
			System.out.println("★");
		}
	}

	// 2. 원하는 문자를 3번 출력하는 매서드 만들기
	void printChar(String ch) {
		for (int i = 0; i < 3; i++) {
			System.out.println(ch);
		}
	}

	// 3. 원하는 코드를 3번 실행해 주는 매서드 만들기
	void repeat(Runnable r) {
		for (int i = 0; i < 3; i++) {
			r.run();
		}
	}
	
	public static void main(String[] args) {

		MyLib lib = new MyLib();
		lib.printStar();
		lib.printChar("dd");
		lib.repeat(() -> lib.printStar());

	}
	
	// 당신의 코드 => 인터페이스 사용( 약속 정하기 ) : 약속을 지키면서 당신의 코드를 작성하시오
	public void codeRun(CodeRunnable r) {
		System.out.println("코드 3번 실행");
		for (int i = 0; i < 3; i++) {
			r.codeRun();
		}
	}
	
}
