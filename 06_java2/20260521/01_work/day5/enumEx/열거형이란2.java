package day5.enumEx;

public class 열거형이란2 {
	public static void main(String[] args) {
		//  1: LIGHT, 2: DARK
		//  위 정보를 숙지해야 함 - 가독성 현저히 떨어짐
		int mode = 1;
		mode = 2;
		
		//  타 변수에 사용되는 값들과 구분되지 않음
		//  잘못된 범위의 값 입력에 대응하기 번거로움
		int spaces = 3;		
		mode = spaces; // 이러한 실수를 방지하기 어려움
	}

}
