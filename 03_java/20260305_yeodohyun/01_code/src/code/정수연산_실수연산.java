package code;

public class 정수연산_실수연산 {
	public static void main(String[] args) {
		// 정수연산
		// 피연산자가 모두 정수라면 -> 정수연산 수행 -> 결과가 무조건 정수
		// 10/3 -> 3 (정수/정수) -> 정수연산 수행 -> 결과도 무조건 정수 3

		// 10/3 의 결과가 실수형 값을 얻어야 한다면
		// 두 개중에 한개를 실수형으로 반환해야함
		// 10/3.0 -> 자료형이 큰 쪽으로 맞춰서 계산됨 -> double로 연산됨

		int result;
		result = 10 / 3;
		System.out.println(result);

		double result2;
		result2 = 10 / 3;
		System.out.println(result2);
		result2 = 10 / 3.0; // 실수연산 실행
		System.out.println(result2);

	}

}
