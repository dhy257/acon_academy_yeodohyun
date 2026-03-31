package day21.join.prac;

public class ThreadB extends Thread {
	private int sum;

	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
		for (int i = 51; i <= 100; i++) {
			sum += i;
			System.out.println(Thread.currentThread().getName() + " " + i + " " + sum);
		}
	}

}
