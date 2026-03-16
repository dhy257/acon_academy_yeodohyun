package javaprj.day10;

public class me_객체매서드_스태틱매서드_정리하기Main {

	public static void main(String[] args) {
//	객체 메서드 -> <객체>의 행동				 / new 주기!! 객체.매서드이름() 으로 사용가능
//	static 메서드 -> 클래스 안에서의 공통 기능 / 클래스이름.매서드이름() 으로 사용가능
	
	// 객체매서드
		me_객체매서드_스태틱매서드_정리하기 girl = new me_객체매서드_스태틱매서드_정리하기();
		girl.아침스트레칭();
	
	// 스태틱매서드
	me_객체매서드_스태틱매서드_정리하기.오늘의패션추천();
	
	
	}
}
