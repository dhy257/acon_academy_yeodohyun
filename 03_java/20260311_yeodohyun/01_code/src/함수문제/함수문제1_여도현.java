package 함수문제;

public class 함수문제1_여도현 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. subtract 함수만들어 두 수를 매개변수로 받아 큰 수에서 작은수를 뺀 결과를 반환하는 함수를 만들기
		int num1 = 6;
		int num2 = 3;
		System.out.println(subtract(num1, num2));
	}

	public static int subtract(int a, int b) {
		int result;
		if (a > b) {
			result = a - b;
		} else
			result = b - a;
		return result;
	}

}
