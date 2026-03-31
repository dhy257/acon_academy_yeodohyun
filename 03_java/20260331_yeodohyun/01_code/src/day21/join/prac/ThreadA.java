package day21.join.prac;

public class ThreadA extends Thread {
	private int sum;

	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		for (int i = 1; i <= 50; i++) {
			sum += i;
			System.out.println(Thread.currentThread().getName() + " " + i + " " + sum);
		}
	}

}
