package student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		AcornStudent엄진희 a = new AcornStudent엄진희();
//
//		a.입력하기("엄진희", 100, 10, 10, 10, 10);
//		a.정보출력하기();
//		a.수면();
//		a.정보출력하기();

		AcornStudent장해든 s = new AcornStudent장해든();
		// 객체매서드 사용법
		// 1. 객체를 반드시 생성 >> 객체의 정보를 전달받아서 객체(변수)의 내용을 사용해아 함
		// 2. 
		s.입력하기("장해든", 1000, 30, 30, 50, 100);
		s.정보출력하기();
		s.놀기놀기(); // 객체의 행복지수는 놀기놀기()를 사용해 올릴 수 있음
		s.정보출력하기();
		AcornStudent장해든.학원위치소개하기();
	}

}
