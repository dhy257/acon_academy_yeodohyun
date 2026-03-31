package day21.실습1;

public class 계단오르기2 {
	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			String name = "1칸씩 이동하는 사람";
			int move = 1;
			int position = 0;

			while (position < 30) {
				position += move;

				if (position > 30) {
					position = 30;
				}

				System.out.println(name + ": " + position + "칸");

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println(name + " 도착!===============================");
		});

		Thread t2 = new Thread(() -> {
			String name = "2칸씩 이동하는 사람";
			int move = 2;
			int position = 0;

			while (position < 30) {
				position += move;

				if (position > 30) {
					position = 30;
				}

				System.out.println(name + ": " + position + "칸");

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println(name + " 도착!===============================");
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("메인 종료");
	}
}