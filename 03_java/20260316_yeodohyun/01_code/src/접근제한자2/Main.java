package 접근제한자2;

import 접근제한자.A;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1) 같은 패키지라면 패키지명 생략가능
		접근제한자.A a = new 접근제한자.A(); // 클래스 이름은 패키지를 포함함 ( 접근제한자.A)
		
		// 2) 다른 패키지라면 직접 명시하거나 import 사용
		
		A b = new A();
	}

}
