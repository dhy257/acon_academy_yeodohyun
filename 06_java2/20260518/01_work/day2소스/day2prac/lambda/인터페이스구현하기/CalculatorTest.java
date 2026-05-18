package day2prac.lambda.인터페이스구현하기;

interface Calculator {

	int calc(int x, int y);

}

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역 내부 클래스 구현

		// 더하기
		class AddClass implements Calculator {

			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		}

		// 빼기
		class SubClass implements Calculator {

			@Override
			public int calc(int x, int y) {
				return x - y;
			}
		}

		// 곱하기
		class MulClass implements Calculator {

			@Override
			public int calc(int x, int y) {
				return x * y;
			}
		}

		Calculator add1 = new AddClass();
		Calculator sub1 = new SubClass();
		Calculator mul1 = new MulClass();

		System.out.println("=== 지역 내부 클래스 ===");
		System.out.println("더하기 : " + add1.calc(10, 5));
		System.out.println("빼기 : " + sub1.calc(10, 5));
		System.out.println("곱하기 : " + mul1.calc(10, 5));

		// 익명 클래스 구현

		Calculator add2 = new Calculator() {

			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};

		Calculator sub2 = new Calculator() {

			@Override
			public int calc(int x, int y) {
				return x - y;
			}
		};

		Calculator mul2 = new Calculator() {

			@Override
			public int calc(int x, int y) {
				return x * y;
			}
		};

		System.out.println("\n=== 익명 클래스 ===");
		System.out.println("더하기 : " + add2.calc(10, 5));
		System.out.println("빼기 : " + sub2.calc(10, 5));
		System.out.println("곱하기 : " + mul2.calc(10, 5));

		// 람다식 구현

		Calculator add3 = (x, y) -> x + y;

		Calculator sub3 = (x, y) -> x - y;

		Calculator mul3 = (x, y) -> x * y;

		System.out.println("\n=== 람다식 ===");
		System.out.println("더하기 : " + add3.calc(10, 5));
		System.out.println("빼기 : " + sub3.calc(10, 5));
		System.out.println("곱하기 : " + mul3.calc(10, 5));

	}
}