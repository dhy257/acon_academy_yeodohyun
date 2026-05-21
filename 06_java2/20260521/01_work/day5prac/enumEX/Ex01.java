package day5prac.enumEX;

public class Ex01 {
	public static void main(String[] args) {

		// 변수
		String mode = "DARK";
		mode = "abc"; // 지정된 값 이외의 값을 막을 수 없음

		// enum 사용하기
		Mode enumMode = null;
		enumMode = Mode.DARK;
		enumMode = Mode.LIGHT;
	}
}
