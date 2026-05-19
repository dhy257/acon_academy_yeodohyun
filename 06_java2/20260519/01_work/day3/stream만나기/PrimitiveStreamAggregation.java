package day3.stream만나기;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class PrimitiveStreamAggregation {
    public static void main(String[] args) {
        // 1~10 숫자 배열
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // IntStream 생성
        IntStream intStream = Arrays.stream(numbers);

        // 1 합계
        int sum = intStream.sum();
        System.out.println("합계: " + sum);

        // 2️ 평균값
        double avg = Arrays.stream(numbers).average().orElse(0.0);
      
        System.out.println("평균: " + avg);

        // 3️ 최대값
        int max = Arrays.stream(numbers).max().orElse(Integer.MIN_VALUE);
        System.out.println("최대값: " + max);

        // 4️ 최소값
        int min = Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
        System.out.println("최소값: " + min);

        // 5️ 요소 개수
        long count = Arrays.stream(numbers).count();
        System.out.println("요소 개수: " + count);

        // 6️ summaryStatistics (합계, 평균, 최대, 최소, 개수)
        IntSummaryStatistics stats = Arrays.stream(numbers).summaryStatistics();
        System.out.println("summaryStatistics: " + stats);
    }
}
