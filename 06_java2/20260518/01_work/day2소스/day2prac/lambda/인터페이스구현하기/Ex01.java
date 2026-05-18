package day2prac.lambda.인터페이스구현하기;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * @ FunctionalInterface interface Runnable { void run(); }
		 * 
		 * 
		 * interface MySpeakable { void speak(); }
		 * 
		 */

		// 1.
		class RunnableImp implements Runnable {

			@Override
			public void run() {
				System.out.println("룰루랄라");
			}
		}

		Runnable r1 = new RunnableImp();
		r1.run();

		// 2.익명

		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				System.out.println("익명 클래스입니다");

			}
		};

		r2.run();

		// 람다식

		Runnable r3 = () -> {
			System.out.println("람다식입니다");

		};

		r3.run();

		// 람다식에서 매개변수가 한 개 있으면 괄호생략가능
		// 수행할 코드가 한 줄이면 중괄호 블럭 생략
		// 수행할코드와 return이 있는 경우 리턴과 중괄호 블럭 생략 가능
		Runnable r4 = () -> System.out.println("람다식입니다");

		r4.run();

	}

}
