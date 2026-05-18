package day2prac.lambda.인터페이스구현하기;

public class Ex02 {

	public static void main(String[] args) {

		// 1. 이름 있는 클래스
		class RunnableImpl implements Runnable {

			@Override
			public void run() {
				System.out.println("안녕하세요!");
			}
		}

		Runnable r1 = new RunnableImpl();

		System.out.println("이름 있는 클래스");
		r1.run();

		// 2. 익명 클래스
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("반갑습니다!");
			}
		};

		System.out.println("\n익명 클래스");
		r2.run();

		// 3. 람다식
		Runnable r3 = () -> {
			System.out.println("좋은 하루 보내세요!");
		};

		System.out.println("\n람다식");
		r3.run();

		// 4. 생략 람다식
		Runnable r4 = () -> System.out.println("생략 람다식");

		System.out.println("\n생략 람다식");
		r4.run();
	}
}