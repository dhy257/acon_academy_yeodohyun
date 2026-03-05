package code;

public class 자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 숫자
		// byte: 1byte (8bit, 부호1+7bit >> -128~127)
		// short: 2byte (2byte, -32768~)
		// int: 4byte (4byte: -21억~+21억)
		// ( 4G > 42억 byte)
		// long: 8byte (8byte: -920~+920경)
		byte a =127;
		short b =23435;
		int c = 1231231;
		long d = 12312311;
		
		// 실수형 숫자
		// float(4byte, 소수 이하7자리)
		// double(8byte, 소수 이하 15자리)
		float e = 35.3f;
		double f = 35.3;
		
		// 문자: 한 문자(char) char: 2byte: 영문 한 글자, 또는 한글 한 글자 (0~65535)
		char g='D';
		// 논리형: boolean (1byte: true, false만 저장 가능)
		boolean h = true;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}

}
