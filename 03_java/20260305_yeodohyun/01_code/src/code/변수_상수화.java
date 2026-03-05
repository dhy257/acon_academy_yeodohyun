package code;

public class 변수_상수화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기억장소(메모리블럭)을 값의 초기화 후 이용만 할 때 사용
		// 변수를 상수화시킴
		// 대문자 규칙을 가짐

		final int MAX = 10;
		// MAX=11; 불가
		final double PI = 3.14;

		// 상수 사용 목적
		// 1. 가독성 좋아짐
		// 2. 유지보수 좋아짐

		System.out.println(MAX);
		System.out.println(PI);
	}

}
