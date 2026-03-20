package 라이브러리;

public class MyUtilTeacher {

	public void 별출력하기() {

		// 1. 별을 3개 출력하기 : 무조건 별을 3개 출력해 드릴께요

		for (int i = 0; i < 3; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	// 2. 원하는 문자를 3개 출력하기 ( 매개변수 활용) : 당신이 원하는 문자를 3번 출력해 드릴께요

	public void print(String a) {
		for (int i = 0; i < 3; i++) {
			System.out.print(a);
		}
		System.out.println();
	}

	// 당신의 코드를 세번 실행해 드릴께요
	// 매개변수 당신의 코드를 받아야한다 ( 매서드 작성- > 매서드의 이름을 라이브러리를 만드는 사람이 정하는것. 약속을 정하는것 )
	// -인터페이스로 만들기
	// 인터페이스 만들기
	// TeacherCodeRun //인터페이스 이름
	// -매서드이름 void codeRun() //매개변수필요없고 반환도 필요없다
	// 세번 실행하기

	public void runThreeTimes(TeacherCodeRun code) { // A, B, C, D => TeacherCodeRun -> codeRun
		//
		code.codeRun();//
		code.codeRun();
		code.codeRun();

	}

}
