package day21.interrupt.prac;

public class Smile2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub

//		java.lang.InterruptedException: sleep interrupted
//		at java.base/java.lang.Thread.sleep0(Native Method)
//		at java.base/java.lang.Thread.sleep(Thread.java:509)
//		at day21.interrupt.prac.Smile2.run(Smile2.java:14)

		// => 스마일2 스레드가 자고있을 때 인터럽트가 들어옴
		// => 이때는 인터럽트 설정 정보 초기화

		// isInterrupted() => 인터럽트가 안걸리면 false
//							=> 걸렷으면 true

//		while (isInterrupted() == false) {
		while (!isInterrupted()) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				// 인터럽트 정보를 초기화 즉, false로 만들어 줌

				System.out.println("자다 깸");
				// interrupt()쓰거나 break쓰거나
				interrupt();
//				break;
			}
			System.out.println("^-^");
		}
		System.out.println("웃음 끝");
	}
}
