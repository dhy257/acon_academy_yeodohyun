package code;

public class 연산자_사칙연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// + - * / %
		// 정수연산, 실수연산

		int a = 10;
		int b = 3;

		// 정수연산을 수행하고 정수결과를 얻고 싶으면 그대로 사용
		int result = a + b;
		;
		int result2 = a - b;
		int result3 = a * b;
		int result4 = a / b;
		double result5 = a / (double) b;

		int result6 = a % b;

		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}
	

}
