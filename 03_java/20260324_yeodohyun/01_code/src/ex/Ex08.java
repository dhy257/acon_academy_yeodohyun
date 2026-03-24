package ex;

import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int su = 0;
		try {
			su = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 예외가 발생하거나 발생하지않는 경우 모두 실행되는 구간
			System.out.println("무조건 수행");
		}

		System.out.println(su);
	}

}
