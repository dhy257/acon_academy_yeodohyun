package day5prac.재귀호출;

public class 합10재귀2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = getSum();
		System.out.println(result);

	}

	private static int getSum() {
		int sum = 0;

		// 기능 : 1~10 합
		// 입력 ( 매개변수 ) : x
		// 반환 : 1~10 합

		// 처리
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		return sum;
	}

}
