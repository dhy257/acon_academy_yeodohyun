package day2prac.consumer;

/*
 * interface Consumer<T>{
 * 		void accept(T t);
 * }
 * */

interface MyConsumer<T> {
	void accept(T t);
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.
		class A implements MyConsumer<Integer> {
			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t + "구매완료");
			}
		}

		MyConsumer<Integer> c1 = new A();
		c1.accept(50000);

		// 2
		MyConsumer<Integer> c2 = new MyConsumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t + "구매완료/익명");
			}

		};
		c2.accept(60000);

		// 3
		MyConsumer<Integer> c3 = (money) -> {
			System.out.println(money + "구매완료/람다");
		};
		c3.accept(70000);

		// ()->{} 생략가능한가?
		// 매개변수가 하나면 () 생략가능
		// 수행할 코드가 1줄이면 중괄호 생략가능, 리턴도 생략함
		MyConsumer<Integer> c4 = money -> System.out.println(money + "구매완료/람다2");
		c4.accept(80000);

		MyConsumer<Integer> c5 = (t) -> {
			System.out.println("받은 돈" + t);
			System.out.println("지우기 500소비");
			t -= 500;
			System.out.println("남은 돈" + t);
		};
		c5.accept(1000);
	}

}
