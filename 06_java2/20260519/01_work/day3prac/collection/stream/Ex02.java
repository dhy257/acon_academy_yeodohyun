package day3prac.collection.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

// Stream<T> - 객체스트림
// 기본형스트림
// IntStream
// DoubleStream
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 15, 20, 25, 30 };

		// 1. 합계
		IntStream is = Arrays.stream(arr);

		int result = is.sum();
		System.out.println(result);

		// 2. 짝수 합계

		// 1) 스트림 얻어오기
		is = Arrays.stream(arr);

		// 2)
		int sumResult = is.filter(item -> item % 2 == 0).sum();
		System.out.println(sumResult);

		// 3. 전체 개수 구하기
		is = Arrays.stream(arr);
		long countResult = is.count();
		System.out.println(countResult);

		// 4. 짝수 개수 구하지

		// 스트림 이용해서 구하기
		is = Arrays.stream(arr);
		is.filter(n -> n % 2 == 0).count();

		// 스트림을 사용하지 않고 구하기
		int eventCount = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (num % 2 == 0) {
				eventCount++;
			}
		}
		System.out.println(eventCount);

		
		// 5. 통계 구하기
		is = Arrays.stream(arr);
		IntSummaryStatistics summary = is.summaryStatistics();
		System.out.println(summary);
		
	}

}
