package day2prac.lambda.predicate;

/*
 * interface Predicate<T>{
 * 		Boolean test(T t);
 * }
 * 
 * */
interface MyPredicate<T> {
	Boolean test(T t);
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class A implements MyPredicate<String> {

			@Override
			public Boolean test(String t) {
				// TODO Auto-generated method stub
				return t.startsWith("쌀");
			}

		}

		MyPredicate<String> p1 = new A();
		Boolean result = p1.test("쌀국수");
		System.out.println(result);

		//
		MyPredicate<String> p2 = new MyPredicate<String>() {

			@Override
			public Boolean test(String t) {
				// TODO Auto-generated method stub
				return t.startsWith("쌀");

			}
		};

		Boolean result2 = p2.test("쌀과자");
		System.out.println(result2);

		//
		MyPredicate<String> p3 = (t) -> {
			return t.startsWith("쌀");
		};
		Boolean result3 = p3.test("찹쌀만두");
		System.out.println(result3);

		MyPredicate<String> p4 = t -> t.startsWith("쌀");
		Boolean result4 = p4.test("찹만두");
		System.out.println(result4);

	}

}
