package day21.비동기.prac;

// 스레드 만들기 2번째 방법 : Runnable 인터페이스 사용

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인터페이스를 구현하는 방법
		// 1. 이름있는 클래스
		// 2. 익명클래스
		// 3. functional interface => 람다식

		class A implements Runnable {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i <= 100; i++) {
					System.out.println("김건희 춤춤=====");
				}
			}

		}

		Thread 김건희 = new Thread(new A());
		김건희.start();

		class B implements Runnable {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i <= 100; i++) {
					System.out.println("고지연 춤춤");
				}
			}

		}

		Thread 고지연 = new Thread(new B());
		고지연.start();

		System.out.println("main 프로그램 종료");
	}

}
