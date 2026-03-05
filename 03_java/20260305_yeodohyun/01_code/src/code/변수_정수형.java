package code;

public class 변수_정수형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b; // 1바이트 -128~+127
		short s; // 2바이트 -32000~+32000
		int i; // 4바이트 -21억~+21
		long l; // 8바이트 -922경~+922경

		b = 127;
		s = 32000;
		i = 2100000000;
		// 값(리터럴)은 저장되고 사용됨
		// 정수형리터럴은 int로 저장됨 >> l지금 int 로저장되는중
		// 정수형 값 => int로 처리됨
		// 이유는? 22억을 int 공간에 저장하려해서 오류
		// 따라서 값뒤에 l, L을 붙여야함
		l = 2200000000l;

		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
	}

}
