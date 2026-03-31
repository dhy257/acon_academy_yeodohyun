package day21.join.prac;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1~100개 구하기

		// 2개 스레드 만들기
		// 1 => 1~50
		// 2 => 51~100
		// 메인스레드 : 1번째 스레드 결과값 + 2번째 스레드 결과값

		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();

		a.start();
		b.start();

		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int result1 = a.getSum();
		int result2 = b.getSum();
		int sum = result1 + result2;

		System.out.println(sum);

		System.out.println("main 종료");
	}

}
