import java.util.Scanner;

public class 문제3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 0. 데이터 초기화
		int pos = 0, neg = 0, pos_odd = 0, pos_even = 0;
		int limit = 10;

		System.out.println(limit + "개의 정수를 입력하세요:");

		// 4. 처리
		for (int i = 1; i <= limit; i++) {
			System.out.print(i + "번째 입력: ");
			int num = sc.nextInt();

			// 양수 판별
			if (num > 0) {
				pos++;
				// 양수 내에서 홀짝 판별
				if (num % 2 == 0) {
					pos_even++;
				} else {
					pos_odd++;
				}
			}
			// 음수 판별
			else if (num < 0) {
				neg++;
			}
		}

		// 5. 출력
		System.out.println("\n--- 분석 결과 ---");
		System.out.println("양수의 개수: " + pos);
		System.out.println("음수의 개수: " + neg);
		System.out.println("양수 중 홀수의 개수: " + pos_odd);
		System.out.println("양수 중 짝수의 개수: " + pos_even);

		sc.close();
	}
}