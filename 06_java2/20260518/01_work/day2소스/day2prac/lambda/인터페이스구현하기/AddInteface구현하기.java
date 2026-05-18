package day2prac.lambda.인터페이스구현하기;

/*
 * public interface AddInteface {
	int add(int x, int y);
}
*/
public class AddInteface구현하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인터페이스를 구현하는 3가지 방법( 함수형 인터페이스 )
		// 1. 이름있는 클래스 구현
		// 2. 익명클래스 구현
		// 3. 람다식 구현 ( 익명클래스에서 추론 가능한 모든 코드를 생략하고 사용 )

		// 1. 지역내부클래스
		class A implements AddInterface {
			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
		}

		AddInterface f1 = new A();
		int result = f1.add(5, 3);
		System.out.println(result);

		// 2. 익명클래스 구현
		// AddInteface f2 = new AddInteface() {};
		// 익명클래스 구현, 생성된 클래스로 객체생성하기 new
		AddInterface f2 = new AddInterface() {

			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
		};
		;
		int result2 = f2.add(3, 5);
		System.out.println(result2);

		// 3. 람다식
		// ( 매개변수 ) -> { }
		AddInterface f3 = (x, y) -> {
			return x + y;
		};
		int result3 = f3.add(5, 11);
		System.out.println(result3);

		AddInterface f4 = (x, y) -> x + y;
		int result4 = f4.add(7, 7);
		System.out.println(result4);

	}

}
