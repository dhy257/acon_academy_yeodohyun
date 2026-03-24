package ex;

import java.io.IOException;

public class Ex07 {
	// jvm이 main호출
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 키보드로부터 한 바이트 읽어오기
		int ch = System.in.read(); // checkedException => 사용하려면 예외처리 필요
		// try~catch, throws 를 사용 가능

		// 1) throws 사용하기 => 예외던지기, 예외 미루기 ( main => 미루기 => jvm )
		// 예외처리를 하지 않고 작성 가능
		System.out.println((char) ch); // 아스키코드 저장
		System.out.println("ok");
	}

}
