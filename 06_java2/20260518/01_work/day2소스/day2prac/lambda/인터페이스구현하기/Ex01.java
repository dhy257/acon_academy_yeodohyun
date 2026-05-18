package day2prac.lambda.인터페이스구현하기;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * interface Runnable{ void run() }
		 * 
		 * interface MySpeakable { void speak(); }
		 */

		// 1.
		class RunnablImp implements Runnable {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("룰루랄라");
			}

		}

		Runnable r1 = new RunnablImp();
		r1.run();

		// 2. 익명
		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("익명 클래스");
			}
		};
		r2.run();

		// 람다식
		Runnable r3 = () -> {
			System.out.println("람다식");
		};
		r3.run();

		
		// 람다식에서 매개변수가 한 개 있으면 괄호 생략가능
		// 수정할 코드가 한 줄이면 중괄호 블럭 생략
		// 수행할코드와 return이 있는 경우 리턴과 중괄호 블럭 생략가능
		
		Runnable r4 = ()-> System.out.println("생략 람다식");
		r4.run();
		
	}

}
