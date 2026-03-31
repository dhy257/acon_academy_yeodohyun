package day21.interrupt.prac;

public class Smile extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		super.run();
//		while (true) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("^-^");
//		}

		// isInterrupted() => 인터럽트가 안걸리면 false
//							=> 걸렷으면 true

//		while (isInterrupted() == false) {
		while (!isInterrupted()) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("^-^");
		}
		System.out.println("웃음 끝");
	}
}
