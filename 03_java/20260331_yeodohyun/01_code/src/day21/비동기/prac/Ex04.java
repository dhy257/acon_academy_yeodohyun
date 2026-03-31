package day21.비동기.prac;

// 스레드 만들기 2번째 방법 : Runnable 인터페이스 사용

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i = 0; i <= 100; i++) {
//			System.out.println("김건희 춤춤=====");
//		}
//		
//		for (int i = 0; i <= 100; i++) {
//			System.out.println("고지연 춤춤");
//		}

		Thread 김건희 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i <= 100; i++) {
					System.out.println("김건희 춤춤=====");
				}
			}

		});
		김건희.start();

		Thread 고지연 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i <= 100; i++) {
					System.out.println("고지연 춤춤");
				}
			}

		});
		고지연.start();

		System.out.println("main 프로그램 종료");
	}

}
