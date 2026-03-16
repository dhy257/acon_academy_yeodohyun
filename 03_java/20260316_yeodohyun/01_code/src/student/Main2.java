package javaprj.day10;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AcornStudent엄진희 a;  // a는 참조형변수이다
		a = new AcornStudent엄진희();
		a.입력하기("엄진희", 100, 10, 30, 30, 50);
		a.정보출력하기();
		a.수면();
		
		a.정보출력하기();  // 정보출력하기 (a)
		               // 정보출력하기가 호출될 때 a변수 (a객체)의 위치정보가 전달됨
		
		
	}

}
