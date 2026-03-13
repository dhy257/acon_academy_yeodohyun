package 실습2;

public class Calculator {
	// 덧셈 메서드
	public double add(double a, double b) {
		return a + b;
	}

	// 뺄셈 메서드
	public double subtract(double a, double b) {
		return a - b;
	}

	// 곱셈 메서드
	public double multiply(double a, double b) {
		return a * b;
	}

	// 나눗셈 메서드
	public double divide(double a, double b) {
		if (b == 0) {
			System.out.println("0으로 못나눔");
			return 0;
		}
		return a / b;
	}
}