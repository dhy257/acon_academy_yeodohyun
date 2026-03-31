package day21.interrupt.prac;

public class Ex01 {
	public static void main(String[] args) {
		Smile smile = new Smile();
		smile.start();

		try {
			Thread.sleep(5000);
			System.out.println("메인 작업");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 신호보내면 !isInterrupted()가 false가 되면서 끝남
		smile.interrupt();

		System.out.println("메인 종료");
	}
}
