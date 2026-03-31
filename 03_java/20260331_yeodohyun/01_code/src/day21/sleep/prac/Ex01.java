package day21.sleep.prac;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("3초후 잔다");

		// sleep
		// sleep은 자신의 스레드만 가능
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("잔다");
	}

}
