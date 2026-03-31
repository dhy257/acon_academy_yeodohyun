package day21.데몬.prac;

class A implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}

public class Ex01 {
	public static void main(String[] args) {

		Thread th = new Thread(new A());
		th.setDaemon(true); // main 끝나면 죽어버림
		th.start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("종료");
	}
}
