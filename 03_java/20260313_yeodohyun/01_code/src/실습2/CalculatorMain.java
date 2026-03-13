package 실습2;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator(); // 객체 생성
		Scanner sc = new Scanner(System.in);

		System.out.println("계산기");

		System.out.print("첫 번째 숫자 입력: ");
		double num1 = sc.nextDouble();

		System.out.print("두 번째 숫자 입력: ");
		double num2 = sc.nextDouble();

		System.out.print("연산자 (+, -, *, /) 입력: ");
		String op = sc.next();

		double result = 0;
		switch (op) {
		case "+":
			result = calc.add(num1, num2);
			break;
		case "-":
			result = calc.subtract(num1, num2);
			break;
		case "*":
			result = calc.multiply(num1, num2);
			break;
		case "/":
			result = calc.divide(num1, num2);
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			sc.close();
			return;
		}

		System.out.println("결과: " + result);
		sc.close();
	}

}
