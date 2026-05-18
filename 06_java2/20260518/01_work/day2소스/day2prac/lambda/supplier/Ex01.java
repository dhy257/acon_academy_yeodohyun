package day2prac.lambda.supplier;

import java.util.function.Supplier;

/*
 * interface Supplier<T>(){
 * 		T get();
 * }
 * 
 * */

interface MySupplier<T> {

	T get();
}

public class Ex01 {
	public static void main(String[] args) {
		// 1.
		class A implements MySupplier<Integer> {

			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return (int) (Math.random() * 100);

			}

		}

		MySupplier<Integer> s1 = new A();
		int result = s1.get();
		System.out.println(result);

		// 2.

		MySupplier<Integer> s2 = new MySupplier<Integer>() {

			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				return 25;
			}

		};

		int result2 = s2.get();
		System.out.println(result2);

		// 3.

		MySupplier<Integer> s3 = () -> {
			return 30;
		};
		int result3 = s3.get();
		System.out.println(result3);

		MySupplier<Integer> s4 = () -> 40;
		int result4 = s4.get();
		System.out.println(result4);

		Supplier<String> s5 = () -> {
			return "2시간 ";
		};
		String r5 = s5.get();
		System.out.println(r5);
	}
}
