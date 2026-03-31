package day21.join.prac;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 100; i++) {
					System.out.println("Thread별도 작업 진행 중");
				}
			}
		});
		th.start();

		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("main 종료");
	}

}
