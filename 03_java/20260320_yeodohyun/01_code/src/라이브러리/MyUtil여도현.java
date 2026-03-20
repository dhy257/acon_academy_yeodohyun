package 라이브러리;

public class MyUtil여도현 {

	public void star() {
		for (int i = 0; i < 3; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public void printChar(String str) {
		for (int i = 0; i < 3; i++) {
			System.out.println(str);
		}
		System.out.println();
	}

	// 라이브러리를 만들때는 결정할 수 없는 코드는 모두 인터페이스로 만들어 제공한다
	// 라이브러리를 사용하는 사람(개발자)이 구현해서 책임져야 함
	// 원하는코드 => 매서드 => 미완성의 매서드 작성 => 추상클래스, 인터페이스
	public void printCode(Runnable r) {
		for (int i = 0; i < 3; i++) {
			r.run();
		}
	}
}
