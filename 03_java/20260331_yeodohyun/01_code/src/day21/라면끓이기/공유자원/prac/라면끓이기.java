package day21.라면끓이기.공유자원.prac;

public class 라면끓이기 implements Runnable {

	라면 ramen;

	public 라면끓이기(라면 ramen) {
		this.ramen = ramen;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		while (true) {

			synchronized (ramen) {
				if (ramen.count <= 0) {
					System.out.println(Thread.currentThread().getName() + "sold out");
					break;
				}

				System.out.println(Thread.currentThread().getName() + "라면 끓이는 중");
				ramen.count--;
				System.out.println("남은 라면" + ramen.count);
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
