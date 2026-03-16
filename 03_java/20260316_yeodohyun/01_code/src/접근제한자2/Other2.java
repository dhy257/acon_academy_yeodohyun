package 접근제한자2;

import 접근제한자.A;

public class Other2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A(); // 너가 속한 패키지에 A없다 >> import 해라

		// a.a = 5; private
		a.b = 10; // public 접근간으
//		a.c=10; // 같은 패키지 아니라 접근 불가
	}

}
