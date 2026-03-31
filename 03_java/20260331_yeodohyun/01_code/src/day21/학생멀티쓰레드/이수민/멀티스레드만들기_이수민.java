package day21.학생멀티쓰레드.이수민;

public class 멀티스레드만들기_이수민 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		밥을먹는다 a = new 밥을먹는다();
		이를닦는다 b = new 이를닦는다();

		a.start();
		b.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.interrupt();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		b.interrupt();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class 밥을먹는다 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {

			if (isInterrupted()) {
				System.out.println("배가불러요");
				return;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("배가불러요");
				return;
			}

			System.out.println(i + "번째 밥을먹는다");
		}

	}

}

class 이를닦는다 extends Thread {
	@Override
	public void run() {
		나갈준비하기 c = new 나갈준비하기();
		for (int i = 1; i <= 50; i++) {

			if (isInterrupted()) {
				System.out.println("헹구기");
				c.start();
				return;
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				System.out.println("헹구기");
				c.start();
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {

				}
				c.interrupt();
				return;

			}
			System.out.println(i + "번째 이를 닦는다");
		}

	}
}

class 나갈준비하기 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			if (isInterrupted()) {
				System.out.println("나간다");
				return;
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				System.out.println("나간다");
				return;

			}
			System.out.println(i + "번째 나갈준비를한다");
		}
	}

}
