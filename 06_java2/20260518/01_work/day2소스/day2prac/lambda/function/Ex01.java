package day2prac.lambda.function;

/*
 * interface Function<T,R>{
 * 		R apply(T t);
 * }
 * 
 * */

interface MyFunction<T, R> {
	R apply(T t);
}

public class Ex01 {
	public static void main(String[] args) {

		//

		// 1
		class A implements MyFunction<Integer, Integer> {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t * 2;
			}

		}
		MyFunction<Integer, Integer> f1 = new A();
		int result = f1.apply(3000);
		System.out.println(result);
		// 2

		MyFunction<Integer, Integer> f2 = new MyFunction<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				// TODO Auto-generated method stub
				return t * 2;
			}
		};
		int result2 = f2.apply(4000);
		System.out.println(result2);

		// 3
		MyFunction<Integer, Integer> f3 = (item) -> {
			return item * 2;
		};
		int result3 = f3.apply(5000);
		System.out.println(result3);

		MyFunction<Integer, Integer> f4 = item -> item * 2;
		int result4 = f4.apply(6000);
		System.out.println(result4);
	}
}
