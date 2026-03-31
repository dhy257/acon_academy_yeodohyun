package day21.비동기.prac;

// class A { void run() }

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread 상속 받아서 만들기 >> 이후 run() 메서드 오버라이드
		class A extends Thread {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i <= 100; i++) {
					System.out.println("김건희 춤춤=====");
				}
			}
		}

		A a = new A();
		a.start(); // Thread를 실행해 주세요 >> run 직접 호출x

		// Thread 상속 받아서 만들기 >> 이후 run() 메서드 오버라이드
		class B extends Thread {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i <= 100; i++) {
					System.out.println("고지연 춤춤");
				}
			}
		}

		B b = new B();
		b.start(); // Thread를 실행해 주세요 >> run 직접 호출x

		
		System.out.println("main 프로그램 종료");
	}

}
