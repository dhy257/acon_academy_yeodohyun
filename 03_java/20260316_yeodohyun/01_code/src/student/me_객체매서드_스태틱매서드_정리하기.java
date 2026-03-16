package javaprj.day10;

public class me_객체매서드_스태틱매서드_정리하기 {

//	객체 메서드 → 객체 행동
	// 객체 메서드
	// 객체의 상태(변수)를 사용하거나 변경할 수 있다.
	// this 사용 가능
	// 객체 생성 후 사용해야 한다.
	
//	static 메서드 → 공통 기능
	
	// 객체매서드
	 private int 기분 = 50;

	    public void 아침스트레칭() {
	        this.기분 += 10;
	        System.out.println("스트레칭 완료. 기분 상승!");
	    }
	
	// 스태틱매서드
	public static void 오늘의패션추천() {
		System.out.println("오늘은 블랙 코디 추천!");

	}

}
