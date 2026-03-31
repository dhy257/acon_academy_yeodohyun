package day21.공유자원문제.prac;

public class Ex02 {

	static int su = 0; // 두 개의 스래드가 su라는 변수의 값을 증가 시키기

	static synchronized void 증가하기() {

		for (int i = 1; i <= 100; i++) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			su = su + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 개의 스래드가 su라는 변수의 값을 증가 시키기

		Thread a = new Thread(new Runnable() {

			@Override
			public void run() {
				증가하기();

			}
		});

		Thread b = new Thread(new Runnable() {

			@Override
			public void run() {
				증가하기();

			}
		}); // 익명클래스의 익명객체

		a.start();
		b.start();

		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("종료");
		System.out.println(su);
	}

}
