package day21.sleep.prac;

public class Counter extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		for (int i = 10; i > 0; i--) {

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
